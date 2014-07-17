<!DOCTYPE html>
<html>
<head>
<meta name="layout" content="main" />
<title>Index View</title>
</head>
<body>
  <div class="row">
    <div class="col-lg-12">
      <div class="well text-center">Begin your search in the German Digital Library!</div>
    </div>
  </div>
  <div class="row">
    <div class="col-lg-12">
      <div class="col-lg-12">
      <g:form name="search" action="list" controller="search" method="get">
        <div class="input-group">
          <span class="input-group-addon"><span class="glyphicon glyphicon-search"></span> </span> 
          <input type="text" name="query"
            class="form-control input-large"> <span class=" input-group-btn">
            <button class="btn btn-default" type="button">Go!</button>
          </span>
        </div>
        <!-- /input-group -->
        </g:form>
      </div>

    </div>

  </div>

  <hr><%--


  <div class="row">
    <div class="col-lg-4">
      <h2>Heading 1</h2>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sollicitudin auctor quam ac tempor. Cras a
        ante sed libero mollis sodales. Praesent fringilla, neque ut ultrices faucibus, dolor eros ultrices neque, nec
        bibendum arcu ipsum eget justo.</p>
      <a class="btn btn-default" href="#">More Info</a>
    </div>
    <div class="col-lg-4">
      <h2>Heading 2</h2>
      <p>Phasellus vestibulum sagittis purus laoreet varius. Pellentesque malesuada malesuada mattis. Aliquam sed
        porta nisi, eget suscipit dolor. Nam ipsum sapien, rhoncus eu leo eu, ultricies pellentesque tellus.</p>
      <a class="btn btn-default" href="#">More Info</a>
    </div>
    <div class="col-lg-4">
      <h2>Heading 3</h2>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam sollicitudin auctor quam ac tempor. Cras a
        ante sed libero mollis sodales. Praesent fringilla, neque ut ultrices faucibus, dolor eros ultrices neque, nec
        bibendum arcu ipsum eget justo.</p>
      <a class="btn btn-default" href="#">More Info</a>
    </div>
  </div>


--%></body>
</html>
