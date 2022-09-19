class Student{
    String name;
    int age;
    int no;
    
    Student (String name, int age, int no ){
        this.name=name;
        System.out.println("\n");
        this.age=age;
        System.out.println("\n");
        this.no=no;
        
    }
public void printInfo(){
 System.out.println(this.name);
 System.out.println(this.age);
 System.out.println(this.no);
}
}
class OOP{
    public static void  main(String[]args){
        Student s1=new Student("vipul", 12, 30);

        s1.printInfo();
        
    }
}