function flat(arr, n) {
    if (n === 0) return arr;
    let res = [];
    for (let i = 0; i < arr.length; i++) {
        if (!Array.isArray(arr[i])) res.push(arr[i]);
        else res.push(...flat(arr[i], n - 1))
    }
    return res;
}
/**
 * @param {Array} arr
 * @return {Generator}
 */
var inorderTraversal = function*(arr) {
    let i = 0;
    arr = flat(arr);
    let n = arr.length;
    while (i < n) {
        yield arr[i];
        i++;
    }
};

/**
 * const gen = inorderTraversal([1, [2, 3]]);
 * gen.next().value; // 1
 * gen.next().value; // 2
 * gen.next().value; // 3
 */