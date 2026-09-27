public class inheritance{
    public static void main(String args[]){
        User u = new User();
        Trainer t = new Trainer();
        Admin a = new Admin();
        u.id = 12;
        u.name = "Praveen";
        u.password = "prav@90";
        u.email = "prav@gmail.com";
        u.login();
        u.logout();
        u.displayinfo();

        t.id = 13;
        t.name = "Uday";
        t.password = "uday@123";
        t.email = "uday@gmail.com";
        t.noofsessions = 3;
        t.takesessions();
        t.displayinfo();
        t.login();
        t.logout();

        a.id = 14;
        a.name = "Nithin";
        a.password = "nithin@145";
        a.email = "nithin@gmail.com";
        a.adminvar = 13;
        a.login();
        a.logout();
        a.manageapp();
        a.displayinfo();
        
    }
}

class User{
    int id;
    String name;
    String password;
    String email;

     void login(){
        System.out.println("Logging in");
    }

    void logout(){
        System.out.println("Logged out");
    }

    void displayinfo(){
        System.out.println("Userid: "+id);
        System.out.println("Username: "+name);
        System.out.println("Userpassword: "+password);
        System.out.println("Useremail: "+email);

    }
    
}

class Trainer extends User{
    int noofsessions;
    void takesessions(){
        System.out.println("Trainer is taking sessions");
    }
    
}

class Admin extends User{
    int adminvar;
    void manageapp(){
        System.out.println("Admin is managing the app");
    }
}