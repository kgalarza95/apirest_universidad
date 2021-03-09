<%-- 
    Document   : facebook
    Created on : 07/03/2021, 21:01:29
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin-2.min.js"></script>
        <script src="js/reporte/facebook.js"></script>
        <script src="js/alert/sweetalert.js"></script>
        <!-- Optional: include a polyfill for ES6 Promises for IE11 -->
        <script src="//cdn.jsdelivr.net/npm/promise-polyfill@8/dist/polyfill.js"></script>
        <script src="js/alert/sweetalert.min.js"></script>
        <link rel="stylesheet" href="css/alert/sweetalert.css">
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" href="css/rs/facebook.css">
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">
        <!-- Estilos personalizados-->
        <link href="css/sb-admin-2.min.css" rel="stylesheet">
        <link href="css/estilos_local.css" rel="stylesheet">
        
        <script type="text/javascript" src="//connect.facebook.net/en_US/sdk.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>facebook</h1>
        
       <a id="id_facebook" class="btn btn-facebook btn-user btn-block">
                                                <i class="fab fa-facebook-f fa-fw"></i> Login con Facebook
                                            </a>
        <h1 id="name"></h1>
        <p id="id_name"></p>
        
        <button class="btn btn-primary btn-user btn-block" id="btn_like"><i class="fa fa-user"></i> Obtener Likes
                                            </button>
        
        <p id="like"></p>
    </body>
</html>
