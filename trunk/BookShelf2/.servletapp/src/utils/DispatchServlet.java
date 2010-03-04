package utils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;
import javax.servlet.*;
import javax.servlet.http.*;
import utils.*;
import exampleapp.beans.*;
import org.webdsl.lang.Environment;

public class DispatchServlet extends HttpServlet 
{ 
  private java.util.Timer timer;

  public void init()
  { 
    org.hibernate.Session hSession = null;
    try
    { 
      final org.hibernate.Session hibSession = HibernateUtilConfigured.getSessionFactory().getCurrentSession();
      hSession = hibSession;
      hibSession.beginTransaction();
      final java.io.PrintWriter out = new java.io.PrintWriter(System.out);
      timer = new java.util.Timer();
      final Environment env = null;
      hibSession.flush();
    }
    catch(Exception ex)
    { 
      System.out.println("exception occured: " + ex.getMessage());
      ex.printStackTrace();
      hSession.getTransaction().rollback();
    }
  }

  public void destroy()
  { 
    timer.cancel();
  }

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  { 
    DispatchServletHelper d = new DispatchServletHelper(this, true, getServletConfig().getServletContext().getContextPath());
    d.doServe(request, response);
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  { 
    DispatchServletHelper d = new DispatchServletHelper(this, false, getServletConfig().getServletContext().getContextPath());
    d.doServe(request, response);
  }
}