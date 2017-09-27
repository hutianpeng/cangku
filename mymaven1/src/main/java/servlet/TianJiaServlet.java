package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LiuTingDao;
import daoimpl.LiuTingDaoImpl;
import entity.LiuTing;
import service.LiuTingService;
import service.impl.LiuTingServiceImpl;

/**
 * Servlet implementation class TianJiaServlet
 */
@WebServlet("/TianJiaServlet")
public class TianJiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LiuTingService liutingdao =new LiuTingServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TianJiaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LiuTing liuting=new LiuTing();
		liuting.setName(request.getParameter("name"));
		liuting.setAge(Integer.valueOf(request.getParameter("age")));
		liuting.setSchool(request.getParameter("school"));
	
		liutingdao.tianji(liuting);
		request.getRequestDispatcher("ChaXunServlet").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
