 HEAD
# Core-Java
this is my core java learning repo

#Core Java Project 
- **Mini Project 1**: Console Based Banking Application
- **Mini Project 2**: Library Management System
- **Mini Project 3**: Employee Management System
- **Mini Project 4**: Ecommerce Product Filter App
- **Mini Project 5**: Hospital Management System

This repository contains various core Java programs and exercises for learning and practice.

## Core Java RoadMap
- Basic Java Syntax
- Data Types
- Control Statements
- Arrays, Methods, and more.
- String Handling
- Exception handling
- try-catch and finally
- Custom Exception
- Object oriented programming principals
- Class, Object, Constructor
- Inheritance
- Polymorphism
- Encapsulation
- Abstraction classes, interfaces
- Packages
- Access modifiers, Non Access Modifiers
- Static Class
- Nested Classes
- Collection

---

## How to Run
To run any program, simply open the `.java` file in your favorite IDE (such as IntelliJ IDEA) and run it from there.

---


# 📅 05-03-2025: Java Basics

## 📘 1. Java Introduction

1. Java is a popular programming language.  
2. Father of Java is **James Gosling**.  
3. Java 1st version (1.0) was introduced by **Sun Microsystems** in **1996**.  
4. Currently, Java is owned by **Oracle Corporation**.

---

## 🧱 Java is Technically Divided into 3 Parts

### 1. J2SE (Java 2 Standard Edition)

- Covers Java fundamentals.
- Used to develop **standalone/desktop/window-based applications**.

### 2. J2EE (Java 2 Enterprise Edition)

- Covers **server-side programming**.
- Used to develop **enterprise/distributed applications**.

### 3. J2ME (Java 2 Micro Edition)

- Covers **micro-side programming**.
- Used to develop **mobile-based applications**.

---

## 🧾 Basic Java Program Syntax

```java
class ClassName {
    public static void main(String[] args) {
        // statements
    }
}
```

---
## 🌟 Java Features

- Simple programming language
- Platform independent
- Statically typed
- High-level
- Integrated
- Robust
- Both functional and object-oriented
- Portable
- Multithreaded
- Dynamic

---

## Simple Programming Language
- Java is simple because it provides predefined methods.
- It eliminates complex concepts like pointers.
- Syntax is easy to learn and understand.

---

## Predefined Methods
#### Methods already available in Java (provided by JDK developers)

- **Examples**:

- sqrt()
- add()
- max()
- min()

---

## User-Defined Methods
#### Methods created by Java programmers that are not part of JDK.

- **Examples**:

- bhavadeesh()
- vikash()
- mihir()
- pawan()

---

## Variables in Java
A **Variables**  is a container to store values (operand, variable, or expression).
- int a = 5; → Value
- int b = a; → Variable
- int c = 6 + 3; → Expression

---

## Data Type 
- **Primitive datatype**
- byte
- short
- int
- long
- float
- double
- char
- boolean

---

- **Non Primtive Datatype**
- Array
- String 
- Class
- Object
- Interface

---

# 📅 06-03-2025: Control Statements in Java

Control statements are used to control the **flow of execution** in a program. These include:

- Conditional Statements
- Looping (Iteration) Statements
- Jump Statements

---

## 🔹 1. Conditional Statements

Used to perform **decision-making** operations.

### ✅ `if` Statement

Executes a block if the condition is true.

```java
if (condition) {
    // code block
}
```

#### Example 
int age = 20;
if (age >= 18) {
    System.out.println("Eligible to vote");
}
```
### ✅ if-else Statement
Executes one block if true, another if false. else is optional here.
```java
int number = 10;
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```
### ✅ if-else-if Ladder
Multiple conditions checked sequentially.
```java
if (condition1) {
    // block1
} else if (condition2) {
    // block2
} else {
    // default block
}
```
#### Example
```java
int marks = 85;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else {
    System.out.println("Grade C");
}

