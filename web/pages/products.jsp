<%--
  Created by IntelliJ IDEA.
  User: josue
  Date: 28/05/2019
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <title>Dashboard</title>

    <!-- Fontfaces CSS-->
    <link href="assets/css/font-face.css" rel="stylesheet" media="all">
    <link href="assets/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <link href="assets/vendor/font-awesome-5/css/fontawesome-all.min.css" rel="stylesheet" media="all">
    <link href="assets/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">

    <!-- Bootstrap CSS-->
    <link href="assets/vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">

    <!-- Vendor CSS-->
    <link href="assets/vendor/animsition/animsition.min.css" rel="stylesheet" media="all">
    <link href="assets/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet" media="all">
    <link href="assets/vendor/wow/animate.css" rel="stylesheet" media="all">
    <link href="assets/vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet" media="all">
    <link href="assets/vendor/slick/slick.css" rel="stylesheet" media="all">
    <link href="assets/vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="assets/vendor/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="assets/css/theme.css" rel="stylesheet" media="all">

</head>

<body class="animsition">
<div class="page-wrapper">
    <!-- HEADER MOBILE-->
    <header class="header-mobile d-block d-lg-none">
        <div class="header-mobile__bar">
            <div class="container-fluid">
                <div class="header-mobile-inner">
                    <a class="logo" href="index.html">
                        <img src="images/icon/logo.png" alt="CoolAdmin" />
                    </a>
                    <button class="hamburger hamburger--slider" type="button">
                            <span class="hamburger-box">
                                <span class="hamburger-inner"></span>
                            </span>
                    </button>
                </div>
            </div>
        </div>
        <nav class="navbar-mobile">
            <div class="container-fluid">
                <ul class="navbar-mobile__list list-unstyled">
                    <li class="has-sub">
                        <a class="js-arrow" href="RedirectServlet.do?page=dashboard">
                            <i class="fas fa-tachometer-alt"></i>Dashboard</a>
                    </li>
                    <li>
                        <a href="RedirectServlet.do?page=sales">
                            <i class="fas fa-chart-bar"></i>Ventas</a>
                    </li>
                    <li>
                        <a href="RedirectServlet.do?page=products">
                            <i class="fas fa-table"></i>Productos</a>
                    </li>
                    <li>
                        <a href="RedirectServlet.do?page=stocks">
                            <i class="fas fa-map-marker-alt"></i>Existencias</a>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <!-- END HEADER MOBILE-->

    <!-- MENU SIDEBAR-->
    <aside class="menu-sidebar d-none d-lg-block">
        <div class="logo">
            <a href="#">
                <img src="assets/img/umg.png" alt="Cool Admin" />
            </a>
        </div>
        <div class="menu-sidebar__content js-scrollbar1">
            <nav class="navbar-sidebar">
                <ul class="list-unstyled navbar__list">
                    <li class="has-sub">
                        <a class="js-arrow" href="RedirectServlet.do?page=dashboard">
                            <i class="fas fa-tachometer-alt"></i>Dashboard</a>
                    </li>
                    <li>
                        <a href="RedirectServlet.do?page=sales">
                            <i class="fas fa-chart-bar"></i>Ventas</a>
                    </li>
                    <li>
                        <a href="RedirectServlet.do?page=products">
                            <i class="fas fa-table"></i>Productos</a>
                    </li>
                    <li>
                        <a href="RedirectServlet.do?page=stocks">
                            <i class="fas fa-map-marker-alt"></i>Existencias</a>
                    </li>
                </ul>
            </nav>
        </div>
    </aside>
    <!-- END MENU SIDEBAR-->

    <!-- PAGE CONTAINER-->
    <div class="page-container">
        <!-- HEADER DESKTOP-->
        <header class="header-desktop">
            <div class="section__content section__content--p30">
                <div class="container-fluid">
                    <div class="header-wrap">
                        <form class="form-header" action="" method="POST">

                        </form>
                        <div class="header-button">
                            <div class="noti-wrap">
                                <div class="noti__item js-item-menu">

                                </div>
                                <div class="noti__item js-item-menu">

                                </div>
                                <div class="noti__item js-item-menu">

                                    <c:if test="${ country == 1 }">
                                        <img src="assets/img/guatemala.png" height="50" width="50   ">
                                    </c:if>
                                    <c:if test="${ country == 2 }">
                                        <img src="assets/img/usa.png" height="50" width="50   ">
                                    </c:if>

                                </div>
                            </div>
                            <div class="account-wrap" align="right">
                                <div class="account-item clearfix js-item-menu">
                                    <div class="image">
                                        <img src="assets/img/luke.PNG" alt="${user}" />
                                    </div>
                                    <div class="content">
                                        <a class="js-acc-btn" href="#">${user}</a>
                                    </div>
                                    <div class="account-dropdown js-dropdown">
                                        <div class="info clearfix">
                                            <div class="image">
                                                <a href="#">
                                                    <img src="images/icon/avatar-01.jpg" alt="${user}" />
                                                </a>
                                            </div>
                                            <div class="content">
                                                <h5 class="name">
                                                    <a href="#">${user}</a>
                                                </h5>
                                                <span class="email">johndoe@example.com</span>
                                            </div>
                                        </div>
                                        <div class="account-dropdown__body">
                                            <div class="account-dropdown__item">
                                                <a href="#">
                                                    <i class="zmdi zmdi-account"></i>Account</a>
                                            </div>
                                            <div class="account-dropdown__item">
                                                <a href="#">
                                                    <i class="zmdi zmdi-settings"></i>Setting</a>
                                            </div>
                                            <div class="account-dropdown__item">
                                                <a href="#">
                                                    <i class="zmdi zmdi-money-box"></i>Billing</a>
                                            </div>
                                        </div>
                                        <div class="account-dropdown__footer">
                                            <a href="#">
                                                <i class="zmdi zmdi-power"></i>Logout</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </header>
        <!-- HEADER DESKTOP-->

        <!-- MAIN CONTENT-->
        <div class="main-content">
            <div class="section__content section__content--p30">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-12">
                            <!-- DATA TABLE -->
                            <h3 class="title-5 m-b-35">Productos</h3>
                            <div class="table-data__tool">
                                <div class="table-data__tool-right">
                                    <form action="RedirectServlet.do?page=add_product" method="post">
                                        <button class="au-btn au-btn-icon au-btn--green au-btn--small">
                                            <i class="zmdi zmdi-plus"></i>Agregar producto</button>
                                    </form>
                                </div>
                            </div>
                            <div class="table-responsive table-responsive-data2">
                                <table class="table table-data2">
                                    <thead>
                                    <tr>
                                        <th>Nombre</th>
                                        <th>Precio unitario</th>
                                        <th>Categoria</th>
                                        <th>Proveedor</th>
                                        <th>Estado</th>
                                        <th></th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="p" items="${listaProductos}">
                                            <tr class="tr-shadow">
                                                <td class="desc">${p.getNombreProducto()}</td>
                                                <td>Q ${p.getPrecioUnidad()}</td>
                                                <td>${p.getNombreCategoria()}</td>
                                                <td>${p.getNombreProveedor()}</td>
                                                <td>
                                                    <c:if test="${p.getSuspendido() == 'n'}">
                                                        <span class="status--process">Activo</span>
                                                    </c:if>
                                                    <c:if test="${p.getSuspendido() != 'n'}">
                                                        <span class="status--denied">Inactivo</span>
                                                    </c:if>

                                                </td>
                                                <td>
                                                    <div class="table-data-feature">
                                                        <button class="item" data-toggle="tooltip" data-placement="top" title="Editar">
                                                            <i class="zmdi zmdi-edit"></i>
                                                        </button>
                                                        <form action="DeleteProductServlet.do?id=${p.getIdProducto()}" method="POST">
                                                            <button class="item" data-toggle="tooltip" data-placement="top" title="Eliminar">
                                                                <i class="zmdi zmdi-delete"></i>
                                                            </button>
                                                        </form>
                                                    </div>
                                                </td>
                                            </tr>
                                            <tr class="spacer"></tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <!-- END DATA TABLE -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- END MAIN CONTENT-->
        <!-- END PAGE CONTAINER-->
    </div>

</div>

<!-- Jquery JS-->
<script src="assets/vendor/jquery-3.2.1.min.js"></script>
<!-- Bootstrap JS-->
<script src="assets/vendor/bootstrap-4.1/popper.min.js"></script>
<script src="assets/vendor/bootstrap-4.1/bootstrap.min.js"></script>
<!-- Vendor JS       -->
<script src="assets/vendor/slick/slick.min.js">
</script>
<script src="assets/vendor/wow/wow.min.js"></script>
<script src="assets/vendor/animsition/animsition.min.js"></script>
<script src="assets/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
</script>
<script src="assets/vendor/counter-up/jquery.waypoints.min.js"></script>
<script src="assets/vendor/counter-up/jquery.counterup.min.js">
</script>
<script src="assets/vendor/circle-progress/circle-progress.min.js"></script>
<script src="assets/vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
<script src="assets/vendor/chartjs/Chart.bundle.min.js"></script>
<script src="assets/vendor/select2/select2.min.js">
</script>

<!-- Main JS-->
<script src="assets/js/main.js"></script>

</body>

</html>
<!-- end document-->

