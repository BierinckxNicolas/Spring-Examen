<%--
  Created by IntelliJ IDEA.
  User: nicolas
  Date: 06/09/2018
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Make a joke</title>
</head>
<body>

<div class='well'>
    <h1>Make a joke</h1>
    <br/>
    <form method=POST action='joke_post' onsubmit='return validate()'>
        <div class='form-group row'>
            <div class='col-xs-4'>
                <label for='firstName'>First Name : </label>
                <input type='text' class='form-control' name='firstName' id='firstName'>
            </div>
        </div>
        <div class='form-group row'>
            <div class='col-xs-4'>
                <label for='lastName'>Last Name : </label>
                <input type='text' class='form-control' name='lastName' id='lastName'>
            </div>
        </div>

        <input type=SUBMIT value='Save'>
    </form>

</div>

</body>
</html>
