/* Short method practise from Codingbat.com - String problems 
*  Solved by Joonas Rajala
*/

/* Given a string name, e.g. "Bob", return a greeting of the form "Hello 
Bob!". */
public String helloName(String name) {
  return "Hello " + name + "!";
}

/* Given two strings, a and b, return the result of putting them together in 
the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi". */
public String makeAbba(String a, String b) {
  return a + b + b + a;
}

/* The web is built with HTML strings like "<i>Yay</i>" which draws Yay as 
italic text. In this example, the "i" tag makes <i> and </i> which surround 
the word "Yay". Given tag and word strings, create the HTML string with tags 
around the word, e.g. "<i>Yay</i>". */
public String makeTags(String tag, String word) {
  String tag1 = "<" + tag + ">";
  String tag2 = "</" + tag + ">";

  return tag1 + word + tag2;
}

/* Given an "out" string length 4, such as "<<>>", and a word, return a new 
string where the word is in the middle of the out string, e.g. "<<word>>". */
public String makeOutWord(String out, String word) {
  String start = out.substring(0,2);
  String end = out.substring(2,4);

  return start + word + end;
}

/* Given a string, return a new string made of 3 copies of the last 2 chars 
of the original string. The string length will be at least 2. */
public String extraEnd(String str) {
  int len = str.length();
  String end = str.substring(len - 2, len);

  return end + end + end;
}

/* Given a string, return the string made of its first two chars, so the 
String "Hello" yields "He". If the string is shorter than length 2, return 
whatever there is, so "X" yields "X", and the empty string "" yields the 
empty string "". */
public String firstTwo(String str) {
  if (str.length() < 2) 
    return str;

  return str.substring(0,2);
}

/* Given a string of even length, return the first half. So the string 
"WooHoo" yields "Woo". */
public String firstHalf(String str) {
  return str.substring(0, str.length() / 2);
}

/* Given a string, return a version without the first and last char, so "
Hello" yields "ell". The string length will be at least 2. */
public String withoutEnd(String str) {
  return str.substring(1, str.length() - 1);
}

/* 
Given 2 strings, a and b, return a string of the form short+long+short, with 
the shorter string on the outside and the longer string on the inside. The 
strings will not be the same length, but they may be empty (length 0). 
*/
public String comboString(String a, String b) {
  if (a.length() < b.length())
    return a + b + a;

  return b + a + b;
}

/* 
Given 2 strings, return their concatenation, except omit the first char of 
each. The strings will be at least length 1. 
*/
public String nonStart(String a, String b) {
  return a.substring(1, a.length()) + b.substring(1, b.length());
}

/* 
Given a string, return a "rotated left 2" version where the first 2 chars 
are moved to the end. The string length will be at least 2.  
*/
public String left2(String str) {
  return str.substring(2, str.length()) + str.substring(0,2);
}

/* Given a string, return a "rotated right 2" version where the last 2 chars 
are moved to the start. The string length will be at least 2. */
public String right2(String str) {
  int len = str.length();
  
  return str.substring(len - 2) + str.substring(0, len - 2);
}

/* Given a string, return a string length 1 from its front, unless front is 
false, in which case return a string length 1 from its back. The string will 
be non-empty. */
public String theEnd(String str, boolean front) {
  if(front)
    return str.substring(0,1);
    
  return str.substring(str.length() - 1);
}

/* Given a string, return a version without both the first and last char of 
the string. The string may be any length, including 0. */
public String withouEnd2(String str) {
  int len = str.length();
  
  if(len <= 2)
    return "";
    
  return str.substring(1, len - 1);
}

/* Given a string of even length, return a string made of the middle two 
chars, so the string "string" yields "ri". The string length will be at 
least 2. */
public String middleTwo(String str) {
  int len = str.length();
  
  return str.substring(len / 2 - 1, len / 2 + 1);
}

/* Given a string, return true if it ends in "ly". */
public boolean endsLy(String str) {
  int len = str.length();
  
  if(len >= 2 && str.substring(len - 2, len).equals("ly"))
    return true;
    
  return false;
}

/* Given a string and an int n, return a string made of the first and last n 
chars from the string. The string length will be at least n. */
public String nTwice(String str, int n) {
  return str.substring(0,n) + str.substring(str.length() - n);
}

/* Given a string and an index, return a string length 2 starting at the 
given index. If the index is too big or too small to define a string length 
2, use the first 2 chars. The string length will be at least 2. */
public String twoChar(String str, int index) {  
  if (index < 0 || index > str.length() - 2)
    return str.substring(0,2);
  
  return str.substring(index, index + 2);
}

/* Given a string of odd length, return the string length 3 from its middle, 
so "Candy" yields "and". The string length will be at least 3. */
public String middleThree(String str) {
  int len = str.length();
  
  return str.substring(len / 2 - 1, len / 2 + 2);
}

/* Given a string, return true if "bad" appears starting at index 0 or 1 in 
the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string 
may be any length, including 0. */
public boolean hasBad(String str) {
  int len = str.length();
  
  if (len >= 3 && str.substring(0,3).equals("bad"))
    return true;

  if (len >= 4 && str.substring(1,4).equals("bad"))
    return true;
  
  return false;
}

/* Given a string, return a string length 2 made of its first 2 chars. If 
the string length is less than 2, use '@' for the missing chars. */
public String atFirst(String str) {
  int len = str.length();
  
  if (len == 0) 
    return "@@";
    
  if (len == 1) 
    return str + "@";
  
  return str.substring(0,2);
}

