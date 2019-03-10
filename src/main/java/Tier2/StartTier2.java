package Tier2;

import java.rmi.RemoteException;

public class StartTier2 {
	public static void main(String[] args) {
		/**
		 * Instantiate Skeleton here
 		 */
		try {
			ControllerTier2 controllerTier2 = new ControllerTier2();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
