package zixi.xcoder.zprox;

import org.eclipse.jetty.server.Server;

public class App {
    public static void main( String[] args )
    {
    	try {
	    	Server server = new Server(5566);
	        server.start();
	        server.dumpStdErr();
	        server.join();
    	}catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
}
