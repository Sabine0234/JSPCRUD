<%@ page import="Service.UserService" %>
<%@ page import="ServiceImplemention.UserServiceIMP" %>
<%@ page import="Conroller.HibernateUtil" %>
<%@ page import="Model.UserJava" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Edit Form</title>
</head>
<body>

<%
  Integer id= Integer.valueOf(request.getParameter("id"));
  UserService service = new UserServiceIMP(HibernateUtil.getSessionFactory());
  UserJava user=new UserJava();
  user.setUser_id(id);
  UserJava u=service.findUser(user);
%>

<h1>Edit Form</h1>
<form action="edituser.jsp" method="post">
  <input type="hidden" name="id" value="<%=u.getUser_id() %>"/>
  <table>
    <tr><td>Name:</td><td>
      <input type="text" name="name" value="<%= u.getName()%>"/></td></tr>
    <tr><td>Password:</td><td>
      <input type="password" name="password" value="<%= u.getPassword()%>"/></td></tr>
    <tr><td>Email:</td><td>
      <input type="email" name="email" value="<%= u.getEmail()%>"/></td></tr>
    <tr><td>Sex:</td><td>
      <input type="radio" name="sex" value="male"/>Male
      <input type="radio" name="sex" value="female"/>Female </td></tr>
    <tr><td>Country:</td><td>
      <select name="country">
        <option>India</option>
        <option>Pakistan</option>
        <option>Afghanistan</option>
        <option>Berma</option>
        <option>Other</option>
      </select>
    </td></tr>
    <tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>
  </table>
</form>

</body>
</html>