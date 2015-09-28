<%@ include file="/WEB-INF/views/jsp/include/headerInclude.jsp" %>

<html lang="en">
<head>
  <link href="<c:url value="/resources/core/css/sb-admin-2.css" />" rel="stylesheet">
  <script type="text/javascript">SyntaxHighlighter.all();</script>
</head>

<body>
<div id="wrapper">

  <c:if test="${empty urlHelper}">
    var1 is empty or null.
  </c:if>

  <%-- Login Box--%>
  <div class="container">
    <div class="row">
      <div class="col-md-4 col-md-offset-4">
        <div class="login-panel panel panel-default">
          <div class="panel-heading">
            <h3 class="panel-title">Please Sign In</h3>
          </div>
          <div class="panel-body">
            <form:form role="form" method ="POST">
              <fieldset>
                <div class="form-group">
                  <input class="form-control" placeholder="Username" name="username" type="text" required = "true" autofocus>
                </div>
                <div class="form-group">
                  <input class="form-control" placeholder="Password" name="password" type="password"required = "true>
                </div>
                <div class="checkbox">
                  <label>
                    <input name="remember" type="checkbox" value="Remember Me">Remember Me
                  </label>
                </div>
                <!-- Change this to a button or input when using this as a form -->
                <button  class="btn btn-lg btn-success btn-block" onclick="form.action= '/' "> Login </button>
              </fieldset>
            </form:form>
          </div>
        </div>
      </div>
    </div>
  </div>

</div>

</body>
</html>
