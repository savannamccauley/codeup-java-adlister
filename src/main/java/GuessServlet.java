import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet (name="GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/guess.jsp").forward(req,resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random random = new Random();
        int randomNum = random.nextInt(3)+ 1;

        if(randomNum == Integer.parseInt(req.getParameter("userNum"))){
            resp.sendRedirect("/correct");
        }else{
            resp.sendRedirect("/incorrect");
        }

        System.out.println("UserNum: " + Integer.parseInt(req.getParameter("userNum")));
        System.out.println("Random Number : " + randomNum);
}}
