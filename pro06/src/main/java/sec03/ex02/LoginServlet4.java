package sec03.ex02;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login4")
public class LoginServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig config) throws ServletException {
		System.out.print("login4 init 메서드 호출");
	}


	public void destroy() {
		System.out.print("login4 destroy 메서드 호출");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("login4 doGet 메서드 호출");
		doHandle(request, response); // get 방식으로 요청 시 다시 dohandle 호출
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("login4 doPost 메서드 호출");
		doHandle(request, response); // post 방식으로 요청 시 다시 dohandle 호출
	}

	private void doHandle(HttpServletRequest request,HttpServletResponse response)
		throws ServletException, IOException
		{
			request.setCharacterEncoding("utf-8");
			String user_id = request.getParameter("user_id");
			System.out.println("dohandle 메서드 호출");
			String user_pw = request.getParameter("user_pw");
			System.out.println("아이디 : " + user_id);
			System.out.println("비밀번호 : " + user_pw);
		}
	
}
