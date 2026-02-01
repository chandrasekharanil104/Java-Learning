package dev.Interfaces;

interface Test{
    void meth1();
    void meth2();
}

 class MyClass implements Test{
    public void meth1(){
        System.out.println("Implementation of meth1");
    }

    public void meth2(){
        System.out.println("Implementation of meth2");
    }

    public void meth3(){
        System.out.println("Implementation of meth3");
    }
}

public class InterfaceMethod {
    public static void main(String[] args){
        Test t = new MyClass();

        t.meth1();
        t.meth2();

        MyClass myClass = new MyClass();
        myClass.meth3();

    }
}
