package com.harman.annotations;

import java.util.ArrayList;

public class Suppress_Base {

    void display() {
        System.out.println("This is a Parent Class");
    }
}

//@SuppressWarnings("No Error")

class Child_class extends Suppress_Base
{
    @Override
    void display()   // Use Ctrl O for this method to getting !!!
    {
        super.display();
    }

    public static void main(String[] args)
    {
        Child_class c_obj = new Child_class();
        c_obj.display();

        @SuppressWarnings("unused")
                int y;

//        @SuppressWarnings("rawtypes")
//                List x = new ArrayList();
    }
}
