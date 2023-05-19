import module.Album;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet (name="AlbumsServlet", urlPatterns = "/albums")
public class AlbumsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Album artist1 = new Album("Michael Jackson", "Thriller", 90);
        Album artist2 = new Album("Kehlani", "Fake", 30);
        Album artist3 = new Album("Tink", "Stingy", 28);

        List<Album> album = new ArrayList<>();

        album.add(artist1);
        album.add(artist2);
        album.add(artist3);

        req.setAttribute("albums", album);

        req.getRequestDispatcher("/bean-test.jsp").forward(req,resp);

    }
}
