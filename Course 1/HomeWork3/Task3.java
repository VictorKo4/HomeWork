package HomeWork3;

public class Task3 {
    public static void main(String[] args) {
        int teacherLP = 23;
        int teacherAS = 27;
        int teacherEA = 30;
        int totalStudents = teacherLP + teacherAS + teacherEA;
        int totalSheetsOfPaper = 480;
        int sheetsStudent = totalSheetsOfPaper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsStudent + " листов бумаги");
    }
}
