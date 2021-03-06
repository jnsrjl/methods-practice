/* Short method practise from Codingbat.com - Recursion problems 
*  Solved by Joonas Rajala
*
*  Problems solved using only recursion.
*/

/* Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2
) ... 1. */
public int factorial(int n) {
  // Base
  if (n == 1) return 1;
  
  return n * factorial(n - 1);
}

/* We have a number of bunnies and each bunny has two big floppy ears. We 
want to compute the total number of ears across all the bunnies recursively.
*/
public int bunnyEars(int bunnies) {
  // Base
  if (bunnies == 0) return 0;
  
  return 2 + bunnyEars(bunnies - 1);
}

/* Fibonacci sequence */
public int fibonacci(int n) {
  // Two bases
  if (n == 0) return 0;
  if (n == 1) return 1;
  
  return fibonacci(n - 2) + fibonacci(n - 1);
}

/* We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies 
have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, 
because they each have a raised foot. Recursively return the number of 
"ears" in the bunny line 1, 2, ... n. */
public int bunnyEars2(int bunnies) {
  // Base
  if (bunnies == 0) return 0;
  
  return (2 + bunnies % 2) + bunnyEars2(bunnies - 1);
}

/* We have triangle made of blocks. The topmost row has 1 block, the next 
row down has 2 blocks, the next row has 3 blocks, and so on. Compute 
recursively the total number of blocks in such a triangle with the given 
number of rows. */
public int triangle(int rows) {
  // Base
  if (rows == 0) return 0;
  
  return rows + triangle(rows - 1);
}

/* Given a non-negative int n, return the sum of its digits recursively. */
public int sumDigits(int n) {
  // Base
  if (n == 0) return 0;
  
  // Rightmost digit + next 10th
  return (n % 10) + sumDigits(n / 10);
}

/* Given a non-negative int n, return the count of the occurrences of 7 as a 
digit, so for example 717 yields 2. */
public int count7(int n) {
  // Base
  if (n == 0)
    return 0;
  
  // Is 7
  if (n % 10 == 7)
    return 1 + count7(n / 10);

  // Not 7
  return count7(n / 10);
}

/* Given a non-negative int n, compute the count of the occurrences of 8 as 
a digit, except that an 8 with another 8 immediately to its left counts 
double, so 8818 yields 4. */
public int count8(int n) {
  // Base
  if (n == 0) return 0;
  
  // Has two eights
  if (n % 10 == 8 && (n / 10) % 10 == 8)
    return 2 + count8(n / 10);
  
  // Has one eight
  if (n % 10 == 8)
    return 1 + count8(n / 10);
    
  // Not 8
  return count8(n / 10);
}

/* Given base and n that are both 1 or more, compute recursively the value 
of base to the n power. */
public int powerN(int base, int n) {
  // Base
  if (n == 0) return 1;
  
  return base * powerN(base, n - 1);
}

/* Given a string, compute recursively the number of lowercase 'x' chars in 
the string. */
public int countX(String str) {
  // Base
  if (str.length() == 0) return 0;

  // Has 'x'
  if (str.charAt(0) == 'x')
    return 1 + countX(str.substring(1));

  // Hasn't
  return countX(str.substring(1));
}

/* Given a string, compute recursively the number of times lowercase "hi" 
appears in the string. */
public int countHi(String str) {
  if (str.length() <= 1) return 0;
  
  // Has hi
  if (str.substring(0,2).equals("hi"))
    return 1 + countHi(str.substring(1));
  
  // Hasn't
  return countHi(str.substring(1));
}

/* Given a string, compute recursively a new string where all the lowercase 
'x' chars have been changed to 'y' chars. */
public String changeXY(String str) {
  // Base
  if (str.length() == 0) return str;
  
  // Has 'x'
  if (str.charAt(0) == 'x')
    return 'y' + changeXY(str.substring(1));
  
  // Hasn't
  return str.charAt(0) + changeXY(str.substring(1));
}

/* Given a string, compute recursively a new string where all appearances of 
"pi" have been replaced by "3.14". */
public String changePi(String str) {
  // Base
  if (str.length() < 2) return str;
  
  // Has "pi" => two steps forward
  if (str.substring(0,2).equals("pi"))
    return "3.14" + changePi(str.substring(2));
  
  // Hasn't => one step forward
  return str.substring(0,1) + changePi(str.substring(1));
}

/* Given a string, compute recursively a new string where all the 'x' chars 
have been removed. */
public String noX(String str) {
  // Base
  if (str.length() < 1) return str;
  
  // Has 'x'
  if (str.charAt(0) == 'x')
    return noX(str.substring(1));

  // Hasn't
  return str.charAt(0) + noX(str.substring(1));
}

/* Given an array of ints, compute recursively if the array contains a 6 
starting from the given index. */
public boolean array6(int[] nums, int index) {
  // Base
  if (index >= nums.length) return false;
  
  // Has 6
  if (nums[index] == 6) return true;
  
  // Hasn't
  return array6(nums, index + 1);
}

/* Given an array of ints, compute recursively the number of times that the 
value 11 appears in the array starting from the given index. */
public int array11(int[] nums, int index) {
  // Base
  if (index >= nums.length) return 0;
  
  // Has 11
  if (nums[index] == 11)
    return 1 + array11(nums, index + 1);
  
  // Hasn't
  return array11(nums, index + 1);
}

/* Given an array of ints, compute recursively if the array contains 
somewhere a value followed in the array by that value times 10. We'll use 
the convention of considering only the part of the array that begins at the 
given index. In this way, a recursive call can pass index+1 to move down the 
array. The initial call will pass in index as 0. */
public boolean array220(int[] nums, int index) {
  // Base
  if (index >= nums.length - 1) return false;
  
  // Has x and 10x
  if (nums[index] * 10 == nums[index + 1])
    return true;
  
  // Hasn't => step one
  return array220(nums, index + 1);
}

