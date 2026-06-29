class InsufficientFundsException extends Exception{

    InsufficientFundsException(String msg){
        super(msg);
    }

}

public class HospitalBilling {

    public static void main(String[] args) {

        int items=0;
        int patient[]={101,102,103};
        String txt="abc";
        double balance=1000;
        double bill=2000;

        try{

            double cost=5000/items;
            System.out.println(cost);

        }
        catch(ArithmeticException e){
            System.out.println("Bills cannot have zero items.");
        }

        try{

            System.out.println(patient[5]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Patient Index.");
        }

        try{

            int x=Integer.parseInt(txt);
            System.out.println(x);

        }
        catch(NumberFormatException e){
            System.out.println("Invalid Number Format.");
        }

        try{

            if(balance<bill)
            {
                throw new InsufficientFundsException("Payment Failed. Insufficient Funds.");
            }

            System.out.println("Payment Successful");

        }
        catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }

    }

}
