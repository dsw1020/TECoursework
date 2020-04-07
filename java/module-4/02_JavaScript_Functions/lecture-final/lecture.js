/**
 * All named functions will have the function keyword and
 * a name followed by parentheses.
 */
function returnOne() {
  return 1;
}

/**
 * Functions can also take parameters. These are just variables that are filled
 * in by whoever is calling the function.
 *
 * Also, we don't *have* to return anything from the actual function.
 *
 * @param {any} value the value to print to the console
 */
function printToConsole(value) {
  console.log(value);
}

/**
 * Write a function called multiplyTogether that multiplies two numbers together. But 
 * what happens if we don't pass a value in? What happens if the value is not a number?
 *
 * @param {number} firstParameter the first parameter to multiply
 * @param {number} secondParameter the second parameter to multiply
 */
function multiplyTogether(firstParameter, secondParameter){
  return firstParameter * secondParameter;
}

/**
 * This version makes sure that no parameters are ever missing. If
 * someone calls this function without parameters, we default the
 * values to 0. However, it is impossible in JavaScript to prevent
 * someone from calling this function with data that is not a number.
 * Call this function multiplyNoUndefined
 *
 * @param {number} [firstParameter=0] the first parameter to multiply
 * @param {number} [secondParameter=0] the second parameter to multiply
 */
function multiplyNoUndefined(firstParameter=0, secondParameter=0){
  return firstParameter * secondParameter;
}
/**
 * Scope is defined as where a variable is available to be used.
 *
 * If a let variable is declare inside of a block, it will only exist in
 * that block and any block underneath it. Once the block that the
 * variable was defined in ends, the variable disappears.
 * 
 * Just like Java
 * 
 * a variable defined with var is available anywhere in the program
 * regardless of where it is defined.  THIS CAN BE CONFUSING!
 */
function scopeTest() {
  // This variable will always be in scope in this function
  let inScopeInScopeTest = true;

  {
    // this variable lives inside this block and doesn't
    // exist outside of the block
    let scopedToBlock = inScopeInScopeTest;
  }

  // scopedToBlock doesn't exist here so an error will be thrown
  if (inScopeInScopeTest && scopedToBlock) {
    console.log("This won't print!");
  }
}

function createSentenceFromUser(name, age, listOfQuirks = [], separator = ', ') {
  let description = `${name} is currently ${age} years old. Their quirks are: `;
  return description + listOfQuirks.join("?-");
}
function forEachExample() {
  let numbers = [1, 2, 3, 4];

// forEach() expecting a parameter that is a function that receives one parameter
//       the parameter received by the function is one element from the array

  numbers.forEach( (aNumber) => {
    // aNumber is an element from the array
    console.log(`This number is ${aNumber}`);
});
/*******************************************************************
 * in Java the previous code would be:
 * 
 *  for(int aNumber : numbers){
 *  // aNumber is an element from the array
 *     System.out.println("This number is " + aNumber)
 *  }
 */
}

/**
 * Takes an array and, using the power of anonymous functions, generates
 * their sum.
 *
 * @param {number[]} numbersToSum numbers to add up
 * @returns {number} sum of all the numbers
 */
function sumAllNumbers(numbersToSum) {

// arrayName.reduce( (arg1, arg2) => {})
//              arg1 - the result from previous call
//              arg2 - the current element in the array  
//
//  An implied forEach is done by reduce when calling the function

  return numbersToSum.reduce(
                             (sum, aNumber) => {
                                               return sum + aNumber;
                                               }
                            );
}

/**
 * Takes an array and returns a new array of only numbers that are
 * multiples of 3
 *
 * @param {number[]} numbersToFilter numbers to filter through
 * @returns {number[]} a new array with only those numbers that are
 *   multiples of 3
 */
function allDivisibleByThree(numbersToFilter) {
// filter() - return an array
//          - expects aFunction(current-element) {}
//          - Add the current element to the resulting array if the function returns true
//                 if the function returns false - the current element is NOT added to the resulting array
//
//  An implied forEach is done by filter when calling the function 

  return numbersToFilter.filter(
                                (number) => {
                                            // Only keep numbers divisible by 3
                                            return number % 3 === 0;  // return true if number is divisible by 3
                                                                      //        false if it is not
                                            }   
                               );
}
