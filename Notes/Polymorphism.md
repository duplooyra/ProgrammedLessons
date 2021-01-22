# Abstract Classes/Methods and Polymorphism
## Abstract Classes
### An abstract class in Java is a class that is never instantiated. Its purpose is to be a parent to several related classes. The children classes inherit from the abstract parent class.
#### Abstract class definition:
    abstract class ClassName
    {

    . . . . .  // definitions of methods and variables

    }
---
## Abstract Methods
### This is the complete definition of this abstract class. Notice the abstract method. Abstract classes can (but don't have to) contain abstract methods. Also, an abstract class can contain non-abstract methods, which will be inherited by the children.
    abstract class Card
    {
    protected String recipient;      // name of who gets the card
    public abstract void greeting();  // abstract greeting() method
    }

### An abstract method has no body. (It has no statements.) It declares an access modifier, return type, and method signature followed by a semicolon. A non-abstract child class inherits the abstract method and must define a non-abstract method that matches the abstract method.
---
## Polymorphism
### Polymorphism is when a variable of a base type (like Automobile) can refer to various derived types (like Nissan or Sentra) as needed.
#### Polymorphism example:
    Card crd = new YouthBirthday( "Sophia", 7 );
    crd.greeting();

    crd      = new AdultBirthday( "Walter", 47 );
    crd.greeting();

    crd      = new Birthday( "Zoe", 30 );
    crd.greeting();

#### crd is used multiple times for 3 different classes.