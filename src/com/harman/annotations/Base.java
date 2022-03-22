package com.harman.annotations;

public class Base {

    void display() {
        System.out.println("This is a Parent Class");
    }
}

class Child extends Base
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
        }
    }
