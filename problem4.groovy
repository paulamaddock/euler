/**
 * Problem 3 Palindrome problem http://projecteuler.net/problem=4
 */
 
 def largestPossibleNum = 999 * 999
 def smallestNum = 100 * 100
 def highestThreeDigitFactor = largestPossibleNum
 def highestPalindrome
 
 while (largestPossibleNum >= smallestNum) {
     if (largestPossibleNum.toString() == largestPossibleNum.toString().reverse()){
         def i = 999
         println largestPossibleNum
         while (Math.round(largestPossibleNum/i).toString().size() <= 3) {
             println i
             if (largestPossibleNum % i == 0 && (largestPossibleNum/i).toString().size() ) {
                 println "highest palidrome"  + largestPossibleNum
                 println "factor 1"  
                 return
             }
             i--
         }
     }
     largestPossibleNum--
 }
 
 println largestPossibleNum
 println smallestNum