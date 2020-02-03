<#ftl encoding="utf-8"/>
<html lang="ru-RU">
<head>
    <meta charset="UTF-8">
    <style type="text/css">

        #form {
            color: #626262;
            background: #FFFFFF;
            max-width: 500px;
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

<form name="session" action="/Project_war_exploded/updateSession" method="post" id="form">
    <h3>Изменить информацию о авторе</h3>
    <table>
        <tr>
            <td>Id</td>
            <td><input  type="hidden" name="id" value="${session.id}">${session.id}</td>
        </tr>
        <tr>
            <td>Movie</td>
            <td><input  type="text" name="movie" value="${session.movie}"></td>
        </tr>
        <tr>
            <td>Cinema</td>
            <td><input  type="text" name="cinema" value="${session.cinema}"></td>
        </tr>
        <tr>
            <td>Date</td>
            <td><input  type="text" name="date_time" value="${session.date_time}"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input  type="text" name="price" value="${session.price}"></td>
        </tr>
    </table>
    <input type="submit" value="OK" id="buttons">
</form>