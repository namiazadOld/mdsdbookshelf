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

public class DispatchServletHelper  
{ 
  public static HashMap<String, Class> pages = new HashMap<String, Class>();

  private static HashMap<String, String[]> pagearguments = new HashMap<String, String[]>();

  private static HashMap<String, Boolean[]> pageEntityArgs = new HashMap<String, Boolean[]>();

  Class pc;

  java.util.Map<String, utils.File> fileUploads;

  java.util.Map<String, String> parammap;

  java.util.Map<String, List<String>> parammapvalues;

  HttpServletRequest request;

  HttpServletResponse response;

  List<String> messages;

  public boolean isPostRequest;

  public String contextPath;

  DispatchServlet servlet;

  public DispatchServletHelper (DispatchServlet servlet, boolean isPost, String contextPath) 
  { 
    this.servlet = servlet;
    this.isPostRequest = isPost;
    this.contextPath = contextPath;
  }

  DispatchServlet getServlet()
  { 
    return servlet;
  }

  String getContextPath()
  { 
    return contextPath;
  }

  static
  { 
    pages.put("signup", SignupPage.class);
    pages.put("root", RootPage.class);
    pages.put("manageColor", ManageColorPage.class);
    pages.put("editColor", EditColorPage.class);
    pages.put("color", ColorPage.class);
    pages.put("createColor", CreateColorPage.class);
    pages.put("managePerson", ManagePersonPage.class);
    pages.put("editPerson", EditPersonPage.class);
    pages.put("person", PersonPage.class);
    pages.put("createPerson", CreatePersonPage.class);
    pages.put("pagenotfound", PagenotfoundPage.class);
    { 
      String[] s = {};
      pagearguments.put("signup", s);
      Boolean[] b = {};
      pageEntityArgs.put("signup", b);
    }
    { 
      String[] s = {};
      pagearguments.put("root", s);
      Boolean[] b = {};
      pageEntityArgs.put("root", b);
    }
    { 
      String[] s = {};
      pagearguments.put("manageColor", s);
      Boolean[] b = {};
      pageEntityArgs.put("manageColor", b);
    }
    { 
      String[] s = {"arg"};
      pagearguments.put("editColor", s);
      Boolean[] b = {true};
      pageEntityArgs.put("editColor", b);
    }
    { 
      String[] s = {"arg"};
      pagearguments.put("color", s);
      Boolean[] b = {true};
      pageEntityArgs.put("color", b);
    }
    { 
      String[] s = {};
      pagearguments.put("createColor", s);
      Boolean[] b = {};
      pageEntityArgs.put("createColor", b);
    }
    { 
      String[] s = {};
      pagearguments.put("managePerson", s);
      Boolean[] b = {};
      pageEntityArgs.put("managePerson", b);
    }
    { 
      String[] s = {"arg"};
      pagearguments.put("editPerson", s);
      Boolean[] b = {true};
      pageEntityArgs.put("editPerson", b);
    }
    { 
      String[] s = {"arg"};
      pagearguments.put("person", s);
      Boolean[] b = {true};
      pageEntityArgs.put("person", b);
    }
    { 
      String[] s = {};
      pagearguments.put("createPerson", s);
      Boolean[] b = {};
      pageEntityArgs.put("createPerson", b);
    }
    { 
      String[] s = {};
      pagearguments.put("pagenotfound", s);
      Boolean[] b = {};
      pageEntityArgs.put("pagenotfound", b);
    }
  }

  private void addToValues(String key, String val, Map<String, List<String>> parammapvalues)
  { 
    List<String> current = parammapvalues.get(key);
    if(current == null)
    { 
      List<String> newlist = new LinkedList<String>();
      newlist.add(val);
      parammapvalues.put(key, newlist);
    }
    else
    { 
      current.add(val);
    }
  }

  public boolean unspecifiedArgumentsContainEntityTypes(String requested, String[] argnames, int count)
  { 
    Boolean[] argEntityTypes = pageEntityArgs.get(requested);
    for(int in = argnames.length - 1; in >= count; in--)
    { 
      if(argEntityTypes[in] == true)
      { 
        return true;
      }
    }
    return false;
  }

  public String paramDecode(HttpServletRequest request, String param) throws UnsupportedEncodingException
  { 
    if(request.getCharacterEncoding() != null && request.getCharacterEncoding().equals("UTF-8"))
    { 
      return param;
    }
    else
    { 
      return new String(param.getBytes("ISO-8859-1"), "UTF-8");
    }
  }

