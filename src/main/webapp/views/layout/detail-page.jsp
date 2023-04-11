<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <meta name="description" content="">
    <meta name="author" content="">

    <title>Pod Talk Free CSS Template by TemplateMo</title>

    <!-- CSS FILES -->
    <link rel="preconnect" href="https://fonts.googleapis.com">

    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>

    <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400&family=Sono:wght@200;300;400;500;700&display=swap"
            rel="stylesheet">

    <link rel="stylesheet" href="util/css/bootstrap.min.css">

    <link rel="stylesheet" href="util/css/bootstrap-icons.css">

    <link rel="stylesheet" href="util/css/owl.carousel.min.css">

    <link rel="stylesheet" href="util/css/owl.theme.default.min.css">

    <link href="util/css/templatemo-pod-talk.css" rel="stylesheet">
    <!--

TemplateMo 584 Pod Talk

https://templatemo.com/tm-584-pod-talk

-->
</head>

<body>

<main>
    <%@include file="menu.jsp"%>

    <header class="site-header d-flex flex-column justify-content-center align-items-center">
        <div class="container">
            <div class="row">

                <div class="col-lg-12 col-12 text-center">

                    <h2 class="mb-0">Watch video</h2>
                </div>

            </div>
        </div>
    </header>


    <section class="latest-podcast-section section-padding pb-0" id="section_2">
        <div class="container">
            <div class="row justify-content-center">

                <div class="col-lg-10 col-12">
                    <div class="section-title-wrap mb-5">
                        <h4 class="section-title">${video.title}</h4>
                    </div>

                    <div class="row">
                        <div class="col-lg-9 col-12">
                            <div class="custom-block-icon-wrap">
                                <div class="custom-block-image-wrap custom-block-image-detail-page">
                                    <%--                                        <img src="images/podcast/11683425_4790593.jpg"--%>
                                    <%--                                            class="custom-block-image img-fluid" alt="">--%>
                                    <iframe width="600" height="325"
                                            src="https://www.youtube.com/embed/${video.videoid}"
                                            title="YouTube video player" frameborder="0"
                                            allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
                                            allowfullscreen></iframe>
                                </div>
                            </div>
                        </div>

                        <div class="col-lg-3 col-12">
                            <div class="custom-block-info">
                                <h2 class="mb-2">Description</h2>

                                <p><strong>${video.description}</strong></p>

                                <div
                                        class="profile-block profile-detail-block d-flex flex-wrap align-items-center mt-5">
                                    <c:if test="${not empty sessionScope.user}">
                                        <ul class="social-icon ms-lg-auto ms-md-auto">
                                            <li class="social-icon-item">
                                                <a href="<c:url value='/video?action=like&id=${video.videoid}'/>" class="social-icon-link bi-heart"></a>
                                            </li>
                                            <li class="social-icon-item">
                                                <a href="#" class="social-icon-link bi-share"></a>
                                            </li>
                                        </ul>
                                    </c:if>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </section>


    <section class="related-podcast-section section-padding">
        <div class="container">
            <div class="row">

                <div class="col-lg-12 col-12">
                    <div class="section-title-wrap mb-5">
                        <h4 class="section-title">Suggested</h4>
                    </div>
                </div>

                <div class="col-lg-4 col-12 mb-4 mb-lg-0">
                    <div class="custom-block custom-block-full">
                        <div class="custom-block-image-wrap">
                            <a href="detail-page.html">
                                <img src="images/podcast/27376480_7326766.jpg" class="custom-block-image img-fluid"
                                     alt="">
                            </a>
                        </div>

                        <div class="custom-block-info">
                            <h5 class="mb-2">
                                <a href="detail-page.html">
                                    Vintage Show
                                </a>
                            </h5>

                            <div class="profile-block d-flex">
                                <img src="images/profile/woman-posing-black-dress-medium-shot.jpg"
                                     class="profile-block-image img-fluid" alt="">

                                <p>Elsa
                                    <strong>Influencer</strong>
                                </p>
                            </div>

                            <p class="mb-0">Lorem Ipsum dolor sit amet consectetur</p>

                            <div class="custom-block-bottom d-flex justify-content-between mt-3">
                                <a href="#" class="bi-headphones me-1">
                                    <span>100k</span>
                                </a>

                                <a href="#" class="bi-heart me-1">
                                    <span>2.5k</span>
                                </a>

                                <a href="#" class="bi-chat me-1">
                                    <span>924k</span>
                                </a>
                            </div>
                        </div>

                        <div class="social-share d-flex flex-column ms-auto">
                            <a href="#" class="badge ms-auto">
                                <i class="bi-heart"></i>
                            </a>

                            <a href="#" class="badge ms-auto">
                                <i class="bi-bookmark"></i>
                            </a>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4 col-12 mb-4 mb-lg-0">
                    <div class="custom-block custom-block-full">
                        <div class="custom-block-image-wrap">
                            <a href="detail-page.html">
                                <img src="images/podcast/27670664_7369753.jpg" class="custom-block-image img-fluid"
                                     alt="">
                            </a>
                        </div>

                        <div class="custom-block-info">
                            <h5 class="mb-2">
                                <a href="detail-page.html">
                                    Vintage Show
                                </a>
                            </h5>

                            <div class="profile-block d-flex">
                                <img src="images/profile/cute-smiling-woman-outdoor-portrait.jpg"
                                     class="profile-block-image img-fluid" alt="">

                                <p>
                                    Taylor
                                    <img src="util/images/verified.png" class="verified-image img-fluid" alt="">
                                    <strong>Creator</strong>
                                </p>
                            </div>

                            <p class="mb-0">Lorem Ipsum dolor sit amet consectetur</p>

                            <div class="custom-block-bottom d-flex justify-content-between mt-3">
                                <a href="#" class="bi-headphones me-1">
                                    <span>100k</span>
                                </a>

                                <a href="#" class="bi-heart me-1">
                                    <span>2.5k</span>
                                </a>

                                <a href="#" class="bi-chat me-1">
                                    <span>924k</span>
                                </a>
                            </div>
                        </div>

                        <div class="social-share d-flex flex-column ms-auto">
                            <a href="#" class="badge ms-auto">
                                <i class="bi-heart"></i>
                            </a>

                            <a href="#" class="badge ms-auto">
                                <i class="bi-bookmark"></i>
                            </a>
                        </div>
                    </div>
                </div>

                <div class="col-lg-4 col-12">
                    <div class="custom-block custom-block-full">
                        <div class="custom-block-image-wrap">
                            <a href="detail-page.html">
                                <img src="images/podcast/12577967_02.jpg" class="custom-block-image img-fluid"
                                     alt="">
                            </a>
                        </div>

                        <div class="custom-block-info">
                            <h5 class="mb-2">
                                <a href="detail-page.html">
                                    Daily Talk
                                </a>
                            </h5>

                            <div class="profile-block d-flex">
                                <img src="images/profile/handsome-asian-man-listening-music-through-headphones.jpg"
                                     class="profile-block-image img-fluid" alt="">

                                <p>
                                    William
                                    <img src="util/images/verified.png" class="verified-image img-fluid" alt="">
                                    <strong>Vlogger</strong>
                                </p>
                            </div>

                            <p class="mb-0">Lorem Ipsum dolor sit amet consectetur</p>

                            <div class="custom-block-bottom d-flex justify-content-between mt-3">
                                <a href="#" class="bi-headphones me-1">
                                    <span>100k</span>
                                </a>

                                <a href="#" class="bi-heart me-1">
                                    <span>2.5k</span>
                                </a>

                                <a href="#" class="bi-chat me-1">
                                    <span>924k</span>
                                </a>
                            </div>
                        </div>

                        <div class="social-share d-flex flex-column ms-auto">
                            <a href="#" class="badge ms-auto">
                                <i class="bi-heart"></i>
                            </a>

                            <a href="#" class="badge ms-auto">
                                <i class="bi-bookmark"></i>
                            </a>
                        </div>
                    </div>
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
                <a class="navbar-brand" href="index.html">
                    <img src="util/images/logo.jpg" class="logo-image img-fluid" alt="templatemo pod talk">
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
<script src="util/js/jquery.min.js"></script>
<script src="util/js/bootstrap.bundle.min.js"></script>
<script src="util/js/owl.carousel.min.js"></script>
<script src="util/js/custom.js"></script>

</body>

</html>