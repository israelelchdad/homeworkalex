package t1;

public class sybcrone3 extends Thread {
    private Object o1;
    private Object o2;

    public sybcrone3(String s,Object o1,Object o2) {
        super(s);
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            printeAline(i,this.getName(),o1,o2);

        }
    }

    public static void printeAline(int i, String name, Object o1,Object o2) {
        synchronized (o1){
            System.out.println(i+" )");
            for (int j = 0; j <7 ; j++) {
                System.out.print(name);

            }
            System.out.println();
        }
        System.out.println("no syncrone");
        synchronized (o2){
            System.out.println(i+" )");
            for (int j = 0; j <7 ; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=new Object();
        sybcrone3 t1=new sybcrone3("a",o1,o2);
        sybcrone3 t2=new sybcrone3("b",o1,o2);
        t1.start();
        t2.start();

    }
}
