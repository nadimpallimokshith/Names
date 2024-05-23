import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/names")
public class NameServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        NameDAO nameDAO = new NameDAO();
        List<String> names = nameDAO.getNames();

        request.setAttribute("names", names);
        request.getRequestDispatcher("names.jsp").forward(request, response);
    }
}
