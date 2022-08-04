package Exception;

class Test {
    int a; //200

    public void method(){
        System.out.println("Hello");
    }
}

public class SuperKeyword extends Test {
    public void print1() {
        // int a = 300
        System.out.println(a + " print1"); //300
    }

    public void print2() {
        System.out.println(super.a + " Super A"); //200
    }

    public void method2(){

        super.method();
        System.out.println("Hallo");
    }

    public static void main(String[] args) {
        Test obj1 = new Test();

        obj1.a = 300;

        SuperKeyword obj2 = new SuperKeyword();

        obj2.a = 400;
        obj2.print1(); //300
        obj2.print2();
        obj2.method2();


    }


}
