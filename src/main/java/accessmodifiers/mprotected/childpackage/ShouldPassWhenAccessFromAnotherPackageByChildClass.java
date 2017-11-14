package accessmodifiers.mprotected.childpackage;

import accessmodifiers.mprotected.ClassUnderTest;

public class ShouldPassWhenAccessFromAnotherPackageByChildClass extends ClassUnderTest {

    public static void main(String args[]){
        ShouldPassWhenAccessFromAnotherPackageByChildClass obj = new ShouldPassWhenAccessFromAnotherPackageByChildClass();
        obj.msg();
    }
}

/**

 Expected Results:

 - IDE complies with Java rule, errors are NOT thrown

 Verify that:

 - verify that Compile Time Errors NOT displayed


 */
