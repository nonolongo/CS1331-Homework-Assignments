
// I worked on the homework assignment alone, using only course materials
import java.util.Random;

public class DataLeakSimulator {
    public static void main(String[] args) {
        Random myRandom = new Random();
        int num = (int) Math.sqrt(myRandom.nextInt(26));
        int num1 = (int) (Math.random() * 11);
        SchoolDataType d = leakData(num);
        SchoolDataType e = leakData(num1);
        System.out.println(d + " data was leaked");
        System.out.println(e + " data was leaked");
    }

    public static SchoolDataType leakData(int a) {
        a = Math.abs(a);
        a = a % 4;
        if (a == 0) {
            SchoolDataType a1 = SchoolDataType.STUDENTS;
            return a1;
        } else if (a == 1) {
            SchoolDataType a2 = SchoolDataType.CLASSES;
            return a2;
        } else if (a == 2) {
            SchoolDataType a3 = SchoolDataType.HOUSING;
            return a3;
        } else {
            SchoolDataType a4 = SchoolDataType.DINING;
            return a4;
        }
    }

}
