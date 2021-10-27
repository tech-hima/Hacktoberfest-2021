function bubbleSort(array){
    for(let i = 0; i < array.length; i++){
        for(let j = 0; j < array.length - i - 1; j++){
            if(array[j + 1] < array[j]){
                [array[j + 1],array[j]] = [array[j],array[j + 1]]
            }
        }
    };
    return array;
};

console.log(bubbleSort([5,3,8,4,6]));
console.log(bubbleSort([3,1,0,11,12,13,12,3,1,1,4,9,0]));
console.log(bubbleSort([5,3,8,4,12,3,1,1,4,9,0,12,3,1,1,4,9,0]));
console.log(bubbleSort([5,3]));