<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login</title>
</head>
<body>

<form action="{{route("login.post")}}" method="POST">
    @csrf

    <h1>Login</h1>
    <hr>

    <div>
        <label>Username</label><br/>
        <input type="text" name="username"><br/>
    </div>

    <div>
        <label>Password</label><br/>
        <input type="password" name="password"><br/>
    </div>

    <div>
        <br/>
        <button type="submit">Submit</button>
    </div>


</form>

</body>
</html>
