package filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/*" })//어노테이션으로 필터 등록 설정
public class HangulFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    	HttpServletRequest req = (HttpServletRequest)request;
    	if (req.getMethod().equals("POST"))
    		request.setCharacterEncoding("utf-8");    	
    	chain.doFilter(request, response);//얘 다음 수행될 객체(누가 될지는 관계 없고 정보를 주기 위한 설정?선언만 먼저 한다고 봐야 하나.....?dofilter는 여기까지 자기 수행은 끝내고 다음의 애가 누구든 간에 수행할 내용을 미리 넣어놓는다...실질적인 호출은 컨테이너가 함)
	}
    //ServletRequest: HttpServletRequest의 부모
}
