# Assignment 1 – Builder Pattern

In this project I used the  Builder Pattern.  
As a product I chose a simple Car class.  

To build a Car I created an inner `CarBuilder` class.  
With it we can set the brand and model step by step and finally get a ready object.  

## Files
- Car.java – Car class and Builder
- Main.java – main class, where Car objects are created

## Usage
Example:
```java
Car car1 = new Car.CarBuilder()
        .setBrand("Toyota")
        .setModel("Camry")
        .build();

System.out.println(car1);
