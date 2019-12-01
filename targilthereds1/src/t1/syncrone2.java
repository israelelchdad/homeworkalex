package t1;

public class syncrone2 extends Thread {
    private Object o;


    public syncrone2(String s,Object o) {
        super(s);
        this.o = o;

    }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            printeAline(i,this.getName(),o);

        }
    }

    public static void printeAline(int i, String name, Object o) {
        synchronized (o){
            System.out.println(i+" )");
            for (int j = 0; j <7 ; j++) {
                System.out.print(name);

            }
            System.out.println();
        }
        System.out.println("no syncrone");
        synchronized (o){
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

        syncrone2 t1=new syncrone2("a",o1);
        syncrone2 t2=new syncrone2("b",o2);
        t1.start();
        t2.start();

    }
}
