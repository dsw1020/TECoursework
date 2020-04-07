/*
    Example of a multi-line comment just like in C#/Java
*/

// Single line comment

/**
 * Functions start with the word function.
 * They don't have a return type and the naming convention is camel-case.
 */
function variables() {
  // Declares a variable where the value cannot be changed
  const daysPerWeek = 7;  // No data type 
  
  // console.log is like System.out.println() in Java
  // If what you want to display contains a variable...
  //   1. enclose the string to be displayed in back-ticks
  //   2. use an EL expression for the variable
  console.log(`There are ${daysPerWeek} days per week.`)

// in JavaScript ; at the end of a statement are usually option

  // Declares a variable those value can be changed
  let daysPerMonth = 30;    // let is preferred for defining variables
  console.log(`There are ${daysPerMonth} days per month.`);

  // Declares a variable that will always be an array
  const weekdays = [   // the open bracket [ - marks teh start of teh array]
    "Monday",          // place a comma between elements
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday",
    "Sunday"
  ]   // The close bracket marks the end of the array
  console.table(weekdays);  // display the array as a table

}

/**
 * Functions can also accept parameters.
 * Notice the parameters do not have types.
 * @param {Number} param1 The first number to display
 * @param {Number} param2 The second number to display
 */
function printParameters(param1, param2) {  // no datatype on parameters - just the names
  console.log(`The value of param1 is ${param1}`);
  console.log(`The value of param2 is ${param2}`);
}

/**
 * Compares two values x and y.
 * == is loose equality   - Only checks the values for equality
 * === is strict equality - Checks both the value and type for equality
 * @param {Object} x
 * @param {Object} y
 */
function equality(x, y) {
  console.log(`x is ${typeof x}`);
  console.log(`y is ${typeof y}`);

  console.log(`x == y : ${x == y}`); // true
  console.log(`x === y : ${x === y}`); // false
}

/**
 * Each value is inherently truthy or falsy.
 * false, 0, '', null, undefined, and NaN are always falsy
 * everything else is always truthy
 * @param {Object} x The object to check for truthy or falsy,
 */
function falsy(x) {
  if (x) {
    console.log(`${x} is truthy`);
  } else {
    console.log(`${x} is falsy`);
  }
}

/**
 *  Objects are simple key-value pairs (JSON)
    - values can be primitive data types
    - values can be arrays
    - or they can be functions
*/
function objects() {
  const person = {
    firstName: "Bill",
    lastName: "Lumbergh",
    age: 42,
    employees: [  // an array as an entry in an object
      "Peter Gibbons",
      "Milton Waddams",
      "Samir Nagheenanajar",
      "Michael Bolton"
    ],
    toString : function() {
      return `${this.lastName}, ${this.firstName}, ${this.age}`
    }
  };

  // To use/call a function in an object
  console.log(person.toString());

  // Log the object
  console.table(person)

  // Log the first and last name
  console.log(`${person.firstName} ${person.lastName}`)

  // Log each employee - Loop thru the employees array in the object
  
  for (let i=0; i < person.employees.length; i++){
    console.log(`Employee: ${i+1} is ${person.employees[i]}`)
  }
}

/*
########################
Function Overloading
########################

Function Overloading is not available in Javascript. If you declare a
function with the same name, more than one time in a script file, the
earlier ones are overriden and the most recent one will be used.
*/

function Add(num1, num2) {
  return num1 + num2;
}

function Add(num1, num2, num3) {  // This Add replaces the previous Add function
  return num1 + num2 + num3;
}

/*
########################
Math Library
########################

A built-in `Math` object has properties and methods for mathematical constants and functions.
*/

function mathFunctions() {
  console.log("Math.PI : " + Math.PI);
  console.log("Math.LOG10E : " + Math.LOG10E);
  console.log("Math.abs(-10) : " + Math.abs(-10));
  console.log("Math.floor(1.99) : " + Math.floor(1.99));  // next lower integer
  console.log("Math.ceil(1.01) : " + Math.ceil(1.01));    // next higher integer
  console.log("Math.random() : " + Math.random());
}

/*
########################
String Methods
########################

The string data type has a lot of properties and methods similar to strings in Java/C#
*/

function stringFunctions(value) {
  console.log(`.length -  ${value.length}`);
  console.log(`.endsWith('World') - ${value.endsWith("World")}`);     // true/false
  console.log(`.startsWith('Hello') - ${value.startsWith("Hello")}`); // true/false
  console.log(`.indexOf('Hello') - ${value.indexOf("Hello")}`);       // index position of the parameter
  console.log(`.indexOf('o') - ${value.indexOf("o")}`);               // index position of the parameter
  console.log(`.lastIndexOf('o') - ${value.lastIndexOf("o")}`);       // index position of the parameter
  console.log(`.split(" ") - ${value.split(" ")}`);                   //Split the value based on space

  let words = value.split(" ");
  console.log(`Words are: ${words}`)
  console.log(`.substr('2,3')    - ${value.substr(2,3)}`);             
  console.log(`.substring('2,3') - ${value.substring(2,3)}`);    
  
  /*
    Other Methods
        - split(string)
        - substr(number, number)     // starting-index, number-of-chars
        - substring(number, number)  // staring-index, ending-index - but don't include the character the ending index
        - toLowerCase()
        - trim()
        - https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/String
    */
}
   function arrayFunction() {
    let stooges = [
      "Moe",
      "Larry",
      "Curly"
    ];
    console.table(stooges);  // Display array as a table in browser

    console.log("Adding elements using push and unshift()..."
    stooges.push("Shemp");        // Add element to the end of the array
    stooges.unshift("Curly Joe"); // Add element to the beginning of the array
    console.table(stooges);

    console.log("Adding/Insert elements at index 3 splice()...")
    stooges.splice(3,0,"Groucho","Chico", "Harpo");  // splice(where-new-elements-go, #-elements to delete, new-elements)
    console.table(stooges);
  
    console.log("Removing elements at index 3 using splice()...")
    stooges.splice(3,1);    // Remove 1 element starting with line at index 3 - splice(starting-index, #-elements-to-remove)
    console.table(stooges);

    console.log("Removing 2 elements at index 3 using splice()...")
    stooges.splice(3,2);
    console.table(stooges);
 
    console.log("Removing last element using pop()...")
    stooges.pop();
    console.table(stooges);
    
    console.log("Removing first element using unshift()...")
    stooges.unshift();
    console.table(stooges);
 
    console.log("Removing 'Curly Joe' element using splice()...")
    stooges.splice(stooges.indexOf('Curly Joe'), 1);
    console.table(stooges);
   };
   

