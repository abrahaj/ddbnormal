<html>
<head>
<title>${item.view.getTitle()}</title>
<meta name="layout" content="main" />
<r:require modules="bootstrap" />
</head>
<body>

  <div class="row">
${item.view.getTitle()}
<img src="${request.contextPath}${item?.preview?.thumbnail?."@href"}" />
  </div>
</body>
</html>