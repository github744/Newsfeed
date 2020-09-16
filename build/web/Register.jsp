<!DOCTYPE html>
<html>
<head>
     <link rel="icon" type="image/png" href="assets/img/icons.png">
<title>NewsFeed | Join us</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="assets/css/animate.css">
<link rel="stylesheet" type="text/css" href="assets/css/font.css">
<link rel="stylesheet" type="text/css" href="assets/css/li-scroller.css">
<link rel="stylesheet" type="text/css" href="assets/css/slick.css">
<link rel="stylesheet" type="text/css" href="assets/css/jquery.fancybox.css">
<link rel="stylesheet" type="text/css" href="assets/css/theme.css">
<link rel="stylesheet" type="text/css" href="assets/css/style.css">
<jsp:include page="base.jsp"></jsp:include>
<!--[if lt IE 9]>
<script src="../assets/js/html5shiv.min.js"></script>
<script src="../assets/js/respond.min.js"></script>
<![endif]-->
<script>

                function readURL(input,preview) {
                    if (input.files && input.files[0]) {
                        var reader = new FileReader();

                        reader.onload = function (e) {
                            preview.src = e.target.result;
                        };

                        reader.readAsDataURL(input.files[0]);
                    }
                }
                        
        function checkUserid(userid, x){
               ajax = new XMLHttpRequest();
               ajax.open("GET","ReporterController?op=checkuserid&userid="+userid, true);
               ajax.send();
               
               ajax.onreadystatechange = function(){
                   if (this.readyState==4 && this.status==200)
                       x.innerHTML = this.responseText;
               };
            
        
    }
                </script>
</head>
<body>
      <jsp:useBean id="reporter" class="com.beans.Reporter" scope="session"></jsp:useBean>
<div id="preloader">
  <div id="status">&nbsp;</div>
</div>
<a class="scrollToTop" href="#"><i class="fa fa-angle-up"></i></a>
<div class="container">
 <jsp:include page="navbar.jsp"></jsp:include>
  <section id="contentSection">
    <div class="row">
      <div class="col-lg-8 col-md-8 col-sm-8">
        <div class="left_content">
          <div class="contact_area">
            <h2>Join NewsFeed</h2>
          
              
            <form action="addrepoimage.jsp"   method="post" class="form">
                        <table class="table">
                          
                            <tr>
                                <td>Enter Name </td>
                                <td><input type="text" name="name" class="form-control" value="${reporter.name}"/></td>
                            </tr> 
                             <tr>
                                <td>Enter DOB </td>
                                <td><input type="date" name="dob" class="form-control" value="${reporter.dob}"/></td>
                            </tr> 
                             <tr>
                                <td>Select Gender  </td>
                                <td><input type="radio" name="gender" value="Male" ${reporter.gender eq "Male" ? "checked" : ""}/> Male 
                                <input type="radio" name="gender" value="Female" ${reporter.gender eq "Female" ? "checked" : ""}/> Female 
                                </td>
                            </tr> 
                            
                            <tr>
                                <td>Enter Contact </td>
                                <td><input type="text" name="contact" class="form-control" value="${reporter.contact}"/></td>
                            </tr> 
                            
                             <tr>
                                <td>Enter Email </td>
                                <td><input type="email" name="email" class="form-control" value="${reporter.email}"/></td>
                            </tr> 
                            
                           <tr>
                                <td>Enter Username </td>
                                <td><input type="text" name="userid" class="form-control" onblur="checkUserid(this.value,sp1)" value="${reporter.userid}"/></td>
                                  <span id="sp1"> </span> 
                            </tr> 
                            
                             <tr>
                                <td>Enter Password </td>
                                <td><input type="password" name="password" class="form-control" value="${reporter.password}"/></td>
                            </tr> 
                           
                            <input type="hidden" name="status" value="Disable"/>
                        </table>
 <center class="contact_form">  <input type="submit" value="Next" id="submit" name="submit" ></center> 
                    </form>  
                             
               
            
          </div>
        </div>
      </div>
                                <jsp:include page="sidebar1.jsp"></jsp:include>
    </div>
  </section>
  <jsp:include page="footer.jsp"></jsp:include>
</div>
<script src="assets/js/jquery.min.js"></script> 
<script src="assets/js/wow.min.js"></script> 
<script src="assets/js/bootstrap.min.js"></script> 
<script src="assets/js/slick.min.js"></script> 
<script src="assets/js/jquery.li-scroller.1.0.js"></script> 
<script src="assets/js/jquery.newsTicker.min.js"></script> 
<script src="assets/js/jquery.fancybox.pack.js"></script> 
<script src="assets/js/custom.js"></script>
</body>
</html>