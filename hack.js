let lowestRow = 0;
let lowestRowTotal = n;
let rowTotal = 0;
//so like if the lowest total equals n then just return 0,0 because lot is full
for(let i = 0; i < available.length; i++){
     rowTotal = 0;
    for(let j = 0; j < available[i].length; j++){
        rowTotal += available[i][j];
    }
    if(rowTotal < lowestRowTotal){
        lowestRowTotal = rowTotal;
        lowestRow = i;
    }
}
if(lowestRowTotal == n){
    let myArray = [];
    myArray.push(0);
    myArray.push(0);
    return myArray;
}

let spot = 0;
console.log(available[lowestRow])
for(let k = 0; k < available[lowestRow].length; k++){
    if(available[lowestRow][k] == 1){
        continue;
    }else{
        spot = k;
        break;
    }
}

let answerArray = [];
answerArray.push(lowestRow+1);
answerArray.push(spot+1);

return answerArray;
