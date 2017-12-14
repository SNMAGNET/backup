alert("＜アラート文をどうぞ＞");

confirm("＜確認メッセージをどうぞ＞");





$(function(){
    $("button").hover(
        function(){
            $(this).css("color","gray")},
        function(){
            $(this).css("color","white")}
        );
});

/*$(function(){
    $("#acMenu dt").on("click",function() {
            $(this).next().slideToggle();
        });
    });*/

 $(function(){
    $("#acMenu dt").hover(
    function(){
        $(this).next().slideDown(
        {duration:'fast'});
    },
    function(){
        $(this).next().slideUp(
        {duration:''});
    });
}); 