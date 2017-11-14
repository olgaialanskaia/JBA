package accessmodifiers.mprivate.testInnerClass;


public class ShouldPassWhenAccessFromInnerClass {
    private int data = 40;
    private void msg(){
                System.out.println("Hello java");
        }


private class InnerClass {
    ShouldPassWhenAccessFromInnerClass obj=new ShouldPassWhenAccessFromInnerClass();

    public void printParentValue() {
        System.out.println(obj.data); // Compile Time Error IS NOT Thrown!
        obj.msg(); // Compile Time Error IS NOT Thrown!
    }
}

}

/**

 Expected Results:

 - IDE complies with Java rule, errors are NOT thrown

 Verify that:

 - verify that Compile Time Errors NOT displayed


 */


