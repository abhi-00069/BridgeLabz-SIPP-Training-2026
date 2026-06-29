class InsufficientBalanceException extends Exception{

    InsufficientBalanceException(String msg){
        super(msg);
    }

}

public class ATMWithdrawal {

    static void withdraw(double balance,double amount) throws InsufficientBalanceException
    {

        if(amount>balance)
        {
            throw new InsufficientBalanceException(
                    "Balance = "+balance+
                    ", Requested = "+amount+
                    ", Withdrawal Failed."
            );
        }

        System.out.println("Withdrawal Successful");

    }

    public static void main(String[] args) {

        double balance=5000;
        double request=8000;

        try{

            withdraw(balance,request);

        }
        catch(InsufficientBalanceException e){

            System.out.println(e.getMessage());

        }

    }

}
