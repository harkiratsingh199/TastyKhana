
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
         <style>
                      body{
                background-image: url("food_img/dessert.jpg");
                background-repeat: no-repeat;
                background-size: cover;
            }
        </style>
    
        <script>
            function go() {
                window.location.href = "admin_change_password1.jsp";
            }
            function go1() {
                window.location.href = "addmenu.jsp";
            }
            function go2() {
                window.location.href = "restaurant.jsp";
            }
            function go3() {
                window.location.href = "add_coupon.jsp";
            }
        </script>
    </head>
    <body>
        <div class="container">
            <h1 class="bg-success" style="text-align: center">Welcome admin</h1>
            <br>
            <br>
            <%
                String email = request.getParameter("em");

            %>

            <div class="row">
                <div class="col-sm-12">
                    <button class="btn btn-primary btn-block" onclick="go()">Change Password</button>
                    <button class="btn btn-primary btn-block" onclick="go1()">Add Menu</button>
                    <button class="btn btn-primary btn-block" onclick="go2()">Add Restaurant</button>
                    <button class="btn btn-primary btn-block" onclick="go3()">Add Coupon</button>
                </div>
            </div>
        </div>         
    </body>
</html>
