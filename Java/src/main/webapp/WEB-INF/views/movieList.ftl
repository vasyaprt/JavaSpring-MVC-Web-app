<#ftl encoding="utf-8"/>
<html lang="ru-RU">
<head>
    <meta charset="UTF-8">
    <style type="text/css">

        #form {
            color: #626262;
            background: #FFFFFF;
            margin-right: 100px;
            margin-left: 100px;
            padding: 30px;
            box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
            font-size: 24px;
            margin-top: 100px;
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
            width: 100%;
            font-size: 14px;
            padding-top: 20px;
            padding-bottom: 20px;
        }

        #buttons:hover {
            box-shadow: 0px -5px 0 #088 inset;
        }

        td {
            padding: 10px;
        }

        th {
            padding: 10px;
        }

    </style>
</head>
<body id="form">
<h3>Список фильмов</h3>
<table style="text-align: center; font-size: 16px">
    <tr>
        <th>Название</th>
        <th>Описание</th>

    </tr>
    <#list movies as movie>
        <tr>
            <td>${movie.name}</td>
            <td>${movie.description}</td>

        </tr>
    </#list>
</table>
<a id="buttons" href="/Project_war_exploded/createMovie">Добавить фильм</a>
<a id="buttons" href="/Project_war_exploded/logout">Выйти</a>
<a id="buttons" href="/Project_war_exploded/adminPage">назад</a>
</body>
</html>