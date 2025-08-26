// a class with short-cut constructor
var Employee = /** @class */ (function () {
    // you don't need to initialize the id & name, just use private
    // they are avaibale as a property by default
    function Employee(id, name) {
        this.id = id;
        this.name = name;
    }
    // a function in class must not have function keyword
    Employee.prototype.display = function () {
        return "Name=".concat(this.name, ", Id=").concat(this.id);
    };
    return Employee;
}());
// creating a vairalbe of Employee type
var emp = new Employee(12345, "Siddharth");
console.log(emp.display());
// a function that takes string and returns string
function greet(name) {
    return "Hello " + name;
}
console.log(greet("Atharv"));
//console.log(greet(25));
