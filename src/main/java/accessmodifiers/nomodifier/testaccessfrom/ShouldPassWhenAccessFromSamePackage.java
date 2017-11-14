package accessmodifiers.nomodifier.testaccessfrom;

public class ShouldPassWhenAccessFromSamePackage {

    public static void main(String args[]){
        ClassUnderTest obj = new ClassUnderTest();//Compile Time Error
        obj.msg();//Compile Time Error
    }

    }

/**

 Expected Results:

 - IDE complies with Java rule, errors are NOT thrown

 Verify that:

 - verify that Compile Time Errors NOT displayed


 */
