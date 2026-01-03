class BankAccount{
    private int balance;
    public  void deposit(int amount){
        if (amount>0){
            balance+=amount;
            System.out.println("THe amount "+amount +" is deposited succesfully in your bank account");
        }
        else{
            System.out.println("Enter Valid amount");
        }
    }
    public void withdraw(int amount){
        if (amount<=balance){
            System.out.println("before withdrawa;"+balance);
            balance-=amount;
            System.out.println("after withdrawal "+balance);
        }
        else{
            System.out.println("Low balance");
        }
    }
    public void getbalance(){
        System.out.println( balance);
    }
} 
class Main {
    public static void main(String[] args) {
       BankAccount b1=new BankAccount();
       b1.deposit(5000);
       b1.withdraw(100);
       b1.getbalance();
    }
}
