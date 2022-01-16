public class input_using_command_line {
    public static void main(String[] args){
        if(args.length > 0){
            System.out.println("The Command line arguement are");

        for (String str :args){
            System.out.println(str);
        }
        }
        else{
            System.out.println("No value enteres at command line");
        }

    }
}
