import javax.naming.Name;

public class Account {
private String id ;
private String name;
private int Balance =0 ;

public Account(String id, String name){
    this.id = id;
    this.name= name;
}

public Account(String id, String name, int balance){
    this.id = id;
    this.name= name;
    this.Balance=balance;
}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        this.Balance = balance;
    }

    public int credit(int amount){
        if (Balance<=0 || amount>Balance)
            System.out.println("there is insufficient balance in the customer's account");
        else{
            this.Balance = Balance - amount;
            System.out.print("Your New balance is "+Balance);}

            return Balance;
    }

    public int debit(int amount){
        this.Balance=amount+Balance;
        return Balance;
    }

    public int TransferTo(Account a2,int amount){
    if (amount>Balance){
        System.out.println("there is insufficient balance in the customer's account");
    }else{
        a2.Balance+=amount;
        this.Balance=Balance-amount;
        System.out.println("Balance of Customer 1 after transferring the amount "+Balance);
        System.out.println("Balance of Customer 2 after Receiving the amount "+a2.Balance);
    }

    return a2.Balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Balance=" + Balance +
                '}';
    }
}
