public class Main{
    public static void main(String args[]){
        bankaccount ba = new bankaccount();
        
        System.out.println(ba.getbalance());
        ba.setbalance(2000);
        System.out.println(ba.getbalance());
    }
}



class bankaccount{
    private double balance=1000;

    public double getbalance(){
        return balance;
    }
    public void setbalance(double amount){
        if(amount>0){
            balance=amount;
        }else{
            System.out.println("Invalid Amount");
        }
    }
}
