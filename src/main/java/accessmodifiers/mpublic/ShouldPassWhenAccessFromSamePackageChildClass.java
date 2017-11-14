package accessmodifiers.mpublic;


import accessmodifiers.mprotected.ClassUnderTest;

public class ShouldPassWhenAccessFromSamePackageChildClass extends ClassUnderTest {

    public static void main(String args[]){
        ShouldPassWhenAccessFromSamePackageChildClass obj = new ShouldPassWhenAccessFromSamePackageChildClass();
        obj.msg();
    }
}

/**

 Expected Results:

 - IDE complies with Java rule, errors are NOT thrown

 Verify that:

 - verify that Compile Time Errors NOT displayed


 */

