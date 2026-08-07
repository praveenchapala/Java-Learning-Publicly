
class controlconstructs {
    public static void main(String[] args) {
        int number =-7;
        int firstscore=18;
        int secondscore=25;
        if(number>0){
            System.out.println("Number type: "+"Positive");
        }else if(number<0){
            System.out.println("Number type: "+"Negative");
        }else{
            System.out.println("Number type: "+ "Zero");
        }
        
        if(number%2==0){
            System.out.println("Parity: "+"Even");
        }else{
            System.out.println("Parity: "+"Odd");
        }
        
        if(firstscore>secondscore){
            System.out.println("LargerScore: "+firstscore);
        }else{
            System.out.println("LargerScore: "+secondscore);
        }
    }
}