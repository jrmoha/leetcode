/**
 * @param {string} s1
 * @param {string} s2
 * @return {string}
 */
 String.prototype.reverse = function () {
    let res = "";
    for (let i = this.length - 1; i >= 0; i--) {
        res += this[i];
    }
    return res;
}
var addBinary = function(s1, s2) {
    let i = s1.length - 1;
let j = s2.length - 1;
let carry = 0;
let sum = 0;
let res = "";
while (i >= 0 || j >= 0 || carry) {
    sum = 0;
    if (i >= 0 &&s1.charAt(i--)=='1') sum ++;
    if (j >= 0 &&s2.charAt(j--)=='1') sum ++;
    sum += carry;
    res=res.concat( sum % 2);
    carry = Math.floor(sum / 2);
}
return res.reverse();
};