package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fforgot_005fpassword4_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


    String email = request.getParameter("email");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("         <style>\n");
      out.write("                      body{\n");
      out.write("                background-image: url(\"food_img/88.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 class=\"bg-danger\" style=\"text-align: center\" >New_Password_Form</h1>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("         <div class=\"container\">\n");
      out.write("             <form action=\"update_password.jsp\" method=\"post\" onsubmit=\"alert('hello')\" class=\"form-horizontal\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-sm-3\">Enter Your Password </label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("            \n");
      out.write("                        <input type=\"text\"  name=\"newpassword\" class=\"form-control\" required placeholder=\"new password\"/> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                 \n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                    \n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"hidden\" value=\"");
      out.print(email);
      out.write("\" name=\"email\"/> \n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label class=\"col-sm-3\">Confirm Your Password </label>\n");
      out.write("                    <div class=\"col-sm-9\">\n");
      out.write("                        <input type=\"text\" name=\"confirmpassword\" class=\"form-control\" required placeholder=\"confirm password\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                    <div class=\"col-sm-offset-3 col-sm-9\">\n");
      out.write("                    <button class=\"btn btn-primary\" type=\"submit\">Update</button>\n");
      out.write("                    </div>\n");
      out.write("                     </div>\n");
      out.write("                   \n");
      out.write("                                        \n");
      out.write("                      \n");
      out.write("             </form>\n");
      out.write("         </div>\n");
      out.write("   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
