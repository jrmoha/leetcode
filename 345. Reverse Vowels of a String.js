/**
 * @param {string} s
 * @return {string}
 */
function isVowel(c) {
  let lower = c.toLowerCase();
  return lower === 'a' || lower === 'e' || lower === 'i' || lower === 'o' || lower === 'u';
}
var reverseVowels = function (s) {
  let i = 0
  let j = s.length - 1;
  let chars = s.split('');
  while (i < j) {
    if (isVowel(s[i]) && isVowel(s[j])) {
      [chars[i], chars[j]] = [chars[j], chars[i]];
      i++;
      j--;
    } else if (isVowel(s[i])) {
      j--;
    } else if (isVowel(s[j])) {
      i++;
    } else {
      i++;
      j--;
    }
  }
  return chars.join('');
}
