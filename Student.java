public class Student 
{
    int id;
    String name;
    static String college="svec";
    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void print()
    {
        System.out.println("id :"+id);
        System.out.println("name :"+name);
        System.err.println("college:"+college);
    }
    public static void main(String[] args) 
    {
        Student ob1=new Student(1,"abc");
        Student ob2=new Student(2,"defg");
        ob1.print();
        ob2.print();
    } 
}
