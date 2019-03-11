package Tier2;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StartTier2 {
	public static void main(String[] args) {
		/**
		 * Instantiate Skeleton here
 		 */
		try {
			Registry reg = LocateRegistry.createRegistry(0);
			
			Tier2Controller controllerTier2 = new Tier2Controller();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
