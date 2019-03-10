package Tier1;

import SharedInterfaces.ITier1;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ControllerTier1 extends UnicastRemoteObject {
	protected ControllerTier1() throws RemoteException {
		try {
			Naming.rebind(ITier1.INTERFACENAME, this);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
