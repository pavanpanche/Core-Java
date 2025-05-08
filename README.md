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
- Arrays, Methods, Variable(Instance, static, local)
- String Handling
- Exception handling
- try-catch and finally
- Custom Exception
- Object oriented programming principals
- Class, Object
- Constructor, Constructor overloading 
- Inheritance
- Polymorphism (Overloading, Overriding)
- Encapsulation
- Abstraction classes, interfaces
- Packages
- Access modifiers, Non Access Modifiers
- Scanner Class
- Static Class
- Nested Classes
- Collection Framework
- MultiTHreading
- Java 8 Features (Lamda Expression, Functional Interface, Annotation, Date and time Api)

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

- StringBuffer: mutable (can be changes once created)]

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

---

# 📅 08-03-2025: Object-Oriented Programming (OOP) Concepts in Java

Object-Oriented Programming (OOP) is a fundamental programming paradigm based on the concept of **objects** and **classes**. Java is a **pure object-oriented language**, and mastering OOP is essential for Java development.

---

## 📌 Core OOP Concepts

1. Class  
2. Object  
3. Constructor  
4. Inheritance  
5. Polymorphism  
6. Encapsulation  
7. Abstraction  

---

## 🧱 1. Class

- A **class** is a blueprint for creating objects.
- It defines properties (fields) and behaviors (methods).

### ✅ Syntax:

```java
class ClassName {
    // Fields (variables)
    // Methods
}
```
### Example 
```java
class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car is driving...");
    }
}
```
---

## 🎯 2. Object
- An object is an instance of a class.

- It contains real values of properties defined in the class.

- ✅ **Creating an Object**:

```java
ClassName obj = new ClassName();
```
### Example
```java
Car myCar = new Car();
myCar.color = "Red";
myCar.drive();
```
---

## 🧱 3. Constructor

- Constructor is a one type of special method.
- Constructor name and class Name must be same and with no return type including void.
- Constructor will execute whenever we create an object.
- The purpose of constructors is to initilize instance variables.
- **They are 3 types of constructors**
   - default/Non parameterized constructor.
   - Parameterized Constructor
   - Copy Constructor.

### default/Non parameterized constructor.

The constructor without formal parameters or Zero formal parameters is called default or 
Non parameterized constructor.

### Parameterized Constructors

The constructor with formal parameters is called parameterized constructors.

### Copy Constructor.

The process of copying 1 object refernce or refernce variable into another Onject refernce or
reference variable.


- **If there is no constructor jvm will provide 1 default constructor.**

---
  
### Constructor Overloading

The process of 2 or more constructors with same name and different formal parameters list.
**Constructor overriding is not possible because inheritance is not possible.**

### Constructor chaining

- The process of calling one constructor to another constructor is called constructor chaining.
- Constructor chaining can be possible by this(),super().
- this() and super() must be written in first statement.
- super() is implicitly present in every class but not this().

---

#### this()
this() will call default constructor in current class.

#### this(int x)
this(int x) will parameterized constructor in current class.

#### super()
super() will call default constructor in super class

#### super(int x)
super(int x) will call parameterized constructor in super class

#### 🧪 Example:
```java
class Person {
    String name;
    int age;

    // Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println(name + " is " + age + " years old");
    }
}

Person p = new Person("Alice", 25);
p.show();
```
---

## 🧬 4. Inheritance
- Inheritance allows a class to inherit properties and methods from another class.

- Promotes code reusability parent class to child class.
### ✅ Syntax:
```java
class Parent {
    // code
}

class Child extends Parent {
    // inherits Parent
}
```

### 🧪 Example:
```java 
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

Dog d = new Dog();
d.eat();   // inherited
d.bark();
```
---

## 🔁 5. Polymorphism
Polymorphism means many forms — the ability to take different forms.

### ✅ Types of Polymorphism:
- Compile-time (Method Overloading)

- Runtime (Method Overriding)

### 🧪 Method Overloading (Compile-time)
with Same method name, different parameters:

#### Example 
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

---

### 🧪 Method Overriding (Runtime)
- with Same method name, same parameter
- Subclass provides a specific implementation:

#### Example 
```
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

Animal obj = new Cat();
obj.sound();  // Meow
```

---

## 🔒 6. Encapsulation
- Wrapping data (fields) and code (methods) together.

- Fields should be marked private and accessed via getters/setters.

### ✅ Example:
```java 
class Employee {
    private int salary;

    public void setSalary(int s) {
        salary = s;
    }

    public int getSalary() {
        return salary;
    }
}
```

---

## 🧩 7. Abstraction
- The process of hiding uncessesary details and showing necessary details is called Abstaraction.
- The process of  hiding implementation code and showing only functinality to the user.
  
### Achieved using:
- Abstract classes
- Interfaces

### 🧪 Abstract Class 
- A class which is defined with abstract keyword then that is called a abstract class.
- abstract class is a collection of concrete methods and abstract methods.

### Abstract Class Contain Two Method:
- **abstarct class**
- A class which is defined with abstract keyword then that is called a abstract class.
- abstract class is a collection of concrete methods and abstract methods.

- **concrete methods**:
- The methods which have body then that is called a concrete method.
- The purpose of concrete methods to give common functinality to the implementation classes.

#### Example:

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}
```
### 🧪 Interface Example:

```java
interface Animal {
    void makeSound();
}

class Cow implements Animal {
    public void makeSound() {
        System.out.println("Moo");
    }
}
```

---
## 🧠 Summary of OOP Concepts

| Concept       | Description                                       |
| ------------- | ------------------------------------------------- |
| Class         | Blueprint for objects                             |
| Object        | Instance of a class                               |
| Constructor   | Initializes new objects                           |
| Inheritance   | Reuse properties and behaviors from other classes |
| Polymorphism  | Many forms: overloading/overriding                |
| Encapsulation | Data hiding using private fields and methods      |
| Abstraction   | Hiding details, exposing only what’s necessary    |

---
  






  






