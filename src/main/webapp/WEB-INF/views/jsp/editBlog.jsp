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

    <c:if test="${empty urlHelper}">
        var1 is empty or null.
    </c:if>

    <%-- Navigatioin Side bar --%>
    <%@ include file="navigation/adminNavigation.jsp" %>

    <div id="page-wrapper">

        <div class="container">
            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">
                        Create New Tutorial
                        <small>Java</small>
                    </h1>

                    <ol class="breadcrumb">
                        <li>
                            <i class="fa fa-dashboard"></i> <a href="index.html">First Option</a>
                        </li>
                        <li class="active">
                            <i class="fa fa-file"></i> Second Option
                        </li>
                    </ol>
                </div>
            </div>
        </div>

        <%-- New Blog Creating Form --%>
        <form:form class="form-horizontal" method="POST" role="form">

            <%--Titel Section--%>
            <div class="form-group">
                <label class="control-label col-sm-2">Title:</label>

                <div class="col-sm-10">
                    <input name="title" type="input" class="form-control" placeholder="Enter Title" value="${title}">
                </div>
            </div>

            <%-- Sub Title Section--%>
            <div class="form-group">
                <label class="control-label col-sm-2">SubTitle:</label>

                <div class="col-sm-10">
                    <input name="subTitle" type="input" class="form-control" placeholder="Enter SubTitle" value="${subTitle}">
                </div>
            </div>

            <%-- Content Label--%>
            <div class="form-group">
                <label class="control-label col-sm-2"> Blog Information:</label>
                <div class="col-sm-10">
                    <textarea name="contents" class="form-control" rows="5" placeholder="Enter Blog Contents">${contents}</textarea>
                </div>
            </div>

            <%-- Submit & Preview buttons--%>
            <div class="form-group">
                <div class="button col-sm-2">
                    <button type="submit" class="button btn btn-default" onclick="form.action='${urlHelper.getUpdateBlogUrlPath()}'">Submit</button>
                    <button type="submit" class="button btn btn-default" onclick="form.action='/previewNewBlogPage'">Preview</button>
                </div>
            </div>

            <input name="id" type="input" hidden="hidden" value="${blogID}">

        </form:form>
    </div>

</div>

</body>
</html>
