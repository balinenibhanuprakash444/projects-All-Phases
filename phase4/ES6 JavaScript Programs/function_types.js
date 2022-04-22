// normal function
function display1(){
    document.write("Normal function <br/>");

}
display1();
display1();
//Expression style function with function body with name
let display3 = function display2(){
    document.write("<br/> Expression style function")
}
display3();
display3();
//Expression style function with function body without name
let display4 = function(){
    document.write("<br/> Expression style function")
}
display4();
//IIFE Function style
(function())
document.write("<br/>IIFE Style function")
})();
//Arrow function : ES6
let display5 = ()=>document.write("<br/>This simple arroe function");
display5();
//Addition of two number using express style
let addNumber1 = function(a,b){
    var sum = a+b;
    return sum;
}
document.write("<br/> Addition of two number using expression style "+addNumber1(10,20));
// Addition of two numbers using arrow style
let addNumber2 = (a,b)=>a+b;
document.write("<br/> Addition of two number using arrow style "+addNumber2(10,20));
// find  larges of two number using expression style
let findLargest1 = function(a,b){
    if(a>b){
        return "a is largest"
    }else{
        return "b is largest"
    }
    
}
document.write("<br/>"+findLargest1(10,5));
let findLargest2 = (a,b)=>{
    if(a>b){
        return "a is largest"
    }else{
        return "b is largest"
    }
}
document.write("<br/>" +findLargest2(10,5));
