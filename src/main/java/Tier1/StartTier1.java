package Tier1;

import java.rmi.RemoteException;

public class StartTier1 {
	public static void main(String[] args) {
		try {
			ControllerTier1 controllerTier1 = new ControllerTier1();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
