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
            <script src="${contextPath}/resources/bootstrap/popper.min.js" integrity="sha384-"></script>
            <script src="${contextPath}/resources/bootstrap/bootstrap.min.js" integrity="sha384-"></script>

            <link rel="stylesheet" href="${contextPath}/resources/css/template.css">
        </head>

        <body>
            <header id="header">
                <nav class="navbar navbar-default sticky-top" aria-label="#">
                    <div class="container">
                        <a href="localhost:8080/SGULibrary/" class="col-ms-7 navbar-brand"><img
                                src="resources/images/header-logo.png" alt="SGU Library"></a>
                        <div class="col-ms-5">
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

                    <div class="menu-header">
                        <nav class="navbar navbar-expand-md bg-success" aria-label="#">
                            <ul class="navbar-nav container">
                                <li class="nav-item">
                                    <a class="navbar-brand btn" href="localhost:8080/SGULibrary/"><i
                                            class="fa-sharp fa-solid fa-house fa-xs"></i></a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" role="button" data-bs-toggle="dropdown">GIỚI
                                        THIỆU</a>
                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item" href="#">GIỚI THIỆU CHUNG</a></li>
                                        <li><a class="dropdown-item" href="#">NỘI QUY</a></li>
                                        <li><a class="dropdown-item" href="#">SƠ ĐỒ BỐ TRÍ</a></li>
                                        <li><a class="dropdown-item" href="#">DỊCH VỤ CUNG CẤP</a></li>
                                    </ul>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" role="button" data-bs-toggle="dropdown">TÀI
                                        LIỆU</a>
                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item" href="#">TÁT CẢ</a></li>
                                        <li><a class="dropdown-item" href="#">ĐỀ XUẤT<i class="fa-brands fa-hotjar"
                                                    style="color: var(--bs-red)"></i></a></li>
                                        <li><a class="dropdown-item" href="#">LUẬN VĂN - LUẬN ÁN - ĐTNCKH</a></li>
                                        <li><a class="dropdown-item" href="#">PHÂN LOẠI MÔN/CHUYÊN NGÀNH</a></li>
                                    </ul>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" role="button" data-bs-toggle="dropdown">DỊCH
                                        VỤ</a>
                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item" href="#">MƯỢN SÁCH</a></li>
                                        <li><a class="dropdown-item" href="#">TRẢ SÁCH</a></li>
                                        <li><a class="dropdown-item" href="#">GIA HẠN</a></li>
                                        <li><a class="dropdown-item" href="#">BÁO MẤT</a></li>
                                    </ul>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="">THƯ
                                        VIỆN SỐ</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="">THÔNG BÁO</a>
                                </li>
                                <li class="nav-item">
                                    <form class="form-control">
                                        <input class="search-input" type="search" name="name" placeholder="Tìm kiếm"
                                            required />
                                        <button type="submit" class="btn btn-success">
                                            <em class="fas fa-search"></em>
                                        </button>
                                    </form>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" role="button" data-bs-toggle="dropdown">TÀI
                                        KHOẢN</a>
                                    <ul class="dropdown-menu">
                                        <li><a class="dropdown-item" href="#">ĐĂNG NHẬP</a></li>
                                        <li><a class="dropdown-item" href="#">ĐĂNG KÝ</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </nav>
                    </div>
                </nav>
            </header>