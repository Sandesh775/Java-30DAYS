Program 1: Input Validation
File: InputValidation.java

📝 Description
This program demonstrates robust input validation in Java. It ensures that user input meets specific criteria before proceeding:

Validates numeric input to be within range 0-10 (inclusive)

Validates string input to have length between 1-15 characters

🔍 Features
Do-While Loops: For guaranteed at least one execution and repeated validation

Input Validation: Ensures user provides valid input before proceeding

Scanner Management: Proper handling of Scanner buffer with nextLine()

Output Formatting: Simple, clear output display

📊 Input Requirements
Number: Must be between 0 and 10 (inclusive)

String: Length must be between 1 and 15 characters

📤 Output
Double the validated number

The validated string

Program 2: String Replication
File: Warmup2.java

📝 Description
Creates multiple copies of an input string using a custom method. Demonstrates string manipulation and StringBuilder usage for efficiency.

🔍 Features
Custom Method: stringTimes() for string replication

StringBuilder: Efficient string concatenation in loops

Input Validation: Ensures positive number of copies

Modular Design: Separation of input/output logic from business logic

⚡ Performance Note
Uses StringBuilder instead of string concatenation (+ operator) for better performance when building strings in loops.

📊 Input Requirements
String: Any text input

Number: Positive integer (> 0) for number of copies

📤 Output
The input string repeated N times

Program 3: Palindrome Number Checker
File: CheckPalindromeNum.java

📝 Description
Checks whether a given number is a palindrome (reads the same forwards and backwards) using mathematical operations.

🔍 Features
Mathematical Approach: No string conversion needed

Efficient Algorithm: O(n) time complexity where n is number of digits

Proper Variable Management: Preserves original number for comparison

Clear Logic: Well-commented mathematical operations

🧮 Algorithm Explanation
The program reverses the number mathematically:

Extract last digit using modulo operator (% 10)

Build reversed number: reversed = reversed * 10 + digit

Remove last digit using integer division (/ 10)

Compare original with reversed number
