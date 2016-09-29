import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloW extends HttpServlet {

    private String msg = "";
    private static final String TEMPLATE = "<html><head><title>Test</title></head><body><h1>%s</h1></body></html>";

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {


        String login = req.getParameter("login");

        if (login != null) {

            if(login.equalsIgnoreCase("aa")){
                msg = "Success";
            } else {
                msg = "Error";
            }
        } else {
            msg = "No Parameter";
        }

        resp.getWriter().println(String.format(TEMPLATE, msg));
    }
}
