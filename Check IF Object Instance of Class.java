/**
 * Checks if a given value is an instance of a given class or superclass.
 * @param {*} obj - The value to check.
 * @param {*} classFunction - The class constructor function.
 * @returns {boolean} True if obj is an instance of classFunction, else false.
 */
var checkIfInstanceOf = function(obj, classFunction) {
    // Validate that classFunction is a function (constructor/class)
    if (typeof classFunction !== 'function') {
        return false;
    }

    // If obj is null or undefined, it cannot be an instance
    if (obj === null || obj === undefined) {
        return false;
    }

    // For primitive values, wrap them in their object equivalents
    // so instanceof can work for cases like new String("abc")
    if (typeof obj !== 'object' && typeof obj !== 'function') {
        obj = Object(obj);
    }

    // Traverse the prototype chain
    let proto = Object.getPrototypeOf(obj);
    while (proto !== null) {
        if (proto.constructor === classFunction) {
            return true;
        }
        proto = Object.getPrototypeOf(proto);
    }

    return false;
};

// ------------------ Example Tests ------------------
console.log(checkIfInstanceOf(new Date(), Date));       // true
console.log(checkIfInstanceOf(123, Number));            // true (primitive wrapped)
console.log(checkIfInstanceOf("abc", String));          // true (primitive wrapped)
console.log(checkIfInstanceOf({}, Object));             // true
console.log(checkIfInstanceOf([], Array));              // true
console.log(checkIfInstanceOf(null, Object));           // false
console.log(checkIfInstanceOf(undefined, Object));      // false
console.log(checkIfInstanceOf({}, null));               // false
