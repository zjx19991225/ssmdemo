<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
<title>文档列表 - 光年(Light Year Admin)后台管理系统模板</title>
<link rel="icon" href="../favicon.ico" type="image/ico">
<meta name="keywords" content="LightYear,光年,后台模板,后台管理系统,光年HTML模板">
<meta name="description" content="LightYear是一个基于Bootstrap v3.3.7的后台管理系统的HTML模板。">
<meta name="author" content="yinqi">
<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/materialdesignicons.min.css" rel="stylesheet">
<link href="../css/style.min.css" rel="stylesheet">
</head>
  
<body>
<div class="lyear-layout-web">
  <div class="lyear-layout-container">
    <!--左侧导航-->
    <aside class="lyear-layout-sidebar">

      <!-- logo -->
      <div id="logo" class="sidebar-header">
        <a href="${pageContext.request.contextPath}/pages/index.jsp"><img src="../images/logo-sidebar.png" title="LightYear" alt="LightYear" /></a>
      </div>
      <div class="lyear-layout-sidebar-scroll">

        <nav class="sidebar-main">
          <ul class="nav nav-drawer">
            <li class="nav-item active"> <a href="${pageContext.request.contextPath}/pages/index.jsp"><i class="mdi mdi-home"></i> 后台首页</a> </li>

            <li class="nav-item nav-item-has-subnav">
              <a href="javascript:void(0)"><i class="mdi mdi-file-outline"></i> 用户管理</a>
              <ul class="nav nav-subnav">
                <li> <a href="${pageContext.request.contextPath}/user/findAllReader">读者列表</a> </li>
              </ul>
            </li>

            <li class="nav-item nav-item-has-subnav">
              <a href="javascript:void(0)"><i class="mdi mdi-file-outline"></i> 图书管理</a>
              <ul class="nav nav-subnav">
                <li> <a href="${pageContext.request.contextPath}/book/findAllBook">图书列表</a> </li>

              </ul>
            </li>

            <li class="nav-item nav-item-has-subnav">
              <a href="javascript:void(0)"><i class="mdi mdi-file-outline"></i> 借还记录</a>
              <ul class="nav nav-subnav">
                <li> <a href="${pageContext.request.contextPath}/record/findAllRecord">记录列表</a> </li>

              </ul>
            </li>


          </ul>
        </nav>

        <div class="sidebar-footer">
          <p class="copyright">Copyright &copy; 2019. <a target="_blank" href="http://lyear.itshubao.com">IT书包</a> All rights reserved.</p>
        </div>
      </div>

    </aside>
    <!--End 左侧导航-->

    <!--头部信息-->
    <header class="lyear-layout-header">

      <nav class="navbar navbar-default">
        <div class="topbar">

          <div class="topbar-left">
            <div class="lyear-aside-toggler">
              <span class="lyear-toggler-bar"></span>
              <span class="lyear-toggler-bar"></span>
              <span class="lyear-toggler-bar"></span>
            </div>
            <span class="navbar-page-title"> 借阅信息 </span>
          </div>

          <ul class="topbar-right">
            <li class="dropdown dropdown-profile">
              <a href="javascript:void(0)" data-toggle="dropdown">
                <img class="img-avatar img-avatar-48 m-r-10" src="../images/users/avatar.jpg" alt="笔下光年" />
                <span>${user.user} <span class="caret"></span></span>
              </a>
              <ul class="dropdown-menu dropdown-menu-right">
                <li> <a href="${pageContext.request.contextPath}/pages/pages_profile.jsp"><i class="mdi mdi-account"></i> 个人信息</a> </li>
                <li> <a href="${pageContext.request.contextPath}/pages/pages_edit_pwd.jsp"><i class="mdi mdi-lock-outline"></i> 修改密码</a> </li>
                <li> <a href="javascript:void(0)"><i class="mdi mdi-delete"></i> 清空缓存</a></li>
                <li class="divider"></li>
                <li> <a href="${pageContext.request.contextPath}/pages/login.jsp"><i class="mdi mdi-logout-variant"></i> 退出登录</a> </li>
              </ul>
            </li>
            <!--切换主题配色-->
            <li class="dropdown dropdown-skin">
              <span data-toggle="dropdown" class="icon-palette"><i class="mdi mdi-palette"></i></span>
              <ul class="dropdown-menu dropdown-menu-right" data-stopPropagation="true">
                <li class="drop-title"><p>主题</p></li>
                <li class="drop-skin-li clearfix">
                  <span class="inverse">
                    <input type="radio" name="site_theme" value="default" id="site_theme_1" checked>
                    <label for="site_theme_1"></label>
                  </span>
                  <span>
                    <input type="radio" name="site_theme" value="dark" id="site_theme_2">
                    <label for="site_theme_2"></label>
                  </span>
                  <span>
                    <input type="radio" name="site_theme" value="translucent" id="site_theme_3">
                    <label for="site_theme_3"></label>
                  </span>
                </li>
                <li class="drop-title"><p>LOGO</p></li>
                <li class="drop-skin-li clearfix">
                  <span class="inverse">
                    <input type="radio" name="logo_bg" value="default" id="logo_bg_1" checked>
                    <label for="logo_bg_1"></label>
                  </span>
                  <span>
                    <input type="radio" name="logo_bg" value="color_2" id="logo_bg_2">
                    <label for="logo_bg_2"></label>
                  </span>
                  <span>
                    <input type="radio" name="logo_bg" value="color_3" id="logo_bg_3">
                    <label for="logo_bg_3"></label>
                  </span>
                  <span>
                    <input type="radio" name="logo_bg" value="color_4" id="logo_bg_4">
                    <label for="logo_bg_4"></label>
                  </span>
                  <span>
                    <input type="radio" name="logo_bg" value="color_5" id="logo_bg_5">
                    <label for="logo_bg_5"></label>
                  </span>
                  <span>
                    <input type="radio" name="logo_bg" value="color_6" id="logo_bg_6">
                    <label for="logo_bg_6"></label>
                  </span>
                  <span>
                    <input type="radio" name="logo_bg" value="color_7" id="logo_bg_7">
                    <label for="logo_bg_7"></label>
                  </span>
                  <span>
                    <input type="radio" name="logo_bg" value="color_8" id="logo_bg_8">
                    <label for="logo_bg_8"></label>
                  </span>
                </li>
                <li class="drop-title"><p>头部</p></li>
                <li class="drop-skin-li clearfix">
                  <span class="inverse">
                    <input type="radio" name="header_bg" value="default" id="header_bg_1" checked>
                    <label for="header_bg_1"></label>                      
                  </span>
                  <span>                                                     
                    <input type="radio" name="header_bg" value="color_2" id="header_bg_2">
                    <label for="header_bg_2"></label>                      
                  </span>
                  <span>                                                     
                    <input type="radio" name="header_bg" value="color_3" id="header_bg_3">
                    <label for="header_bg_3"></label>
                  </span>
                  <span>
                    <input type="radio" name="header_bg" value="color_4" id="header_bg_4">
                    <label for="header_bg_4"></label>                      
                  </span>
                  <span>                                                     
                    <input type="radio" name="header_bg" value="color_5" id="header_bg_5">
                    <label for="header_bg_5"></label>                      
                  </span>
                  <span>                                                     
                    <input type="radio" name="header_bg" value="color_6" id="header_bg_6">
                    <label for="header_bg_6"></label>                      
                  </span>
                  <span>                                                     
                    <input type="radio" name="header_bg" value="color_7" id="header_bg_7">
                    <label for="header_bg_7"></label>
                  </span>
                  <span>
                    <input type="radio" name="header_bg" value="color_8" id="header_bg_8">
                    <label for="header_bg_8"></label>
                  </span>
                </li>
                <li class="drop-title"><p>侧边栏</p></li>
                <li class="drop-skin-li clearfix">
                  <span class="inverse">
                    <input type="radio" name="sidebar_bg" value="default" id="sidebar_bg_1" checked>
                    <label for="sidebar_bg_1"></label>
                  </span>
                  <span>
                    <input type="radio" name="sidebar_bg" value="color_2" id="sidebar_bg_2">
                    <label for="sidebar_bg_2"></label>
                  </span>
                  <span>
                    <input type="radio" name="sidebar_bg" value="color_3" id="sidebar_bg_3">
                    <label for="sidebar_bg_3"></label>
                  </span>
                  <span>
                    <input type="radio" name="sidebar_bg" value="color_4" id="sidebar_bg_4">
                    <label for="sidebar_bg_4"></label>
                  </span>
                  <span>
                    <input type="radio" name="sidebar_bg" value="color_5" id="sidebar_bg_5">
                    <label for="sidebar_bg_5"></label>
                  </span>
                  <span>
                    <input type="radio" name="sidebar_bg" value="color_6" id="sidebar_bg_6">
                    <label for="sidebar_bg_6"></label>
                  </span>
                  <span>
                    <input type="radio" name="sidebar_bg" value="color_7" id="sidebar_bg_7">
                    <label for="sidebar_bg_7"></label>
                  </span>
                  <span>
                    <input type="radio" name="sidebar_bg" value="color_8" id="sidebar_bg_8">
                    <label for="sidebar_bg_8"></label>
                  </span>
                </li>
              </ul>
            </li>
            <!--切换主题配色-->
          </ul>

        </div>
      </nav>

    </header>
    <!--End 头部信息-->
    
    <!--页面主要内容-->
    <main class="lyear-layout-content">
      
      <div class="container-fluid">
        
        <div class="row">
          <div class="col-lg-12">
            <div class="card">
              <div class="card-toolbar clearfix">
                <form class="pull-right search-bar" method="get" action="#" role="form">
                  <div class="input-group">
                    <div class="input-group-btn">
                      <input type="hidden" name="search_field" id="search-field" value="title">
                      <button class="btn btn-default dropdown-toggle" id="search-btn" data-toggle="dropdown" type="button" aria-haspopup="true" aria-expanded="false">
                        选择搜索条件
                      </button>
                      <ul class="dropdown-menu">
                        <li> <a tabindex="-1" class="find" name="keyword" data-field="title">借阅人</a> </li>
                        <li> <a tabindex="-1" class="find" name="keyword" data-field="cat_name">书籍</a> </li>
                      </ul>
                    </div>
                    <input type="text" class="form-control" id="findbycontext" value="" name="keyword" placeholder="请输入名称">
                  </div>
                </form>
                <form id="keys"></form>
                <div class="toolbar-btn-action">
                  <button type="button" id="submit" class="btn btn-primary m-r-5" >查 询</button>

                </div>
              </div>
              <div class="card-body">
                
                <div class="table-responsive">
                  <table class="table table-bordered">
                    <thead>
                      <tr>
                        <th>
                          <label class="lyear-checkbox checkbox-primary">
                            <input type="checkbox" id="check-all"><span></span>
                          </label>
                        </th>
                        <th>记录编号</th>
                        <th>借阅人</th>
                        <th>书籍</th>
                        <th>数量</th>
                      </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="record" items="${record.list}">

                      <tr>
                        <td>
                          <label class="lyear-checkbox checkbox-primary">
                            <input type="checkbox" name="ids[]" value="1"><span></span>
                          </label>
                        </td>
                        <td>${record.recordId}</td>
                        <td>${record.readerName}</td>
                        <td>${record.bookName}</td>
                        <td>${record.number}</td>

                      </tr>


                    </c:forEach>


                    </tbody>
                  </table>
                </div>
                <ul class="pagination">

                  <li><a href="${pageContext.request.contextPath}/record/findAllRecord?id=1">首页</a></li>
                  <li><a href="${pageContext.request.contextPath}/record/findAllRecord?id=${record.pageNum-1}">上一页</a></li>
                  <c:forEach var="recordPage" begin="1" end="${record.pages}">
                  <li><a href="${pageContext.request.contextPath}/record/findAllRecord?id=${recordPage}">${recordPage}</a></li>
                  </c:forEach>
                  <li><a href="${pageContext.request.contextPath}/record/findAllRecord?id=${record.pageNum+1}">下一页</a></li>
                  <li><a href="${pageContext.request.contextPath}/record/findAllRecord?id=${record.pages}">尾页</a></li>

                </ul>
              </div>
            </div>
          </div>
        </div>
        
      </div>
      
    </main>
    <!--End 页面主要内容-->
  </div>
</div>

<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript" src="../js/perfect-scrollbar.min.js"></script>
<script type="text/javascript" src="../js/main.min.js"></script>
<script type="text/javascript">
$(function(){
    $('.search-bar .dropdown-menu a').click(function() {
        var field = $(this).data('field') || '';
        $('#search-field').val(field);
        $('#search-btn').html($(this).text());
    });
});
</script>
<script>
  $(function () {
      $("#submit").on("click",function () {
          var keyword=$("input[name=keyword]").val();
          var key=$('#search-btn').text();


          if (keyword===null){
              alert("请输入查询关键字");
          }
          if (key!=="书籍"&&key!=="借阅人") {
              alert("请选择查询方式！")
          }
window.location.href="${pageContext.request.contextPath}/record/findbykey?key="+key+"&keyword="+keyword;







      })



  })
</script>
</body>
</html>