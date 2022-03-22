package com.harman.annotations;

public class User {

    void display()
    {
        System.out.println("This is a Parent Class");
    }

    @Deprecated
    void test()
    {
        System.out.println("Testing..... "); // This can be giving a warning to the user !!!
    }
}

class S_class extends User
{
    @Override
    void display()   // Use Ctrl O for this method to getting !!!
    {
        super.display();
    }

    public @interface NewAnnotation
    {
        int age() default 18;
        String name();
    }
    @NewAnnotation(name = "Sherlock", age = 21)


    public static void main(String[] args) {
        S_class c_obj = new S_class();
        c_obj.test();

        @SuppressWarnings("unused")
        int y;
    }
}
