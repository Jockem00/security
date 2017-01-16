package se.coredev.security.web;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/leaking-servlet2-fixed")
public class LeakingServlet2Fixed extends HttpServlet
{
	private static final long serialVersionUID = 5083486561122480754L;
	private ExecutorService executor;

	@Override
	public void init(ServletConfig config) throws ServletException
	{
		executor = Executors.newFixedThreadPool(20, new ThreadFactory() {
			
			public Thread newThread(Runnable target)
			{
				Thread thread = new Thread(target, "Executor Thread");
				
				return thread;
			}
		});
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		resp.getWriter().write("doGet() called on " + this.getClass().getSimpleName() + " starting runnable\n");
		executor.execute(new Runnable() { public void run() {}} );
		resp.getWriter().write("Runnable started");
	}
}