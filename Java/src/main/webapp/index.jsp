<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru-RU">

<head>
    <meta charset="UTF-8">
    <style type="text/css">
        a.buttons {
            text-decoration: none;
            font-size: 24px;
            background: #eee;
            color: #088;
            display: block;
            width: 230px;
            text-align: center;
            margin: 10px auto;
            padding: 20px;
        }
        a.buttons:hover {
            box-shadow: 0px -5px 0 #088 inset;}

        body {position: relative;

            background: #FFFFFF;
            max-width: 360px;
            margin: 40px auto 100px;
            padding: 45px;
            text-align: center;
            box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
        }
    </style>
</head>

<body>
<header style="font-size: 30px; text-align:center">Movie Selection</header>
<a href="/Project_war_exploded/createPerson" class="buttons" style="margin-top:30px">
    Зарегистрироваться
</a>
<br/>
<a href="/Project_war_exploded/login" class="buttons">
   Войти
</a>
</body>

</html>