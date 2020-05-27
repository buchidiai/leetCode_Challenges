// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:

// Given nums = [2, 7, 11, 15], target = 9,
// Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].

let nums_sorted = [2, 7, 10, 15, 19, 30, 45];
let nums_unsorted = [5, 2, 88, 5, 9, 11, 20];

//solution 1 ---> for sorted and unsorted O(n^2)
const twoSums = (array, target) => {
  for (let i = 0; i < array.length; i++) {
    for (let j = i + 1; j < array.length; j++) {
      if (array[i] + array[j] === target) {
        return console.log([i, j]);
      }
    }
  }
};

// solution 2 ---> two pinter system sorted only O(n)
const twoSums = (array, target) => {
  let start = 0;
  let end = array.length - 1;

  while (array[start] < array[end]) {
    console.log(array[start], array[end]);

    if (array[start] + array[end] === target) {
      return console.log([start, end]);
    }

    if (array[start] + array[end] < target) {
      console.log(array[start], array[end], "< +");
      start++;
    }

    if (array[start] + array[end] > target) {
      console.log(array[start], array[end], "> -");
      end--;
    }
  }
};

//solution 3 ---> hashmap for sorted and unsorted O(n)

const twoSums = (array, target) => {
  let hashMap = {};
  let result = [];

  for (let i = 0; i < array.length; i++) {
    let complement = target - array[i];

    if (hashMap[complement]) {
      result[0] = hashMap[complement];
      result[1] = i;

      return result;
    }

    hashMap[array[i]] = i;
  }

  return ["not found"];
};

console.log(twoSums(nums_sorted, 4));
