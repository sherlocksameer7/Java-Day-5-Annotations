package com.harman.annotations;

public class Depre
{

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

class sub_class extends Depre
{


    @Override
    void display()   // Use Ctrl O for this method to getting !!!
    {
        super.display();
    }



    public static void main(String[] args) {
        sub_class c_obj = new sub_class();
        c_obj.test();

        @SuppressWarnings("unused")
        int y;
    }
}