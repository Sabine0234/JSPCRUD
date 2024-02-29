
<%@page import="Repository.UserDao"%>
<%@ page import="Service.UserService" %>
<%@ page import="ServiceImplemention.UserServiceIMP" %>
<%@ page import="Conroller.HibernateUtil" %>
<%@ page import="Model.UserJava" %>
<jsp:useBean id="u" class="Model.UserJava"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%
    UserService service = new UserServiceIMP(HibernateUtil.getSessionFactory());
    UserJava theUser = service.removeUser(u);
    response.sendRedirect("viewusers.jsp");
%>
