package Tier1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import SharedInterfaces.ITier2;

public class StartTier1 {
	public static void main(String[] args) {
		// Simple test driver of the system
		// Normally it should be the client
		try {
			ITier2 tier2 = (ITier2) Naming.lookup(ITier2.T2_SERVICE_NAME);
			// hardcoded ammount to withdraw
			double amount = 853.17;
			
			while(tier2.withdraw(1234, amount))
				System.out.println("Withdrawn: "+amount);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
