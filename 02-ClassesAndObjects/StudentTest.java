public class StudentTest {
    public static void main(String[] args) {
        //15
        Student student1 = new Student();

        student1.name = "Adam";
        student1.age = 22;
        System.out.println(student1.name+" "+student1.age);

        //18
        student1.sayHello();
        student1.displayName();
        student1.displayAge();

        Student student2 = new Student();
        student2.name = "Aga";
        student2.age = 20;

        student2.sayHello();
        student2.displayName();
        student2.displayAge();

        //19
        Student student3 = new Student();
        Student student4 = new Student();

        student3.name = "BoringGuy";
        student4.name = "BoringLady";
        student3.avg_grade = 3.6f;
        student4.avg_grade = 5.5f;
        student3.semester_nr = 3;
        student4.semester_nr = 6;
        student3.ID_card = "0122";
        student4.ID_card = "5555";
        student3.is_card_valid = false;
        student4.is_card_valid = true;

        student3.displayNameSemesterGrade();
        student3.switchCardStatus();
        student3.displayNameID();

        student4.displayNameSemesterGrade();;
        student4.switchCardStatus();
        student4.displayNameID();
    }
}
