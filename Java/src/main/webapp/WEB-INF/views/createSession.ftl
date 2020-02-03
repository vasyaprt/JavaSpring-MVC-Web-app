<#ftl encoding="utf-8"/>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <style type="text/css">

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
            font-size: 14px;}
        input.buttons {
            text-decoration: none;
            font-size: 24px;
            background: #eee;
            color: #088;
            display: block;
            width: 230px;
            text-align: center;
            margin: 10px auto;
        }
        input.buttons:hover{
            box-shadow:0px -5px 0 #088 inset;
        }
        input.buttons {
            text-transform: uppercase;
            width: 100%;
            font-size: 14px;
            padding-top:20px;
            padding-bottom:20px;
        }

    </style>
</head>
<body>

<div class="login-page">
    <div class="form">
        <form name="person" action="/Project_war_exploded/createSession" method="post" class="login-form">
            <input type="text" placeholder="номер_фильма" name="movie"/>
            <input type="text" placeholder="номер_кино" name="cinema"/>
            <input type="text" placeholder="время и дата" name="date_time"/>
            <input type="text" placeholder="цена" name="price"/>
            <input type="submit" class="buttons" value="Добавить сеанс" />
            <a href="/Project_war_exploded/sessionList" id="buttons">Назад</a>

        </form>
    </div>

</div>
</body>
</html>