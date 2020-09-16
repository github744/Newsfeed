<%-- 
    Document   : Subscribe
    Created on : Aug 17, 2020, 10:23:51 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NewsFeed | Subscribe</title>
    </head>
    <body>
       <div class="modal" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">Fill the Basic Details</h4>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
           <form method="post" class="form bg-light">
                        <input type="text" placeholder="Enter Name" name="name" class="form-control"> <br/><br/>
                        <input type="email" name="email" placeholder="Enter your email" class="form-control"/> <br/><br/>
                        <input type="submit" value="Subscribe" class="btn btn-dark form-control" name="submit"/>
         </form>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>           
    </div>        

  </div>
    </body>
</html>
