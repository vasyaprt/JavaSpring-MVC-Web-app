<#ftl encoding="utf-8"/>
<html lang="ru-RU">
<head>
    <meta charset="UTF-8">
    <style type="text/css">

        #form {
            color: #626262;
            background: #FFFFFF;
            max-width: 500px;
            padding: 50px;
            margin: 0 auto 300px;
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
            width: 100%;
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

<div id="form" style="text-align: center">
    <p> Мы предлагаем вам сходить на фильм: </p>
    <h1>${selectedOne.movie_name}</h1>

    ${selectedOne.movie_description}
    <br/>
    <h3> ${selectedOne.cinema_name}</h3>
    <h3>Дата и время: ${selectedOne.session_date_time}</h3>
    <h3> ${selectedOne.session_price} РУБ</h3>
    <br/>
    <a id="buttons" href="/Project_war_exploded/logout">Выйти</a>
    <a id="buttons" href="/Project_war_exploded/choice">Попробоать еще раз</a>

</div>

</body>
</html>