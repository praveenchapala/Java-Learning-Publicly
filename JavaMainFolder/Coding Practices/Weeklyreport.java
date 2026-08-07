

//Sample output:
// Completed Topics: 17
// Remaining Topics: 3
// Weekly Learning Hours: 15
// Progress Percentage: 85.0

public class Weeklyreport {
    public static void main(String[] args) {
        int Completedtopics = 17;
        int Totaltopics = 20;
        int Dailylearninghours = 3;
        int Learningdays = 5;

        int remainingtopics = Totaltopics - Completedtopics;
        int weeklylearninghours = Dailylearninghours * Learningdays;
        double progressPercentage = (double) Completedtopics * 100 / Totaltopics;

        System.out.println("Completed Topics: " + Completedtopics);
        System.out.println("Remaining Topics: " + remainingtopics);
        System.out.println("Weekly Learning Hours: " + weeklylearninghours);
        System.out.println("Progress Percentage: " + progressPercentage);
    }
}