<%@ page language="java"
         contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib prefix="s"
           uri="/struts-tags"%>
<!DOCTYPE html>
<html>
 <head>
      <meta http-equiv="Content-Type"
            content="text/html; charset=utf-8" />
      <meta http-equiv="Content-Style-Type"
            content="text/css" />
      <meta http-equiv="Content-Script-Type"
            content="text/javascript" />
      <meta http-equiv="imagetoolbar"
            content="no" />
      <meta name="description"
            content="" />
      <meta name="keywords"
            content="" />
      <link rel=stylesheet
            type="text/css"
            href="css/home.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

  <title>Home画面</title>

</head>

<body>
      <div id = "header">

            <div id="logo">
              <h1>
              <a class="logo"
                 href='<s:url
                 action="GoHomeAction"/>'>
             <label>SUPER SHOP</label>
              </a>
              </h1>
            </div>

            <div id="menu">
            menu1
            </div>

      </div>

      <div id="main">

          <div id="top">
          <p>Home</p>
          </div>

                <div id=”text-center”>

                <s:form action="HomeAction">
                <s:submit value="商品購入"/>
                </s:form>

                <s:if test="#session.id != null">
                <p>ログアウトする場合は
                <a href='<s:url action="LogoutAction" />'>
                こちら
                </a>
                </p>
                </s:if>

                </div>

      </div>

      <div id="footer">
      </div>

</body>
</html>