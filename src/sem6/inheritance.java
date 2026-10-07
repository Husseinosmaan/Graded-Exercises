package sem6;

class Student{
    String name;
    String ID;
    void display(){
        System.out.println("Student Name:" + name);
        System.out.println("Student ID:" + ID);
    }
}
class GraduatingStudent extends Student{
    String ProjectTitle;
    void show(){
        System.out.println("Students ProjectTitle is:"+ProjectTitle);
    }
}

public class inheritance {
    static void main(){
        GraduatingStudent s1=new GraduatingStudent();
        s1.name="faaizo";
        s1.ID="c1230431";
        s1.ProjectTitle="AI Machine";
        s1.display();
        s1.show();
    }
}
