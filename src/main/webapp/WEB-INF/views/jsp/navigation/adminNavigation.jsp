<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
        <a class="navbar-brand" href="index.html">TechTutoringService Admin</a>
    </div>

    <jsp:include page="navigation/adminTopMenuNavigation.jsp"/>

    <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
    <div class="collapse navbar-collapse navbar-ex1-collapse">
        <ul class="nav navbar-nav side-nav">
            <li>
                <a href="index-rtl.html"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
            </li>

            <li class="active">
                <a href="blank-page.html"><i class="fa fa-fw fa-file"></i> Create New Blog</a>
            </li>
        </ul>
    </div>
    <!-- /.navbar-collapse -->
</nav>
