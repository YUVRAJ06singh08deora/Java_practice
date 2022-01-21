import java.util.*;
class reservation{
    int nop;
    String date,source,destination;
    Scanner s=new Scanner(System.in);
    void input(){
        nop=s.nextInt();
        date = s.next();
        source = s.next();
        destination =s.next();
        bus(nop);
        train(nop);
    }
    void bus(int tp){
        float distance =s.nextFloat();
        float fare=distance*2.00f*tp;
        System.out.println(fare);
    }
    void train(int tnp){
        float distance =s.nextFloat();
        float fare=distance*1.50f*tnp;
        System.out.println(fare);
    }


}
public class railway {
    public static void main(String[] arg){
        reservation r1=new reservation();
        r1.input();

    }
}
