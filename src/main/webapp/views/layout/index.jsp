<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <meta name="description" content="">
    <meta name="author" content="">

    <title>Phimmoi</title>

    <!-- CSS FILES -->
    <link rel="preconnect" href="https://fonts.googleapis.com">

    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>

    <link
        href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400&family=Sono:wght@200;300;400;500;700&display=swap"
        rel="stylesheet">

    <link rel="stylesheet" href="../util/css/bootstrap.min.css">

    <link rel="stylesheet" href="../util/css/bootstrap-icons.css">

    <link rel="stylesheet" href="../util/css/owl.carousel.min.css">

    <link rel="stylesheet" href="../util/css/owl.theme.default.min.css">

    <link href="../util/css/templatemo-pod-talk.css" rel="stylesheet">

    <!--

TemplateMo 584 Pod Talk

https://templatemo.com/tm-584-pod-talk

-->
</head>

<body>

    <main>

<%--        <nav class="navbar navbar-expand-lg">--%>
<%--            <div class="container">--%>
<%--                <a class="navbar-brand me-lg-5 me-0" href="index">--%>
<%--                    <img src="../util/images/logo.png" class="rounded-circle logo-image img-fluid" alt="Logo Movie">--%>
<%--                </a>--%>

<%--                <form action="#" method="get" class="custom-form search-form flex-fill me-3" role="search">--%>
<%--                    <div class="input-group input-group-lg">--%>
<%--                        <input name="search" type="search" class="form-control" id="search" placeholder="Search Podcast"--%>
<%--                            aria-label="Search">--%>

<%--                        <button type="submit" class="form-control" id="submit">--%>
<%--                            <i class="bi-search"></i>--%>
<%--                        </button>--%>
<%--                    </div>--%>
<%--                </form>--%>

<%--                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"--%>
<%--                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">--%>
<%--                    <span class="navbar-toggler-icon"></span>--%>
<%--                </button>--%>

<%--                <div class="collapse navbar-collapse" id="navbarNav">--%>
<%--                    <ul class="navbar-nav ms-lg-auto">--%>
<%--                        <li class="nav-item dropdown">--%>
<%--                                <c:choose>--%>
<%--                                <c:when test="${empty sessionScope.user}">--%>
<%--                                    <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button"--%>
<%--                                       data-bs-toggle="dropdown" aria-expanded="false">--%>
<%--                                        Account--%>
<%--                                    </a>--%>
<%--                                    <ul class="dropdown-menu dropdown-menu-dark">--%>
<%--                                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/login">Log in</a></li>--%>
<%--                                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/forgot">Forgot Password</a></li>--%>
<%--                                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/regis">Register</a></li>--%>
<%--                                    </ul>--%>
<%--                                </c:when>--%>
<%--                                <c:otherwise>--%>
<%--                                    <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button"--%>
<%--                                       data-bs-toggle="dropdown" aria-expanded="false">--%>
<%--                                            ${sessionScope.user.fullname}--%>
<%--                                    </a>--%>
<%--                                    <ul class="dropdown-menu dropdown-menu-light">--%>
<%--                                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/myfavorite">My Favorite</a></li>--%>
<%--                                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/changer">Change Password</a></li>--%>
<%--                                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/edit-profile">Edit Profile</a></li>--%>
<%--                                        <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/logoff">Logoff</a></li>--%>
<%--                                    </ul>--%>
<%--                                </c:otherwise>--%>
<%--                                </c:choose>--%>
<%--                        </li>--%>
<%--                    </ul>--%>

