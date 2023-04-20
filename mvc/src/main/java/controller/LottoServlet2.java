package controller;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.domain.TimeVO;

//@WebServlet("/lotto2")
//public class LottoServlet2 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//		    throws ServletException, IOException {
//		  HttpSession session = request.getSession();
////		  int lottoCount;
////		  if(session.getAttribute("count")==null) {
////			  session.setAttribute("count", 1); //integer
////		  }else {
////			  session.setAttribute("count", (int)session.getAttribute("count"+1));
////		  }
////		  lottoCount =(int)session.getAttribute("count"); //이 방법은 integer 형식을 넣었기 때문에 객체가 계속 생성될 수 밖에 없음 int형을 넣어주기
//		
//		
//		
////		  String click = request.getParameter("click");
////		  int count = 0;
//
////		  if (session.getAttribute(click) != null) {
////		    count = (int) session.getAttribute(click);
////		  }
//
//		  String select = request.getParameter("selectNum");
//		  int selectNum = Integer.parseInt(select);
//		  int lottoNum = (int) (Math.random() * 6) + 1;
//
//		  String pageView = "";
////		  count++;
////		  if (count <= 3) {
//		    System.out.println("전달된 값 : " + selectNum + " 추출된 값 : " + lottoNum);
//
//		    LocalTime now = LocalTime.now();
//		    int hour = now.getHour();
//		    int minute = now.getMinute();
//		    TimeVO vo = new TimeVO(hour, minute);
//		    request.setAttribute("time", vo);
//
//		    if (selectNum == lottoNum) {
//		      pageView = "/jspexam/success.jsp";
//		    } else {
//		      pageView = "/jspexam/fail.jsp";
//		    }
//
//		    RequestDispatcher rd = request.getRequestDispatcher(pageView);
//		    rd.forward(request, response);
//
//		    session.setAttribute("click", "");
//		  } else {
//		    pageView = "/jspexam/impossible.jsp";
//		    session.invalidate();
//		  
//		}
//	
//}
