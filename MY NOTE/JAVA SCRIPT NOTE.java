>>>>>>>>>>>TYPE OF FUNCTION IN JAVA SCRIPT<<<<<<<<<<

> Arrow functions

	- let sum = ( number) => {
	- or //let sum = function( number){
	- or //function sum( number) {


	for(let index = 1;index <= number;index++){
	console.log(index)
}
}

sum(50);
	e.g let sum = (a,b)=> {}

	- Arror function also take in argument as an argument
	- in arror function, u can create a function on d fly

> Nexted function

	is when u create a function where d parameter is use as function
e.g  function kaka(){}
	function jaja(kaka()){}
e.g function inside(num){
	num = 100
	function outside(mili){
	lad = 0
	console.log(mili)
}
inside(10)
console.log(num)
}
outside(

> function as an argument

e.g console.log(sum(10))
	bcus console.log is a function

e.g function student(name){
return name
}

function greeting(call, name){
	console.log("welcome" + call(name))
}
greeting(student, "lakiki")

e.g functio greeting(callFn){

callFn()
console.log("Good Morning")
}

function time(){
	console.log("Good Morning")
}

greeting(time);
callFn()

> function as returned object

	- function person(name,age,gender,location){
	return {
	getName: name,
	getAge : age,
	getGender: gender,
	getLocation: location
}
}
 let lad = person("lakiki",14,"male","location");

console.log(lad.getAge);

another e.g

function inside(num){
	num = 100
	function outside(){
	let lad = 0
	return mili;
}
let insideResult = outside();
return {inside: insideResult, num}
}

> call back function
e.g array.map((lap) => {} )

>> All call back function are argument function but not all argument function are arrow function