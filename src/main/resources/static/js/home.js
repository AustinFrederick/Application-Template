$(document).ready(function() {
    $('#menu-button').click(function() {
        $('#menu-overlay').fadeIn();
    });
    $('#menu-overlay').click(function() {
        $(this).fadeOut();
    });
});