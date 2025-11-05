class Student {
    // private data members (data hiding)
    private int rollNo;
    private String name;

    // Setter methods (write / modify data)
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter methods (read / retrieve data)
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}

public class en{
    public static void main(String[] args) {
        Student s = new Student();   // creating object

        s.setRollNo(101);            // setting values using setter
        s.setName("Dwarak");

        System.out.println("Roll No: " + s.getRollNo());   // getting value using getter
        System.out.println("Name: " + s.getName());
    }
}
