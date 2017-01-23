/* Short method practise from Codingbat.com - Array problems
*  Solved by Joonas Rajala
*
*  Ordered from most complex to least complex.
*/

/* Given 2 int arrays, a and b, of any length, return a new array with the 
first element of each array. If either array is length 0, ignore that array.
*/
public int[] front11(int[] a, int[] b) {
  // Both empty
  if (a.length == 0 && b.length == 0)
    return new int[0];
    
  // a empty
  if (a.length == 0) {
    int[] res = {b[0]};
    
    return res;
  }
  
  // b empty
  if (b.length == 0) {
    int[] res = {a[0]};
    
    return res;
  }
  
  // both have some
  int[] res = {a[0], b[0]};
  
  return res;
}

/* Given 2 int arrays, a and b, return a new array length 2 containing, as 
much as will fit, the elements from a followed by the elements from b. The 
arrays may be any length, including 0, but there will be 2 or more elements 
available between the 2 arrays. */
public int[] make2(int[] a, int[] b) {
  int[] res = new int[2];
  int current = 0;

  // Add a:s until full
  for (int i = 0; i < a.length; i++) {
    if (current < 2) {
      res[current] = a[i];
      current++;
    }

    else
      break;
  }
   
  // Add b:s until full 
  for (int i = 0; i < b.length; i++) {
    if (current < 2) {
      res[current] = b[i];
      current++;
    }
    
    else
      break;    
  }
  
  return res;
}

/* We'll say that a 1 immediately followed by a 3 in an array is an 
"unlucky" 1. Return true if the given array contains an unlucky 1 in the 
first 2 or last 2 positions in the array. */
public boolean unlucky1(int[] nums) {
  int len = nums.length;
  
  // Too short
  if (len < 2)
    return false;
  
  int limit = 1;
  
  if (len > 2)
    limit = 2;
  
  // First two
  for (int i = 0; i < limit; i++) {
    if (nums[i] == 1 && nums[i+1] == 3)
      return true;
  }
  
  // Last two
  for (int i = len - limit; i < len - 1; i++) {
    if (nums[i] == 1 && nums[i+1] == 3)
      return true;
  }
  
  return false;
}

/* Given an int array of any length, return a new array of its first 2 
elements. If the array is smaller than length 2, use whatever elements are 
present. */
public int[] frontPiece(int[] nums) {
  int size = 2;
  
  if (nums.length < 2)
    size = nums.length;
  
  int[] a = new int[size];
  
  for (int i = 0; i < size; i++) {
    a[i] = nums[i];
  }
  
  return a;
}

/* Given an array of ints of odd length, look at the first, last, and middle 
values in the array and return the largest. The array length will be a least 
1. */
public int maxTriple(int[] nums) {
  int half = nums.length / 2;
  int largest = nums[0];
  
  if(nums[half] > largest)
    largest = nums[half];
    
  if(nums[nums.length-1] > largest)
    largest = nums[nums.length-1];
      
  return largest;
}

/* Given an array of ints of odd length, return a new array length 3 
containing the elements from the middle of the array. The array length will 
be at least 3. */
public int[] midThree(int[] nums) {
  int half = nums.length / 2;
  
  int[] res = {nums[half-1], nums[half], nums[half+1]};
  
  return res;
}

/* Given an array of ints, swap the first and last elements in the array. 
Return the modified array. The array length will be at least 1. */
public int[] swapEnds(int[] nums) {
  int swap = 0;
  
  swap = nums[0];
  nums[0] = nums[nums.length-1];
  nums[nums.length-1] = swap;
  
  return nums;
}

/* Given 2 int arrays, each length 2, return a new array length 4 containing 
all their elements. */
public int[] plusTwo(int[] a, int[] b) {
  int[] res = {a[0], a[1], b[0], b[1]};
  
  return res;
}

/* Given an array of ints of even length, return a new array length 2 
ontaining the middle two elements from the original array. The original 
array will be length 2 or more. */
public int[] makeMiddle(int[] nums) {
  int half = nums.length / 2;
  
  int[] a = {nums[half-1], nums[half]};
 
  return a;
}

/* Start with 2 int arrays, a and b, each length 2. Consider the sum of the 
values in each array. Return the array which has the largest sum. In event 
of a tie, return a. */
public int[] biggerTwo(int[] a, int[] b) {
  int sum = 0; // b increases - a decreases

  for(int i = 0; i < a.length; i++) {
    sum -= a[i];
    sum += b[i];
  }
  
  if(sum > 0)
    return b;
  
  return a;
}

