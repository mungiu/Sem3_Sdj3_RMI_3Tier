package Tier3;

import java.rmi.RemoteException;

public class StartTier3 {
	public static void main(String[] args) {
		try {
			Tier3Controller controllerTier3 = new Tier3Controller();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
