<#ftl encoding="utf-8"/>
<html lang="ru-RU">
<head>
    <meta charset="UTF-8">
    <style type="text/css">
        buttons {
            text-decoration: none;
            font-size: 24px;
            background: #eee;
            color: #088;
            display: block;
            width: 230px;
            text-align: center;
            margin: 10px auto;
        }
        buttons:hover{
            box-shadow:0px -5px 0 #088 inset;
        }
        buttons {
            text-transform: uppercase;
            width: 100%;
            font-size: 14px;
            padding-top:20px;
            padding-bottom:20px;
        }
        .login-page {
            width: 360px;
            padding: 8% 0 0;
            margin: auto;
        }
        .form {
            position: relative;
            z-index: 1;
            background: #FFFFFF;
            max-width: 360px;
            margin: 0 auto 100px;
            padding: 45px;
            text-align: center;
            box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
        }
        .form input {
            outline: 0;
            background: #f2f2f2;
            width: 100%;
            border: 0;
            margin: 0 0 15px;
            padding: 15px;
            box-sizing: border-box;
            font-size: 14px;
        }
    </style>
</head>
<body>

<div class="login-page">

    <div class="form">
        <form class="login-form" name="person" action="/Project_war_exploded/createPersonAsAdmin" method="post">
            <input type="email" placeholder="email" name="email"/>
            <input type="password" placeholder="password" name="password"/>
            <input type="text" placeholder="status" name="status"/>
            <input type="submit" value="Создать" class="buttons" />
            <a href="/Project_war_exploded/usersList" id="buttons">Назад</a>
        </form>
    </div>

</div>
</body>
</html>