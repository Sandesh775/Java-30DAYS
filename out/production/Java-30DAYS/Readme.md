📘 Java String & Array Programs — Documentation

This document explains a set of beginner-friendly Java programs focused on strings and arrays. Each program includes:

🎯 Purpose

🧠 Core logic (step-by-step)

🧪 Example behavior

The goal is that when you read this later, the logic clicks immediately.

1️⃣ CheckPalindromeString
📌 Purpose

To check whether an entered word is a palindrome (a word that reads the same forward and backward).

Examples:

madam → Palindrome ✅

level → Palindrome ✅

hello → Not a palindrome ❌

🧠 Logic Explanation

Take input string from the user.

Reverse the string manually using a loop.

Compare the original string with the reversed string.

If both are equal → palindrome.

🔍 Why it works

A palindrome remains unchanged even after reversing. So equality check is enough.

🧪 Key Concepts Used

StringBuilder

for loop (reverse traversal)

String.equals()

2️⃣ ToogleString (Toggle Case)
📌 Purpose

To toggle each character in a string:

Lowercase → Uppercase

Uppercase → Lowercase

Example:

Input: HeLLo

Output: hEllO

🧠 Logic Explanation

Convert the string into a character array.

Traverse each character.

If the character is lowercase → convert to uppercase.

Else → convert to lowercase.

Convert the modified character array back to a string.

🔍 Why it works

Java provides Character utility methods that correctly identify and convert character cases.

🧪 Key Concepts Used

toCharArray()

Character.isLowerCase()

Character.toUpperCase() / toLowerCase()

3️⃣ CountVowel
📌 Purpose

To count the number of vowels in a given word.

Vowels considered: A, E, I, O, U

🧠 Logic Explanation

Take string input from the user.

Convert the string to uppercase (for easy comparison).

Convert string into a character array.

Traverse each character.

If character matches any vowel → increase count.

🔍 Why uppercase conversion?

It avoids checking both lowercase and uppercase vowels separately.

🧪 Key Concepts Used

String normalization

Logical OR (||)

Character comparison

4️⃣ LargestNuminArray
📌 Purpose

To find the largest number in an integer array.

Array Used: {10, 2, 3, 45, 105, 50, 4, 2, 90}

🧠 Logic Explanation

Assume the first element is the largest.

Traverse the array from the second element.

If current element > largest → update largest.

After loop ends, largest holds the maximum value.

🔍 Why this approach?

Only one traversal is needed → efficient and simple.

🧪 Key Concepts Used

Array traversal

Conditional comparison

Variable updating

5️⃣ SmallestNuminArray
📌 Purpose

To find the smallest number in an integer array.

Array Used: {10, 2, 3, 45, 105, 50, 4, 1, 90}

🧠 Logic Explanation

Assume the first element is the smallest.

Traverse the array starting from index 1.

If current element < smallest → update smallest.

Final value of smallest is the minimum element.

⚠️ Note

Output text says "Largest number" — it should be "Smallest number".

🧪 Key Concepts Used
* Minimum value tracking
* Array comparison logic
Minimum value tracking

Array comparison logic
