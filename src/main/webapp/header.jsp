<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <c:set var="contextPath" value="${pageContext.request.contextPath}" />
        <!DOCTYPE html>
        <html lang="vi">

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="shortcut icon" href="resources/images/sgu-logo.ico" type="image/x-icon" />
            <title>Thư viện SGU</title>

            <script src="https://kit.fontawesome.com/6f98f62eac.js" crossorigin="anonymous"></script>
            <link rel="stylesheet" href="${contextPath}/resources/bootstrap/bootstrap.min.css">


            <link rel="stylesheet" href="${contextPath}/resources/css/template.css">
        </head>

        <body>
            <header id="header">
                <nav class="navbar">
                    <div class="container">
                        <a href="localhost:8080/SGULibrary/" class="col-xs-12 col-ms-7 navbar-brand banner-header"><img
                                src="resources/images/header-logo.png" alt="SGU Library"></a>
                        <div class="col-xs-12 col-ms-5">
                            <!-- edit elements -->
                            <div class="link-header">
                                <ul class="contact-menu">
                                    <li><a href="https://sgu.edu.vn/">Website SGU</a></li>
                                    <li><a href="http://lib.sgu.edu.vn/opaclibol/search/index.asp">Trang bạn đọc</a>
                                    </li>
                                    <li><a href="loginwebmail.html">Tin nội bộ</a></li>
                                    <li><a href="http://mail.lib.sgu.edu.vn:3000/">Web-mail</a></li>
                                </ul>
                            </div>
                            <!-- edit elements -->
                            <div class="link-header">
                                <ul class="social-menu">
                                    <li class="li-fb"><a target="_blank" title="Facebook"
                                            href="https://www.facebook.com/trungtamhoclieusgu"><i
                                                class="fa-brands fa-facebook-f"></i></a></li>
                                    <li class="li-mail"><a target="_self" title="Mail"
                                            href="mailto:tt_hoclieu@sgu.edu.vn"><i
                                                class="fa-sharp fa-solid fa-envelope"></i></a></li>
                                    <li class="li-phone"><a target="_self" title="Phone" href="tel:+02838354004"><i
                                                class="fa-solid fa-phone"></i></a></li>
                                    <li class="li-youtube"><a target="_blank" title="Youtube"
                                            href="https://www.youtube.com/@TuoitreaihocSaiGon"><i
                                                class="fa-brands fa-youtube"></i></a></li>
                                </ul>
                            </div>
                        </div>


                    </div>
                </nav>
            </header>