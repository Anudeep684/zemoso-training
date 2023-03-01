//Assignment
/*
(1)Refactor the following function into a one-liner:
const printName = (name) => {
                     return “Hi” + name;
           }
(2)Rewrite the following code using template literals
const printBill = (name, bill) => {
                     return “Hi “ + name + “, please pay: “ + bill;
           }
(3)Modify the following code such that the object properties are destructured and logged.
const person = {
                      name: “Noam Chomsky”,
                      age: 92
            }
           
           let name = person.name;
           let age = person.age;
           console.log(name);
           console.log(age);
*/
const printName = name => `Hi ${name}`;
console.log(printName('Anudeep'))
const printBill = (name, bill) => `Hi ${name}, please pay: ${bill}`;
console.log(printBill('Anudeep',5000))
const person = {
  name: "Noam Chomsky",
  age: 92
};
/*Here, we use object destructuring to create variables name and age from the person object, 
 and then log their values using console.log().*/

const { name, age } = person;
console.log(name);
console.log(age);