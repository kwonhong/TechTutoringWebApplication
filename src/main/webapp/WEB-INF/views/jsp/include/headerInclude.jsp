<%--Tag Library for jsp--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%--Setting the internet/computer locale--%>
<fmt:setLocale value="${locale}"/>

<%-- Bootstrap Css and Js plugins --%>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<%-- Syntax Highlighter plugins --%>
<script type="text/javascript" src="../../../resources/core/syntax_highlighter/scripts/shCore.js"></script>
<script type="text/javascript" src="../../../resources/core/syntax_highlighter/scripts/shBrushJScript.js"></script>
<script type="text/javascript" src="../../../resources/core/syntax_highlighter/scripts/shBrushJava.js"></script>
<link type="text/css" rel="stylesheet" href="../../../resources/core/syntax_highlighter/styles/shCoreRDark.css"/>

<%-- JQuery Plugin--%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
