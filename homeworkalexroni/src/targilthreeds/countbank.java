package targilthreeds;

import java.util.concurrent.locks.ReentrantLock;

public class countbank {

    private String ID;
    private double mony=5000;

    public String getID() {
        return ID;
    }
    public void printID() {
        System.out.println(this.ID);
    }


    public void setID(String ID) {
        this.ID = ID;
    }

    public double getMony() {
        return mony;
    }

    public void  hafkada(double mony) {
        ReentrantLock w=new ReentrantLock();
        w.lock();
        this.mony += mony;
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getName());
        w.unlock();

        }
    public synchronized void mehicha(double mony) {
        this.mony -= mony;
    }

    public void setMony(double mony) {
        this.mony = mony;
    }

    public countbank(String ID) {

        this.ID = ID;
    }

    @Override
    public String toString() {
        return "countbank{" +
                "ID='" + ID + '\'' +
                ", mony=" + mony +
                '}';
    }
}
