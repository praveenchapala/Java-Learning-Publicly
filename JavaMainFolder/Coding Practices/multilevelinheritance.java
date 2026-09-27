public class multilevelinheritance{
    public static void main(String args[]){
        trainees ts = new trainees();
        ts.managers();
        ts.dotask();
        ts.employeeworks();
        ts.traineworks();
        ts.traineattend();
        
        
    }
}

class company{
    String companyname;
    long companyprofits;

    void managers(){
        System.out.println("Managers assignes task to employees");
    }

    void dotask(){
        System.out.println("employees will do task assigned by manager");
    }
}

class employee extends company{
    String employeename;
    int empid;

    void employeeworks(){
        System.out.println("Employee works for company by killing his self respect");
    }
}

class trainees extends employee{
    String traineename;
    int id;

    void traineworks(){
        System.out.println("Trainee learns from the employees");
    }
     void traineattend(){
         System.out.println("Trainee attends the training classes");
     }
}