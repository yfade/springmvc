<html>
<body>
<h2>Hello World!</h2>
<a href="/hello/sayHello">hello</a><br>
<a href="/hello/testModelAndView">testModelAndView</a><br>
<a href="/hello/testMethod">testMethod</a><br>
<form action="/hello/testMethod" method="post">
    <button type="submit">submit</button>
</form>
<a href="/hello/testParam?userName=''&age=10">testParam</a><br>
<a href="/hello/testPathVariable/100">testPathVariable</a><br>
<hr>

<form action="/hello/doPost" method="post">
    <button type="submit">doPost</button>
</form>

<form action="/hello/doDelete/1" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="doDelete">
</form>

<form action="/hello/doPut/1" method="post">
    <input type="hidden" name="_method" value="put">
    <button>doPut</button>
</form>

<a href="/hello/doGet/1">doGet</a>

<hr>
<a href="/hello/testRequestParam?userName=zhangsan&age=15">testRequestParam</a>
</body>
</html>
