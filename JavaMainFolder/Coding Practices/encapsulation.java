class encapsulation{
    public static void main(String args[]){
        Bankaccount ba = new Bankaccount();
        // ba.bankaccountnumber=1234;
        // ba.accountholdername = "Praveen";  direct acess from outside of the class also there is no data protection and anyone can easily accessible and modifyable;
        ba.setdata(123);
        System.out.println(ba.getdata());
       
    }
}
class Bankaccount{
    private int bankaccountnumber;
    String accountholdername;

    public void  setdata(int x){
        if(x>0){
        bankaccountnumber = x;
    }else{
            System.out.println("Wrong value");
    }
    }
    public int getdata(){
        return bankaccountnumber;
    }
}
