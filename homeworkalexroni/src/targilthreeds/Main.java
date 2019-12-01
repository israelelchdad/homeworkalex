package targilthreeds;

public class Main {
    public static void main(String[] args) {
        countbank a=new countbank("451027");

//        Useas avi=new Useas("AVI",a,200.5,350);
//        Useas dani=new Useas("dani",a,1400,459);
//        Useas ali=new Useas("ali",a,1500.3,499);
        Useas avi=new Useas("AVI",a);
        Useas dani=new Useas("dani",a);
        Useas ali=new Useas("ali",a);
        avi.mshichandandhafkada(200.5,350);
        dani.mshichandandhafkada(1400,459);
        ali.mshichandandhafkada(1500.3,499);


//        avi.getConut().hafkada(134567);
//        System.out.println(Thread.currentThread().getName()+" "+avi.getConut().getMony());

    }
}