<%--                </div>--%>
<%--            </div>--%>
<%--        </nav>--%>
<%@include file="menu.jsp"%>

        <section class="hero-section">
            <div class="container">
                <div class="row">

                    <div class="col-lg-12 col-12">
                        <div class="owl-carousel owl-theme">
                            <div class="owl-carousel-info-wrap item">
                                <img src="../util/images/profile/smiling-business-woman-with-folded-hands-against-white-wall-toothy-smile-crossed-arms.jpg"
                                    class="owl-carousel-image img-fluid" alt="">

                                <div class="owl-carousel-info">
                                    <h4 class="mb-2">
                                        Candice
                                        <img src="../util/images/verified.png" class="owl-carousel-verified-image img-fluid"
                                            alt="">
                                    </h4>

                                    <span class="badge">Storytelling</span>

                                    <span class="badge">Business</span>
                                </div>

                                <div class="social-share">
                                    <ul class="social-icon">
                                        <li class="social-icon-item">
                                            <a href="#" class="social-icon-link bi-twitter"></a>
                                        </li>

                                        <li class="social-icon-item">
                                            <a href="#" class="social-icon-link bi-facebook"></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>

                            <div class="owl-carousel-info-wrap item">
                                <img src="../util/images/profile/handsome-asian-man-listening-music-through-headphones.jpg"
                                    class="owl-carousel-image img-fluid" alt="">

                                <div class="owl-carousel-info">
                                    <h4 class="mb-2">
                                        William
                                        <img src="../images/verified.png" class="owl-carousel-verified-image img-fluid"
                                            alt="">
                                    </h4>

                                    <span class="badge">Creative</span>

                                    <span class="badge">Design</span>
                                </div>

                                <div class="social-share">
                                    <ul class="social-icon">
                                        <li class="social-icon-item">
                                            <a href="#" class="social-icon-link bi-twitter"></a>
                                        </li>

                                        <li class="social-icon-item">
                                            <a href="#" class="social-icon-link bi-facebook"></a>
                                        </li>

                                        <li class="social-icon-item">
                                            <a href="#" class="social-icon-link bi-pinterest"></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>

                            <div class="owl-carousel-info-wrap item">
                                <img src="../util/images/profile/cute-smiling-woman-outdoor-portrait.jpg"
                                    class="owl-carousel-image img-fluid" alt="">

                                <div class="owl-carousel-info">
                                    <h4 class="mb-2">Taylor</h4>

                                    <span class="badge">Modeling</span>

                                    <span class="badge">Fashion</span>
                                </div>

                                <div class="social-share">
                                    <ul class="social-icon">
                                        <li class="social-icon-item">
                                            <a href="#" class="social-icon-link bi-twitter"></a>
                                        </li>

                                        <li class="social-icon-item">
                                            <a href="#" class="social-icon-link bi-facebook"></a>
                                        </li>

                                        <li class="social-icon-item">
                                            <a href="#" class="social-icon-link bi-pinterest"></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>

                            <div class="owl-carousel-info-wrap item">
                                <img src="../util/images/profile/man-portrait.jpg" class="owl-carousel-image img-fluid" alt="">

                                <div class="owl-carousel-info">
                                    <h4 class="mb-2">Nick</h4>

                                    <span class="badge">Acting</span>
                                </div>

                                <div class="social-share">
                                    <ul class="social-icon">
                                        <li class="social-icon-item">
                                            <a href="#" class="social-icon-link bi-instagram"></a>
                                        </li>

                                        <li class="social-icon-item">
                                            <a href="#" class="social-icon-link bi-youtube"></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>

                            <div class="owl-carousel-info-wrap item">
                                <img src="../util/images/profile/woman-posing-black-dress-medium-shot.jpg"
                                    class="owl-carousel-image img-fluid" alt="">

                                <div class="owl-carousel-info">
                                    <h4 class="mb-2">
                                        Elsa
                                        <img src="../images/verified.png" class="owl-carousel-verified-image img-fluid"
                                            alt="">
                                    </h4>

                                    <span class="badge">Influencer</span>
                                </div>

                                <div class="social-share">
                                    <ul class="social-icon">
                                        <li class="social-icon-item">
                                            <a href="#" class="social-icon-link bi-instagram"></a>
                                        </li>

                                        <li class="social-icon-item">
                                            <a href="#" class="social-icon-link bi-youtube"></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>

                            <div class="owl-carousel-info-wrap item">
                                <img src="../util/images/profile/smart-attractive-asian-glasses-male-standing-smile-with-freshness-joyful-casual-blue-shirt-portrait-white-background.jpg"
                                    class="owl-carousel-image img-fluid" alt="">

                                <div class="owl-carousel-info">
                                    <h4 class="mb-2">Chan</h4>

                                    <span class="badge">Education</span>
                                </div>

                                <div class="social-share">
                                    <ul class="social-icon">
                                        <li class="social-icon-item">
                                            <a href="#" class="social-icon-link bi-linkedin"></a>
                                        </li>

                                        <li class="social-icon-item">
                                            <a href="#" class="social-icon-link bi-whatsapp"></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </section>

        <section class="trending-podcast-section section-padding">
            <div class="container">
                <div class="row">

                    <div class="col-lg-12 col-12">
                        <div class="section-title-wrap mb-5">
                            <h4 class="section-title">All Movies</h4>
                        </div>
                    </div>

                    <c:forEach var="items" items="${videos}">
                    <div class="col-lg-4 col-12 mb-4 mb-lg-0">
                        <div class="custom-block custom-block-full">
                            <div class="custom-block-image-wrap">
                                <a href="<c:url value='/video?action=watch&id=${items.videoid}'/>" >
                                    <img class="custom-block-image img-fluid" alt="${items.title}" src="${items.poster}">
                                </a>
                            </div>

                            <div class="custom-block-info">
                                <h5 class="mb-2">
                                    <a href="<c:url value='/video?action=watch&id=${items.videoid}'/>">
                                        Views more...
                                    </a>
                                </h5>

                                <div class="custom-block-bottom d-flex justify-content-between mt-3">
                                    <a href="#" class="bi-headphones me-1">
                                        <span>${items.views}</span>
                                    </a>

                                    <a href="#" class="bi-heart me-1">
                                        <span>0</span>
                                    </a>
                                    <a href="#" class="bi-share">
                                        <span>2.5k</span>
                                    </a>
                                </div>
                            </div>

                        </div>
                    </div>
                    </c:forEach>
                    <div class="col-lg-4 col-12 mx-auto">
                        <nav aria-label="Page navigation example">
                            <ul class="pagination pagination-lg justify-content-center mt-5">
                                <li class="page-item">
                                    <a class="page-link" href="#" aria-label="Previous">
                                        <span aria-hidden="true">&laquo;</span>
                                    </a>
                                </li>

                                <li class="page-item active"><a class="page-link" href="#">1</a></li>

                                <li class="page-item"><a class="page-link" href="#">2</a></li>

                                <li class="page-item"><a class="page-link" href="#">3</a></li>

                                <li class="page-item">
                                    <a class="page-link" href="#" aria-label="Next">
                                        <span aria-hidden="true">&raquo;</span>
                                    </a>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </section>
    </main>


    <footer class="site-footer">
        <div class="container">
            <div class="row">

                <div class="col-lg-6 col-12 mb-5 mb-lg-0">
                    <div class="subscribe-form-wrap">
                        <h6>Subscribe. Every weekly.</h6>

                        <form class="custom-form subscribe-form" action="#" method="get" role="form">
                            <input type="email" name="subscribe-email" id="subscribe-email" pattern="[^ @]*@[^ @]*"
                                class="form-control" placeholder="Email Address" required="">

                            <div class="col-lg-12 col-12">
                                <button type="submit" class="form-control" id="submit">Subscribe</button>
                            </div>
                        </form>
                    </div>
                </div>

                <div class="col-lg-3 col-md-6 col-12 mb-4 mb-md-0 mb-lg-0">
                    <h6 class="site-footer-title mb-3">Contact</h6>

                    <p class="mb-2"><strong class="d-inline me-2">Phone:</strong> 010-020-0340</p>

                    <p>
                        <strong class="d-inline me-2">Email:</strong>
                        <a href="#">inquiry@pod.co</a>
                    </p>
                </div>

                <div class="col-lg-3 col-md-6 col-12">
                    <h6 class="site-footer-title mb-3">Download Mobile</h6>

                    <div class="site-footer-thumb mb-4 pb-2">
                        <div class="d-flex flex-wrap">
                            <a href="#">
                                <img src="images/app-store.png" class="me-3 mb-2 mb-lg-0 img-fluid" alt="">
                            </a>

                            <a href="#">
                                <img src="images/play-store.png" class="img-fluid" alt="">
                            </a>
                        </div>
                    </div>

                    <h6 class="site-footer-title mb-3">Social</h6>

                    <ul class="social-icon">
                        <li class="social-icon-item">
                            <a href="#" class="social-icon-link bi-instagram"></a>
                        </li>

                        <li class="social-icon-item">
                            <a href="#" class="social-icon-link bi-twitter"></a>
                        </li>

                        <li class="social-icon-item">
                            <a href="#" class="social-icon-link bi-whatsapp"></a>
                        </li>
                    </ul>
                </div>

            </div>
        </div>

        <div class="container pt-5">
            <div class="row align-items-center">

                <div class="col-lg-2 col-md-3 col-12">
                    <a class="navbar-brand" href="home">
                        <img src="../util/images/logo.png" class="logo-image img-fluid" alt="templatemo pod talk">
                    </a>
                </div>

                <div class="col-lg-7 col-md-9 col-12">
                    <ul class="site-footer-links">
                        <li class="site-footer-link-item">
                            <a href="#" class="site-footer-link">Homepage</a>
                        </li>

                        <li class="site-footer-link-item">
                            <a href="#" class="site-footer-link">Browse episodes</a>
                        </li>

                        <li class="site-footer-link-item">
                            <a href="#" class="site-footer-link">Help Center</a>
                        </li>

                        <li class="site-footer-link-item">
                            <a href="#" class="site-footer-link">Contact Us</a>
                        </li>
                    </ul>
                </div>

                <div class="col-lg-3 col-12">
                    <p class="copyright-text mb-0">Copyright © 2036 Talk Pod Company
                        <br><br>
                        Design: <a rel="nofollow" href="https://templatemo.com/page/1" target="_parent">TemplateMo</a>
                    </p> Distribution: <a rel="nofollow" href="https://themewagon.com" target="_blank">ThemeWagon</a>
                </div>
            </div>
        </div>
    </footer>


    <!-- JAVASCRIPT FILES -->
    <script src="../util/js/jquery.min.js"></script>
    <script src="../util/js/bootstrap.bundle.min.js"></script>
    <script src="../util/js/owl.carousel.min.js"></script>
    <script src="../util/js/custom.js"></script>

</body>

</html>