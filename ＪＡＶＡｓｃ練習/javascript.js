
var a1 = "TANAKA";

document.write(a1);

var name = "中村";
document.write(name);

var tel = "090-1234-5678<br>";
document.write(tel);

var a1 = 2 + 3;
document.write(a1);

document.write("<br>");

var a2 = 2 * 3;
document.write(a2);

document.write("<br>");

var a3 = 2 / 3;
document.write(a3);

document.write("<br>");

var a4 = 2 % 3
document.write(a4 + "<br>");
//剰余。割ってあまったそのあまりの数を出す。


var a5 = 15 / 4;
var a6 = 15 % 4;

document.write("15を4で割ると" + a5 + "商の小数以下を考えないとすると、あまりは" + a6 + "<br>");

var c1 = 12;
if(c1 > 10) {
document.write("10よりでかいぞ！" + "<br>");
}else if(c1==10){
document.write("10だぞ！"+"<br>");
}else{
document.write("10よりちいさいぞ！"+"<br>");}



if(c1!=10){
document.write("10じゃないぞ！"+"<br>");}
if(c1<20 && c1>10){
document.write("20より小さくて１０よりデカイゾ！"+"<br>");}
if(c1>20 || c1<18){
document.write("20より大きいか、または１８より小さいぞ！"+"<br>");}

if(c1<20){
if(c1>15){
document.write("20より小さく、15より大きい！"+"<br>");
}}

if(c1%2==0){
document.write("偶数");
}else{document.write("奇数");}

var d1=90
var d2=100

if(d1>=80){
 if(d2>=70){
 document.write("合格");
 }
  else{
  document.write("不合格");}}

var e1=50
if(e1>1){
 if(e1==2){
     document.write("A");
 } else if(e1==3){
        document.write("B");}
    else {document.write("C")}}