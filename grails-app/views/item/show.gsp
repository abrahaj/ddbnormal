<html>
<head>
<title>
  ${item.view.getTitle()}
</title>
<meta name="layout" content="main" />
</head>
<body>
  <g:render template="breadcrumb" />
  <div id="single-product">
    <div class="container">
      <g:if test="${item.binaries}">
        <g:set value="${item.binaries.get(0)}" var="first" />
        <div class="no-margin col-xs-12 col-sm-6 col-md-5 gallery-holder">
          <div class="product-item-holder size-big single-product-gallery small-gallery">

            <div class="owl-carousel owl-theme" style="opacity: 1; display: block;" id="owl-single-product">
              <div class="owl-wrapper-outer">
                <div style="width: 2598px; left: 0px; display: block;" class="owl-wrapper">
                  <div style="width: 433px;" class="owl-item">
                    <div class="single-product-gallery-item" id="slide1">
                      <a data-rel="prettyphoto" href="${request.contextPath+first.path}"> <img class="img-responsive" alt=""
                        src="${request.contextPath+first.path}" width="433px">
                      </a>
                    </div>
                  </div>
                  <div style="width: 433px;" class="owl-item">
                    <div class="single-product-gallery-item" id="slide2">
                      <a data-rel="prettyphoto" href="${request.contextPath+first.path}"> <img class="img-responsive" alt=""
                        src="${request.contextPath+first.path}" width="433px">
                      </a>
                    </div>
                  </div>
                  <div style="width: 433px;" class="owl-item">
                    <div class="single-product-gallery-item" id="slide3">
                      <a data-rel="prettyphoto" href="${request.contextPath+first.path}"> <img class="img-responsive" alt=""
                        src="${request.contextPath+first.path}" width="433px">
                      </a>
                    </div>
                  </div>
                </div>
              </div>
              <!-- /.single-product-gallery-item -->
              <!-- /.single-product-gallery-item -->
              <!-- /.single-product-gallery-item -->
            </div>
            <!-- /.single-product-slider -->


            <div class="single-product-gallery-thumbs gallery-thumbs">

              <div class="owl-carousel owl-theme" style="opacity: 1; display: block;" id="owl-single-product-thumbnails">
                <div class="owl-wrapper-outer">
                  <div style="width: 1296px; left: 0px; display: block;" class="owl-wrapper">
                    <g:set var="i" value="0" />
                    <g:each in="${item.binaries}">
                      <div style="width: 72px;" class="owl-item">
                        <a class="horizontal-thumb active" data-target="#owl-single-product" data-slide="${i}" href="#slide${i++}"> <img alt=""
                          src="${request.contextPath+it.path}" width="67">
                        </a>
                      </div>
                    </g:each>
                  </div>
                </div>
              </div>
              <!-- /#owl-single-product-thumbnails -->

              <div class="nav-holder left hidden-xs">
                <a class="prev-btn slider-prev" data-target="#owl-single-product-thumbnails" href="#prev"></a>
              </div>
              <!-- /.nav-holder -->

              <div class="nav-holder right hidden-xs">
                <a class="next-btn slider-next" data-target="#owl-single-product-thumbnails" href="#next"></a>
              </div>
              <!-- /.nav-holder -->

            </div>
            <!-- /.gallery-thumbs -->

          </div>
          <!-- /.single-product-gallery -->
        </div>
        <!-- /.gallery-holder -->
      </g:if>
      <div class="no-margin col-xs-12 col-sm-7 body-holder">
        <div class="body">
          <div class="title">
            <a href="#"> ${item.preview.title }
            </a>
          </div>
          <div class="brand">
            ${item.view.institution.name}
          </div>
          <div class="buttons-holder">
            <a class="btn-add-to-wishlist" href="#">add to favorites</a> <a class="btn-add-to-compare" href="#">add to compare list</a>
          </div>

          <div class="excerpt">
            <p>
              ${item.view.subtitle}
            </p>
          </div>
        </div>
        <!-- /.body -->

      </div>
      <!-- /.body-holder -->
    </div>
    <!-- /.container -->
  </div>
  <g:render template="/recent" />

</body>
</html>