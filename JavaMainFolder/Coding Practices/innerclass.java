public class innerclass {
    public static void main(String args[]){
        outerclass otr = new outerclass();
        outerclass.Inner inr = otr.new Inner();//we cannot directly acess inner classes by creating object of it so we have to use like this
        otr.outerdisplay();
        inr.innerdisplay();
        
        
    }
}

class outerclass{
    int a=20;
    static int b = 30;
    void outerdisplay(){
        System.out.println("Inside outerclass");
        System.out.println(a);
        System.out.println(b);
    }
        class Inner{  // member inner class (non static inner class)
            int p=50;
            static int q=60;
            void innerdisplay(){
                System.out.println("Inside innerclass");
                System.out.println(a);//can acess non static variables of outer class
                System.out.println(b);//can acess static variables of outer class
                System.out.println(p);//can acess non static varibales of inner class
                System.out.println(q); // can acess static variables of inner class
            
        }
    }
    
}