package day1;

public class variableConcepts
{
    /*
    Instance variables or class variables
    1.variables declared inside the class
    2.variables will have default value when no value is initialized.
    3.It can be static,final
    4.It can be accessed through the class using object.
    */

    int a=100;
    String b;
    boolean c;

    //static Variable
    static int d=7000;

     /*Local variable
    1.Local variable cannot be accessed outside the method.
    2.local variable should be initialised.
    3.It cannot be static,final.
     */
    public void printName()
    {
        String name="Kalpana";
        System.out.println("Local variable:"+name);
    }

    public static void main(String[] args)
    {
        //creating an object
        // ClassName objectName=new classname();
        variableConcepts objects=new variableConcepts();
        System.out.println(" Value of integer"+ objects.a);
        System.out.println("value of string variable:" + objects.b);
        System.out.println("value of boolean:"+ objects.c);
        objects.printName();
        //acessing static variable
        System.out.println(d);



    }


}
