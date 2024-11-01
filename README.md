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

### Command:
Allows decouple a sender from a receiver. The sender will talk to the receiver through a command. Commands can be undone and persisted.
Encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests, and support undoable operations.

### Memento: 
Allows restoring an object to a previous state.

### State: 
Allows an object to behave differently depending on the state it is in.

### Iterator:
Allows iterating over an object without having to expose the object’s
internal structure (which may change in the future).
be implemented in subclasses.


### Mediator:
Allows an object to encapsulate the communication between other
objects.

### Chain of Responsibility:
Allows building a chain of objects to process a
request.

### Visitor:
Allows adding new operations to an object structure without
modifying it.