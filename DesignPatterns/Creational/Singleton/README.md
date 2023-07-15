### What is Singleton Design Pattern?

The singleton pattern is a design pattern that restricts the instantiation of a class to one object.
The singleton design pattern ensures :-
- A class has only one instance, and provide a global point of access to it.
- Encapsulated "just-in-time initialization" or "initialization on first use".

We need to make the class of the single instance object responsible for creation, initialization, access, and enforcement. Declare the instance as a private static data member. Provide a public static member function that encapsulates all initialization code, and provides access to the instance.

The client calls the accessor function (using the class name and scope resolution operator) whenever a reference to the single instance is required.

### Benefits
- Reduced memory usage as only one object is created.
- It can simplify the access and control of a shared resource, by providing a single point of access.


### Checklist
Singleton should be considered only if all three of the following criteria are satisfied:
- Ownership of the single instance cannot be reasonably assigned
- Lazy initialization is desirable
- Global access is not otherwise provided for

#### Singleton in Java :-
- [Ways to implement Singleton in Java](https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples)
- [How to prevent Singleton Pattern from Reflection, Serialization and Cloning?](https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-serialization-cloning/)


### Class Stucture
![img.png](img.png)

### Comparisions
- A Facade class can often be transformed into a Singleton since a single facade object is sufficient in most cases.
- Flyweight would resemble Singleton if you somehow managed to reduce all shared states of the objects to just one flyweight object. But there are two fundamental differences between these patterns:
    - There should be only one Singleton instance, whereas a Flyweight class can have multiple instances with different intrinsic states.
    - The Singleton object can be mutable. Flyweight objects are immutable.
- Abstract Factories, Builders and Prototypes can all be implemented as Singletons.
- When is Singleton unnecessary? Short answer: most of the time. Long answer: when it's simpler to pass an object resource as a reference to the objects that need it, rather than letting objects access the resource globally. The real problem with Singletons is that they give you such a good excuse not to think carefully about the appropriate visibility of an object. Finding the right balance of exposure and protection for an object is critical for maintaining flexibility.