  public void doServe(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  { 
    this.request = request;
    this.response = response;
    response.setCharacterEncoding("UTF-8");
    ThreadLocalServlet.set(this);
    boolean showerrorpage = false;
    try
    { 
      String[] req = request.getRequestURL().toString().split("/");
      int count;
      boolean first = false;
      if(ThreadLocalServlet.getContextPath().length() > 1)
      { 
        for(count = 0; count < req.length; count++)
        { 
          if(req[count].equals("BookShelf"))
          { 
            count++;
            break;
          }
        }
      }
      else
      { 
        count = 3;
      }
      String requested;
      String[] argnames;
      String[] args;
      if(count > req.length - 1)
      { 
        requested = "root";
        args = new String[0];
        argnames = new String[0];
      }
      else
      { 
        requested = req[count];
        args = java.util.Arrays.copyOfRange(req, count + 1, req.length);
        argnames = pagearguments.get(requested);
      }
      fileUploads = new HashMap<String, utils.File>();
      parammap = new HashMap<String, String>();
      parammapvalues = new HashMap<String, List<String>>();
      for(java.util.Enumeration en = request.getParameterNames(); en.hasMoreElements(); )
      { 
        String parameterName = (String)en.nextElement();
        parammap.put(parameterName, paramDecode(request, request.getParameter(parameterName)));
        for(String paramval : request.getParameterValues(parameterName))
        { 
          addToValues(parameterName, paramDecode(request, paramval), parammapvalues);
        }
      }
      messages = new LinkedList<String>();
      int count2 = 0;
      for(count2 = 0; count2 < args.length; count2++)
      { 
        if(count2 >= argnames.length)
        { }
        else
        { 
          parammap.put(argnames[count2], args[count2]);
          addToValues(argnames[count2], args[count2], parammapvalues);
        }
      }
      if(count2 < argnames.length)
      { 
        if(!isPostRequest && parammap.get("action-call-with-get-request-type") == null)
        { 
          if(unspecifiedArgumentsContainEntityTypes(requested, argnames, count2))
          { 
            throw new utils.TooFewArgumentsException();
          }
        }
      }
      boolean isMultipart = org.apache.commons.fileupload.servlet.ServletFileUpload.isMultipartContent(request);
      if(isMultipart)
      { 
        org.apache.commons.fileupload.FileItemFactory factory = new org.apache.commons.fileupload.disk.DiskFileItemFactory();
        org.apache.commons.fileupload.servlet.ServletFileUpload upload = new org.apache.commons.fileupload.servlet.ServletFileUpload(factory);
        try
        { 
          java.util.List<org.apache.commons.fileupload.FileItem> items = (java.util.List<org.apache.commons.fileupload.FileItem>)upload.parseRequest(request);
          java.util.Iterator<org.apache.commons.fileupload.FileItem> iter = items.iterator();
          while(iter.hasNext())
          { 
            org.apache.commons.fileupload.FileItem item = (org.apache.commons.fileupload.FileItem)iter.next();
            if(item.isFormField())
            { 
              String name = item.getFieldName();
              String value = item.getString();
              parammap.put(name, paramDecode(request, value));
              addToValues(name, paramDecode(request, value), parammapvalues);
            }
            else
            { 
              String fieldName = item.getFieldName();
              String fileName = item.getName();
              String contentType = item.getContentType();
              boolean isInMemory = item.isInMemory();
              long sizeInBytes = item.getSize();
              utils.File temp = new utils.File();
              temp.setFileName(fileName);
              temp.setContentType(contentType);
              temp.setSizeInBytes(sizeInBytes);
              temp.setContentStream(item.getInputStream());
              fileUploads.put(fieldName, temp);
            }
          }
        }
        catch(org.apache.commons.fileupload.FileUploadException ex)
        { 
          System.out.println("exception occured in file upload handling DispatchServlet");
          ex.printStackTrace();
        }
      }
      pc = pages.get(requested);
      if(pc == null)
      { 
        pc = pages.get("pagenotfound");
      }
      showerrorpage = !handlePage();
    }
    catch(utils.TooFewArgumentsException ex)
    { 
      showerrorpage = true;
    }
    catch(utils.AjaxWithGetRequestException ex)
    { 
      showerrorpage = true;
    }
    catch(Exception ex)
    { 
      System.out.println("Exception in dispatch servlet: " + ex.getMessage());
      ex.printStackTrace();
      showerrorpage = true;
    }
    if(showerrorpage)
    { 
      pc = pages.get("pagenotfound");
      if(!handlePage())
      { 
        response.setStatus(404);
        response.getWriter().write("<h3>404 Not Found</h3>");
      }
    }
  }

  private boolean handlePage()
  { 
    if(pc != null)
    { 
      try
      { 
        PageServlet pageservlet = (PageServlet)pc.newInstance();
        pageservlet.getIncomingSuccessMessages().addAll(messages);
        pageservlet.serve(request, response, parammap, parammapvalues, fileUploads);
      }
      catch(IllegalAccessException iae)
      { 
        System.out.println("Problem in dispatch servlet page lookup: " + iae.getMessage());
        iae.printStackTrace();
        return false;
      }
      catch(InstantiationException ie)
      { 
        System.out.println("Problem in dispatch servlet page lookup: " + ie.getMessage());
        ie.printStackTrace();
        return false;
      }
      catch(RuntimeException re)
      { 
        return false;
      }
    }
    else
    { 
      return false;
    }
    return true;
  }
}