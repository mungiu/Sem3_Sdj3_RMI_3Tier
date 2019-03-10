package Tier3;

import java.rmi.RemoteException;

public class StartTier3 {
	public static void main(String[] args) {
		try {
			ControllerTier3 controllerTier3 = new ControllerTier3();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
