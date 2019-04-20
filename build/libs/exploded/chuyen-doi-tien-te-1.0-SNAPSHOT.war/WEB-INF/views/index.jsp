<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/abc" method="post">
   Money: <input type="number" name="money">
    <select name="moneyChangeForm" id="moneyChangeForm">
        <option value="usd">USD</option>
        <option value="vnd">VND</option>
    </select>
    <select name="toMoney" id="toMoney">
        <option value="usd">USD</option>
        <option value="vnd">VND</option>
    </select>
    <input type="submit" value="submit">
</form>
<h2>${result}</h2>
</body>
</html>