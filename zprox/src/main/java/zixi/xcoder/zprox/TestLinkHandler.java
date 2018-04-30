package zixi.xcoder.zprox;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import com.zixi.tools.TestLinkIntegrationZen;

import br.eti.kinoshita.testlinkjavaapi.constants.ExecutionStatus;
import br.eti.kinoshita.testlinkjavaapi.util.TestLinkAPIException;


public class TestLinkHandler extends AbstractHandler{

	@Override
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html; charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter out = response.getWriter();

        String[] testIds =  baseRequest.getParameterValues("");
        
        TestLinkIntegrationZen tl = new TestLinkIntegrationZen();
        
        out.println(new JsonResponder("testLink").toString());
        
        baseRequest.setHandled(true);
	}
	public static void main(String[] args) throws TestLinkAPIException, MalformedURLException {
		TestLinkIntegrationZen tl = new TestLinkIntegrationZen();
		
		tl.setResult("8603", ExecutionStatus.FAILED, "", 364);
		
	}
}
