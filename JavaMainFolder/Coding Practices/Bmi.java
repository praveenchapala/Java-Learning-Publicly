public class Bmi{
    public static void main(String args[]){
        double principal =600000;
        double rate = 6.7;
        double time = 3.0;
        double simpleinterest=principal*rate*time;
        double totalamount = principal+simpleinterest;
        //caluclate BMI 
        double weight = 72.0;
        double height=1.8;
        double bmi = weight/(height*height);
        //caluclate percentage
        int totalmarks = 78+84+69+91+88;
        double percentage = totalmarks*100.0/500;
        System.out.println("Simple interest: "+simpleinterest);
        System.out.println("Total Amount: "+totalamount);
        System.out.println("BMI: "+bmi);
        System.out.println("Total Marks:"+totalmarks);
        System.out.println("Percentage: "+percentage);
    }
}