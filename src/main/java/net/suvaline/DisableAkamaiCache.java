package net.suvaline;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class DisableAkamaiCache implements Filter {

	private String mode = "NO";
	
	public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain) throws IOException, ServletException {
 
		HttpServletResponse resp = (HttpServletResponse) res;
        resp.addHeader("X-Check-Cacheable", mode );
        chain.doFilter(req, res);
    }
	
    public void init(FilterConfig config) throws ServletException {
        // none
    }
    
    public void destroy() {
    	// none
    }
     
}
