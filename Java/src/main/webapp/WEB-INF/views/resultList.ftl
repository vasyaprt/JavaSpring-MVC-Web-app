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

<table style="text-align: center; font-size: 16px">
    <tr>
        <th>Фильм</th>
        <th>Описание</th>
        <th>Кинотеатр</th>
        <th>Дата и время</th>
        <th>Цена</th>
    </tr>
    <#list selectList as selected>
        <tr>
            <td>${selected.movie_name}</td>
            <td style="text-align: left">${selected.movie_description}</td>
            <td>${selected.cinema_name}</td>
            <td>${selected.session_date_time}</td>
            <td>${selected.session_price}</td>
        </tr>
    </#list>
</table>
<a id="buttons" href="/Project_war_exploded/logout">Выйти</a>
<a id="buttons" href="/Project_war_exploded/choice">Попробоать еще раз</a>
</body>
</html>