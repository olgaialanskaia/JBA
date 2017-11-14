package accessmodifiers.mprivate.testPrivateConstructor;

public class ShouldFailWhenCreatePrivateConstructor {

    public static void main(String args[]) {

        ClassUnderTest obj = new ClassUnderTest();//Compile Time Error
    }
}


/**

 Expected Results:

 - IDE complies with Java rule, errors are shown

 Verify that:

 - a compile Time Error is shown in a form of tooltip with a clear message
 - a squiggly line appears under a faulty code declaration
 - a squiggly line appear in the left panel of the project structure, the package, the parent package all the way up to the root

 */
