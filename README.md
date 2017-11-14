# Java Access Modifiers with Intellij IDEA IDE test suite

 **Task**

1. Write a set of test cases to verify that IDE handles access modifiers correctly.
2. Example: if there's an attempt to access private method check that there's an error. 
3. The result should contain set of test classes which cover all possible cases.

**Documentation Requirements**

 1. https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
 2. https://www.javatpoint.com/access-modifiers
 
 **Test Organization**
 
 1. Each test directory contains a ClassUnderTest.java
    - with the exception of test directories that do not require creation of a separate ClassUnderTest
 2. Each test directory contains a Class that verifies expected behavior when calling a ClassUnderTest, e.g. ShouldFailWhenAccessFromAnotherPackage
    - verification steps provided as comments inside of Should... Class
 3. Some test directories have childpackage directory that stores a Should.. Class that verifies expected behavior when calling a ClassUnderTest from a different package
 4. Not all permutations of Java access modifiers rules have been covered in this version
 
 **_Test cases:_**
 
 * Private access modifier
    - ShouldFailWhenAccessFromAnotherPackage
    - ShouldFailWhenAccessFromAnotherClass
    - ShouldFailWhenAccessFromSubclass
    - ShouldPassWhenAccessFromInnerClass
    - ShouldFailWhenCreatePrivateClass
    - ShouldFailWhenCreatePrivateConstructor
    - ShouldFailWhenCreatePrivateInterface

 * Protected access modifier
    - ShouldPassWhenAccessFromAnotherPackageByChildClass
    - ShouldPassWhenAccessFromSamePackageByChildClass
 
 * Public access modifier
    - ShouldPassWhenAccessFromSamePackageChildClass
    
 * Public access default/not-specified modifier
     - ShouldFailWhenAccessFromAnotherPackage
     - ShouldPassWhenAccessFromSamePackage
     - ShouldFailWhenMethodOverridingIsLessRestrictive
     
 **Test Execution**
 
 1. Set up this repo on your local environment
 2. Read Java doc to refresh your memory on Java Access Modifiers
 3. Start executing test by going into
    - /Users/ialanskaia/Desktop/Docs/relayr/JBA/src/main/java/accessmodifiers
    - Open a Should... class
    - Read execution steps and expected results
    - Execute the test
    - Report issues
     
 **Next Steps**
 * Add more scenarios to verify that
     - corresponding access modifiers icons next to a class file as per https://www.jetbrains.com/help/idea/symbols.html
     - private members of the class can be accessed if getter and setters available
     - when moving classes to a different location (with drag-and-drop) from packages a warning message is present
     - using undo and redo options code sets the access modifier to a previous/next state 
     - (Private) ShouldFailWhenAccessFromSubclassAnotherPackage
     - (Protected) ShouldFailWhenAccessFromAnotherPackageByClass
     - (Protected) ShouldPassWhenAccessFromAClassSamePackage
     - (Protected) ShouldPassWhenAccessFromInnerClass
     - (Protected) ShouldFailWhenCreateProtectedClass
     - (Protected) ShouldPassWhenCreateProtectedInnerClass
     - (Public) ShouldPassWhenAccessFromAnotherPackage
     - (Public) ShouldPassWhenAccessFromAnotherPackageChildClass
     - (Public) ShouldPassWhenAccessFromFromInnerClass
     - (Default) ShouldFailWhenAccessFromAnotherPackageChildClass
     - (Default) ShouldFailWhenAccessFromInnerClass
     