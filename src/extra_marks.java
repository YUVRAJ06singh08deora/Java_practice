import java.util.Scanner;

//[09:47] Anitha  A
////write a java program to create a class called father with name as attribute.
////create another class called mother with againt the name as attribute
////create a child class called children which inherits both the name of father and mother class
////and display the parent detail of a child (multiple)//write a java program to create two parent class called father and mother.
////create a child class called children who inherit the properties of the fathe and mother
//interface father
//{
//    void father_character();
//}
//interface mother
//{
//    void mother_character();
//}class children implements father,mother
//{
//    public void father_character()
//    {
//        System.out.println("left hander");
//    }
//    public void mother_character()
//    {
//        System.out.println("blue eyes");
//    }
//}
//public class multipleinheritance {
//    public static void main (String ar[])
//    {
//        children c = new children();
//        c.father_character();
//        c.mother_character();
//    }
//}
//
//[09:49] Anitha  A
//        1.write a java program to create two parent class called audio and video. create another class called movie to inherit the audio details and the video details clubbed to have the details for a unpcoming movie.
//
interface audio
{
    void audio_details();
}
interface video
{
    void video_details();
}



class movie implements audio,video
{
    Scanner s=new Scanner(System.in);
    int audio_len;
    String video_quality;
    public void audio_details()
    {
        System.out.println("Audio length");
        audio_len=s.nextInt();

    }
    public void video_details()
    {
        System.out.println("video quality");
        video_quality=s.next();


    }
    public void movie(){
        System.out.println("Audio length :  "+audio_len+"  video quality :  "+video_quality);
    }
}
public class extra_marks {
    public static void main (String ar[])
    {
        movie c = new movie();
        c.audio_details();
        c.video_details();
        c.movie();
    }

}
