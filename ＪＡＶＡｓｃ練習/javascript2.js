var a ="赤";

switch(a){
    case 0:
    document.write("aは0に等しい"+"<br>");
    break;
    
    case 1:
    document.write("aは1に等しい"+"<br>");
    break;
}



switch(a){
    case 0:
    document.write("a==0"+"<br>");
    break;
    case 1:
    document.write("a==1"+"<br>");
    break;
    default:
    document.write("a!=0 && a!=1"+"<br>");
}

switch(a){
    case "赤":
    document.write("a==赤"+"<br>");
    break;
        
    case "白":
    document.write("a==白"+"<br>");
    break;
}

for(var i =-50; i<0; i+=2){
    document.write("ぬわーーーーー！！！");
}

document.write("<br>")

for( var t=1;  t<11 ; t++){
    if(t%2==0){
        document.write("<br>");}
    else{
        document.write(t+"<br>");}
}