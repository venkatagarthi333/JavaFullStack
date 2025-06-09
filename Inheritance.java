class Base 
{
    int id;
    String name;
    String roll;
}
    class SubClass1 extends Base
    {
        void print( int id,String name)
        {
            System.out.println("id :"+id);
            System.out.println("name :"+name);
        }
    }
    class SubClass2 extends Base
    {
        void print( int id,String name,String roll)
        {
            System.out.println("id :"+id);
            System.out.println("name :"+name);
            System.out.println("roll :"+roll);
        }
    }

    class Inheritance
    {
       public static void main(String[] args) 
        {

            SubClass1 ob1=new SubClass1();
            ob1.print(1,"abc");
            SubClass2 ob2=new SubClass2();
            ob2.print(1,"abc","23a85a0514");
            
        }
    }

