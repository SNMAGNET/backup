
for(var i=0; i<5; i++){
    for(var t=0; t<5; t++){document.write("★");
}
    document.write("<br>");
}


document.write("<br>");
document.write("<br>");
document.write("<br>");


for(var s=0; s<5; s++){
    if(s%2==0){
        for(var i2 =0; i2<5; i2++){
             if(i2 % 2==0){
                  document.write("★");
                          }
             else {
                  document.write("☆");
                  }
    
                                  }      
    document.write("<br>");
              }
    else{
        for(var i2 =0; i2<5; i2++){
             if(i2 % 2==0){
                  document.write("☆");
                          }
             else {
                  document.write("★");
                  }            
                                  }
    document.write("<br>");
        
        }
                       }



document.write("<br>");
document.write("<br>");


for(var a=0; a<5; a++){
    for(var b=0; b<5; b++){
        if(a==b){
            document.write("☆");
        }
        else{
            document.write("★");
        }
        
    }
    document.write("<br>");
}


document.write("<br>");
document.write("<br>");


for(var a=0; a<6; a++){
    for(var b=0; b<5; b++){
        if(a>b){
            document.write("★");
         }
    }
    if(a!==0){document.write("<br>");
             }
}

document.write("<br>");
document.write("<br>");


for(var a=0; a<5; a++){
    for(var b=0; b<5; b++){
        if(a==b){
            document.write("☆");
        }
        else if(a>b){
            document.write("★");
        }
        
    }
    document.write("<br>");
}


for(o=0; o<=4; o++){
    for(p=0; p<=4; p++){
        if(p==o){
            document.write("☆"+"<br>");
            break;
        }
        else{
            document.write("★")
        }
    }
}


document.write("<br>");
document.write("<br>");
document.write("<br>");
document.write("<br>");


function circle(r){
return r**2*3,14;
}

document.write(circle(5)+"c㎡");