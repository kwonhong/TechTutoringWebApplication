<%@ include file="/WEB-INF/views/jsp/include/headerInclude.jsp" %>

<html lang="en">
<head>
    <link href="<c:url value="/resources/core/css/sb-admin-2.css" />" rel="stylesheet">
    <script type="text/javascript">SyntaxHighlighter.all();</script>
</head>

<style>
    .button {
        float: right;
        margin-left: 5px;
    }
</style>

<body>
<div id="wrapper">

    <%-- Navigatioin Side bar --%>
    <%@ include file="navigation/adminNavigation.jsp" %>

    <div id="page-wrapper">
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Tables</h1>
            </div>
            <!-- /.col-lg-12 -->
        </div>
        <!-- /.row -->
        <div class="row">
            <div class="col-lg-12">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        DataTables Advanced Tables
                    </div>
                    <!-- /.panel-heading -->
                    <div class="panel-body">
                        <div class="dataTable_wrapper">
                            <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                <thead>
                                <tr>
                                    <th>blogID</th>
                                    <th>title</th>
                                    <th>subTitle</th>
                                    <th>Creation Date</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="blog" items="${blogList}">
                                    <tr>
                                        <td>${blog.id}</td>
                                        <td>${blog.title}</td>
                                        <td>${blog.subTitle}</td>
                                        <td>${blog.createdDate.toString()}</td>
                                        <%--<td>${blog.creationDate}</td>--%>
                                    </tr>
                                </c:forEach>

                                <%--<tr class="gradeX">--%>
                                    <%--<td class="center"><input type="checkbox"/></td>--%>
                                    <%--<td>Misc</td>--%>
                                    <%--<td>Lynx</td>--%>
                                    <%--<td>Text only</td>--%>
                                    <%--<td class="center">-</td>--%>
                                    <%--<td class="center">X</td>--%>
                                    <%--<td><button type="button" class="btn btn-primary">View Detail</button></td>--%>
                                <%--</tr>--%>

                                </tbody>
                            </table>
                        </div>
                        <!-- /.table-responsive -->
                        <div class="well">
                            <h4>DataTables Usage Information</h4>

                            <p>DataTables is a very flexible, advanced tables plugin for jQuery. In SB Admin, we are
                                using a specialized version of DataTables built for Bootstrap 3. We have also customized
                                the table headings to use Font Awesome icons in place of images. For complete
                                documentation on DataTables, visit their website at <a target="_blank"
                                                                                       href="https://datatables.net/">https://datatables.net/</a>.
                            </p>
                            <a class="btn btn-default btn-lg btn-block" target="_blank" href="https://datatables.net/">View
                                DataTables Documentation</a>
                        </div>
                    </div>
                    <!-- /.panel-body -->
                </div>
                <!-- /.panel -->
            </div>
            <!-- /.col-lg-12 -->
        </div>
    </div>

</div>

</body>
</html>
