# MVP

## Dagger 2 implementation

#### To understand Dagger 2 it is important (and probably a bit hard in the beginning) to know about the fundamentals of dependency injection and the concepts of each one of these guys:

###### @Inject: Basically with this annotation we request dependencies. In other words, you use it to tell Dagger that the annotated class or field wants to participate in dependency injection. Thus, Dagger will construct instances of this annotated classes and satisfy their dependencies.

###### @Module: Modules are classes whose methods provide dependencies, so we define a class and annotate it with @Module, thus, Dagger will know where to find the dependencies in order to satisfy them when constructing class instances. One important feature of modules is that they have been designed to be partitioned and composed together (for instance we will see that in our apps we can have multiple composed modules).

###### @Provide: Inside modules we define methods containing this annotation which tells Dagger how we want to construct and provide those mentioned dependencies.

###### @Component: Components basically are injectors, let’s say a bridge between @Inject and @Module, which its main responsibility is to put both together. They just give you instances of all the types you defined, for example, we must annotate an interface with @Component and list all the @Modules that will compose that component, and if any of them is missing, we get errors at compile time. All the components are aware of the scope of dependencies it provides through its modules.

###### @Scope: Scopes are very useful and Dagger 2 has has a more concrete way to do scoping through custom annotations. We will see an example later, but this is a very powerful feature, because as pointed out earlier, there is no need that every object knows about how to manage its own instances. An scope example would be a class with a custom @PerActivity annotation, so this object will live as long as our Activity is alive. In other words, we can define the granularity of your scopes (@PerFragment, @PerUser, etc).

###### @Qualifier: We use this annotation when the type of class is insufficient to identify a dependency. For example in the case of Android, many times we need different types of context, so we might define a qualifier annotation “@ForApplication” and “@ForActivity”, thus when injecting a context we can use those qualifiers to tell Dagger which type of context we want to be provided.

