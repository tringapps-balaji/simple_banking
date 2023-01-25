
import java.util.*;

class bank{
    int number,bal=0,deposit,withdrawel;
    String name;
    Scanner sc = new Scanner (System.in);

    public bank(int no, String name) {
       this.number =no ;
        this.name = name;
    }



     void deposit(){

         System.out.println("Enter the deposit : ");
         deposit = sc.nextInt();
         bal=bal+deposit;
        }
        void withdrawel(){
         System.out.println("Enter the withdrawel : ");
         withdrawel = sc.nextInt();
         bal -= withdrawel;
        }
        void balance (){
         System.out.println("Current balance: "+bal);
        }


        }
 

public class Bank
{
	public static void main(String[] args) {
		  int num;
        int ch=0;
        Scanner bn= new Scanner(System.in);
        System.out.print("Enter the account number : ");
         num = bn.nextInt();
       System.out.print("Enter the name : ");
        String name =bn.next();
       bank obj = new bank(num,name);

        while (ch<4){
            System.out.println("1.Deposit / 2. Withdrawel / 3. current balance / 4.exit");
            System.out.println("Enter the choice : ");
            ch = bn.nextInt();

            switch (ch){
                case 1:
                    obj.deposit();
                    break;

                case 2:
                    obj.withdrawel();
                    break;

                case 3:
                    obj.balance();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");


            }
        }

    }
	}

