// bài 1
console.log("bài 1");
function mark(number){
    if (number >= 85){
        console.log("a");
    }else if (number >= 70 && number < 85){
        console.log("b");
    }else if (number >= 40 && number <70){
        console.log("c");
    }else{
        console.log("d");
    }
}
mark(90);

// bài 2
console.log("bài 2");
function day(number){
    switch (number) {
        case 0: 
        console.log("Chủ Nhật");
        break;
        case 1: 
        console.log("thứ 2");
        break;
        case 2: 
        console.log("thứ 3");
        break;
        case 3: 
        console.log("thứ 4");
        break;
        case 4: 
        console.log("thứ 5");
        break;
        case 5:
        console.log("thứ 6");
        break;
        case 6:
        console.log("thứ 7");
        break;
        default:
        break;
    }
}
day(3);

// bài 3
console.log("bài 3");
function random(a , b){
    console.log(Math.random() * (a - b) + b);
}
random(10 , 2);

//Bài tập vòng lặp
// bài 4
console.log("bài 4");
function Sum(number){
    let sum = 0 ;
    for( let i = 1 ; i <= number;){
        sum += i;
        i += 2;
    }
    console.log(sum);
}
Sum(100);

//bài 5
console.log("bài 5");
function SumAdd(a , b ,number){
    let sum = 0 ;
    for(let i = a ; i <= number;){
        if(i % b == 0){
            sum += i;
        }
        i += a;
    }
    console.log(sum);
}
SumAdd(3,5,100);