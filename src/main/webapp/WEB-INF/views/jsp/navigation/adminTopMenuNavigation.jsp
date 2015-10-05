<%-- Top Navigation Component--%>
<ul class="nav navbar-top-links navbar-right">

    <%-- User Setting Top Navigation Component--%>
    <li class="dropdown">
        <%-- Icon to represent User on Top Navigation--%>
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
            <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
        </a>

        <%-- When User Icon is clicked, below lists are shown--%>
        <ul class="dropdown-menu dropdown-user">
            <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a></li>
            <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a></li>

            <%-- Logout Feature comes here--%>
            <li class="divider"></li>
            <li><a href='/logout'><i class="fa fa-sign-out fa-fw"></i> Logout</a></li>
        </ul>
    </li>
    <%-- End of User Setting Top Navigation Component--%>
</ul>

