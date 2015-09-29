<%--TODO Without DOCTYPE declared, some part of css doesn't work correctly.. Why?--%>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include file="/WEB-INF/views/jsp/include/headerInclude.jsp" %>
</head>

<body>
<div id="wrapper">

    <%-- Navigatioin Side bar --%>
    <%@ include file="navigation/adminNavigation.jsp" %>

    <%-- Dashboard Contents --%>
    <div id="page-wrapper">

        <%-- Table Header Comes here--%>
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">DashBoard</h1>
            </div>
        </div>

    </div>

</body>
</html>