/* Start with 2 int arrays, a and b, of any length. Return how many of the 
arrays have 1 as their first element. */
public int start1(int[] a, int[] b) {
  int res = 0;

  if(a.length > 0 && a[0] == 1)
    res++;
    
  if(b.length > 0 && b[0] == 1)
    res++;

  return res;
}

/* Given an int array length 3, if there is a 2 in the array immediately 
followed by a 3, set the 3 element to 0. Return the changed array. */
public int[] fix23(int[] nums) {
  for(int i = 0; i < nums.length - 1; i++) {
    if(nums[i] == 2 && nums[i+1] == 3)
      nums[i+1]=0;
  }
  
  return nums;
}

/* Given an int array, return true if the array contains 2 twice, or 3 
twice. The array will be length 0, 1, or 2. */
public boolean double23(int[] nums) {
  int twos = 0;
  int threes = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 2) twos++;
    if(nums[i] == 3) threes++;
  }
  
  return (twos == 2 || threes == 2);
}

/* Given an int array, return a new array with double the length where its 
last element is the same as the original array, and all the other elements 
are 0. The original array will be length 1 or more. */
public int[] makeLast(int[] nums) {
  int len = nums.length;
  int[] arr = new int[len * 2];
  
  arr[arr.length - 1] = nums[len - 1];
  
  return arr;
}

/* Given an int array length 2, return true if it does not contain a 2 or 3. 
*/
public boolean no23(int[] nums) {
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 2 || nums[i] == 3)
      return false;
  }
  
  return true;
}

/* Given an int array length 2, return true if it contains a 2 or a 3. */
public boolean has23(int[] nums) {
  for(int i = 0; i < nums.length; i++) {
    if (nums[i] == 2 || nums[i] == 3)
      return true;
  }
  
  return false;
}

/* Given an array of ints, return a new array length 2 containing the first 
and last elements from the original array. The original array will be length 
1 or more. */
public int[] makeEnds(int[] nums) {
  int[] arr = {nums[0], nums[nums.length-1]};
  
  return arr;
}

/* Given 2 int arrays, a and b, each length 3, return a new array length 2 
containing their middle elements. */
public int[] middleWay(int[] a, int[] b) {
  int[] arr = {a[1], b[1]};
  
  return arr;
}

/* Given an array of ints, return the sum of the first 2 elements in the
array. If the array length is less than 2, just sum up the elements that 
exist, returning 0 if the array is length 0. */
public int sum2(int[] nums) {
  int sum = 0;
  int end = 2;
  
  if(nums.length < 2)
    end = nums.length;
  
  for(int i = 0; i < end; i++)
    sum += nums[i];
    
  return sum;
}

/* Given an array of ints length 3, figure out which is larger between the 
first and last elements in the array, and set all the other elements to be 
that value. Return the changed array. */
public int[] maxEnd3(int[] nums) {
  int[] arr = new int[3];
  int larger = nums[0];
  
  if(nums[0] < nums[2])
    larger = nums[2];  
    
  for(int i = 0;i < arr.length; i++)
    arr[i] = larger;
    
  return arr;
}

/* Given an array of ints length 3, return a new array with the elements in 
reverse order, so {1, 2, 3} becomes {3, 2, 1}. */
public int[] reverse3(int[] nums) {
  int[] arr = {nums[2], nums[1], nums[0]};
  
  return arr;
}

/* Given an array of ints length 3, return an array with the elements 
"rotated left" so {1, 2, 3} yields {2, 3, 1}. */
public int[] rotateLeft3(int[] nums) {
  int[] arr = {nums[1], nums[2], nums[0]};
  
  return arr;
}

/* Given an array of ints length 3, return the sum of all the elements. */
public int sum3(int[] nums) {
  int sum = 0;
  for(int i = 0;i < nums.length; i++)
    sum += nums[i];

  return sum;
}

/* Given 2 arrays of ints, a and b, return true if they have the same first 
element or they have the same last element. Both arrays will be length 1 or 
more. */
public boolean commonEnd(int[] a, int[] b) {
  return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
}

/* Return an int array length 3 containing the first 3 digits of pi, {3, 1, 
4}. */
public int[] makePi() {
  int[] pi = {3, 1, 4};
  return pi;
}

/* Given an array of ints, return true if the array is length 1 or more, and 
the first element and the last element are equal. */
public boolean sameFirstLast(int[] nums) {
  int len = nums.length;
  
  return(len > 0 && nums[0] == nums[len - 1]);
}

/* Given an array of ints, return true if 6 appears as either the first or 
last element in the array. The array will be length 1 or more. */
public boolean firstLast6(int[] nums) {
  return(nums[0] == 6 || nums[nums.length - 1] == 6);  
}
