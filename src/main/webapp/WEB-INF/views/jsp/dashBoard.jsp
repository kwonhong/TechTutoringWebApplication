<%@ include file="/WEB-INF/views/jsp/include/headerInclude.jsp" %>

<html lang="en">
<head>
  <link href="<c:url value="/resources/core/css/sb-admin-2.css" />" rel="stylesheet">
  <script type="text/javascript">SyntaxHighlighter.all();</script>
</head>

<style>
  .button {
    float:right;
    margin-left: 5px;
  }
</style>

<body>
<div id="wrapper">

  <%-- Navigatioin Side bar --%>
  <%@ include file="navigation/adminNavigation.jsp" %>

  <div id="page-wrapper">

    <div class="container">
      <!-- Page Heading -->
      <div class="row">
        <div class="col-lg-12">
          <h1 class="page-header">
            List of Blogs Created
          </h1>
        </div>
      </div>

      <c:forEach var = "Blog" items="${blogList}">
        <p> ${blogList.size()} </p>
      </c:forEach>

    </div>
  </div>

</div>

</body>
</html>
