/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2017-01-04 06:20:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.Query;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

 int current;int init; 
 String[] answer; 
  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.Query");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"container\">\r\n");
      out.write("<div>\r\n");
      out.write("<h1> Welcome to forum</h1>\r\n");
      out.write("<span class=\"pull-right\">\r\n");
      out.write("<form action=\"postQuestion.jsp\"> <button class=\"btn btn-primary\" type=\"submit\">Post a Question</button></form>\r\n");
      out.write("</span>\r\n");
      out.write("<br><br>\r\n");
      out.write("</div>\r\n");
      out.write("<div>");
String[][] question = new Query().selectAll(); 
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write('\r');
      out.write('\n');

	if(request.getParameter("no")==null)
		current =0;
	else{
		current=Integer.parseInt(request.getParameter("no"));
		if(current>=question.length || current<-1)
			current=0;
	}
	try{
		  init=Integer.parseInt(request.getParameter("no1"));
		  if(init>=question.length || init<-1)
				init=0;
	}
	catch(Exception e){
		 init=0;
		 if(init>=question.length || init<-1)
				init=0;
	}

      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"panel panel-danger\">\r\n");
      out.write(" \t<div class=\"panel-heading\">\r\n");
      out.write(" \t");
      out.print(question[current][1] );
      out.write("\r\n");
      out.write(" \t\r\n");
      out.write(" \t\t</div>");
      out.write("\r\n");
      out.write("  \t\t<div class=\"panel-body\">\r\n");
      out.write("  \t\t<div>\r\n");
      out.write("  \r\n");
      out.write("     \t\t ");
answer=new Query().answer(current);
      out.write("\r\n");
      out.write("\t   \t\t <ul class=\"list-group\">\r\n");
      out.write("\t   \t\t \t<form class=\"well\" action=\"Page\">\r\n");
      out.write(" \t\t\t\t\t <div class=\"form-group\">\r\n");
      out.write(" \t\t\t\t     <label for=\"answer\">Post your Answer</label>\r\n");
      out.write("    \t\t\t\t <textarea class=\"form-control\" rows=\"3\" name=\"ans\"></textarea>\r\n");
      out.write("    \t\t\t\t <input type=\"hidden\" value=");
      out.print(current );
      out.write(" name=\"id\">\r\n");
      out.write(" \t\t\t\t\t <button class=\"btn btn-success\" name=button value=\"post\" type=\"submit\">submit</button>\r\n");
      out.write(" \t\t\t\t\t </div>\r\n");
      out.write("\t   \t\t  \t</form>\r\n");
      out.write("\t   \t\t ");
for(int j=0;j<answer.length;j++) {
      out.write("\r\n");
      out.write("\t   \t\t \t<li class=\"list-group-item\">\r\n");
      out.write("\t   \t\t\t\t");
      out.print(answer[j]);
      out.write("\r\n");
      out.write("\t   \t\t\t</li>\r\n");
      out.write("\t   \t\t </ul>\r\n");
      out.write("\t   \t\t ");
} 
      out.write("\r\n");
      out.write("   \t\t </div>\r\n");
      out.write("\t</div> \r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      out.write("\t<nav aria-label=\"Page navigation\">\r\n");
      out.write("  \t\t<ul class=\"pagination\">\r\n");
      out.write("    <li>");
int i1=init-5; 
      out.write("\r\n");
      out.write("      <a href=\"/Forum/index.jsp?no1=");
      out.print(i1);
      out.write("&no=");
      out.print(i1);
      out.write("\" aria-label=\"Previous\">\r\n");
      out.write("        <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("      </a>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    </li>\r\n");
      out.write("    ");
int count=1;
    for(int k=init;k<question.length;k++,init++){ 
    	if(count++>5){ count =1;break; }
    
      out.write("\r\n");
      out.write("    <li><a  href=\"/Forum/index.jsp?no=");
      out.print(k);
      out.write('"');
      out.write('>');
      out.print(k+1);
      out.write("</a></li>\r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    <li>\r\n");
      out.write("      <a href=\"/Forum/index.jsp?no1=");
      out.print(init);
      out.write("&no=");
      out.print(init);
      out.write("\" aria-label=\"Next\">\r\n");
      out.write("        <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("      </a>\r\n");
      out.write("   \t </li>\r\n");
      out.write(" \t </ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
