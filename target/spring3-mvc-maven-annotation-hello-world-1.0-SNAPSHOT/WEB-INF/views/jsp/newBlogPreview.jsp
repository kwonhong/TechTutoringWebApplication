<%@ include file="/WEB-INF/views/jsp/include/headerInclude.jsp" %>
<!DOCTYPE html>
<html lang="en">


<head>

    <title>Clean Blog - Sample Post</title>

    <!-- Bootstrap Core CSS -->
    <link href="../../../resources/core/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../../../resources/core/
    css/clean-blog.min.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href='http://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <script type="text/javascript">SyntaxHighlighter.all();</script>

</head>

<body>

<!-- Page Header -->
<!-- Set your background image for this header on the line below. -->
<header class="intro-header" style="background-image: url('../../../resources/core/img/post-bg.jpg')">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
                <div class="post-heading">
                    <h1>${title}</h1>
                    <h2 class="subheading">${subTitle}</h2>
                    <span class="meta">Posted by <a href="#">Start Bootstrap</a> on ${createdDate}</span>
                </div>
            </div>
        </div>
    </div>
</header>

<!-- Post Content -->
<article>
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">

                <c:forEach var="blogComponent" items="${blogComponents}" >

                    <c:choose>
                        <c:when test="${blogComponent.blogComponentType=='HEADER'}">
                            <h2 class="section-heading">${blogComponent.content}</h2>
                        </c:when>

                        <c:when test="${blogComponent.blogComponentType=='PARAGRAPH'}">
                            <p> ${blogComponent.content} </p>
                        </c:when>

                        <c:when test="${blogComponent.blogComponentType=='JAVA'}">
                           <pre class="brush: java;">
                                public static void main() {
                                    // This doesn't really make sense yet
                                    int hello = 3;
                                }
                            </pre>
                        </c:when>

                        <c:when test="${blogComponent.blogComponentType=='QUOTE'}">
                            <blockquote> ${blogComponent.content}</blockquote>
                        </c:when>

                        <c:when test="${blogComponent.blogComponentType=='IMAGE'}">
                            <img class="img-responsive" src="${blogComponent.content}" alt="">
                        </c:when>

                        <c:when test="${blogComponent.blogComponentType=='CAPTION'}">
                            <span class="caption text-muted"> ${blogComponent.content} </span>
                        </c:when>

                        <c:otherwise>
                            Something else has been detected.
                        </c:otherwise>
                    </c:choose>

                </c:forEach>
            </div>
        </div>
    </div>
</article>

<hr>

</body>

</html>
