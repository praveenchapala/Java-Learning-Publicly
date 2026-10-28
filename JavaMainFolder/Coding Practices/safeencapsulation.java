public class Main{
    public static void main(String args[]){
        Bankaccount ba = new Bankaccount();
        ba.setaccountnumber("123456");
        ba.depositammount(10000);
        ba.withdrawammount(5000);
        System.out.println(ba.getbalance());
        System.out.println(ba.getaccountnumber());
        
    }
}
class Bankaccount{
    private double balance=0;
    private String accountnumber;

    public void setaccountnumber(String number){
        if(number!=null && number.length()==6){
            accountnumber=number;
        }else{
            System.out.println("Invalid account number");
        }
    }

    public void depositammount(double ammount){
        if(ammount>0){
            balance+=ammount;
            System.out.println("The deposited ammount is:"+ammount);
        }else{
            System.out.println("The deposited ammount must be greater than 0");
        }
        
        
    }

    public void withdrawammount(double ammount){
        if(ammount>0 && ammount<=balance){
            balance-=ammount;
            System.out.println("The withdrawn ammount is:"+ammount);
        }else{
            System.out.println("the withdrawn ammount is inavalid or dont have sufficient balance");
        }
    }
    public double getbalance(){
        return balance;
    }

    public String getaccountnumber(){
        return accountnumber;
    }
}