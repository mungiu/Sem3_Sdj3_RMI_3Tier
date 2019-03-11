package Tier3;

import SharedInterfaces.ITier3;
import SharedModel.Account;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import static SharedInterfaces.ITier3.T3_SERVICE_NAME;

public class ControllerTier3 extends UnicastRemoteObject implements ITier3 {
	private static final long serialVersionUID = 1L;
	private Account acAndrei = new Account(1234, 5321.46);

	public ControllerTier3() throws RemoteException {
		try {

			Naming.rebind(T3_SERVICE_NAME, this);
			System.out.println("Do som transaction");

		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	// this is a stub to mimic a database
	// Here you can put real database coding stuff


	@Override
	public Account getAccount(int acNumber) throws RemoteException {
		// TODO Auto-generated method stub
		return acAndrei;
	}

	@Override
	public void updateAccount(Account account) throws RemoteException {
		// TODO Auto-generated method stub
		acAndrei = account;
	}
}
