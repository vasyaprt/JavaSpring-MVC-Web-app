<#ftl encoding="utf-8"/>
<html lang="ru-RU">
<head>
    <meta charset="UTF-8">
    <style type="text/css">

        #form {
            color: #626262;
            background: #FFFFFF;
            max-width: 360px;
            margin: 0 auto 100px;
            padding: 30px;
            box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
            font-size: 24px;
        }

        .input {
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
            font-size: 24px;
            background: #eee;
            color: #088;
            display: block;
            width: 230px;
            text-align: center;
            margin: 10px auto;
        }
        #buttons:hover{
            box-shadow:0px -5px 0 #088 inset;
        }
        #buttons {
            text-transform: uppercase;
            width: 100%;
            font-size: 14px;
            padding-top:20px;
            padding-bottom:20px;
        }


    </style>
</head>
<body>
<form name="result"  method="post" id="form">
    <p style="color:red">Вы не выбрали параметры из каждого пункта </p>
    <p>1.Выберете кинотеатры, которые вам удобны</p>
    <#list cinemaList as cinema>
        <label><input type="checkbox" value="${cinema.id}" name="cinema_id"/>${cinema.name}
        </label>
        <br/>
    </#list>
    <br/>
    <p>2.Выберете Фильмы, которые вы НЕ хотите смотреть</p>
    <#list movieList as movie>
        <label><input type="checkbox" value="${movie.id}" name="movie_id"/>${movie.name}
        </label>
        <br/>
    </#list>
    <input id="buttons"  type="submit" formaction="/Project_war_exploded/selectOne" value="Показать результат" class="input"/>
    <input id="buttons" type="submit" formaction="/Project_war_exploded/select" value="Показать все варианты" class="input"/>
    <a id="buttons" href="/Project_war_exploded/logout">Выйти</a>
</form>

</body></html>
