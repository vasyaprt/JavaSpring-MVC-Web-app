<#ftl encoding="utf-8"/>
<html lang="ru-RU">
<head>
    <meta charset="UTF-8">
    <style type="text/css">

        <  style type  = "text/css"  >

        #form {
            color: #088;
            background: #FFFFFF;
            max-width: 460px;
            margin: 50px auto 300px;
            padding: 45px;
            text-align: center;
            box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
            font-size: 24px;

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

        #buttons {
            text-decoration: none;
            background: #eee;
            color: #088;
            display: block;
            text-align: center;
            margin: 10px auto;
            text-transform: uppercase;
width :460px;
            font-size: 14px;
            padding-top: 20px;
            padding-bottom: 20px;
        }

        #buttons:hover {
            box-shadow: 0px -5px 0 #088 inset;

        }


    </style>
</head>
<body>
<div id="form">
<a id="buttons" href="/Project_war_exploded/usersList">Список пользователей</a>
<a id="buttons" href="/Project_war_exploded/movieList">Редактировать фильмы</a>
<a id="buttons" href="/Project_war_exploded/sessionList">Редактировать сеансы</a>
<a id="buttons" href="/Project_war_exploded/createPersonAsAdmin">Cоздать аккаунт</a>
<a id="buttons" href="/Project_war_exploded/logout">Выйти</a>
</div>
</body>
</html>
