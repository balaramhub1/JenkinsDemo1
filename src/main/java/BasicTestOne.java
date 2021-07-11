public class BasicTestOne{
    
    public static void main(String[] args) {
        System.out.println("Hi this is a test java program");
        class_Method_Details();
    }
    
    public static void class_Method_Details() {
        Class classObj=new Object() {}.getClass();
        System.out.println("Current Class is : "+classObj.getEnclosingClass().getName()+" and Method is : "+classObj.getEnclosingMethod().getName()+"()");
    }
}