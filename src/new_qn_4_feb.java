import java.util.Scanner;
interface area1
{

    void area1();
}
interface volume extends area1{


    void volume();
}
    class cuboid implements volume
    {
        Scanner s=new Scanner(System.in);
        int length;
        int breadth;
        int height;
        int volume;
        int area;
        String video_quality;
        public void area1()
        {
            System.out.println("length");
            length=s.nextInt();
            System.out.println("Bradth");
            breadth=s.nextInt();
            area=length*breadth;
            System.out.println("ARea is");
            System.out.println(area);

        }
        public void volume()
        {
            System.out.println("Height");
            height=s.nextInt();
            volume=area*height;
            System.out.println("Cuboid is");
            System.out.println(volume);


        }

    }

public class new_qn_4_feb {

    public static void main(String[] args) {
        cuboid c = new cuboid();
        c.area1();
        c.volume();


    }
}
