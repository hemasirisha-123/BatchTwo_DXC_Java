import java.util.Scanner;
interface  IAccount {
	
      void depositAmount();
      void withDrawAmount(); 
      void balanceCheck();   
}

class SavingAccount implements IAccount{
	Scanner scan=new Scanner(System.in);
	int initialBalance=10000;
	int result;
                    	public void depositAmount() {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Saving Account");
		System.out.println("enter amount to deposit");
		int deposit=scan.nextInt();
		 result=initialBalance+deposit;
		System.out.println("Amount:"+result);
	}

	@Override
	public void withDrawAmount() {
		// TODO Auto-generated method stub
		int withdraw;
                                           int c=0; 
		if(result<5000) 
			System.out.println("insufficient Balance");
	
			System.out.println("enter amount for withdraw");
			 withdraw=scan.nextInt();
                                                       if(withdraw==6000){
			System.out.println("withdraw attend fail");
                                                                   c=c+1;
                                                                 System.out.println("enter amount for withdraw");
			 withdraw=scan.nextInt();
                                                         result=result-withdraw;
		                System.out.println("Amount:"+result);
                                                       
                                                 }
                                               result=result-withdraw;
		    System.out.println("Amount:"+result);
                      }
	@Override
	public void balanceCheck() {
		System.out.println("the Balance Amount is: "+result);
	}

}
class CurrentAccount implements IAccount{
	Scanner scan=new Scanner(System.in);
	int initialBalance=10000;
	int result;
		public void depositAmount() {
		// TODO Auto-generated method stub
	    System.out.println("Welcome To Current Account");
		System.out.println("enter amount to deposit");
		int deposit=scan.nextInt();
		 result=initialBalance+deposit;
		System.out.println("Amount:"+result);
	}

	@Override
	public void withDrawAmount() {
                                   // TODO Auto-generated method stub
		int withdraw;
                                           int c=0; 
		if(result<5000) 
			System.out.println("insufficient Balance");
	
			System.out.println("enter amount for withdraw");
			 withdraw=scan.nextInt();
                                                       if(withdraw==6000){
			System.out.println("withdraw attend fail");
                                                                System.out.println("enter amount for withdraw");
			 withdraw=scan.nextInt();
                                                                 result=result-withdraw;
		                      System.out.println("Amount:"+result);
                                                                
                                                        }
                                                result=result-withdraw;
		    System.out.println("Amount:"+result);
                                                 
                      }
		
	@Override
	public void balanceCheck() {
		System.out.println("the Balance Amount is: "+result);
	}
	
	
}

public class MenuDriverApplication {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Choose Between Saving Account(s) and Current Account(c)");
		 String account=scan.nextLine();
		 switch (account) {
         case "s" :
                                           System.out.println("Choose Between depositAmount(d) , withdrawAmmount(w) and balancecheck(b)");
		 String acc=scan.nextLine();
        	                      SavingAccount obj=new SavingAccount();
                                            switch(acc){
                           case "d":
     		  obj.depositAmount();
                                                break;
                            case "w":
     		  obj.withDrawAmount();
                                                    break;
                            case "b":
     		  obj.balanceCheck();
                                                break;
                                              }
                                      break;
         case "c":
                                     System.out.println("Choose Between depositAmount(d) , withdrawAmmount(w) and balancecheck(b)");
		 String acc1=scan.nextLine();
        	                      CurrentAccount obj1=new CurrentAccount();
                                            switch(acc1){
                           case "d":
     		  obj1.depositAmount();
                                                break;
                            case "w":
     		  obj1.withDrawAmount();
                                                    break;
                            case "b":
     		  obj1.balanceCheck();
                                                break;
                                              }
                                      break;
           	}

}
}