<%--Tag Library for jsp--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%--Setting the internet/computer locale--%>
<fmt:setLocale value="${locale}"/>

<%-- Css Plugins--%>
<link href='<c:url value="/resources/bower_components/bootstrap/dist/css/bootstrap.min.css" />' rel="stylesheet">
<link href='<c:url value="/resources/bower_components/metisMenu/dist/metisMenu.min.css" />' rel="stylesheet">
<link href='<c:url value="/resources/dist/css/sb-admin-2.css" />' rel="stylesheet">
<link href='<c:url value="/resources/bower_components/font-awesome/css/font-awesome.min.css"/>' rel="stylesheet" type="text/css"/>

<%-- Javascript plugins--%>
<script src="<c:url value="/resources/bower_components/jquery/dist/jquery.min.js" />"></script>
<script src="<c:url value="/resources/bower_components/bootstrap/dist/js/bootstrap.min.js" />"></script>
<script src="<c:url value="/resources/bower_components/metisMenu/dist/metisMenu.min.js" />"></script>
<script src="<c:url value="/resources/dist/js/sb-admin-2.js" />"></script>

<%-- Syntax Highlighter plugins --%>
<%--<script type="text/javascript" src="../../../resources/core/syntax_highlighter/scripts/shCore.js"></script>--%>
<%--<script type="text/javascript" src="../../../resources/core/syntax_highlighter/scripts/shBrushJScript.js"></script>--%>
<%--<script type="text/javascript" src="../../../resources/core/syntax_highlighter/scripts/shBrushJava.js"></script>--%>
