document.getElementById('operationSelect').addEventListener('change', function() {
    const operationContainer = document.getElementById('operationContainer');
    const selectedOperation = this.value;
    
    // Clear any existing content
    operationContainer.innerHTML = '';

    if (selectedOperation === 'helloWorld') {
        operationContainer.innerHTML = `<p>Hello, World!</p>`;
    } else if (selectedOperation === 'sumTwoNumbers') {
        operationContainer.innerHTML = `
            <input type="number" id="num1" placeholder="Enter first number">
            <input type="number" id="num2" placeholder="Enter second number">
            <button onclick="calculateSum()">Calculate Sum</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'evenOdd') {
        operationContainer.innerHTML = `
            <input type="number" id="number" placeholder="Enter a number">
            <button onclick="checkEvenOdd()">Check Even or Odd</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'primeCheck') {
        operationContainer.innerHTML = `
            <input type="number" id="number" placeholder="Enter a number">
            <button onclick="checkPrime()">Check Prime</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'factorial') {
        operationContainer.innerHTML = `
            <input type="number" id="number" placeholder="Enter a number">
            <button onclick="calculateFactorial()">Calculate Factorial</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'fibonacci') {
        operationContainer.innerHTML = `
            <input type="number" id="number" placeholder="Enter N">
            <button onclick="fibonacciSeries()">Generate Fibonacci</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'reverseNumber') {
        operationContainer.innerHTML = `
            <input type="number" id="number" placeholder="Enter a number">
            <button onclick="reverseNumber()">Reverse Number</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'palindromeNumber') {
        operationContainer.innerHTML = `
            <input type="number" id="number" placeholder="Enter a number">
            <button onclick="checkPalindrome()">Check Palindrome</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'armstrongNumber') {
        operationContainer.innerHTML = `
            <input type="number" id="number" placeholder="Enter a number">
            <button onclick="checkArmstrong()">Check Armstrong</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'swapNumbers') {
        operationContainer.innerHTML = `
            <input type="number" id="num1" placeholder="Enter first number">
            <input type="number" id="num2" placeholder="Enter second number">
            <button onclick="swapNumbers()">Swap Numbers</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'largestOfThree') {
        operationContainer.innerHTML = `
            <input type="number" id="num1" placeholder="Enter first number">
            <input type="number" id="num2" placeholder="Enter second number">
            <input type="number" id="num3" placeholder="Enter third number">
            <button onclick="findLargestOfThree()">Find Largest</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'leapYear') {
        operationContainer.innerHTML = `
            <input type="number" id="year" placeholder="Enter year">
            <button onclick="checkLeapYear()">Check Leap Year</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'sumOfDigits') {
        operationContainer.innerHTML = `
            <input type="number" id="number" placeholder="Enter a number">
            <button onclick="sumOfDigits()">Sum of Digits</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'powerOfNumber') {
        operationContainer.innerHTML = `
            <input type="number" id="base" placeholder="Enter base">
            <input type="number" id="exponent" placeholder="Enter exponent">
            <button onclick="calculatePower()">Calculate Power</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'gcdLcm') {
        operationContainer.innerHTML = `
            <input type="number" id="num1" placeholder="Enter first number">
            <input type="number" id="num2" placeholder="Enter second number">
            <button onclick="findGcdLcm()">Find GCD & LCM</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'anagramCheck') {
        operationContainer.innerHTML = `
            <input type="text" id="string1" placeholder="Enter first string">
            <input type="text" id="string2" placeholder="Enter second string">
            <button onclick="checkAnagram()">Check Anagram</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'countVowelsConsonants') {
        operationContainer.innerHTML = `
            <input type="text" id="string" placeholder="Enter a string">
            <button onclick="countVowelsConsonants()">Count Vowels & Consonants</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'findDuplicateChars') {
        operationContainer.innerHTML = `
            <input type="text" id="string" placeholder="Enter a string">
            <button onclick="findDuplicateCharacters()">Find Duplicates</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'removeWhiteSpaces') {
        operationContainer.innerHTML = `
            <input type="text" id="string" placeholder="Enter a string">
            <button onclick="removeWhiteSpaces()">Remove White Spaces</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'reverseString') {
        operationContainer.innerHTML = `
            <input type="text" id="string" placeholder="Enter a string">
            <button onclick="reverseString()">Reverse String</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'bubbleSort') {
        operationContainer.innerHTML = `
            <input type="text" id="array" placeholder="Enter array elements separated by commas">
            <button onclick="bubbleSort()">Sort Array</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'secondLargest') {
        operationContainer.innerHTML = `
            <input type="text" id="array" placeholder="Enter array elements separated by commas">
            <button onclick="findSecondLargest()">Find Second Largest</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'binarySearch') {
        operationContainer.innerHTML = `
            <input type="text" id="array" placeholder="Enter sorted array elements separated by commas">
            <input type="number" id="target" placeholder="Enter target number">
            <button onclick="binarySearch()">Binary Search</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'checkArraySorted') {
        operationContainer.innerHTML = `
            <input type="text" id="array" placeholder="Enter array elements separated by commas">
            <button onclick="checkArraySorted()">Check if Sorted</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'mergeSortedArrays') {
        operationContainer.innerHTML = `
            <input type="text" id="array1" placeholder="Enter first sorted array elements separated by commas">
            <input type="text" id="array2" placeholder="Enter second sorted array elements separated by commas">
            <button onclick="mergeSortedArrays()">Merge Arrays</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'arrayIntersection') {
        operationContainer.innerHTML = `
            <input type="text" id="array1" placeholder="Enter first array elements separated by commas">
            <input type="text" id="array2" placeholder="Enter second array elements separated by commas">
            <button onclick="findArrayIntersection()">Find Intersection</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'transposeMatrix') {
        operationContainer.innerHTML = `
            <textarea id="matrix" placeholder="Enter matrix elements separated by commas, rows separated by newlines"></textarea>
            <button onclick="transposeMatrix()">Transpose Matrix</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'rotateMatrix') {
        operationContainer.innerHTML = `
            <textarea id="matrix" placeholder="Enter matrix elements separated by commas, rows separated by newlines"></textarea>
            <button onclick="rotateMatrix()">Rotate Matrix</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'rotationCheck') {
        operationContainer.innerHTML = `
            <input type="text" id="string1" placeholder="Enter first string">
            <input type="text" id="string2" placeholder="Enter second string">
            <button onclick="checkRotation()">Check Rotation</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'missingNumber') {
        operationContainer.innerHTML = `
            <input type="text" id="array" placeholder="Enter array elements separated by commas">
            <button onclick="findMissingNumber()">Find Missing Number</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'arraySum') {
        operationContainer.innerHTML = `
            <input type="text" id="array" placeholder="Enter array elements separated by commas">
            <button onclick="calculateArraySum()">Calculate Sum</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'removeArrayDuplicates') {
        operationContainer.innerHTML = `
            <input type="text" id="array" placeholder="Enter array elements separated by commas">
            <button onclick="removeArrayDuplicates()">Remove Duplicates</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'stringToNumber') {
        operationContainer.innerHTML = `
            <input type="text" id="string" placeholder="Enter a string">
            <button onclick="convertStringToNumber()">Convert String to Number</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'caesarCipher') {
        operationContainer.innerHTML = `
            <input type="text" id="string" placeholder="Enter a string">
            <input type="number" id="shift" placeholder="Enter shift value">
            <button onclick="implementCaesarCipher()">Apply Caesar Cipher</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'firstNonRepeatedChar') {
        operationContainer.innerHTML = `
            <input type="text" id="string" placeholder="Enter a string">
            <button onclick="findFirstNonRepeatedChar()">Find First Non-Repeated Character</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'substringCheck') {
        operationContainer.innerHTML = `
            <input type="text" id="string1" placeholder="Enter the main string">
            <input type="text" id="string2" placeholder="Enter substring">
            <button onclick="checkSubstring()">Check Substring</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'charFrequency') {
        operationContainer.innerHTML = `
            <input type="text" id="string" placeholder="Enter a string">
            <button onclick="countCharFrequency()">Count Character Frequency</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'decimalToBinary') {
        operationContainer.innerHTML = `
            <input type="number" id="number" placeholder="Enter a decimal number">
            <button onclick="convertDecimalToBinary()">Convert Decimal to Binary</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'largestSumSubarray') {
        operationContainer.innerHTML = `
            <input type="text" id="array" placeholder="Enter array elements separated by commas">
            <button onclick="findLargestSumSubarray()">Find Largest Sum Subarray</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'perfectDeficientAbundant') {
        operationContainer.innerHTML = `
            <input type="number" id="number" placeholder="Enter a number">
            <button onclick="checkPerfectDeficientAbundant()">Check Perfect, Deficient, or Abundant</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'reverseWords') {
        operationContainer.innerHTML = `
            <input type="text" id="string" placeholder="Enter a string">
            <button onclick="reverseWords()">Reverse Words</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'basicCalculator') {
        operationContainer.innerHTML = `
            <input type="number" id="num1" placeholder="Enter first number">
            <input type="number" id="num2" placeholder="Enter second number">
            <select id="operation">
                <option value="add">Add</option>
                <option value="subtract">Subtract</option>
                <option value="multiply">Multiply</option>
                <option value="divide">Divide</option>
            </select>
            <button onclick="basicCalculator()">Calculate</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'dayOfWeek') {
        operationContainer.innerHTML = `
            <input type="date" id="date">
            <button onclick="findDayOfWeek()">Find Day of Week</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'generateRandomNumbers') {
        operationContainer.innerHTML = `
            <input type="number" id="min" placeholder="Enter minimum value">
            <input type="number" id="max" placeholder="Enter maximum value">
            <input type="number" id="count" placeholder="Enter count">
            <button onclick="generateRandomNumbers()">Generate Random Numbers</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'romanToInteger') {
        operationContainer.innerHTML = `
            <input type="text" id="roman" placeholder="Enter Roman numeral">
            <button onclick="convertRomanToInteger()">Convert Roman to Integer</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'toDoList') {
        operationContainer.innerHTML = `
            <input type="text" id="task" placeholder="Enter a task">
            <button onclick="addToDo()">Add Task</button>
            <ul id="taskList"></ul>
        `;
    } else if (selectedOperation === 'primeNumbersRange') {
        operationContainer.innerHTML = `
            <input type="number" id="start" placeholder="Enter start of range">
            <input type="number" id="end" placeholder="Enter end of range">
            <button onclick="findPrimeNumbersRange()">Find Prime Numbers</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'decimalToHexadecimal') {
        operationContainer.innerHTML = `
            <input type="number" id="decimal" placeholder="Enter decimal number">
            <button onclick="convertDecimalToHexadecimal()">Convert Decimal to Hexadecimal</button>
            <p id="result"></p>
        `;
    } else if (selectedOperation === 'sumEvenFibonacci') {
        operationContainer.innerHTML = `
            <input type="number" id="n" placeholder="Enter N">
            <button onclick="sumEvenFibonacci()">Sum Even Fibonacci Numbers</button>
            <p id="result"></p>
        `;
    }
});

// Functions for each operation

function sumTwoNumbers() {
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    const result = num1 + num2;
    document.getElementById('result').textContent = `Sum: ${result}`;
}

function checkEvenOdd() {
    const number = parseInt(document.getElementById('number').value);
    const result = number % 2 === 0 ? 'Even' : 'Odd';
    document.getElementById('result').textContent = `The number is ${result}.`;
}

function checkPrime() {
    const number = parseInt(document.getElementById('number').value);
    let isPrime = true;

    if (number <= 1) {
        isPrime = false;
    } else {
        for (let i = 2; i <= Math.sqrt(number); i++) {
            if (number % i === 0) {
                isPrime = false;
                break;
            }
        }
    }

    document.getElementById('result').textContent = isPrime ? 'The number is Prime.' : 'The number is not Prime.';
}

function calculateFactorial() {
    const number = parseInt(document.getElementById('number').value);
    let result = 1;

    for (let i = 2; i <= number; i++) {
        result *= i;
    }

    document.getElementById('result').textContent = `Factorial: ${result}`;
}

function fibonacciSeries() {
    const n = parseInt(document.getElementById('number').value);
    let fib = [0, 1];

    for (let i = 2; i < n; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
    }

    document.getElementById('result').textContent = `Fibonacci Series: ${fib.slice(0, n).join(', ')}`;
}

function reverseNumber() {
    const number = parseInt(document.getElementById('number').value);
    const reversed = number.toString().split('').reverse().join('');
    document.getElementById('result').textContent = `Reversed Number: ${reversed}`;
}

function checkPalindrome() {
    const number = document.getElementById('number').value;
    const reversed = number.split('').reverse().join('');
    const isPalindrome = number === reversed;
    document.getElementById('result').textContent = isPalindrome ? 'The number is a Palindrome.' : 'The number is not a Palindrome.';
}

function checkArmstrong() {
    const number = parseInt(document.getElementById('number').value);
    const digits = number.toString().split('').map(Number);
    const armstrongSum = digits.reduce((sum, digit) => sum + Math.pow(digit, digits.length), 0);
    const isArmstrong = number === armstrongSum;
    document.getElementById('result').textContent = isArmstrong ? 'The number is an Armstrong number.' : 'The number is not an Armstrong number.';
}

function swapNumbers() {
    let num1 = parseFloat(document.getElementById('num1').value);
    let num2 = parseFloat(document.getElementById('num2').value);
    
    [num1, num2] = [num2, num1];
    
    document.getElementById('result').textContent = `After Swap: num1 = ${num1}, num2 = ${num2}`;
}

function findLargestOfThree() {
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    const num3 = parseFloat(document.getElementById('num3').value);
    
    const largest = Math.max(num1, num2, num3);
    
    document.getElementById('result').textContent = `Largest Number: ${largest}`;
}

function checkLeapYear() {
    const year = parseInt(document.getElementById('year').value);
    const isLeap = (year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0);
    document.getElementById('result').textContent = isLeap ? `${year} is a Leap Year.` : `${year} is not a Leap Year.`;
}

function sumOfDigits() {
    const number = parseInt(document.getElementById('number').value);
    const digits = number.toString().split('').map(Number);
    const sum = digits.reduce((a, b) => a + b, 0);
    document.getElementById('result').textContent = `Sum of Digits: ${sum}`;
}

function calculatePower() {
    const base = parseFloat(document.getElementById('base').value);
    const exponent = parseInt(document.getElementById('exponent').value);
    const result = Math.pow(base, exponent);
    document.getElementById('result').textContent = `${base} raised to the power of ${exponent} is ${result}.`;
}

function findGcdLcm() {
    const num1 = parseInt(document.getElementById('num1').value);
    const num2 = parseInt(document.getElementById('num2').value);
    
    const gcd = (a, b) => b === 0 ? a : gcd(b, a % b);
    const lcm = (a, b) => Math.abs(a * b) / gcd(a, b);
    
    const gcdResult = gcd(num1, num2);
    const lcmResult = lcm(num1, num2);
    
    document.getElementById('result').textContent = `GCD: ${gcdResult}, LCM: ${lcmResult}`;
}

function checkAnagram() {
    const string1 = document.getElementById('string1').value.toLowerCase().replace(/[^a-z0-9]/g, '');
    const string2 = document.getElementById('string2').value.toLowerCase().replace(/[^a-z0-9]/g, '');
    
    const sorted1 = string1.split('').sort().join('');
    const sorted2 = string2.split('').sort().join('');
    
    const isAnagram = sorted1 === sorted2;
    
    document.getElementById('result').textContent = isAnagram ? 'The strings are Anagrams.' : 'The strings are not Anagrams.';
}

function countVowelsConsonants() {
    const string = document.getElementById('string').value.toLowerCase();
    const vowels = string.match(/[aeiou]/g);
    const consonants = string.match(/[bcdfghjklmnpqrstvwxyz]/g);
    
    document.getElementById('result').textContent = `Vowels: ${vowels ? vowels.length : 0}, Consonants: ${consonants ? consonants.length : 0}`;
}

function findDuplicateCharacters() {
    const string = document.getElementById('string').value.toLowerCase();
    const charCount = {};
    const duplicates = [];

    for (const char of string) {
        if (char.match(/[a-z0-9]/)) {
            charCount[char] = (charCount[char] || 0) + 1;
            if (charCount[char] === 2) {
                duplicates.push(char);
            }
        }
    }
    
    document.getElementById('result').textContent = `Duplicate Characters: ${duplicates.join(', ')}`;
}

function removeWhiteSpaces() {
    const string = document.getElementById('string').value;
    const result = string.replace(/\s+/g, '');
    document.getElementById('result').textContent = `String without spaces: ${result}`;
}

function reverseString() {
    const string = document.getElementById('string').value;
    const reversed = string.split('').reverse().join('');
    document.getElementById('result').textContent = `Reversed String: ${reversed}`;
}

function bubbleSort() {
    let array = document.getElementById('array').value.split(',').map(Number);
    
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array.length - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                [array[j], array[j + 1]] = [array[j + 1], array[j]];
            }
        }
    }
    
    document.getElementById('result').textContent = `Sorted Array: ${array.join(', ')}`;
}

function findSecondLargest() {
    let array = document.getElementById('array').value.split(',').map(Number);
    let max = Math.max(...array);
    array = array.filter(num => num !== max);
    let secondMax = Math.max(...array);
    
    document.getElementById('result').textContent = `Second Largest Element: ${secondMax}`;
}

function binarySearch() {
    const array = document.getElementById('array').value.split(',').map(Number).sort((a, b) => a - b);
    const key = parseInt(document.getElementById('key').value);
    
    let low = 0, high = array.length - 1, found = false;
    
    while (low <= high) {
        const mid = Math.floor((low + high) / 2);
        
        if (array[mid] === key) {
            found = true;
            break;
        } else if (array[mid] < key) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    
    document.getElementById('result').textContent = found ? `Element found in the array.` : `Element not found in the array.`;
}

function mergeTwoArrays() {
    const array1 = document.getElementById('array1').value.split(',').map(Number);
    const array2 = document.getElementById('array2').value.split(',').map(Number);
    const mergedArray = array1.concat(array2).sort((a, b) => a - b);
    
    document.getElementById('result').textContent = `Merged and Sorted Array: ${mergedArray.join(', ')}`;
}

function rotateMatrix() {
    const matrix = document.getElementById('matrix').value.split('\n').map(row => row.trim().split(' '));
    const n = matrix.length;
    let rotated = Array.from({ length: n }, () => Array(n).fill(0));

    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            rotated[j][n - 1 - i] = matrix[i][j];
        }
    }

    document.getElementById('result').textContent = `Rotated Matrix:\n${rotated.map(row => row.join(' ')).join('\n')}`;
}
// Find the Missing Number in an Array
function findMissingNumber(arr, n) {
    let total = Math.floor((n * (n + 1)) / 2);
    let sum = arr.reduce((acc, num) => acc + num, 0);
    return total - sum;
}

// Calculate Sum of Elements in an Array
function arraySum(arr) {
    return arr.reduce((acc, num) => acc + num, 0);
}

// Remove Duplicates from an Array
function removeArrayDuplicates(arr) {
    return [...new Set(arr)];
}

// Convert a String to a Number (Without Using Library Functions)
function stringToNumber(str) {
    let num = 0;
    for (let i = 0; i < str.length; i++) {
        num = num * 10 + (str.charCodeAt(i) - '0'.charCodeAt(0));
    }
    return num;
}

// Implement Caesar Cipher Encryption
function caesarCipher(str, shift) {
    return str.split('').map(char => {
        if (char.match(/[a-z]/i)) {
            let code = char.charCodeAt(0);
            let shiftBase = code >= 65 && code <= 90 ? 65 : 97;
            return String.fromCharCode(((code - shiftBase + shift) % 26) + shiftBase);
        }
        return char;
    }).join('');
}

// Find the First Non-Repeated Character in a String
function firstNonRepeatedChar(str) {
    let charCount = {};
    for (let char of str) {
        charCount[char] = (charCount[char] || 0) + 1;
    }
    for (let char of str) {
        if (charCount[char] === 1) return char;
    }
    return null;
}

// Check if a String is a Substring of Another String
function substringCheck(str, subStr) {
    return str.includes(subStr);
}

// Count the Frequency of Each Character in a String
function charFrequency(str) {
    let freq = {};
    for (let char of str) {
        freq[char] = (freq[char] || 0) + 1;
    }
    return freq;
}

// Implement Decimal to Binary Conversion
function decimalToBinary(decimal) {
    return (decimal >>> 0).toString(2);
}

// Find the Largest Sum Contiguous Subarray
function largestSumSubarray(arr) {
    let maxSoFar = arr[0];
    let currMax = arr[0];
    for (let i = 1; i < arr.length; i++) {
        currMax = Math.max(arr[i], currMax + arr[i]);
        maxSoFar = Math.max(maxSoFar, currMax);
    }
    return maxSoFar;
}

// Check if a Number is Perfect, Deficient, or Abundant
function perfectDeficientAbundant(num) {
    let sum = 0;
    for (let i = 1; i <= num / 2; i++) {
        if (num % i === 0) sum += i;
    }
    if (sum === num) return 'Perfect';
    if (sum < num) return 'Deficient';
    return 'Abundant';
}

// Reverse Words in a String
function reverseWords(str) {
    return str.split(' ').reverse().join(' ');
}

// Implement Basic Calculator (Add, Subtract, Multiply, Divide)
function basicCalculator(a, b, operator) {
    switch (operator) {
        case 'add': return a + b;
        case 'subtract': return a - b;
        case 'multiply': return a * b;
        case 'divide': return a / b;
        default: return null;
    }
}

// Find the Day of the Week for a Given Date
function dayOfWeek(date) {
    const days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    return days[new Date(date).getDay()];
}

// Generate Random Numbers within a Given Range
function generateRandomNumbers(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

// Calculate Compound Interest
function compoundInterest(principal, rate, time, n) {
    return principal * Math.pow((1 + rate / n), n * time);
}

// Convert Roman Numerals to Integer
function romanToInteger(roman) {
    const romanNumeralMap = {
        'I': 1, 'V': 5, 'X': 10, 'L': 50,
        'C': 100, 'D': 500, 'M': 1000
    };
    let total = 0;
    for (let i = 0; i < roman.length; i++) {
        if (romanNumeralMap[roman[i]] < romanNumeralMap[roman[i + 1]]) {
            total -= romanNumeralMap[roman[i]];
        } else {
            total += romanNumeralMap[roman[i]];
        }
    }
    return total;
}

// Create a Simple To-Do List Application
function toDoList() {
    let todos = [];
    return {
        addTask: (task) => todos.push(task),
        removeTask: (task) => todos = todos.filter(t => t !== task),
        getTasks: () => todos
    };
}

// Find All Prime Numbers within a Given Range
function primeNumbersRange(min, max) {
    let primes = [];
    for (let i = min; i <= max; i++) {
        let isPrime = true;
        if (i < 2) isPrime = false;
        for (let j = 2; j <= Math.sqrt(i); j++) {
            if (i % j === 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) primes.push(i);
    }
    return primes;
}

// Convert Decimal to Hexadecimal and Vice Versa
function decimalToHexadecimal(decimal) {
    return decimal.toString(16);
}

function hexadecimalToDecimal(hex) {
    return parseInt(hex, 16);
}

// Find the Sum of All Even Fibonacci Numbers Below N
function sumEvenFibonacci(n) {
    let a = 1, b = 2, sum = 0;
    while (b < n) {
        if (b % 2 === 0) sum += b;
        [a, b] = [b, a + b];
    }
    return sum;
}

