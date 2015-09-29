<%--TODO Without DOCTYPE declared, some part of css doesn't work correctly.. Why?--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include file="/WEB-INF/views/jsp/include/headerInclude.jsp" %>
    <script type="text/javascript">SyntaxHighlighter.all();</script>
</head>

<style>
    button {
        float: right;
        margin-left: 5px;
    }
</style>

<body>
<div id="wrapper">

    <%-- Navigatioin Side bar --%>
    <%@ include file="navigation/adminNavigation.jsp" %>

    <div id="page-wrapper">

        <%-- Table Header Comes here--%>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Blog</h1>
            </div>
        </div>

        <%-- New Blog Creating Form --%>
        <div class="row">
            <form:form class="form-horizontal" method="POST" role="form">

                <%--Titel Section--%>
                <div class="form-group">
                    <label class="col-sm-1 control-label">Title:</label>

                    <div class="col-sm-6">
                        <input name="title" type="input" class="form-control" placeholder="Enter Title"
                               value="${title}">
                    </div>
                </div>

                <%-- Sub Title Section--%>
                <div class="form-group">
                    <label class="control-label col-sm-1">SubTitle:</label>

                    <div class="col-sm-6">
                        <input name="subTitle" type="input" class="form-control" placeholder="Enter SubTitle"
                               value="${subTitle}">
                    </div>
                </div>

                <%-- Content Label--%>
                <div class="form-group">
                    <label class="control-label col-sm-1"> Blog Contents:</label>

                    <div class="col-sm-6">
                        <textarea name="contents" class="form-control" rows="5"
                                  placeholder="Enter Blog Contents">${contents}</textarea>
                    </div>
                </div>

                <%-- Submit & Preview buttons--%>
                <div class="form-group">
                    <div class="button col-lg-offset-5 col-sm-2">
                        <button type="submit" class="button btn btn-default"
                                onclick="form.action='${urlHelper.getUpdateBlogUrlPath()}'">Submit
                        </button>
                        <button type="submit" class="button btn btn-default"
                                onclick="form.action='${urlHelper.getPreviewBlogUrlPath()}'">Preview
                        </button>
                    </div>
                </div>

                <%-- Blog Id that can be used to modified--%>
                <c:if test="${not empty blogID}">
                    <input name="id" type="input" hidden="hidden" value="${blogID}">
                </c:if>

            </form:form>
        </div>
    </div>

</div>

</body>
</html>
