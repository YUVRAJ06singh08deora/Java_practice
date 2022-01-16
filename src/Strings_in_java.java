public class Strings_in_java {
    public static void main(String arg[]){
        // Using String Literal
        String s="Yuvraj Singh Deora";
        // using new keyword
        String s1= new String("Yuvraj SINGH DEORa");
//        s="aditya";
        System.out.println(s);
        System.out.println("Using new Keyword = "+s1);
        // String Buffer
        StringBuffer str1=new StringBuffer("hadmatiya");
        System.out.println(str1);
        // String Builder
        StringBuilder str2 = new StringBuilder();
        str2.append("VAlue");
        System.out.println(str2);
        

    }
}
