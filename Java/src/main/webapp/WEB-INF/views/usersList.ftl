<#ftl encoding="utf-8"/>
<html lang="ru-RU">
<head>
    <meta charset="UTF-8">
    <style type="text/css">

        #form {
            color: #626262;
            background: #FFFFFF;
            max-width: 400px;
            margin: 0 auto 100px;
            padding: 30px;
            box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
            font-size: 24px;
            text-align: center;
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
<body id="form" >
<h3>Список аккаунтов</h3>
<table style="text-align: center; font-size: 16px">
    <tr>
        <th>Id</th>
        <th>Email</th>
        <th>Пароль</th>
        <th>Cтатус</th>
        <th>Бан</th>
        <th>Бан?</th>
    </tr>
    <#list personsList as person>
        <tr>
            <td>${person.id}</td>
            <td>${person.email}</td>
            <td>${person.password}</td>
            <td>${person.status}</td>
            <td>${person.ban}</td>
            <td><a href="/Project_war_exploded/ban/${person.id}"> Ban</a></td>
        </tr>
    </#list>
</table>
<a id="buttons" href="/Project_war_exploded/createPersonAsAdmin">Cоздать аккаунт</a>
<a id="buttons" href="/Project_war_exploded/logout">Выйти</a>
<a id="buttons" href="/Project_war_exploded/adminPage">назад</a>
</body>
</html>