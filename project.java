package venkat;

import java.util.Scanner;
class project 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the UserName:");
		String username=sc.nextLine();
        System.out.println("Enetr the pin number:");
		int pin=sc.nextInt();
		long balance=10000000;
        System.out.println(" ~ press 1 for transaction ~ ");
		System.out.println(" ~ press 0 for exit ~ ");
        System.out.println("Enter your choice:");
		int num=sc.nextInt();
		switch (num)
		{
		case 1:
			{
			boolean c=true;
			while (c!=false)
			{
			    System.out.println("Enter the pin number:");
                int pin1=sc.nextInt();
			    if(pin!=pin1)
				{
				    System.out.println("you have entered wrong pin number");
				   System.out.println("please enter correct pin number:");
				   pin1=sc.nextInt();
				   if(pin!=pin1)
					{
				    for (int i=0;i<=2 ; i++ )
						{
					        System.out.println("please enter correct pin number:"); 
					        pin1=sc.nextInt();
                            break;
					    }
					}
				     if (pin!=pin1)
				    {
				     System.out.println("your account is blocked for 24hrs since you have entered wrong pin 3 times ");
			         break;
                    }
				  
				}
               if (pin==pin1)
			   {
				   
				   System.out.println("please select option below:");
				   System.out.println("~ Press withdraw ~");
                   System.out.println("~ Press deposit ~");
                   System.out.println("~ Press balance ~");
				   String money=sc.next();
                   switch (money)
				   {
				   case "withdraw" :
					   {
					    System.out.println("you have selected to withdraw");
						boolean b=true;
						while (b!=false)
						   {
							System.out.println("Enter amount to withdraw:");
						     long amount=sc.nextInt();
							 if (amount<=80000)
							{
								balance=balance-amount;
								System.out.println("---Transaction Successfull---");
                                System.out.println("(" + balance + ")" +"is the remaining balance");
							    b=false;
							}
							else
							{
								System.out.println("please enter sufficient amount to maintain minimum balance in the account");
							}
							
						}
						break;
				   }
				   case "deposit":
					   {
					   System.out.println("you have selected to deposit");
					   boolean b1=true;
					   while (b1!=false)
						   {
						    System.out.println("Enter Amount to deposit:");
					        int amount1=sc.nextInt();
					        if (amount1>=10000)
					        {
							   balance=balance+amount1;
							   System.out.println("---Transaction Successfull---");
                               System.out.println("("+ balance  + ")" +"is remaining balance" );
							   b1=false;   
					        }
							else
							   {
								System.out.println("Enter minimum amount to deposit is 10000");
								}
							}
					   break;
					}
					case "balance":
					   { 
						    System.out.println("you have selected to display balance");
                            System.out.println("(" + balance +")" + "is the balance in your account");
						break;
					   }
			   }
			   c=false;
			}
			}
			break;
			}
			case 0:
			{
				System.out.println("Exit");
				break;
			}
		}
	}
}
