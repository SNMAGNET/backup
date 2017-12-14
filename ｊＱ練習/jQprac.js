$(function(){
    $(".kieru").fadeOut("slow");
});

$(function(){
    $(".toudai").hover(
    function(){
        $("img").fadeIn();
    },
    function(){
        $("img").fadeOut();
    });
});



$(function(){
    $(".iro").hover(
        function(){
        $(".iro").css("color","red");
    },
    function(){
        $(".iro").css("color","black");
    }
    );
});