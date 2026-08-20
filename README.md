# Java Practice Assignments

This repository contains my Java programming practice assignments and exercises, structured by learning days. It serves as a record of my progress in learning core Java concepts, Object-Oriented Programming, and basic algorithmic logic.

## 📂 Structure and Learnings

### ☀️ Day 2: Core Java & Object-Oriented Programming (OOP) Basics
This section focuses on the foundational concepts of Java, control flow, methods, and the principles of OOP.

- **`Greeting.java`**: 
  - **Learnings**: Basic input/output using the `Scanner` class to read from the console, and passing variables (Strings) to methods.
- **`InstaPayCheck.java`**:
  - **Learnings**: Control flow using `if-else` statements, boolean logic, and creating simple business logic methods. Demonstrates passing multiple arguments to determine loan qualification based on salary and credit score.
- **`Rectangle.java`**:
  - **Learnings**: Core OOP concepts! Defines a class with `private` fields (encapsulation), uses the `this` keyword, implements default and parameterized constructors, and includes instance methods (`calculateArea`, `calculatePerimeter`) and getters/setters.
- **`HomeAreaCalculation.java`**:
  - **Learnings**: Object instantiation. Demonstrates how to create instances of the `Rectangle` class, set object properties using setter methods, and use parameterized constructors to calculate the total area of multiple rooms.
- **`HomeAreaCalculatorRedo.java`**:
  - **Learnings**: Returning objects from methods and passing objects as arguments. Shows how to structure code by creating a method `getDimentions()` that returns a `Rectangle` object, and a method `calculateArea()` that takes two `Rectangle` objects as parameters.
- **`Month.java` & `MonthConverter.java`**:
  - **Learnings**: Using `switch` statements to map values, static methods, and method overloading. `MonthConverter` demonstrates calling static methods from a different class without instantiating an object.

### ☀️ Day 3: Arrays, Loops, and Searching Algorithms
This section delves into data structures, iteration, and basic algorithmic problem solving.

- **`LotteryTicket.java`**:
  - **Learnings**: Introduction to Java Arrays and the `Random` class. Demonstrates how to initialize an array, generate random numbers, and use standard `for` loops to iterate through and populate the array.
- **`LotteryCheckUpdate.java`**:
  - **Learnings**: Advanced array manipulation and searching. 
    - **Constants**: Using `static final` variables for fixed values.
    - **Loops**: Using `do-while` loops and enhanced `for` loops.
    - **Algorithms**: Implementing a custom linear search method to ensure generated random numbers are unique (preventing duplicates in the lottery ticket).
    - **Java Utils**: Utilizing the built-in `Arrays` class for cloning arrays (`array.clone()`), sorting (`Arrays.sort()`), and performing a Binary Search (`Arrays.binarySearch()`).

## 🚀 Getting Started
These are standard Java source files. They can be compiled and run using any IDE like IntelliJ IDEA, Eclipse, or directly from the command line using `javac` and `java`.
