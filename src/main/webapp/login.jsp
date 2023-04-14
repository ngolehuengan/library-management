<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
        <%@ include file="header.jsp" %>
            <style>
                body {
                    background: var(--bs-green-light);
                }
            </style>
            <main id="main">
                <article class="container">
                    <section class="row" style="margin: 150px 0;">
                        <div class="col-md-4"></div>
                        <div class="col-md-4">
                            <div class="card card-primary">
                                <div class="card-header bg-success text-center">
                                    <h3 class="card-title" style="color:var(--bs-white)">ĐĂNG NHẬP</h3>
                                </div>
                                <form role="form" action="${pageContext.request.contextPath}/Login" method="post">
                                    <div class="row justify-content-center card-body" style="margin-bottom: -34px;">
                                        <div style="color: red;">${errorString}</div>
                                        <!--flag lỗi đăng nhập -->
                                    </div>
                                    <div class="card-body">
                                        <div class="form-group">
                                            <label for="exampleInputEmail1">Tên đăng nhập</label> <input type="text"
                                                class="form-control" name="username" placeholder="Nhập tên đăng nhập"
                                                required>
                                        </div>
                                        <div class="form-group">
                                            <label for="exampleInputPassword1">Mật khẩu</label> <input type="password"
                                                class="form-control" name="password" placeholder="Nhập mật khẩu"
                                                required>
                                        </div>
                                        <div class="form-check">
                                            <input type="checkbox" class="form-check-input" id="exampleCheck1"
                                                name="rememberMe" value="Y"> <label class="form-check-label"
                                                for="exampleCheck1" style="font-size: 15px; opacity: 0.7;">Nhớ tài
                                                khoản</label>
                                        </div>
                                    </div>
                                    <div class="card-footer bg-success text-center">
                                        <button type="submit" class="btn btn-success" style="transition: 1s">Đăng
                                            nhập</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </section>
                </article>
            </main>

            <%@ include file="footer.jsp" %>