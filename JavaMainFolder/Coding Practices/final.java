//final 

//final - variable (use to create constants) values cant be change
// final - methods (final methods can be inherited but we cannot override means that we can inherit method as it is but we can change its body or we cannot change its implementation)

// final - class (final classes cannot be inherited)


public class final{
    public static void main(String args[]){
        final int a =10;
        a = 20;
        System.out.println(a);
    }
}


// ERROR!
// /tmp/fZ2TSRMdNr/Main.java:12: error: cannot assign a value to final variable a
//         a = 20;
//         ^
// 1 error
// ERROR!
// error: compilation failed

// interviewer may ask that how to create constant in java then we can use final keyword with variable to create constant