


//1. **SumDouble** Given two int values, return their sum. Unless the two values are the same, then return double their sum.

// sumDouble(1, 2) → 3
// sumDouble(3, 2) → 5
// sumDouble(2, 2) → 8


function sumDouble(a, b) {
    let sum = a + b;
    if (a === b) {
        sum *= 2;
    }
    return sum;
}

// 2. **HasTeen** We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return 
//    true if 1 or more of them are teen.

// 		hasTeen(13, 20, 10) → true
// 		hasTeen(20, 19, 10) → true
// 		hasTeen(20, 10, 13) → true

function hasTeen(num1, num2, num3) {
    if (num1 >= 13 && num1 <= 19) {
        return true;
    }

    if (num2 >= 13 && num2 <= 19) {
        return true;
    }

    if (num3 >= 13 && num3 <= 19) {
        return true;
    } else {
        return false;
    }
}

    // 3. **LastDigit** Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.

    // 		lastDigit(7, 17) → true
    // 		lastDigit(6, 17) → false
    // 		lastDigit(3, 113) → true

    function lastDigit(a, b) {
        a = "" + a; //This will concatinate the VALUE in 'a' with whatever in is the string, which here is nothing, thus, the valuse of 'a' becomes the string.
        b = "" + b;
        if (a[a.length - 1] === b[b.length - 1]) {
            return true;
        } else {
            return false;
        }
    }



    // 4. **SeeColor** Given a string, if the string begins with "red" or "blue" return that color string, 
    //     otherwise return the empty string.

    // 		seeColor("redxx") → "red"
    // 		seeColor("xxred") → ""
    // 		seeColor("blueTimes") → "blue"

    function seeColor(str) {

        if (str.startsWith("red")) {
            return "red";
        }
        if (str.startsWith("blue")) {
            return "blue";
        } else
            return "";
        //     if(str.subString(0,3)===("red")){
        //         return "red";
        //     }else if(str.subString(0,4)===("blue")){
        //         return "blue";
        //     }else{
        //         return str;
        //     }
    }

    // 5. **MiddleThree** Given a string of odd length, return the string length 3 from its 
    //      middle, so "Candy" yields "and". The string length will be at least 3.

    // middleThree("Candy") → "and"
    // middleThree("and") → "and"
    // middleThree("solving") → "lvi"

    function middleThree(str) {
         //return (str.substring(((str.length/2) -1), ((str.length/2) +2)));
         return (str.substr(((str.length/2) -1), 3));
    }

    // 6. **FrontAgain** Given a string, return true if the first 2 chars in the string 
    //      also appear at the end of the string, such as with "edited".

	// 	frontAgain("edited") → true
	// 	frontAgain("edit") → false
    // 	frontAgain("ed") → true
    
    function frontAgain(str){
        if(str.substr(0,2) === str.substring(str.length-2)){
            return true;
        }else
        return false;
    }
    
    // 7. **AlarmClock** Write a function that given a day of the week encoded as 
    //      0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, 
    //      displays the weekday name, and the time in the form of "7:00" indicating when the alarm clock should ring. 
    //      Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- 
    //      then on weekdays it should be "10:00" and weekends it should be "off".

	// 	alarmClock(1, false) → "Monday 7:00"
	// 	alarmClock(5, true) → "Friday 10:00"
    // 	alarmClock(0, false) → "Sunday 10:00"
    
    function alarmClock(a, isVacation){
        //days = [0, 1, 2, 3, 4, 5, 6];
            if (a === 0){
                a = "Sunday ";
            } 
            else if (a === 1){
                a = "Monday ";
            } 
            else if (a === 2){
                a = "Tuesday ";
            } 
            else if (a === 3){
                a = "Wednesday ";
            } 
            else if (a === 4){
                a = "Thursday ";
            } 
            else if (a === 5){
                a = "Friday ";
            } else
             a = "Saturday ";

        if(a === "Saturday " || a === "Sunday "){
            if(isVacation){
                return a+"off";
            }else{
                return a+"10:00";
            }
        } else{
            if(isVacation){
                return a+"10:00";
            }else{
                return a+"7:00";
            }
        }    
    }


    // 8. **MakeMiddle** Write a function that given an array of ints of even length, returns a new 
    //      array length 2 containing the middle two elements from the original array. If the original array 
    //      length is not even, or at least 2 elements in length, return an empty array.

    // makeMiddle([1, 2, 3, 4]) → [2, 3]
    // makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    // makeMiddle([1, 2]) → [1, 2]
    
        function makeMiddle(nums){
            result = [];
            if(nums.length < 2 || nums.length%2 === 1){
                return result;
            }else{
                mid = nums.length/2;
                result.push(nums[mid-1]);
                result.push(nums[mid]);
                return result;
            }
        }



















    //14. CountValues problem
    function countValues(array) {
        let counter = {};
        for (let i = 0; i < array.length; i++) {
            let key = array[i];
            if (counter[key] === undefined) {
                counter[key] = 1;
            } else {
                counter[key]++;
            }
        }
        return counter;
    }



    //15. filterEvens

    function filterEvens(array) {
        //<Explicit method>
        //     return array.filter(function(element){
        //         return element %2 === 0;
        //     })
        //</Explicit method>


        //-----
        //"Fat arrow method"
        return array.filter((element) => element % 2 === 0);
        ///----
    }