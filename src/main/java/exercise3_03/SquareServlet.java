package exercise3_03;

import java.io.*;

import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(value="/Square")
public class SquareServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        int param = Integer.parseInt(request.getParameter("cijfer"));
        int square = (param * param);
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Square Servlet</title></head>");
            out.println("<body>");
            out.println(square);
            out.println("</body></html>");
        }
    }
}
