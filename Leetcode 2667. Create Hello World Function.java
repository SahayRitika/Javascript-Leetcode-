//optimised approach
var createHelloWorld = function() {
    const greet= "Hello World";
    return function() {
        return greet; 
    }
};

//2nd approach
/**
 * @return {Function}
 */
var createHelloWorld = function() {
    
    return function(...args) {
        return "Hello World";
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */
