package sec02.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sec02.ex02.MemberVO;

@WebServlet("/member4")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
	}

	public void destroy() {
	}

	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    doHandle(request, response);  // GET 요청도 처리
	}
	 

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response); // POST 요청 → doHandle()로 위임
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		String command = request.getParameter("command");

		MemberDAO dao = new MemberDAO();

		// command가 addMember이면 회원 추가
		if ("addMember".equals(command)) {
			String _id = request.getParameter("id");
			String _pwd = request.getParameter("pwd");
			String _name = request.getParameter("name");
			String _email = request.getParameter("email");

			MemberVO vo = new MemberVO();
			vo.setId(_id);
			vo.setPwd(_pwd);
			vo.setName(_name);
			vo.setEmail(_email);
			dao.addMember(vo);
		}//command가 delMember이면 회원 삭제
		else if ("delMember".equals(command)) {
			String id = request.getParameter("id");
			dao.delMember(id);
		}

		// 회원 목록 다시 조회
		List<MemberVO> list = dao.listMembers();

		// HTML 시작
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td>삭제</td></tr>");

		for (int i = 0; i < list.size(); i++) {
			MemberVO memberVO = list.get(i);
			String id = memberVO.getId();
			String pwd = memberVO.getPwd();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			Date joinDate = memberVO.getJoinDate();

			out.print("<tr>");
			out.print("<td>" + id + "</td>");
			out.print("<td>" + pwd + "</td>");
			out.print("<td>" + name + "</td>");
			out.print("<td>" + email + "</td>");
			out.print("<td>" + joinDate + "</td>");
			out.print("<td><a href='/pro07/member4?command=delMember&id=" + id + "'>삭제</a></td>");
			out.print("</tr>");
		}

		// HTML 마무리
		out.print("</table>");
		out.print("<br><a href='/pro07/memberForm.html'>새 회원 등록하기</a>");
		out.print("</body></html>");
	}

}
