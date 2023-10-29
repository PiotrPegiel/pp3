public class Student {
    String name;
    int age;
    //19
    String ID_card;
    boolean is_card_valid;
    float avg_grade;
    byte semester_nr;

    //16
    void sayHello(){
        System.out.println("Hello from "+name);
    }
    void displayName(){
        System.out.println(name);
    }
    void displayAge(){
        System.out.println(age);
    }

    //19
    void displayNameSemesterGrade(){
        System.out.println("Name: "+name+", Semester nr: "+semester_nr+", Average grade: "+avg_grade);
    }
    void switchCardStatus(){
        is_card_valid = ! is_card_valid;
    }
    void displayNameID(){
        System.out.println("Name: "+name+", ID: "+ID_card+ (is_card_valid ? " valid":" invalid"));
    }
}
