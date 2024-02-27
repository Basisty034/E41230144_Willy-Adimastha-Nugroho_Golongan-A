package Tugas;

public class CallThis {
    class A{
        void callthis(){
            System.out.println("Inside Class A's Method!");
        }
    }
    class B extends A{
        void callthis(){
            System.out.println("Inside Class B's Method!");
        }
}
    class C extends A{
        void callthis(){
            System.out.println("Inside Class C's Method!");
        }
    }
   public static void main(String args[]) {
        CallThis callThis = new CallThis(); 
        A a = callThis.new A(); 
        B b = callThis.new B(); 
        C c = callThis.new C();         A ref;

        ref = b;
        ref.callthis();

        ref = c;
        ref.callthis();

        ref = a;
        ref.callthis();
    }
    }



