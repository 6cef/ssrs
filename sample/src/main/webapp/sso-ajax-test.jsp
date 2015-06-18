<html>
<head>

<% response.setHeader("Access-Control-Allow-Origin", "https://idp.ssocircle.com"); %>
<% response.setHeader("Access-Control-Allow-Credentials", "true"); %>

<script>
	function loadXMLDoc() {
		var xmlhttp = new XMLHttpRequest();

		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				document.getElementById("myDiv").innerHTML = xmlhttp.responseText;
			}
		}

		xmlhttp.withCredentials = true;
		
		xmlhttp
				.open("GET", "http://localhost:8080/spring-security-saml2-sample/hello.jsp",
						true);
		xmlhttp.send();
	}
</script>
</head>
<body>

	<iframe src="http://localhost:8080/spring-security-saml2-sample/">
	</iframe>
	<h2>AJAX</h2>
	<button type="button" onclick="loadXMLDoc()">Request data</button>
	<div id="myDiv"></div>

</body>
</html>
