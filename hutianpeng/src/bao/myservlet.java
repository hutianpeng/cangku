package bao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bb.BaseDao;

/**
 * Servlet implementation class myservlet
 */
@WebServlet("/zhuce")
public class myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");//获得网页中的name所对应的name值
		String password=request.getParameter("password");//获得网页中name所对应的 password值
		BaseDao.execute("insert into ting values(?,?)", name,password);
		//调用basedao类中的execute方法;
		request.setAttribute("na",name);//取名字传到jsp中
		request.setAttribute("pa",password);
		request.getRequestDispatcher("hu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
