//Assignment
//JavaScript program to demonstrate how a function can be passed as a parameter to another function
function fun1(ParamFun)//define a function that takes another function as a parameter
{
  console.log("Inside function1");
  ParamFun(); // call the function that was passed as a parameter
}

function fun2() // define another function
{
  console.log("Inside function2");
}

fun1(fun2); // call 'fun1' and pass in the 'fun2' function as a parameter

/*Output:
Inside function1
Inside function2
*/

/* Explanation:
  In this example, we have two functions: 'fun1' and 'fun2'. 
 
 'fun1' takes another function 'ParamFun' as a parameter & logs a message 
  to the console.It then calls the 'ParamFun' parameter as a function.

  The fun2 function simply logs the message "Inside function2" to the console.

  Finally, we call 'fun1' and pass in the 'fun2' function as a parameter.
  When 'fun1' is called, it logs the message "Inside fun1" to the console &
  then calls the 'ParamFun' parameter, which is the 'fun2' function in this
  case. As a result, the message "Inside function2" is also logged to the console.
*/

/*An arrow function takes two arguments firstName and lastName and returns a 
  2 letter string that represents the first letter of both the arguments. 
  For the arguments Roger and Waters, the function returns ‘RW’.
  Write a JavaScript program for this.
*/
const getInitials = (firstName, lastName) => {
  return firstName.charAt(0) + lastName.charAt(0);
}
console.log(getInitials("Roger", "Waters")); // Output: "RW"
console.log(getInitials("Anudeep", "Madasu"));

/*In this program, we define an arrow function called getInitials that takes 
  two parameters, firstName and lastName. 
 
  The function uses the charAt method to get the first letter of each name, 
  and concatenates them into a single string using the + operator.
  Finally, the function returns the resulting string.

  We then call the getInitials function with the arguments "Roger" and "Waters" 
  and log the output to the console.
  This should produce the string "RW", as requested.
*/