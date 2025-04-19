 class Person {
    String name;
    int age;

   public Person(String name , int age) {
        this.name = name;
        this.age = age;
        }
    }
 class Student extends Person {
    int rollNumber;

   Student(String name , int age,int rollNumber) {
        super(name,age);
        this.rollNumber=rollNumber;

    }
    public void printDetails(){
        System.out.println("name is :"+ this.name +" " +"age is:" + this.age + " " + "rollNumber is:" + this.rollNumber);
    }
    public static void main(String[] args) {
        Student st1 = new Student("Yogita",20,124);
        st1.printDetails();
        Student st2 = new Student("Yashika",20,74);
        st2.printDetails();
        Student st3 = new Student("Swati",20,110);
        st3.printDetails();
        }
 
}
