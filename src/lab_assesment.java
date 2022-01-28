import java.util.Scanner;
class films{
    Scanner s=new Scanner(System.in);
    String fname,production_comapany,language;
    int f_id,no_of_frames;
    public void get_film_data(){
        System.out.println("Enter the name of the film");
        fname=s.nextLine();
        System.out.println("Enter the id of the film");
        f_id=s.nextInt();
        System.out.println("Enter the no. of frames of the film");
        no_of_frames=s.nextInt();
        System.out.println("Enter the name of production company of the film");
        production_comapany=s.nextLine();
        production_comapany=s.nextLine();
        System.out.println("Enter the name of language of the film");
        language=s.nextLine();
    }
    public void show_film(String substring){
        if(language.equalsIgnoreCase(substring)==true) {
            System.out.println(fname);
        }
    }
}
public class lab_assesment {
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no. of films to be created");
        String sub_string;
        int n=s.nextInt();
        films[] f=new films[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the details of  "+(i+1)+"  film");
            f[i]=new films();
            f[i].get_film_data();

        }
        System.out.println("Enter the language of the film to be searched ");
        sub_string=s.nextLine();
        sub_string=s.nextLine();
        System.out.println("-----------*******************-----------");
        System.out.println("The names of the fims which have language as "+sub_string+" are ");
        for(int i=0;i<n;i++){
            f[i].show_film(sub_string);

        }

    }
}
