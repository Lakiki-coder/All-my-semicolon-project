function sumOfAllEvenNumber(evenNumber){

let newArray = []

for(let count = 0;count < 8; count++){

if(count % 2 == 0){

let sum = 0
sum += count;

newArray.push(evenNumber[sum])
}
}
return newArray
}
ler result = [23,43,34,12,2,6,88]
console.log(sumOfAllEvenNumber(sum))


