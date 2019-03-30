package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Date time = new Date();
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

      out.write("<!--这里是welcome.jsp-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0, \n");
      out.write("              minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\"/>\n");
      out.write("        <title>欢迎0.0</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\">欢迎使用学生管理系统</h1>\n");
      out.write("        <a href=\"login.jsp\"><h2 align=\"center\">点击进入</h2></a>\n");
      out.write("        <div align=\"center\" style=\"width:100%; position:fixed; bottom:0;\">\n");
      out.write("            ");

                int num = 1;
                if (application.getAttribute("Count") == null) {
                    num = 1;
                } else {
                    num = ((Integer) application.getAttribute("Count")).intValue();
                    num++;
                }
                application.setAttribute("Count", new Integer(num));
            
      out.write("\n");
      out.write("            ");
      out.print("欢迎访问本站，" + "您是第" + num + "个访问用户");
      out.write("\n");
      out.write("        <br>\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");

                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 E HH时mm分ss秒");
            
      out.write("\n");
      out.write("            ");
 out.println(sdf1.format(time));
      out.write("\n");
      out.write("        </div>\n");
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
