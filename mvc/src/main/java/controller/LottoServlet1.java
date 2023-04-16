package controller;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.domain.TimeVO;

@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String select = request.getParameter("selectNum");
		
		int selectNum = Integer.parseInt(select);
		
		int lottoNum = (int)(Math.random()*6)+1;
		
		System.out.println("전달된 값 : " + selectNum + " 추출된 값 : " + lottoNum);
		
		LocalTime now = LocalTime.now();
		
		int hour = now.getHour();
		int minute = now.getMinute();
		
		TimeVO vo = new TimeVO(hour,minute);
		
		request.setAttribute("time", vo);
		String pageView = "";
		if(selectNum == lottoNum) {
			pageView ="/jspexam/success.jsp";
		} else {
			pageView = "/jspexam/fail.jsp";
		}
		RequestDispatcher rd = request.getRequestDispatcher(pageView);
		rd.forward(request, response);
	}

}
