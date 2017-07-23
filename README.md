# Java 8
---
Introduction to new things in java 8.
> Use link to see example of relevant title.

### What is lambda expression ?
    Lambda expression is nothing but an anonymous function.
### [Functional Interface](https://github.com/sumitppawar/JavaEight/blob/master/src/com/sumit/learn/java8/UseFunctionalInterface.java)
    Functional Interface is an Interface having only one abstract method.

### [Default static method](https://github.com/sumitppawar/JavaEight/blob/master/src/com/sumit/learn/java8/UseStaticDefaultMethod.java)
    Default static method method with default static and defined in an interface. 
### [Built in Functional Interface](https://github.com/sumitppawar/JavaEight/blob/master/src/com/sumit/learn/java8/)
```
java.util.function.*
java.util.function.Predicate
java.util.function.Consumer
```
### [Optional](https://github.com/sumitppawar/JavaEight/blob/master/src/com/sumit/learn/java8/UseOptional.java) 
    Way to deal with null value.
    java.util.Optional.of(new Person(23, "Sumit"))
### [Traveling Collection](https://github.com/sumitppawar/JavaEight/blob/master/src/com/sumit/learn/java8/UseOfForEachMethod.java)
    forEach(Consumer con) method added to collection  
### Stream API
#### [Sequential Stream](https://github.com/sumitppawar/JavaEight/blob/master/src/com/sumit/learn/java8/UseSequentialStream.java)
    Traveling and aggregating collection sequentially.
    new ArrayList(). stream()
#### [Parallel Stream](https://github.com/sumitppawar/JavaEight/blob/master/src/com/sumit/learn/java8/UseParallelStream.ajav)
	Traveling and aggregating collection parallel.
	new ArrayList(). parallelStream()
	
### Time API
```
//The Classes
java.util.Instance
java.util.Duration
java.util.LocalTime
java.util.LocalDate
java.util.LocalDateTime
java.util.DateTimeFormatter
java.util.DateTimeFormatterBuilder
```
#### [Local Date and Time](https://github.com/sumitppawar/JavaEight/blob/master/src/com/sumit/learn/java8/DateAndTime.java)
    Dealing with time and date without time zone information.
#### [Date Formatter](https://github.com/sumitppawar/JavaEight/blob/master/src/com/sumit/learn/java8/UseDateFormatter.java)
    How for format date and time using DateTimeFormatter ?
#### [Zoned Time](https://github.com/sumitppawar/JavaEight/blob/master/src/com/sumit/learn/java8/UseZonedDateTime.java)
    Date and Time with zone information.
### [Introduction to Nashorn, a replacement for Rhino](https://github.com/sumitppawar/JavaEight/blob/master/src/com/sumit/learn/java8/UseNashorn.java)
```java
//nashorn command line using jjs
Sumits-MacBook-Air:~ sumit$ jjs
jjs> var welcome = 'Welcome to Nashorn';
jjs> welcome 
```
### [Execute Js file using nashorn](https://github.com/sumitppawar/JavaEight/blob/master/src/com/sumit/learn/java8/UseNashornExecuteJsFile.java)
    How execute javscript file using nashorn ?

 