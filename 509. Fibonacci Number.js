/**
 * @param {number} n
 * @return {number}
 */
var fib = function(n) {
     let A=(1+Math.sqrt(5))/2;
    let B=(1-Math.sqrt(5))/2;
    return Math.round((Math.pow(A,n)-Math.pow(B,n))/Math.sqrt(5));
};