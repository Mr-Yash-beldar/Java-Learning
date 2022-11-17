
//Date--6-09-2022
//Purpose--Inveritance in java

public class Students {
    String name = "Yashodip";
    int age = 19;
    String grade = "A";

    public void getDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }
}

class OnlineStudent extends Students {
    String platform = "Zoom";

    public void getPlatform() {
        System.out.println("Student Platform: " + platform);
    }

}

class Main {
    public static void main(String[] args) {
        OnlineStudent st1 = new OnlineStudent();
        st1.getDetails();
        st1.getPlatform();
    }
}
