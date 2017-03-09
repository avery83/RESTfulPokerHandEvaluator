package PokerHandEvaluator.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import PokerHandEvaluator.evaluator.*;

/**
 * Created by student on 2/20/17.
 */
@WebServlet(name = "servlet",
        urlPatterns = {"/servlet"})
public class Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Deck deck = new Deck();

        req.setAttribute("deckOfCardImages", deck.getMapOfCardImages());

        String url = "/index.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(req, resp);
    }

}
