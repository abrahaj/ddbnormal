<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="ARB">
<title><g:layoutTitle /></title>

<asset:stylesheet src="application.css" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
</head>
<body>
<g:render template="/layouts/top" />
<g:render template="/layouts/header" />  

  <div class="container">
    <g:layoutBody />
  </div>
  <div id="footer">
    <div class="container">
      <p class="text-muted">Some Rights are Reserved @ARB.</p>
    </div>
  </div>
  <asset:javascript src="application.js" />
  <script src="http://maps.google.com/maps/api/js?sensor=false&amp;language=en"></script>
</body>
</html>
