// a class with short-cut constructor
class Employee {
    // you don't need to initialize the id & name, just use private
    // they are avaibale as a property by default
    constructor(private id : number, private name : string) { } 
    // a function in class must not have function keyword
    display() {
        return `Name=${this.name}, Id=${this.id}`;
    }
}
// creating a vairalbe of Employee type
let emp : Employee = new Employee(12345, "Siddharth");
console.log(emp.display());


// a function that takes string and returns string
function greet(name : string) : string {
    return "Hello "+name;
}
console.log(greet("Atharv"));
//console.log(greet(25));