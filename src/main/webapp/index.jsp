<html>
<head>
<title>Hello World!</title>
</head>
<body>
	<p style="font-size:40px ; color:green" >Hello, Welcome to My World! Your Application is Successfully Deployed.</p>
	<p>
		It is now
		<%= new java.util.Date() %></p>
	<p>
		You are coming from 
		<%= request.getRemoteAddr()  %></p>
</body>