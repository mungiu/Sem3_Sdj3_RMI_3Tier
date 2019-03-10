package Tier3;

import SharedInterfaces.ITier3;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ControllerTier3 extends UnicastRemoteObject {
	protected ControllerTier3() throws RemoteException {
		try {
			Naming.rebind(ITier3.INTERFACENAME, this);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
