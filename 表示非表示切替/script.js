/*//パターン1：CSS使用→CSS読みこみ指定
$(function(){
    $("p").hover(
        function(){
        $("img").css("visibility","visible");
        },
        function(){
        $("img").css("visibility","hidden");
    });
});*/
    
//パターン2：css不使用→CSSコメント化
/*$(function(){
    $("img").hide();
    $("p").hover(
        function(){
        $("img").show();
        },
        function(){
        $("img").hide();
    });
}); */   

/*
//パターン3：css不使用→CSSコメント化
$(function(){
    $("img").hide();
    $("p").hover(
        function(){
        $("img").toggle(true);
        },
        function(){
        $("img").toggle(false);
    });
});    
*/

/*//元のコード
$(function(){
    $("p").hover(
        function(){
        $("img").fadeIn();
        },
        function(){
        $("img").fadeOut();
    });
});*/

