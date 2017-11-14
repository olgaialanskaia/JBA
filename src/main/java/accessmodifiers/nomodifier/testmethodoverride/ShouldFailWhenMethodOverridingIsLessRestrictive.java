package accessmodifiers.nomodifier.testmethodoverride;

public class ShouldFailWhenMethodOverridingIsLessRestrictive extends ClassUnderTest {

    void msg() {  // Time Compiler Error
        System.out.println("Hello java");

    }

    public static void main(String args[]){
        ShouldFailWhenMethodOverridingIsLessRestrictive obj=new ShouldFailWhenMethodOverridingIsLessRestrictive();
        obj.msg();
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