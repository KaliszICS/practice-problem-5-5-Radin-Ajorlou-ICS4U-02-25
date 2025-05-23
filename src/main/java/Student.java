class Student implements Comparable<Student>{
    
    private String name;
    private int age;
    private String studentNumber;

    public Student(String name, int age, String studentNumber){
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getStudentNumber(){
        return this.studentNumber;
    }

    public void setStudentNumber(String studentNumber){
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString(){
        return ("N:" + name + " A:" + age + " SN:" + studentNumber);
    }

    @Override
    public int compareTo(Student student){
        return this.studentNumber.compareTo(student.studentNumber);
    }
}
