<jsp:include page="base.jsp"></jsp:include>
<div class="sidebar">
      <!--
        Tip 1: You can change the color of the sidebar using: data-color="blue | green | orange | red"
    -->
      <div class="sidebar-wrapper">
        <div class="logo">
          <a href="javascript:void(0)" class="simple-text logo-mini">
            CT
          </a>
          <a href="javascript:void(0)" class="simple-text logo-normal">
            Creative Tim
          </a>
        </div>
        <ul class="nav">
          <li class="active ">
            <a href="dashboard.jsp">
              <i class="tim-icons icon-chart-pie-36"></i>
              <p>Dashboard</p>
            </a>
          </li>
          
          <li>
            <a href="map.jsp">
              <i class="tim-icons icon-pin"></i>
              <p>Maps</p>
            </a>
          </li>
          <li>
            <a href="addnews.jsp">
              <i class="tim-icons icon-notes"></i>
              <p>Add News</p>
            </a>
          </li>
          <li>
            <a href="updatenews.jsp">
              <i class="tim-icons icon-align-center"></i>
              <p>Update News</p>
            </a>
          </li>
          <li>
            <a href="editprofile.jsp?id=${reporter.id}">
              <i class="tim-icons icon-single-02"></i>
              <p>User Profile</p>
            </a>
          </li>
          <li>
            <a href="Approved.jsp">
              <i class="tim-icons icon-bullet-list-67"></i>
              <p>Approved List</p>
            </a>
          </li>
          <li>
            <a href="pending.jsp">
              <i class="tim-icons icon-coins"></i>
              <p>Pending List</p>
            </a>
          </li>
           <li>
            <a href="rejected.jsp">
              <i class="tim-icons icon-chart-bar-32"></i>
              <p>Rejected List</p>
            </a>
          </li>
          
         
          <li class="active-pro">
            <a href="upgrade.jsp">
              <i class="tim-icons icon-spaceship"></i>
              <p>Upgrade to PRO</p>
            </a>
          </li>
        </ul>
      </div>
    </div>