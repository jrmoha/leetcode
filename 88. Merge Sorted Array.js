/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function(arr1, m, arr2, n) {
    let i = m - 1, j = n - 1;
    let k = m + n - 1;
    while (i >= 0 && j >= 0) {
        if (arr1[i] > arr2[j]) {
            arr1[k] = arr1[i];
            i--;
        } else {
            arr1[k] = arr2[j];
            j--;
        }
        k--;
    }
    while (j >= 0) {
        arr1[k--] = arr2[j--];
    }
};