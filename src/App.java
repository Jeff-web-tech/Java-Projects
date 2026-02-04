public class App {
    public static class Student {
        private String name;
        private int age;
        private double grade;

        public Student(String name, int age, double grade){
            this.name = name;
            this.age = age;
            setGrade(grade);
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public double getGrade(){
            return grade;
        }

        public void setGrade(double grade){
            if(grade>=0 && grade<=100){
                this.grade = grade;
            } else {
                System.out.println("Error: Grade must be between 0 and 100.");
            }
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Ama", 19, 85);
        System.out.println("First Grade: " + s1.getGrade());

        s1.setGrade(190);

        s1.setGrade(45);
        System.out.println("Final Grade: " + s1.getGrade());
    }
}
