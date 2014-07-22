<html>
<head>
<title>
  ${item.view.getTitle()}
</title>
<meta name="layout" content="main" />
</head>
<body>
  <g:render template="breadcrumb" />
  <div class="container">
    <g:render template="sidebar" />
    <div class="row">
      ${item.view.getTitle()}
      <img src="${request.contextPath}${item?.preview?.thumbnail?."@href"}" />
    </div>
    <g:render template="/recent" />
  </div>
</body>
</html>