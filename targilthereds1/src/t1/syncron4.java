package t1;

public class syncron4 extends Thread {


    public syncron4(String s) {
        super(s);
        }

    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            printeAline(i,this.getName());

        }
    }

    public  synchronized static void printeAline(int i, String name) {

            System.out.println(i+" )");
            for (int j = 0; j <7 ; j++) {
                System.out.print(name);

                System.out.println();
            }
        System.out.println("no syncrone");

            System.out.println(i+" )");
            for (int j = 0; j <7 ; j++) {
                System.out.print(j);


            System.out.println();
        }
    }

    public static void main(String[] args) {

        syncron4 t1=new syncron4("a");
        syncron4 t2=new syncron4("b");
        t1.start();
        t2.start();

    }
}
