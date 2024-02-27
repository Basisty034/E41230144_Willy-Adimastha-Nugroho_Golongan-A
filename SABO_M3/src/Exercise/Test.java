package Exercise;

public class Test {
    private int i = 0;
    
    class TestInner {
        public int i = 1;
        void sayHi(){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        TestInner inner = new Test().new TestInner();
        inner.sayHi();
    }
}
