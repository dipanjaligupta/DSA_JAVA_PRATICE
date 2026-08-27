// public class FirstEx{
//     public static void main(String args[]){
//         Pen p1 = new Pen();
//         p1.setcolor("blue");
//         System.out.println(p1.color); 
//     }
// }

// class Pen{
//     String color;
//     int trip;
//     void setcolor(String newcolor){
//         color = newcolor;
//     }
//     void settrip(int newtrip){
//         trip = newtrip;
//     }
// }
// class Student {
//     String name;
//     int age;
//     float percentage;
//     void calcPercentage(int pyh,int chem,int math)
//     percentage = (pyh + chem + math) /3;
// }
// 
//  //con
public class FirstEx{
    public static void main(String args[]){
       Student s1 = new Student("dipa");
        System.out.println(s1.name); 
    }
}
class Student{
    String name;
    int roll;
    //Constutor
    Student(String name){
        this.name = name;
    }
}
