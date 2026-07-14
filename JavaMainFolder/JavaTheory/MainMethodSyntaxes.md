public class Main{
    public static void main(String[] args){
        System.out.println("Hellow World");
    }
}

<!-- This is the main method in Java. It is the entry point of any Java application. The main method must be declared as public, static, and void, and it must accept a single parameter: an array of Strings (String[] args).

<!-- This is the standard syntax that most of the java programs use. However, there are some variations of the main method syntax that are also valid in Java. Here are some of them: -->




---------------------------------------------------------------

public class Main{
    static public void main(String[] args){
        System.out.println("Hellow World");
    }
}


<!-- this is also a valid syntax for the main method. The order of the modifiers (public and static) does not matter. -->


----------------------------------------------------------------

public class Main{
    public static void main(String args[]){
        System.out.println("Hellow World");
    }
}

<!-- this is also a valid syntax for the main method. The parameter can be declared as String[] args or String args[]. Both are equivalent and can be used interchangeably. -->



--------------------------------------------------------------------


public class Main{
    public static void main(String... args){
        System.out.println("Hellow World");
    }
}

<!-- this is also a valid syntax for the main method. The parameter can be declared as String... args, which is called varargs. It allows you to pass a variable number of arguments to the main method. However, it is less common and not recommended for beginners. -->


-------------------------------------------------------------------

public class Main{
    public static void main(String raju[]){
        System.out.println("Hellow World");

    }
}


<!-- this is also a valid syntax for the main method. The parameter name can be anything, such as args, raju, or any other valid identifier. However, it is recommended to use args as the parameter name for clarity and convention. -->