<!--这里是welcome.jsp-->
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width,initial-scale=1.0, 
              minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
        <title>欢迎0.0</title>
    </head>
    <body>
        <h1 align="center">欢迎使用学生管理系统</h1>
        <a href="login.jsp"><h2 align="center">点击进入</h2></a>
        <div align="center" style="width:100%; position:fixed; bottom:0;">
            <%
                int num = 1;
                if (application.getAttribute("Count") == null) {
                    num = 1;
                } else {
                    num = ((Integer) application.getAttribute("Count")).intValue();
                    num++;
                }
                application.setAttribute("Count", new Integer(num));
            %>
            <%="欢迎访问本站，" + "您是第" + num + "个访问用户"%>
        <br>
            <%!Date time = new Date();%>
            <%
                SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 E HH时mm分ss秒");
            %>
            <% out.println(sdf1.format(time));%>
        </div>
    </body>
</html>
