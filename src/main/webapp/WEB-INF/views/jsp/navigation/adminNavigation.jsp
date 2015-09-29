<!-- Navigation -->
<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">

    <%-- Navigation Header--%>
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="index.html">SB Admin v2.0</a>
    </div>

    <%-- Top Part Navigation--%>
    <jsp:include page="navigation/adminTopMenuNavigation.jsp"/>

    <%--Side Bar Navigation Starts--%>
    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <ul class="nav" id="side-menu">

                <%--Searching Box--%>
                <li class="sidebar-search">
                    <div class="input-group custom-search-form">
                        <input type="text" class="form-control" placeholder="Search...">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button">
                                <i class="fa fa-search"></i>
                            </button>
                        </span>
                    </div>
                </li>

                <%-- Dashboard Button--%>
                <li>
                    <a href="<c:url value='${urlHelper.getDashBoardUrlPath()}' />"><i class="fa fa-dashboard fa-fw"></i>  DashBoard</a>
                </li>

                <li>
                    <a href="#"> Manage Blog </a>
                    <ul class="nav nav-second-level">
                        <li>
                            <a href="<c:url value='${urlHelper.getCreateBlogUrlPath()}' />"> <i class="fa fa-edit fa-fw"></i>Create Blog</a>
                        </li>
                        <li>
                            <a href="<c:url value='${urlHelper.getFindBlogUrlPath()}' />"> <i class="fa fa-table fa-fw"></i>Find Blog</a>
                        </li>
                    </ul>
                </li>

            </ul>
        </div>
    </div>

</nav>
