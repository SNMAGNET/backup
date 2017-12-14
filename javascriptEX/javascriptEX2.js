
for(var a = 0; a<6; a++){
  for(var c=0; c<10; c++){
    if(c%2==0){
        document.write("★");}
    else{
        document.write("☆");}
    }
    document.write("<br>");
}
    
function kigou(){
    return s%3
}

function kigou2(){
    return 
}

for(var t = 0; t<10; t++){
  for(var s=0; s<10; s++){
    if(kigou(s)==0){
        document.write("★");}
    else if(kigou(s)==1){
        document.write("☆");}
    else if(kigou(s)==2){
        document.write("#");}
    }
    document.write("<br>");}

