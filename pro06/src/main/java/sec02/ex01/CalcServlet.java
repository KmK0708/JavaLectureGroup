package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public static final double USD_RATE = 0.00073;
	public static final double JYP_RATE = 0.10;
	public static final double CNY_RATE = 0.0053;
	public static final double GBP_RATE = 0.000539;
	public static final double EUR_RATE = 0.00064;
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pw = response.getWriter();
		String command = request.getParameter("command");
		String won = request.getParameter("won");
		String operator = request.getParameter("operator");
		
		if (command != null && command.equals("calculate"))
		{
			String result = calculate(Float.parseFloat(won), operator);
			pw.print("<html><font size=10>변환 결과</font><br>");
			pw.print("<html><font size=10>" + result + "</font><br>");
			pw.print("<a href='/pro06/calc'>환율 계산기</a>");
			return;
		}
		
		pw.print("<html><title>환율 계산기 </title>");
		pw.print("<font size=5>환율 계산기 </font><br>");
		pw.print("<form name='frmCalc' method='get' action='/pro06/calc' /> ");
		pw.print("원화: <input type='text' name='won' size=10 /> ");
		pw.print("<select name='operator' >");
		pw.print("<option value='dollar'>달러</option>");
		pw.print("<option value='yen'>엔화</option>");
		pw.print("<option value='wian'>위안</option>");
		pw.print("<option value='pound'>파운드</option>");
		pw.print("<option value='euro'>유로</option>");
		pw.print("</select>");
		pw.print("<input type='hidden' name='command' value='calculate'  />");
		pw.println("<input type='submit' value='변환'  /> ");
		pw.println("</form> ");
		pw.print("</html> ");
		pw.close();
	}

	private static String calculate(float won,String operator) {
		String result = null;
		if (operator.equals("dollar")) {
			result = String.format("%.6f", won * USD_RATE);
		}
		else if (operator.equals("yen")) {
			result = String.format("%.6f", won * JYP_RATE);
		}
		else if (operator.equals("wian")) {
			result = String.format("%.6f", won * CNY_RATE);
		}
		else if (operator.equals("pound")) {
			result = String.format("%.6f", won * GBP_RATE);
		}
		else if (operator.equals("euro")) {
			result = String.format("%.6f", won * EUR_RATE);
		}
		return result;
	}
	
}
