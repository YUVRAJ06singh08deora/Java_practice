class college
{
    String name = "VIT university";
    class mtech
    {

        String mname="M.Tech";
        void show()
        {
            System.out.println(name);
        }
    }
//mtech m = new mtech();

}



public class class4Feb {
    public static void main(String a[])
    {
        college c = new college();
        System.out.println(c.name);

        college.mtech cm = c.new mtech();
        System.out.println(cm.mname);
        cm.show();

    }

}