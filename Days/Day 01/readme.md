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

## 📌 Program 4: Count Repeated Digits in a Number

**File:** `CountRepeatDigitinNum.java`  

### 📝 Description
This program takes an integer input from the user and **prints all digits that appear more than once**.
### 💡 How It Works (Logic Explained)

1. **Outer Loop** (`while n1 != 0`):  
   - Picks one digit at a time (`d1 = n1 % 10`) starting from the last digit.
2. **Inner Loop** (`while n2 != 0`):  
   - Compares `d1` with every digit (`d2 = n2 % 10`) in the number.
   - Counts how many times `d1` appears.
3. **Count Check** (`if count > 1`):  
   - If a digit appears more than once, it is printed as a repeated digit.
4. **Reset n2 and move n1**:  
   - `n2` is reset to the original number for the next digit comparison.  
   - `n1` is divided by 10 to move to the next digit.

⚠️ **Note:**  
- The program works but does **not efficiently skip digits that were already counted**, which can lead to duplicate prints.  
- A better version with **skipping control** will be included in **Day02 files**

## 📌 Program 5: Check if a Number Has All Unique Digits

**File:** `UniqueNumorNot.java`  

### 📝 Description
This program checks if **all digits in a number are unique**.
### 💡 How It Works (Logic Explained)

1. **Outer Loop** (`while num != 0`):  
   - Picks one digit at a time (`d1 = num % 10`) and counts total digits.
2. **Inner Loop** (`while temp != 0`):  
   - Compares `d1` with every digit (`d2 = temp % 10`) in the number.  
   - Counts how many times each digit appears.
3. **Decision**:  
   - If the total number of digits equals the total count of all digits (`nod == count`), the number is **unique**.  
   - Otherwise, the number is **not unique**.
