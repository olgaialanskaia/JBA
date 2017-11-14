package accessmodifiers.mprotected;


public class ShouldPassWhenAccessFromSamePackageByChildClass extends ClassUnderTest {

    public static void main(String args[]){
        ShouldPassWhenAccessFromSamePackageByChildClass obj = new ShouldPassWhenAccessFromSamePackageByChildClass();
        obj.msg();
    }
}

/**

 Expected Results:

 - IDE complies with Java rule, errors are NOT thrown

 Verify that:

 - verify that Compile Time Errors NOT displayed


 */

