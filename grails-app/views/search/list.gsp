<html>
<head>
<title>Searching for</title>
<meta name="layout" content="main" />
<r:require modules="bootstrap" />
</head>
<body>
  <h1>Search</h1>
  <div class="row">
    <div class="col-xs-5 col-sm-3 col-lg-3">Facets come here</div>
    <div class="col-xs-8 col-sm-5 col-lg-6">
    
      <g:if test="${flash.message}">
        <div class="message">
          ${flash.message}
        </div>
      </g:if>
      <div id="filteredList">
        <g:render template="filter" />
      </div>

    </div>
    <div class="col-xs-5 col-sm-3 col-lg-3">Entities come here</div>
  </div>
</body>
</html>