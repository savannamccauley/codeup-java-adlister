import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(name ="ViewAddServlet", urlPatterns = "/ads")
public class ViewAddServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Ad> allAdds =DaoFactory.getAdsDao().all();
        req.setAttribute("allAds", allAdds);
        req.getRequestDispatcher("/ads/index.jsp").forward(req,resp);
    }
}
