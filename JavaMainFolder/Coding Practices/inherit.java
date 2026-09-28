public class inherit{
    public static void main(String args[]){
        javaDeveloper jd = new javaDeveloper();
        pythonDeveloper pd = new pythonDeveloper();
        jd.buildapp();
        jd.attendMeeting();
        jd.javaTeam();
        pd.buildapp();
        pd.attendMeeting();
        pd.pythonTeam();
        
        
    }
}

class Developer{

    void buildapp(){
        System.out.println("Developer is building the app");
    }
    void attendMeeting(){
        System.out.println("Developer is attending the meeting");
    }
}

class javaDeveloper extends Developer{
    void buildapp(){
        System.out.println("Java developer is building the java app");
    }

    void javaTeam(){
        System.out.println("Java developer is working with java team");
    }
    
}

class pythonDeveloper extends Developer{
    void buildapp(){
        System.out.println("Python developer is building the python app");
    }

    void pythonTeam(){
        System.out.println("Python developer is working with python team");
    }
}