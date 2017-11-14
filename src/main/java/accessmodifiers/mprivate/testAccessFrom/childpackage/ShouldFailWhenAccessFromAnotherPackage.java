package accessmodifiers.mprivate.testAccessFrom.childpackage;

import accessmodifiers.mprivate.testAccessFrom.ClassUnderTest;

public class ShouldFailWhenAccessFromAnotherPackage {

    public static void main(String args[]){
        ClassUnderTest obj=new ClassUnderTest();
        System.out.println(obj.data); //Compile Time Error
        obj.msg(); //Compile Time Error
    }

}

/**

 Expected Results:

 - IDE complies with Java rule, errors are shown

 Verify that:

 - a compile Time Error is shown in a form of tooltip with a clear message
 - a squiggly line appears under a faulty code declaration
 - a squiggly line appear in the left panel of the project structure, the package, the parent package all the way up to the root
 - running main method fails compilation
 - errors shown in the "message make" panel with line numbers where error occurred with a descriptive message

 */


