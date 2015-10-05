<%--
  Created by IntelliJ IDEA.
  User: honkwon
  Date: 15-09-25
  Time: 1:32 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>

  <TITLE>Crunchify - Spring MVC Example with AJAX call</TITLE>

  <style type="text/css">
    body {
      background-image:
      url('http://cdn3.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
    }
  </style>

  <script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
  <script type="text/javascript">
    function crunchifyAjax() {
      $.ajax({
        url : 'ajaxtest.html',
        success : function(data) {
          $('#result').html(data);
          $('#result2').html("${message}");
        }
      });
    }
  </script>

  <script type="text/javascript">
    var intervalId = 0;
    intervalId = setInterval(crunchifyAjax, 3000);
  </script>
</head>

<body>
<div align="center">
  <br> <br> ${message} <br> <br>
  <div id="result"></div>
  <br>
  <p>
    by <a href="http://crunchify.com">Crunchify.com</a>
  </p>
  <br>
  <div id="result2" ></div>
</div>
</body>
</html>