/* Given a string, compute recursively a new string where all the adjacent 
chars are now separated by a "*". */
public String allStar(String str) {
  // Base
  if (str.length() < 2) return str;
  
  return str.charAt(0) + "*" + allStar(str.substring(1));
}

/* Given a string, compute recursively a new string where identical chars 
that are adjacent in the original string are separated from each other by a 
"*". */
public String pairStar(String str) {
  // Base
  if (str.length() < 2) return str;
  
  // Are identical
  if (str.charAt(0) == str.charAt(1))
    return str.charAt(0) + "*" + pairStar(str.substring(1));
  
  // Are not
  return str.charAt(0) + pairStar(str.substring(1));
}

/* Given a string, compute recursively a new string where all the lowercase 
'x' chars have been moved to the end of the string. */
public String endX(String str) {
  // Base
  if (str.length() < 1) return str;
  
  // Has 'x'
  if (str.charAt(0) == 'x')
    return endX(str.substring(1)) + 'x';
  
  // Hasn't
  return str.charAt(0) + endX(str.substring(1));
}

/* We'll say that a "pair" in a string is two instances of a char separated 
by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" 
contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of 
pairs in the given string. */
public int countPairs(String str) {
  // Base
  if (str.length() < 3) return 0;
  
  // Has a pair
  if (str.charAt(0) == str.charAt(2))
    return 1 + countPairs(str.substring(1));
  
  // Hasn't
  return countPairs(str.substring(1));
}

/* Count recursively the total number of "abc" and "aba" substrings that 
appear in the given string. */
public int countAbc(String str) {
  // Base
  if (str.length() < 3) return 0;
  
  int count = 0;
  
  // Has abc
  if (str.substring(0,3).equals("abc"))
    count++;
  
  // Has aba
  if (str.substring(0,3).equals("aba"))
    count++;
  
  return count + countAbc(str.substring(1));
}

/* Given a string, compute recursively (no loops) the number of "11" 
substrings in the string. The "11" substrings should not overlap. */
public int count11(String str) {
  // Base
  if (str.length() < 2) return 0;
  
  // Has non-overlapping "11"
  if (str.substring(0,2).equals("11"))
    return 1 + count11(str.substring(2));
  
  // Hasn't
  return count11(str.substring(1));
}

/* Given a string, return recursively a "cleaned" string where adjacent 
chars that are the same have been reduced to a single char. So "yyzzza" 
yields "yza". */
public String stringClean(String str) {
  // Base
  if (str.length() < 2) return str;
  
  // Are the same
  if (str.charAt(0) == str.charAt(1))
    return stringClean(str.substring(1));
  
  // Are not
  return str.charAt(0) + stringClean(str.substring(1));
}

/* Given a string, compute recursively the number of times lowercase "hi" 
appears in the string, however do not count "hi" that have an 'x' immedately 
before them. */
public int countHi2(String str) {
  // Base
  if (str.length() < 2) return 0;
  
  // Has "xh" => jump two steps
  if (str.substring(0,2).equals("xh"))
    return countHi2(str.substring(2));
  
  // Has "hi"
  if (str.substring(0,2).equals("hi"))
    return 1 + countHi2(str.substring(1));
  
  // Hasn't
  return countHi2(str.substring(1));
}

/* Given a string that contains a single pair of parenthesis, compute 
recursively a new string made of only of the parenthesis and their contents, 
so "xyz(abc)123" yields "(abc)". */
public String parenBit(String str) {  
  // Base
  if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
    return str;

  // First is not '('
  if (str.charAt(0) != '(')
    return parenBit(str.substring(1));
  
  // Last is not ')'
  return parenBit(str.substring(0, str.length() - 1));
}

/* Given a string, return true if it is a nesting of zero or more pairs of 
parenthesis, like "(())" or "((()))". */
public boolean nestParen(String str) {
  // Base - We are at middle with only nesting paren.
  if (str.length() < 1) return true;
  
  // Matching pair => step both
  if (str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')')
    return nestParen(str.substring(1,str.length() - 1));

  return false;
}

/* Given a string and a non-empty substring sub, compute recursively the 
number of times that sub appears in the string, without the sub strings 
overlapping. */
public int strCount(String str, String sub) {
  // Base - no room for subs
  if (str.length() < sub.length()) return 0;
  
  // Subs match
  if (str.substring(0, sub.length()).equals(sub))
    return 1 + strCount(str.substring(sub.length()), sub);
  
  // Don't match
  return strCount(str.substring(1), sub);
}

/* Given a string and a non-empty substring sub, compute recursively if at 
least n copies of sub appear in the string somewhere, possibly with 
overlapping. N will be non-negative. */
public boolean strCopies(String str, String sub, int n) {
  // Found enough
  if (n < 1)
    return true;
  
  // No room for sub anymore
  if (str.length() < sub.length())
    return false;
  
  // Found sub => step one and reduce n
  if (str.substring(0, sub.length()).equals(sub))
    return strCopies(str.substring(1), sub, n - 1);
  
  // Didn't found => step one
  return strCopies(str.substring(1), sub, n);
}

/* Given a string and a non-empty substring sub, compute recursively the 
largest substring which starts and ends with sub and return its length. */
public int strDist(String str, String sub) {
  // No room for a sub
  if (str.length() < sub.length())
    return 0;
  
  // Not sub from the left => step one right
  if (!str.substring(0, sub.length()).equals(sub))
    return strDist(str.substring(1), sub);

  // Not sub from the right => step one left
  if (!str.substring(str.length() - sub.length()).equals(sub)) {
    return strDist(str.substring(0, str.length() - 1), sub);
  }
  
  return str.length();
}
