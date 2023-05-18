
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (name="PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza-order.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String crust = request.getParameter("crust");
        String size = request.getParameter("size");
        String[] toppings = request.getParameterValues("toppings");
        String address = request.getParameter("address");

        System.out.println("Crust: " + crust);
        System.out.println("Size: " + size);

        if(toppings !=null){
            for (String topping: toppings){
                System.out.println( "Toppings: " + topping + " ");
            }
        }
        System.out.println("Delivery Address: "+ address);



    }
}
