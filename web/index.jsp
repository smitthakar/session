<%-- 
    Document   : index
    Created on : 14 Mar, 2024, 9:16:56 AM
    Author     : smit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .container {
                width: 100%;
                max-width: 400px; /* Adjust as needed */
                margin: 0 auto;
                padding: 20px;
                border: 1px solid #ccc;
                border-radius: 5px;
                background-color: #f9f9f9;
            }
            h1{
                text-align: center;
            }
            .form {
                margin-bottom: 20px;
            }

            label {
                display: block;
                margin-bottom: 5px;
                font-weight: bold;
            }

            input[type="text"] {
                width: 100%;
                padding: 8px;
                border: 1px solid #ccc;
                border-radius: 3px;
                box-sizing: border-box; /* Ensures padding is included in width */
            }

            .btn {
                text-align: center;
            }

            input[type="submit"] {
                padding: 10px 20px;
                border: none;
                border-radius: 5px;
                cursor: pointer;
                transition: background-color 0.3s;
                background-color: #4CAF50; 
                color: white;
            }

            
        </style>
    </head>
    <body>
        <div class="container">
            <form action="sessioncrete" method="Post" onsubmit="">
                <h1>Session</h1>
                <div class="form">
                    <label for="input">Enter Name  </label>
                    <input type="text" name="name" id="name">
                </div>
                <div class="btn">
                    <input type="submit" value="Submit" name="btn" id="btn">
                </div>
            </form>
        </div>
    </body>
</html>
