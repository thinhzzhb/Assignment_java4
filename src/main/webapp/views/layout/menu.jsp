<nav class="navbar navbar-expand-lg">
  <div class="container">
    <a class="navbar-brand me-lg-5 me-0" href="index">
      <img src="../util/images/logo.png" class="rounded-circle logo-image img-fluid" alt="Logo Movie">
    </a>

    <form action="#" method="get" class="custom-form search-form flex-fill me-3" role="search">
      <div class="input-group input-group-lg">
        <input name="search" type="search" class="form-control" id="search" placeholder="Search Podcast"
               aria-label="Search">

        <button type="submit" class="form-control" id="submit">
          <i class="bi-search"></i>
        </button>
      </div>
    </form>

    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav ms-lg-auto">
        <li class="nav-item dropdown">
          <c:choose>
            <c:when test="${empty sessionScope.user}">
              <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button"
                 data-bs-toggle="dropdown" aria-expanded="false">
                Account
              </a>
              <ul class="dropdown-menu dropdown-menu-dark">
                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/login">Log in</a></li>
                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/forgot">Forgot Password</a></li>
                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/regis">Register</a></li>
              </ul>
            </c:when>
            <c:otherwise>
              <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button"
                 data-bs-toggle="dropdown" aria-expanded="false">
                  ${sessionScope.user.fullname}
              </a>
              <ul class="dropdown-menu dropdown-menu-light">
                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/myfavorite">My Favorite</a></li>
                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/changer">Change Password</a></li>
                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/edit-profile">Edit Profile</a></li>
                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/user/logoff">Logoff</a></li>
              </ul>
            </c:otherwise>
          </c:choose>
        </li>
      </ul>

    </div>
  </div>
</nav>