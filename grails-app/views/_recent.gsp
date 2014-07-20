<!-- ========================================= RECENTLY VIEWED ========================================= -->
<section id="recently-reviewd" class="wow fadeInUp">
  <div class="container">
    <div class="carousel-holder hover">

      <div class="title-nav">
        <h2 class="h1">Recently Viewed</h2>
        <div class="nav-holder">
          <a href="#prev" data-target="#owl-recently-viewed" class="slider-prev btn-prev fa fa-angle-left"></a> <a href="#next"
            data-target="#owl-recently-viewed" class="slider-next btn-next fa fa-angle-right"></a>
        </div>
      </div>
      <!-- /.title-nav -->

      <div id="owl-recently-viewed" class="owl-carousel product-grid-holder">
        <% def count=7 %>
        <g:each in="${(1..count).toList()}" var="c">
          <div class="no-margin carousel-item product-item-holder size-small hover">
            <div class="product-item">
              <div class="ribbon red">
                <span>iconograpie</span>
              </div>
              <div class="image">
                <img src="products/blank.gif" data-echo="binary/RFFA7QDWAYSCUJHQAFAHFHN7JA47YL5C/list/1.jpg" alt="Medaillon mit Engel" width="194px"
                  height="143px" />
              </div>
              <div class="body">
                <div class="title">
                  <a href="/">Medaillon mit Engel</a>
                </div>
                <div class="brand">Bildarchiv Foto Marburg</div>
              </div>
              <div class="prices">
                <div class="price-current text-right">Apollonia (Albanien) </div>
              </div>
              <div class="hover-area">
                <div class="add-cart-button">
                  <a href="index.php?page=single-product" class="le-button">Favorites</a>
                </div>
                <div class="wish-compare">
                  <a class="btn-add-to-wishlist" href="#">Facebook</a> <a class="btn-add-to-compare" href="#">Twitt</a>
                </div>
              </div>
            </div>
            <!-- /.product-item -->
          </div>
          <!-- /.product-item-holder -->
        </g:each>
      </div>
      <!-- /#recently-carousel -->

    </div>
    <!-- /.carousel-holder -->
  </div>
  <!-- /.container -->
</section>
<!-- /#recently-reviewd -->
<!-- ========================================= RECENTLY VIEWED : END ========================================= -->