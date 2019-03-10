package Tier2;

import SharedInterfaces.ITier2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ControllerTier2 extends UnicastRemoteObject {
	protected ControllerTier2() throws RemoteException {
		try {
			Naming.rebind(ITier2.INTERFACENAME, this);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
