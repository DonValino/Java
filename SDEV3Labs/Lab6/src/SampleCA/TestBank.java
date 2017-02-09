package SampleCA;

/**
 * Created by x00112730 on 10/10/2014.
 */
public class TestBank {
    public static void main(String [] args)
    {
        BankAccount [] ob1 = new BankAccount[3];

        ob1[0] = new SavingsAccount("Dad",33333,10000,3.0);
        ob1[1] = new SavingsAccount("Mum",44444,5000,3.5);
        ob1[2] = new CurrentAccount("Paul",323232,700,300);

        ob1[0].lodge(50000);
        ob1[0].transfer(6000,ob1[1]);
        ob1[1].transfer(1000,ob1[2]);
        ob1[2].widraw(1500);
        ob1[2].widraw(700);
        ob1[1].transfer(1000,ob1[2]);
        ob1[2].widraw(400);
        for(int i = 0; i < ob1.length;i++) {
            if (ob1[i] instanceof SavingsAccount) {
                SavingsAccount c = (SavingsAccount) ob1[i];
                c.calcInterest();
            }

            if(ob1[i] instanceof CurrentAccount)
            {
                CurrentAccount s = (CurrentAccount) ob1[i];
                s.calcFess();
            }
        }

        for(int i = 0; i < ob1.length;i++)
        {
            System.out.println(ob1[i]);
        }

        if(ob1[2] instanceof CurrentAccount)
        {
            CurrentAccount c = (CurrentAccount) ob1[2];
           System.out.println("The Transaction count is : " + c.getTransactionCount());
        }

    }
}
