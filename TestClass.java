class Student{
  int id;
  String name;
}
class TestClass{
  public static void main (String []args){
    Student s1=new Student();
    s1.id=2;
    s1.name='Mukesh';
    System.out.println(s1.id+" "+s1.name);
  }
}
