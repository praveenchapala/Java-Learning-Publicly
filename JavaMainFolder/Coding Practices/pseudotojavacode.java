//weekly preparationplan from pseudocode to java code 

//START

// SET javaHoursPerDay TO 2
// SET aptitudeHoursPerDay TO 1
// SET numberOfDays TO 5

// CALCULATE weeklyJavaHours AS
// javaHoursPerDay * numberOfDays

// CALCULATE weeklyAptitudeHours AS
// aptitudeHoursPerDay * numberOfDays

// CALCULATE totalPreparationHours AS
// weeklyJavaHours + weeklyAptitudeHours

// DISPLAY "Java: " followed by weeklyJavaHours
// DISPLAY "Aptitude: " followed by weeklyAptitudeHours
// DISPLAY "Total: " followed by totalPreparationHours

// END




public class pseudotojavacode{
    public static void main(String args[]){
        int javahoursperday=2;
        int aptitudehoursperday =1;
        int numberofdays=5;
        int weeklyjavahours=javahoursperday*numberofdays;
        int weeklyaptitudehours=aptitudehoursperday*numberofdays;
        int totalpreparationhours=weeklyjavahours+weeklyaptitudehours;
        System.out.println("Java: "+ weeklyjavahours);
        System.out.println("Aptitude: "+ weeklyaptitudehours);
        System.out.println("Total: "+ totalpreparationhours);
        
        
    }
}


//sample output
//Java : 10
//Aptitude : 5
//Total: 15