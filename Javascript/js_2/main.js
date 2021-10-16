// bài 1: Viết function kiểm tra 1 giá trị có nằm trong mảng hay không
    // Ví dụ: checkElementExist([1,2,3,4], 4) => true
    // Ví dụ: checkElementExist([1,2,3,4], 5) => false 
function checkElementExist(arr , element){
    return arr.includes(element); 
} 
const arr = [1,2,3,4];
console.log(checkElementExist(arr,4));
console.log(checkElementExist(arr,5));


//Bài 2: Viết function tìm ra số lớn thứ nhì trong mảng các số.
    // Ví dụ: max2Numbers([2, 1, 3, 4]) => 3
    // Ví dụ: max2Numbers([2, 1, 3, 4, 4]) => 3
function TwolargestNumber(arr) {
    const sortedArr = arr.sort((a , b) => b - a);
    return sortedArr[1];
}
console.log(TwolargestNumber(arr));

//Bài 3: Cho 1 mảng các chuỗi. Viết function lọc ra các phần tử có độ dài lớn nhất.
    // Ví dụ: findMaxLengthElement["aba", "aa", "ad", "c", "vcd"] => ["aba", "vcd"] 
function findMaxLengthElement(arr){
    const sortedArr = arr.sort((a , b) => b.length - a.length);
    return arr.filter((string) => string.length == sortedArr[0].length);
}
const stringArray = ["aba", "aa", "ad", "c", "vcd"];
console.log(findMaxLengthElement(stringArray));

//Bài 4: Viết function có tác dụng biến 1 chuỗi thành chuỗi chỉ viết hoa từ đầu tiên.
    //Ví dụ: capitalizeString('chÀo MừnG đẾn với techMaster') => 'Chào Mừng Đến Với Techmaster'
function capitalizeString(string ) {
    return string.toLowerCase().split(" ")
           .map(word => word.charAt(0).toUpperCase().concat(word.slice(1)))
           .join(" ");
}
const string = "chÀo MừnG đẾn với techMaster";
console.log(capitalizeString(string));

//Bài 5: Viết function với đầu vào là 1 chuỗi string. Trả về chuỗi đảo ngược của chuỗi đó
    //Ví dụ: reverseString('Hello') => 'olleH'
function reverseString(string){
    return string.split("").reverse().join("");
}
const string1 = "Hello";
console.log(reverseString(string1));

//Bài 6: Cho 1 chuỗi, kiểm tra xem chuỗi đó có phải chuỗi đối xứng hay không 
//       (đọc xuôi hay ngược đều như nhau, không tính khoảng trắng, không phân biệt hoa thường),
//Ví dụ: checkSymmetricString("Race car") => true
//Ví dụ: checkSymmetricString("hello world") => false
function checkSymmetricString(string) {
    const newString = string.replace(" ", " ");
    if(newString.lenght % 2 == 0){
        return false;
    }
    const stringArr1 = newString.toLowerCase().split(" ");
    const stringArr2 = stringArr1.reverse();

    for( let i = 0; i < stringArr1.length; i++){
        if(stringArr1[i] != stringArr2[i]){
            return false;
        }
    }
    return true;
}
const string2 = "Race car";
const string3 = "hello world"
console.log(checkSymmetricString(string2));
console.log(checkSymmetricString(string3));