/* Given 2 strings, a and b, return a new string made of the first char of a 
and the last char of b, so "yo" and "java" yields "ya". If either string is 
length 0, use '@' for its missing char. */
public String lastChars(String a, String b) {
  String result = "";
  
  if (a.length() == 0)
    result += "@";
  else
    result += a.charAt(0);  
  
  if (b.length() == 0)
    result += "@";
  else
    result += b.charAt(b.length() - 1);
    
  return result;  
}

/* Given two strings, append them together (known as "concatenation") and 
return the result. However, if the concatenation creates a double-char, then 
omit one of the chars, so "abc" and "cat" yields "abcat". */
public String conCat(String a, String b) {
  int aLen = a.length();
  int bLen = b.length();
  
  if (aLen == 0)
    return b;
  
  if (bLen == 0)
    return a;
    
  if (a.charAt(aLen - 1) == b.charAt(0))
    return a + b.substring(1);
    
  return a + b;
}

/* Given a string of any length, return a new string where the last 2 chars, 
if present, are swapped, so "coding" yields "codign". */
public String lastTwo(String str) {
  int len = str.length();
  
  if (len < 2)
    return str;
    
  return str.substring(0, len - 2) +
         str.charAt(len - 1) +
         str.charAt(len - 2);
}

/* Given a string, if the string begins with "red" or "blue" return that 
color string, otherwise return the empty string.  */
public String seeColor(String str) {
   int len = str.length();
   
   if (len >= 3 && str.substring(0,3).equals("red"))
     return "red";
   
   if (len >= 4 && str.substring(0,4).equals("blue"))
     return "blue";
     
   return "";
}

/* Given a string, return true if the first 2 chars in the string also 
appear at the end of the string, such as with "edited". */
public boolean frontAgain(String str) {
  int len = str.length();
  
  return (len >= 2 && str.substring(0,2).equals(str.substring(len - 2, len)));
}

/* Given two strings, append them together (known as "concatenation") and 
return the result. However, if the strings are different lengths, omit chars 
from the longer string so it is the same length as the shorter string. So 
"Hello" and "Hi" yield "loHi". The strings may be any length.  */
public String minCat(String a, String b) {
  int aLen = a.length();
  int bLen = b.length();
  
  if (aLen < bLen)
    return a + b.substring(bLen - aLen, bLen);
    
  return a.substring(aLen - bLen, aLen) + b;
}

/* Given a string, return a new string made of 3 copies of the first 2 chars 
of the original string. The string may be any length. If there are fewer 
than 2 chars, use whatever is there. */
public String extraFront(String str) {
  if (str.length() < 2)
    return str + str + str;
    
  String sub = str.substring(0,2);
  
  return sub + sub + sub;
}

/* Given a string, if a length 2 substring appears at both its beginning and 
end, return a string without the substring at the beginning, so "HelloHe" 
yields "lloHe". The substring may overlap with itself, so "Hi" yields "". 
Otherwise, return the original string unchanged. */
public String without2(String str) {
  int len = str.length();
    
  if (str.length() >= 2 && 
      str.substring(0,2).equals(str.substring(len - 2, len)))
    return str.substring(2,len);
    
  return str;
}

/* Given a string, return a version without the first 2 chars. Except keep 
the first char if it is 'a' and keep the second char if it is 'b'. The 
string may be any length. Harder than it looks. */
public String deFront(String str) {    
  int len = str.length();
  String start = "";
  String end = "";
  
  if (len >= 3)
    end += str.substring(2,len);
    
  if (len >= 1 && str.charAt(0) == 'a')
    start += "a";
    
  if (len >= 2 && str.charAt(1) == 'b')
    start += "b";

  return start + end;
}

/* Given a string and a second "word" string, we'll say that the word 
matches the string if it appears at the front of the string, except its 
first char does not need to match exactly. On a match, return the front of 
the string, or otherwise return the empty string. So, so with the string 
"hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be 
at least length 1. */
public String startWord(String str, String word) {
  int len = str.length();
  int wLen = word.length();
  
  if (len >= wLen) {
    if (wLen == 1)
      return str.substring(0,1);
    
    if (str.substring(1,wLen).equals(word.substring(1,wLen)))
      return str.substring(0,wLen);
  }
  
  return "";
}

/* Given a string, if the first or last chars are 'x', return the string 
without those 'x' chars, and otherwise return the string unchanged. */
public String withoutX(String str) {
  int len = str.length();
  String result = "";
  
  if (len >= 1 && str.charAt(0) != 'x')
    result += str.charAt(0);
    
  if (len > 2)
    result += str.substring(1,len - 1);
  
  if (len >= 2 && str.charAt(len - 1) != 'x')
    result += str.charAt(len - 1);
    
  return result;
}

/* Given a string, if one or both of the first 2 chars is 'x', return the 
string without those 'x' chars, and otherwise return the string unchanged. 
This is a little harder than it looks. */
public String withoutX2(String str) {  
  String start = "";
  String end = "";
  
  if (str.length() > 0 && str.charAt(0) != 'x')
    start += str.charAt(0);
    
  if (str.length() > 1 && str.charAt(1) != 'x')
    start += str.charAt(1);
    
  if (str.length() > 2)
    end += str.substring(2);
    
  return start + end;
}
