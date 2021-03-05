package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NavigationServlet
 */
@WebServlet("/deleteShopperServlet")
public class DeleteShopperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteShopperServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String act=request.getParameter("doThisToItem");
		String path="/viewAllShoppersServlet";
		ShopperHelper sh = new ShopperHelper();
		
		if (act.equals("delete")) {
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				sh.deleteShopperById(tempId);
			} catch (NumberFormatException e) {
				System.out.println("Forgot to select an item.");
			}
		}
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}

}
