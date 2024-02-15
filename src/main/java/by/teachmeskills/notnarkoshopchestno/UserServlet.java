package by.teachmeskills.notnarkoshopchestno;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.FileRepository;


import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//            resp.setContentType("text/html");
//            PrintWriter pw = resp.getWriter();
//            pw.println("<b>HelloWorldEMoe");
            FileRepository filleRepository = new FileRepository();
            req.setAttribute("user", filleRepository.allUsers());
req.getRequestDispatcher("/JSP/stranichka.jsp").forward(req,resp);
        }
    }


