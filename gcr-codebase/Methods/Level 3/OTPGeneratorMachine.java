public class OTPGeneratorMachine {

    static int otp()
    {
        return (int)(Math.random()*900000)+100000;
    }

    static boolean unique(int arr[],int size,int x)
    {
        for(int i=0;i<size;i++)
        {
            if(arr[i]==x)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int otp[]=new int[10];

        int k=0;

        while(k<10)
        {
            int x=otp();

            if(unique(otp,k,x))
            {
                otp[k]=x;
                k++;
            }
        }

        System.out.println("Generated OTPs");

        for(int i=0;i<otp.length;i++)
        {
            System.out.println(otp[i]);
        }

    }

}
