package Tier2;

import SharedInterfaces.ITier2;
import SharedInterfaces.ITier3;
import SharedModel.Account;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import static SharedInterfaces.ITier2.T2_SERVICE_NAME;
import static SharedInterfaces.ITier3.T3_SERVICE_NAME;

public class ControllerTier2 extends UnicastRemoteObject implements ITier2 {
	private static final long serialVersionUID = 1L;
	private ITier3 tier3;

	protected ControllerTier2() throws RemoteException {
		try {

			Naming.rebind(T2_SERVICE_NAME, this);
			tier3 = (ITier3) Naming.lookup(ITier3.T3_SERVICE_NAME);


		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public boolean withdraw(int acNumber, double amount) throws RemoteException {
		Account account = tier3.getAccount(acNumber);

		if (account == null)
			return false;

		else if (amount <= 0.0 || amount > account.getBalance())
			return false;

		else {

			account.updateBalance(-amount);
			tier3.updateAccount(account);
			return true;
		}


	}

}
