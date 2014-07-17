//= require jquery
//= require jquery-migrate-1.2.1.js
//= require bootstrap.min.js
//= require gmap3.min.js
//= require bootstrap-hover-dropdown.min.js
//= require owl.carousel.min.js
//= require css_browser_selector.min.js
//= require echo.min.js
//= require jquery.easing-1.3.min.js
//= require bootstrap-slider.min.js
//= require jquery.raty.min.js
//= require jquery.prettyPhoto.min.js
//= require jquery.customSelect.min.js
//= require wow.min.js
//= require scripts.js
//= require_tree .

//= require_tree .
//= require_self

if (typeof jQuery !== 'undefined') {
  (function($) {
    $('#spinner').ajaxStart(function() {
      $(this).fadeIn();
    }).ajaxStop(function() {
      $(this).fadeOut();
    });
  })(jQuery);
}
