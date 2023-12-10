public class C6 {
    private String name;
    private float grade;
    private boolean passed;


    public void setName(String name) {
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        this.name = name;
    }
    public void setGrade(float grade) {
        if (grade == 2f || grade == 3f || grade == 4f || grade ==5f) {
            this.grade = grade;
        }
    }
    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public String getName() {
        return name;
    }
    public float getGrade() {
        return grade;
    }
    public boolean isPassed() {
        return passed;
    }


    public static void main(String[] args) {
        C6 s = new C6();
        s.setName("broWN");
        System.out.println(s.getName());
        s.setGrade(4);
        System.out.println(s.getGrade()); //4
        s.setGrade(6);
        System.out.println(s.getGrade()); //4
    }
}
