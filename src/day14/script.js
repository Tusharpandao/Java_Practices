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
    }
// Add more operations here as needed


else if (selectedOperation === 'reverseWords') {
    operationContainer.innerHTML = `
        <input type="text" id="sentence" placeholder="Enter a sentence">
        <button onclick="reverseWords()">Reverse Words</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'longestWord') {
    operationContainer.innerHTML = `
        <input type="text" id="sentence" placeholder="Enter a sentence">
        <button onclick="findLongestWord()">Find Longest Word</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'pangramCheck') {
    operationContainer.innerHTML = `
        <input type="text" id="sentence" placeholder="Enter a sentence">
        <button onclick="checkPangram()">Check Pangram</button>
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
        <button onclick="calculate()">Calculate</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'dayOfWeek') {
    operationContainer.innerHTML = `
        <input type="date" id="dateInput">
        <button onclick="findDayOfWeek()">Find Day of the Week</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'generateRandomNumbers') {
    operationContainer.innerHTML = `
        <input type="number" id="min" placeholder="Min value">
        <input type="number" id="max" placeholder="Max value">
        <button onclick="generateRandomNumbers()">Generate</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'bankingSystem') {
    operationContainer.innerHTML = `
        <input type="text" id="action" placeholder="Action (Deposit/Withdraw/Check Balance)">
        <input type="number" id="amount" placeholder="Amount (if applicable)">
        <button onclick="bankingSystem()">Perform Action</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'votingSystem') {
    operationContainer.innerHTML = `
        <input type="text" id="candidate" placeholder="Candidate Name">
        <button onclick="vote()">Vote</button>
        <button onclick="showVotes()">Show Votes</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'libraryManagement') {
    operationContainer.innerHTML = `
        <input type="text" id="action" placeholder="Action (Add/Remove/Check)">
        <input type="text" id="bookTitle" placeholder="Book Title">
        <button onclick="libraryManagement()">Perform Action</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'atmMachine') {
    operationContainer.innerHTML = `
        <input type="text" id="action" placeholder="Action (Deposit/Withdraw/Check Balance)">
        <input type="number" id="amount" placeholder="Amount (if applicable)">
        <button onclick="atmMachine()">Perform Action</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'compoundInterest') {
    operationContainer.innerHTML = `
        <input type="number" id="principal" placeholder="Principal">
        <input type="number" id="rate" placeholder="Rate of Interest">
        <input type="number" id="time" placeholder="Time (years)">
        <button onclick="calculateCompoundInterest()">Calculate</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'studentGrading') {
    operationContainer.innerHTML = `
        <input type="number" id="score" placeholder="Enter score">
        <button onclick="gradeStudent()">Grade Student</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'romanToInteger') {
    operationContainer.innerHTML = `
        <input type="text" id="roman" placeholder="Enter Roman Numeral">
        <button onclick="convertRomanToInteger()">Convert</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'toDoList') {
    operationContainer.innerHTML = `
        <input type="text" id="task" placeholder="Enter a task">
        <button onclick="addTask()">Add Task</button>
        <ul id="taskList"></ul>
    `;
} else if (selectedOperation === 'primeNumbersRange') {
    operationContainer.innerHTML = `
        <input type="number" id="range" placeholder="Enter range">
        <button onclick="findPrimeNumbers()">Find Primes</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'generateFirstNPrimes') {
    operationContainer.innerHTML = `
        <input type="number" id="n" placeholder="Enter N">
        <button onclick="generateFirstNPrimes()">Generate Primes</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'ecommerceCart') {
    operationContainer.innerHTML = `
        <input type="text" id="action" placeholder="Action (Add/Remove/Checkout)">
        <input type="text" id="item" placeholder="Item Name">
        <input type="number" id="quantity" placeholder="Quantity">
        <button onclick="ecommerceCart()">Perform Action</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'trafficLight') {
    operationContainer.innerHTML = `
        <select id="light">
            <option value="red">Red</option>
            <option value="yellow">Yellow</option>
            <option value="green">Green</option>
        </select>
        <button onclick="simulateTrafficLight()">Simulate</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'shapesAreaPerimeter') {
    operationContainer.innerHTML = `
        <select id="shape">
            <option value="circle">Circle</option>
            <option value="rectangle">Rectangle</option>
            <option value="triangle">Triangle</option>
        </select>
        <input type="number" id="dimension1" placeholder="Dimension 1">
        <input type="number" id="dimension2" placeholder="Dimension 2 (if applicable)">
        <button onclick="calculateAreaPerimeter()">Calculate</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'decimalToHexadecimal') {
    operationContainer.innerHTML = `
        <input type="number" id="decimal" placeholder="Enter decimal">
        <button onclick="convertDecimalToHex()">Convert to Hex</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'sumPrimeNumbers') {
    operationContainer.innerHTML = `
        <input type="number" id="limit" placeholder="Enter limit">
        <button onclick="sumPrimeNumbers()">Calculate Sum</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'sumEvenFibonacci') {
    operationContainer.innerHTML = `
        <input type="number" id="limit" placeholder="Enter limit">
        <button onclick="sumEvenFibonacci()">Calculate Sum</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'binaryToHexadecimal') {
    operationContainer.innerHTML = `
        <input type="text" id="binary" placeholder="Enter binary">
        <button onclick="convertBinaryToHex()">Convert to Hex</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'textBasedGame') {
    operationContainer.innerHTML = `
        <input type="text" id="action" placeholder="Action">
        <button onclick="playGame()">Play Game</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'stopwatch') {
    operationContainer.innerHTML = `
        <button onclick="startStopwatch()">Start</button>
        <button onclick="stopStopwatch()">Stop</button>
        <button onclick="resetStopwatch()">Reset</button>
        <p id="time">00:00:00</p>
    `;
} else if (selectedOperation === 'employeeManagement') {
    operationContainer.innerHTML = `
        <input type="text" id="action" placeholder="Action (Add/Remove/View)">
        <input type="text" id="employeeName" placeholder="Employee Name">
        <button onclick="manageEmployees()">Perform Action</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'mostFrequentElement') {
    operationContainer.innerHTML = `
        <input type="text" id="array" placeholder="Enter array (comma separated)">
        <button onclick="findMostFrequentElement()">Find Most Frequent</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'happyNumber') {
    operationContainer.innerHTML = `
        <input type="number" id="number" placeholder="Enter number">
        <button onclick="checkHappyNumber()">Check Happy Number</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'randomAlphanumeric') {
    operationContainer.innerHTML = `
        <input type="number" id="length" placeholder="Enter length">
        <button onclick="generateRandomAlphanumeric()">Generate</button>
        <p id="result"></p>
    `;
} else if (selectedOperation === 'encryptionDecryption') {
    operationContainer.innerHTML = `
        <input type="text" id="text" placeholder="Enter text">
        <input type="text" id="key" placeholder="Enter key">
        <select id="operation">
            <option value="encrypt">Encrypt</option>
            <option value="decrypt">Decrypt</option>
        </select>
        <button onclick="encryptionDecryption()">Perform Operation</button>
        <p id="result"></p>
    `;
} else {
    operationContainer.innerHTML = `<p>Select an operation from the list.</p>`;
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


function reverseWords() {
    const sentence = document.getElementById('sentence').value;
    const reversed = sentence.split(' ').reverse().join(' ');
    document.getElementById('result').textContent = `Reversed Sentence: ${reversed}`;
}

function findLongestWord() {
    const sentence = document.getElementById('sentence').value;
    const words = sentence.split(' ');
    const longest = words.reduce((a, b) => a.length > b.length ? a : b, '');
    document.getElementById('result').textContent = `Longest Word: ${longest}`;
}

function checkPangram() {
    const sentence = document.getElementById('sentence').value.toLowerCase();
    const alphabet = 'abcdefghijklmnopqrstuvwxyz';
    const isPangram = alphabet.split('').every(letter => sentence.includes(letter));
    document.getElementById('result').textContent = `Is Pangram: ${isPangram}`;
}

function calculate() {
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    const operation = document.getElementById('operation').value;
    let result;
    
    if (operation === 'add') {
        result = num1 + num2;
    } else if (operation === 'subtract') {
        result = num1 - num2;
    } else if (operation === 'multiply') {
        result = num1 * num2;
    } else if (operation === 'divide') {
        result = num1 / num2;
    } else {
        result = 'Invalid operation';
    }
    
    document.getElementById('result').textContent = `Result: ${result}`;
}

function findDayOfWeek() {
    const dateInput = document.getElementById('dateInput').value;
    const date = new Date(dateInput);
    const options = { weekday: 'long' };
    const dayOfWeek = new Intl.DateTimeFormat('en-US', options).format(date);
    document.getElementById('result').textContent = `Day of the Week: ${dayOfWeek}`;
}

function generateRandomNumbers() {
    const min = parseInt(document.getElementById('min').value);
    const max = parseInt(document.getElementById('max').value);
    const randomNum = Math.floor(Math.random() * (max - min + 1)) + min;
    document.getElementById('result').textContent = `Random Number: ${randomNum}`;
}

function bankingSystem() {
    const action = document.getElementById('action').value.toLowerCase();
    const amount = parseFloat(document.getElementById('amount').value);
    // Implement banking logic here (e.g., deposit, withdraw, check balance)
    document.getElementById('result').textContent = `Banking action: ${action}, Amount: ${amount}`;
}

function vote() {
    const candidate = document.getElementById('candidate').value;
    // Implement voting logic here
    document.getElementById('result').textContent = `Voted for: ${candidate}`;
}

function showVotes() {
    // Implement logic to show votes here
    document.getElementById('result').textContent = `Votes shown.`;
}

function libraryManagement() {
    const action = document.getElementById('action').value.toLowerCase();
    const bookTitle = document.getElementById('bookTitle').value;
    // Implement library management logic here
    document.getElementById('result').textContent = `Library action: ${action}, Book Title: ${bookTitle}`;
}

function atmMachine() {
    const action = document.getElementById('action').value.toLowerCase();
    const amount = parseFloat(document.getElementById('amount').value);
    // Implement ATM logic here
    document.getElementById('result').textContent = `ATM action: ${action}, Amount: ${amount}`;
}

function calculateCompoundInterest() {
    const principal = parseFloat(document.getElementById('principal').value);
    const rate = parseFloat(document.getElementById('rate').value) / 100;
    const time = parseFloat(document.getElementById('time').value);
    const compoundInterest = principal * Math.pow((1 + rate / 12), 12 * time) - principal;
    document.getElementById('result').textContent = `Compound Interest: ${compoundInterest.toFixed(2)}`;
}

function gradeStudent() {
    const score = parseFloat(document.getElementById('score').value);
    let grade;
    
    if (score >= 90) {
        grade = 'A';
    } else if (score >= 80) {
        grade = 'B';
    } else if (score >= 70) {
        grade = 'C';
    } else if (score >= 60) {
        grade = 'D';
    } else {
        grade = 'F';
    }
    
    document.getElementById('result').textContent = `Grade: ${grade}`;
}

function convertRomanToInteger() {
    const roman = document.getElementById('roman').value.toUpperCase();
    const romanToInt = {
        'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000
    };
    let integer = 0;
    for (let i = 0; i < roman.length; i++) {
        const current = romanToInt[roman[i]];
        const next = romanToInt[roman[i + 1]];

        if (next > current) {
            integer += (next - current);
            i++;
        } else {
            integer += current;
        }
    }
    document.getElementById('result').textContent = `Integer: ${integer}`;
}

function addTask() {
    const task = document.getElementById('task').value;
    const taskList = document.getElementById('taskList');
    const li = document.createElement('li');
    li.textContent = task;
    taskList.appendChild(li);
    document.getElementById('task').value = '';
}

function findPrimeNumbers() {
    const range = parseInt(document.getElementById('range').value);
    let primes = [];
    for (let i = 2; i <= range; i++) {
        if (isPrime(i)) primes.push(i);
    }
    document.getElementById('result').textContent = `Prime Numbers: ${primes.join(', ')}`;
}

function generateFirstNPrimes() {
    const n = parseInt(document.getElementById('n').value);
    let primes = [];
    let num = 2;
    while (primes.length < n) {
        if (isPrime(num)) primes.push(num);
        num++;
    }
    document.getElementById('result').textContent = `First ${n} Primes: ${primes.join(', ')}`;
}

function isPrime(num) {
    if (num <= 1) return false;
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false;
    }
    return true;
}

function ecommerceCart() {
    const action = document.getElementById('action').value.toLowerCase();
    const item = document.getElementById('item').value;
    const quantity = parseInt(document.getElementById('quantity').value);
    // Implement e-commerce cart logic here
    document.getElementById('result').textContent = `E-Commerce action: ${action}, Item: ${item}, Quantity: ${quantity}`;
}

function simulateTrafficLight() {
    const light = document.getElementById('light').value;
    document.getElementById('result').textContent = `Traffic Light is: ${light}`;
}

function calculateAreaPerimeter() {
    const shape = document.getElementById('shape').value;
    const dimension1 = parseFloat(document.getElementById('dimension1').value);
    const dimension2 = parseFloat(document.getElementById('dimension2').value);
    let area, perimeter;
    
    if (shape === 'circle') {
        area = Math.PI * Math.pow(dimension1, 2);
        perimeter = 2 * Math.PI * dimension1;
    } else if (shape === 'rectangle') {
        area = dimension1 * dimension2;
        perimeter = 2 * (dimension1 + dimension2);
    } else if (shape === 'triangle') {
        // Assuming an equilateral triangle for simplicity
        area = (Math.sqrt(3) / 4) * Math.pow(dimension1, 2);
        perimeter = 3 * dimension1;
    } else {
        area = perimeter = 'Invalid shape';
    }
    
    document.getElementById('result').textContent = `Area: ${area}, Perimeter: ${perimeter}`;
}

function convertDecimalToHex() {
    const decimal = parseInt(document.getElementById('decimal').value);
    const hexadecimal = decimal.toString(16).toUpperCase();
    document.getElementById('result').textContent = `Hexadecimal: ${hexadecimal}`;
}

function sumPrimeNumbers() {
    const limit = parseInt(document.getElementById('limit').value);
    let sum = 0;
    for (let i = 2; i < limit; i++) {
        if (isPrime(i)) sum += i;
    }
    document.getElementById('result').textContent = `Sum of Prime Numbers: ${sum}`;
}

function sumEvenFibonacci() {
    const limit = parseInt(document.getElementById('limit').value);
    let sum = 0;
    let a = 0, b = 1;
    while (b < limit) {
        if (b % 2 === 0) sum += b;
        [a, b] = [b, a + b];
    }
    document.getElementById('result').textContent = `Sum of Even Fibonacci Numbers: ${sum}`;
}

function convertBinaryToHex() {
    const binary = document.getElementById('binary').value;
    const decimal = parseInt(binary, 2);
    const hexadecimal = decimal.toString(16).toUpperCase();
    document.getElementById('result').textContent = `Hexadecimal: ${hexadecimal}`;
}

function playGame() {
    const action = document.getElementById('action').value;
    // Implement text-based game logic here
    document.getElementById('result').textContent = `Game action: ${action}`;
}

let stopwatchInterval;
let elapsedTime = 0;

function startStopwatch() {
    stopwatchInterval = setInterval(() => {
        elapsedTime++;
        const hours = String(Math.floor(elapsedTime / 3600)).padStart(2, '0');
        const minutes = String(Math.floor((elapsedTime % 3600) / 60)).padStart(2, '0');
        const seconds = String(elapsedTime % 60).padStart(2, '0');
        document.getElementById('time').textContent = `${hours}:${minutes}:${seconds}`;
    }, 1000);
}

function stopStopwatch() {
    clearInterval(stopwatchInterval);
}

function resetStopwatch() {
    clearInterval(stopwatchInterval);
    elapsedTime = 0;
    document.getElementById('time').textContent = '00:00:00';
}

function manageEmployees() {
    const action = document.getElementById('action').value.toLowerCase();
    const employeeName = document.getElementById('employeeName').value;
    // Implement employee management logic here
    document.getElementById('result').textContent = `Employee action: ${action}, Employee Name: ${employeeName}`;
}

function findMostFrequentElement() {
    const array = document.getElementById('array').value.split(',').map(item => item.trim());
    const frequency = {};
    array.forEach(item => frequency[item] = (frequency[item] || 0) + 1);
    const mostFrequent = Object.keys(frequency).reduce((a, b) => frequency[a] > frequency[b] ? a : b);
    document.getElementById('result').textContent = `Most Frequent Element: ${mostFrequent}`;
}

function checkHappyNumber() {
    const number = parseInt(document.getElementById('number').value);
    const isHappy = (num) => {
        let slow = num, fast = num;
        do {
            slow = sumOfSquares(slow);
            fast = sumOfSquares(sumOfSquares(fast));
        } while (fast !== 1 && slow !== fast);
        return fast === 1;
    };

    const sumOfSquares = (n) => n.toString().split('').reduce((acc, digit) => acc + Math.pow(parseInt(digit), 2), 0);

    document.getElementById('result').textContent = `Is Happy Number: ${isHappy(number)}`;
}

function generateRandomAlphanumeric() {
    const length = parseInt(document.getElementById('length').value);
    const chars = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    let result = '';
    for (let i = 0; i < length; i++) {
        result += chars.charAt(Math.floor(Math.random() * chars.length));
    }
    document.getElementById('result').textContent = `Random Alphanumeric String: ${result}`;
}

function encryptionDecryption() {
    const text = document.getElementById('text').value;
    const key = document.getElementById('key').value;
    const operation = document.getElementById('operation').value;
    // Simple example: Caesar Cipher
    const shift = key.length % 26;
    const transform = (c) => {
        const code = c.charCodeAt();
        if (code >= 65 && code <= 90) return String.fromCharCode(((code - 65 + shift) % 26) + 65);
        if (code >= 97 && code <= 122) return String.fromCharCode(((code - 97 + shift) % 26) + 97);
        return c;
    };

    const result = operation === 'encrypt' ? text.split('').map(transform).join('') : text.split('').map(c => transform(String.fromCharCode(c.charCodeAt() - shift))).join('');
    document.getElementById('result').textContent = `Result: ${result}`;
}