/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    let num=-1;
    return function() {
        num+=1;
        return n+num;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */
/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    var num=-1;
    return function() {
        num+=1;
        return n+num;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */
