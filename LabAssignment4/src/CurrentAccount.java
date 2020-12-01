/**  Author name : ANUSHA R
     date: 29/10/2020
     desc: testing compliation and running inheritance extending CurrentAccount from Account
*/
public class CurrentAccount extends Account {

          public CurrentAccount(long accnumber, double balance, Person accholder) {
		super(accnumber, balance, accholder);
		
	}
        
		final double overdraftlimit=100000;   
          public boolean withdraw()
      	  {  
         	if(overdraftlimit<getBalance())
         		return true;
      	   else
      		 return false;
      	  }
          public void abc()
          {
        	  
          }
	     
}