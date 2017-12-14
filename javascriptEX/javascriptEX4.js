//問一

document.write("★★★★★"+"<br>");

for(var a=0; a<5; a++){
    document.write("★");
}
document.write("<br>");

//問二
document.write("★★★"+"<br>"+"★★★"+"<br>");

for(var c=0; c<2; c++){
    for(var b=0; b<3; b++){
    document.write("★");}
    document.write("<br>");
}

document.write("<br>");

//問三
document.write("☆☆☆☆☆"+"<br>"+"☆☆☆☆☆"+"<br>");

for(var c=0; c<2; c++){
    for(var b=0; b<5; b++){
    document.write("☆");}
    document.write("<br>");
}

document.write("<br>");

//問四
document.write("★★★★★"+"<br>"+"★★★★★"+"<br>"+"★★★★★"+"<br>"+"★★★★★"+"<br>");

for(var c=0; c<4; c++){
    for(var b=0; b<5; b++){
    document.write("★");}
    document.write("<br>");
}

document.write("<br>");

//問五
document.write("★★★"+"<br>"+"★★★"+"<br>"+"★★★"+"<br>"+"★★★"+"<br>");

for(var c=0; c<4; c++){
    for(var b=0; b<3; b++){
    document.write("★");}
    document.write("<br>");
}

document.write("<br>");

//問六
document.write("★☆★"+"<br>"+"★☆★"+"<br>"+"★☆★"+"<br>"+"★☆★"+"<br>");


    



//問七
document.write("★☆★☆★"+"<br>"+"★☆★☆★"+"<br>"+"★☆★☆★"+"<br>"+"★☆★☆★"+"<br>");



//問八
document.write("★"+"<br>"+"★★"+"<br>"+"★★★"+"<br>"+"★★★★"+"<br>"+"★★★★★"+"<br>");


for(var s=1; s<=5; s++){
    for(var t=1; t<=s; t++){
    document.write("★");
}
    document.write("<br>");
}

document.write("<br>");
document.write("<br>");
document.write("<br>");


function circle(r){
return r*r*3.14+"<br>";}

document.write(circle(5));
document.write(circle(7));
document.write(circle(10));


function ryoukin(O,K){
    return "グループの料金は"+ (O*500+K*200) +"円です";
}
document.write("A"+ryoukin(2,4)+"<br>");
document.write("B"+ryoukin(1,5)+"<br>");
document.write("C"+ryoukin(3,7)+"<br>");