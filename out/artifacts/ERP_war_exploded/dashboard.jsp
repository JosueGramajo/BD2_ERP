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
                                                    <img src="assets/img/luke.PNG" alt="${user}" />
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
                                            <a href="LogoutServlet.do">
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
                    <div class="row m-t-25">
                        <div class="col-sm-6 col-lg-3">
                            <div class="overview-item overview-item--c1">
                                <div class="overview__inner">
                                    <div class="overview-box clearfix">
                                        <div class="icon">
                                            <i class="zmdi zmdi-account-o"></i>
                                        </div>
                                        <div class="text">
                                            <h2>${numberOfUsers}</h2>
                                            <span>Numero de usuarios</span>
                                        </div>
                                    </div>
                                    <div class="overview-chart">
                                        <canvas id="widgetChart1"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-3">
                            <div class="overview-item overview-item--c2">
                                <div class="overview__inner">
                                    <div class="overview-box clearfix">
                                        <div class="icon">
                                            <i class="zmdi zmdi-shopping-cart"></i>
                                        </div>
                                        <div class="text">
                                            <h2>${numberOfSales}</h2>
                                            <span>Numero de ventas</span>
                                        </div>
                                    </div>
                                    <div class="overview-chart">
                                        <canvas id="widgetChart2"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-3">
                            <div class="overview-item overview-item--c3">
                                <div class="overview__inner">
                                    <div class="overview-box clearfix">
                                        <div class="icon">
                                            <i class="zmdi zmdi-calendar-note"></i>
                                        </div>
                                        <div class="text">
                                            <h2>${numberOfClients}</h2>
                                            <span>Numero de clientes</span>
                                        </div>
                                    </div>
                                    <div class="overview-chart">
                                        <canvas id="widgetChart3"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-3">
                            <div class="overview-item overview-item--c4">
                                <div class="overview__inner">
                                    <div class="overview-box clearfix">
                                        <div class="icon">
                                            <i class="zmdi zmdi-money"></i>
                                        </div>
                                        <div class="text">
                                            <h2>Q ${totalEarnings}</h2>
                                            <span>Ganancias totales</span>
                                        </div>
                                    </div>
                                    <div class="overview-chart">
                                        <canvas id="widgetChart4"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-9">
                            <h2 class="title-1 m-b-25">Ventas recientes</h2>
                            <div class="table-responsive table--no-card m-b-40">
                                <table class="table table-borderless table-striped table-earning">
                                    <thead>
                                    <tr>
                                        <th>Fecha</th>
                                        <th>No. Factura</th>
                                        <th>Cliente</th>
                                        <th>Producto</th>
                                        <th class="text-right">Precio unidad</th>
                                        <th class="text-right">Cantidad</th>
                                        <th class="text-right">Total</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="s" items="${sales}">
                                        <tr>
                                            <td>${s.getFecha()}</td>
                                            <td>${s.getNoFactura()}</td>
                                            <td>${s.getCliente()}</td>
                                            <td>${s.getProducto()}</td>
                                            <td class="text-right">Q ${s.getPrecioUnidad()}</td>
                                            <td class="text-right">${s.getCantidad()}</td>
                                            <td class="text-right">Q ${s.getTotal()}</td>
                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <div class="col-lg-3">
                            <h2 class="title-1 m-b-25">Ganancias por pais</h2>
                            <div class="au-card au-card--bg-blue au-card-top-countries m-b-40">
                                <div class="au-card-inner">
                                    <div class="table-responsive">
                                        <table class="table table-top-countries">
                                            <tbody>
                                            <c:forEach var="e" items="${earningsCountry}">
                                                <tr>
                                                    <td>${e.getPais()}</td>
                                                    <td class="text-right">Q ${e.getGanancias()}</td>
                                                </tr>
                                            </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="au-card recent-report">
                                <div class="au-card-inner">
                                    <h3 class="title-2">Reportes recientes</h3>
                                    <div class="chart-info">
                                        <div class="chart-info__left">
                                            <div class="chart-note">
                                                <span class="dot dot--blue"></span>
                                                <span>products</span>
                                            </div>
                                            <div class="chart-note mr-0">
                                                <span class="dot dot--green"></span>
                                                <span>services</span>
                                            </div>
                                        </div>
                                        <div class="chart-info__right">
                                            <div class="chart-statis">
                                                    <span class="index incre">
                                                        <i class="zmdi zmdi-long-arrow-up"></i>25%</span>
                                                <span class="label">Productos</span>
                                            </div>
                                            <div class="chart-statis mr-0">
                                                    <span class="index decre">
                                                        <i class="zmdi zmdi-long-arrow-down"></i>10%</span>
                                                <span class="label">Clientes</span>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="recent-report__chart">
                                        <canvas id="recent-rep-chart"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="au-card chart-percent-card">
                                <div class="au-card-inner">
                                    <h3 class="title-2 tm-b-5">Grafico %</h3>
                                    <div class="row no-gutters">
                                        <div class="col-xl-6">
                                            <div class="chart-note-wrap">
                                                <div class="chart-note mr-0 d-block">
                                                    <span class="dot dot--blue"></span>
                                                    <span>Productos</span>
                                                </div>
                                                <div class="chart-note mr-0 d-block">
                                                    <span class="dot dot--red"></span>
                                                    <span>Clientes</span>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-xl-6">
                                            <div class="percent-chart">
                                                <canvas id="percent-chart"></canvas>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
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

