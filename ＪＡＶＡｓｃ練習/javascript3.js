for(var a=1; a<10; a++){
    for(var b=1; b<10; b++){
        document.write(a*b+" ");
    }
        document.write(a+"の段"+" ");
}


var i=0
while(i>-3){
    document.write(i+"は-3より大きいぞ！"+" ");
    i--
}

document.write(a,b)
//for文の中身で規定した変数を処理の外で改めて記述すると、その処理が終わった後の、初期値と変化した変数が出てくるぞ！

var t　=["中村","南里","内山","依知川"];
document.write(t)
document.write(t[3]);
delete t[3];
document.write(t);
document.write(t[3]);
t[3]="依知川";
document.write(t);
