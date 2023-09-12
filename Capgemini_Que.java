// Date:12/9/2023
// Yashodip Beldar
// Capgemini question
import java.util.Scanner;
public class Capgemini_Que {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of semister: ");
    int semister = sc.nextInt();
    int[] subjectOfSem = new int[semister];
// marks = []
// maxs = []

// for i in range(0, semister):
//     sems.append(int(input(f"Enter no of subjects in {i+1} semister: ")))

// for k in range(0, semister):
//     print(f"Marks obtained in semester {k+1}:")
//     for j in range(0, sems[m]):
//         mark = int(input())
//         if (mark > 100):
//             print("You have entered invalid mark")
//             # having a issue here. it should retake the marks if its invalid
//         else:
//             marks.append(mark)
//     maxs.append(max(marks))

// for i in range(0, semister):
//     print(f"Maximum mark in {i+1} semester: {maxs[i]}")

sc.close();
    }
}
