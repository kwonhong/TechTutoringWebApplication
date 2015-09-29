<%--TODO Without DOCTYPE declared, some part of css doesn't work correctly.. Why?--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include file="/WEB-INF/views/jsp/include/headerInclude.jsp" %>
    <script type="text/javascript">SyntaxHighlighter.all();</script>
</head>

<body>
<div id="wrapper">

    <%-- Navigatioin Side bar --%>
    <%@ include file="navigation/adminNavigation.jsp" %>

    <%-- Blog Table Contents Comes here--%>
    <div id="page-wrapper">

        <%-- Table Header Comes here--%>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Tables</h1>
            </div>
        </div>

        <%-- Actual Table Comes here--%>
        <div class="row">
            <div class="col-lg-12">

                <div class="panel panel-default">
                    <%-- Table Subheading--%>
                    <div class="panel-heading">
                        DataTables Advanced Tables
                    </div>

                    <%-- Table Contents --%>
                    <div class="panel-body">
                        <div class="dataTable_wrapper">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                <tr>
                                    <th>blogID</th>
                                    <th>title</th>
                                    <th>subTitle</th>
                                    <th>Creation Date</th>
                                    <th>Contents</th>
                                    <th></th>
                                </tr>
                                </thead>

                                <tbody>
                                <c:forEach var="blog" items="${blogList}">
                                    <tr>
                                        <td>${blog.id}</td>
                                        <td>${blog.title}</td>
                                        <td>${blog.subTitle}</td>
                                        <td>${blog.createdDate.toString()}</td>
                                        <td>${blog.contents}</td>
                                        <td>
                                            <a href="${pageContext.request.contextPath}/editBlog/${blog.id}">
                                                <button type="button" class="btn btn-warning">Edit</button>
                                            </a>
                                            <a href="${pageContext.request.contextPath}/deleteBlog/${blog.id}">
                                                <button type="button" class="btn btn-danger">Delete<br/></button>
                                            </a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    <%--End of Table Content--%>
                </div>

            </div>
        </div>
        <%--End of Actual Table Comes here--%>

    </div>
</div>

</body>
</html>
