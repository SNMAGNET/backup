


for(var a=0; a<5; a++){
    for(var b =0; b<5; b++){
        document.write("★");
    }
    document.write("<br>");
}


document.write("<br>");
document.write("<br>");



for(var c=0; c<3; c++){
    for(var d =0; d<5 ;d++){
        if(d%2==0){
            document.write("★");
        }
        else{
            document.write("☆");
        }
        
    }
document.write("<br>");
    
    
    for(var d =0; d<5 ;d++){
        if((d+1)%2==0){
            document.write("★");
        }
        else {
            document.write("☆");
        }
        
    }
document.write("<br>");
}

document.write("<br>");
document.write("<br>");

for(var a=0; a<5; a++){
    for(var b =0; b<5; b++){
        if(b!==a){
            document.write("★");
    }
        else{
            document.write("☆");
        }
    
}document.write("<br>");}