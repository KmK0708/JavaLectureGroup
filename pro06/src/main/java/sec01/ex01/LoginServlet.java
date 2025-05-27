package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login1")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("로그인 init 메서드 호출");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("로그인 destroy 메서드 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 전송된 데이터 utf 8 로 인코딩
		String user_id = request.getParameter("user_id"); // getparameter로 input태그의 name속성값으로 전송된 밸류를 받음.
		String user_pw = request.getParameter("user_pw");
		System.out.println("아이디 : " + user_id);
		System.out.println("비밀번호 : " + user_pw);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
