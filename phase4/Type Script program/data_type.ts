let a :number =10;
//a="raju";
let fname:string ="Raj";
let result : boolean = true;
let msg:any = 100;
msg="Raju";

console.log("value of a "+a);
console.log("value of fname is "+fname);
console.log("value of result is "+result);
console.log("value of msg is "+msg);

let num:Array<number>=[10,20,30,40,50];

console.log("retreive elements using in loop")
for(let i in num){
    console.log(i+" "+num[i])
}
console.log("retrieve elements using of loop")
for(let n of num){
    console.log(n);
}
console.log("using for each function");
num.forEach(v=>console.log(v));

num.map(n=>n+100).forEach(v=>console.log(v));