# Shopping Basket Price Calculator

This Scala project calculates the price of a shopping basket with special offers. It accepts a list of items as input and outputs the subtotal, special offer discounts, and the final price.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [1. Clone the Repository](#1-clone-the-repository)
  - [2. Compile the Scala Source Files](#2-compile-the-scala-source-files)
- [Running the Program](#running-the-program)
- [Running Tests](#running-tests)

## Prerequisites

Before you begin, ensure you have the following prerequisites installed on your system:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html): Scala runs on the Java Virtual Machine (JVM), so you need Java installed.
- Scala
- SBT(Scala Build Tool)


## Getting Started 

Follow these steps to set up and run the project:

### 1. Clone the Repository

Clone this GitHub repository to your local machine using Git:

```bash
git clone https://github.com/ToghrulJabbarli/technical_assignment.git
```

### 2. Compile the Scala Source Files

   Navigate to the project directory, create target folder for compiled files and compile the Scala source files using `scalac`:
```bash
   cd technical_assignment/src/main/scala
   mkdir target
   scalac -d target ShoppingBasket.scala PriceBasket.scala
```

## Running Program

You can run the program using the scala command. Make sure you are in the target directory:
```bash
scala PriceBasket "Item1" "Item2" "Item3"
```
Replace Item1, Item2, Item3 with items in baskets.

## Running Tests
Open your terminal and navigate to the project directory.
Start the Scala Build Tool (SBT) by entering the following command:
```bash
sbt test
```