```
### Multiple if 

```java
if (condition1) {
    // block1
} if (condition2) {
    // block2
} if (condition3){
    // default block
} else {
}
```

### Nested if
one if define another if or one outside if define inside if. else block is optional.
```java 
if(condition1){
  if(condition2){
  }
 } 
```

### ✅ switch Statement
Used for multi-way branching.

```java
switch (expression) {
    case value1:
        // statements
        break;
    case value2:
        // statements
        break;
    default:
        // default statements
}
```
#### Example
```java
int day = 3;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    default: System.out.println("Invalid day");
}
```

---

## 🔁 2. Looping Statements
Used to execute a block of code repeatedly.

### 🔄 for Loop
when we go for for loop when we know number of iteration.
#### syntax
```java
for (initialization; condition; increment/decrement) {
    // statements
}
```
#### Example:
```java 
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```
### 🔄 while Loop
When we go for while loop when we dont about number of iteration.
#### Syntax
```java
while (condition) {
    // statements
}
```
#### Example 
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```
### 🔄 do-while Loop
Executes at least once.
#### Syntax 
```java 
do {
    // statements
} while (condition);
```

#### Example 
```java 
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

---

## 🔀 3. Jump Statements
Used to alter loop execution.

### ✅ break
Exits the loop immediately.
#### Example 
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) break;
    System.out.println(i);
}
```

#### output
1
2

### ✅ continue
Skips current iteration and continues.
#### Example 
```java 
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}
```
#### Output 
1
2
4
5

---

## 📌 Summary
- Use if and switch for decisions.

- Use for, while, do-while for iterations.

- Use break and continue to control loop behavior.

---

# 📅 07-03-2025: Arrays and Strings – Handling and Manipulation

## 🔢 Arrays in Java

### 📌 What is an Array?

- An **array** is a collection of similar type data stored in **contiguous memory**.
- It allows you to store **multiple values** in a single variable.
- Arrays in Java are **fixed in size**.

### 🧾 Syntax of Array Declaration

```java
datatype[] arrayName;         // Recommended
or
datatype arrayName[];         // Also valid
```


### Example
```java
int[] marks = new int[5];     // Declaration with size
marks[0] = 10;                // Initialization
marks[1] = 20;
```

### 🧪 Array Initialization in One Line
int[] numbers = {10, 20, 30, 40, 50};

### 🔄 Array Traversal (Looping through Arrays)
- **➤ Using for loop**
```java
for(int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```
- **➤ Using enhanced for loop (for-each)**
```java
for(int num : numbers) {
    System.out.println(num);
}
```
---

## 📚 Strings in Java
### 📌 What is a String?
- A String is a sequence of characters.

- Strings in Java are objects of the String class.

- Strings are immutable (cannot be changed once created).

## String Handling Type in Java 
- String: Strings are immutable (cannot be changed once created).

- StringBuffer: mutable (can't be changes once created)]

- StringBuilder: mutable and thread safe

- StringTokenizer

### 🧾 Ways to Declare a String

```java
String str1 = "Java";                   // Using string literal
String str2 = new String("Programming"); // Using new keyword
```

### 🔧Common String Method 

| Method               | Description                             |
| -------------------- | --------------------------------------- |
| `length()`           | Returns length of the string            |
| `charAt(int index)`  | Returns character at given index        |
| `toUpperCase()`      | Converts string to uppercase            |
| `toLowerCase()`      | Converts string to lowercase            |
| `substring()`        | Returns substring from the string       |
| `equals()`           | Compares two strings (case-sensitive)   |
| `equalsIgnoreCase()` | Compares two strings (case-insensitive) |
| `concat()`           | Concatenates two strings                |
| `contains()`         | Checks if sequence is present           |

### ✅ Example
```java
String name = "Java Programming";

System.out.println(name.length());          // 16
System.out.println(name.charAt(5));         // P
System.out.println(name.toUpperCase());     // JAVA PROGRAMMING
System.out.println(name.substring(5));      // Programming
```
### 📌 Summary
- Arrays store multiple values of the same type.

- Strings are objects and provide many built-in methods.

- Both are essential for data manipulation in Java.





