# Software Design Patterns


### Strategy
Defines a family of Algorithm, encapsulates each one, and make them interchangeable
Allows passing different algorithms (behaviours) to an object.

### Observer
Defines one to many dependency between objects so when one object changes state, all of its dependents notified and updated automatically. 
Allows an object notify other objects when its state changes.

### Decorator
Attaches additional responsibilities to an object dynamically. Decorators provide the alternative to subclassing for extending functionality.

### Factory Method
Defines an interface for creating an object, but lets subclasses decide which class to instantiate. 
Factory Method lets a class defer instantiation to subclasses.

### Abstract Factory
Provides an interface for creating a families of related or dependent objects without specifying their concrete classes.

### Singleton
Ensures a class has only one instance, and provides a global point of access to it.

### Command
Allows decouple a sender from a receiver. The sender will talk to the receiver through a command. Commands can be undone and persisted.
Encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.

### Adapter
Converts the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
Two types: Object Adapter (Uses Object composition to Adapt the Adaptee) and Class Adapter (It subclass the Adaptee and Target classes).
### Facade
Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level of interface that makes the subsystem easier to use. 

### Template Method
Defines the steps/skeleton of an algorithm and allows the subclasses to provide the implementation for one or more steps.
Lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure.

### Iterator
Allows traversal of the elements of an aggregate without exposing the underlying implementation.
Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
Allows iterating over an object without having to expose the object’s internal structure (which may change in the future) be implemented in subclasses.

### Composite
Allows you to compose objects into tree structure to represent part-whole hierarchies. Composite lets client treat individual objects and compositions of object uniformly.

### State
Allows an object to alter its behaviour when its internal state changes. The object will appear to change its class.
Allows an object to behave differently depending on the state it is in.

### Proxy
Provides a representative or placeholder for another object to control access to it.

### Memento: 
Allows restoring an object to a previous state.


### Mediator:
Allows an object to encapsulate the communication between other
objects.

### Chain of Responsibility:
Allows building a chain of objects to process a
request.

### Visitor:
Allows adding new operations to an object structure without
modifying it.


### Bullet Points:
- An Adapter wraps an object to change its interface, a Decorator wraps an object to add new behaviors and responsibilities, and a Facade “wraps” a set of objects to simplify.