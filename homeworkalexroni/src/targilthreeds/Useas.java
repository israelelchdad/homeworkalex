package targilthreeds;

public class Useas implements Runnable{
    private String name;
    private countbank conut;
   private double msica;
    private double afkada;


    public Useas(String name, countbank conut){//, double msica, double afkada) {
        this.name = name;
        this.conut = conut;
//       this.msica = msica;
//        this.afkada = afkada;
//        Thread t=new Thread(this);
//        t.start();
    }
    public void mshichandandhafkada(double msi,double haf){
        this.msica=msi;
        this.afkada=haf;
        Thread t=new Thread(this);
        t.start();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public countbank getConut() {
        return conut;
    }

    public void setConut(countbank conut) {
        this.conut = conut;
    }

    @Override
    public String toString() {
        return "Useas{" +
                "name='" + name + '\'' +
                ", conut=" + conut +
                '}';
    }

    @Override
    public  void run() {
        synchronized (this.conut) {
            this.conut.hafkada(this.afkada);
            System.out.println(this.name + "  " + Thread.currentThread().getName() + " " + this.conut.getMony());
            this.conut.mehicha(this.msica);
            System.out.println(this.name + " " + Thread.currentThread().getName() + " " + this.conut.getMony());

        }
    }
}
