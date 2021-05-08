package Adapters;

import java.rmi.RemoteException;

import Abstract.UserCheckService;
import Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealUser(User user) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long.valueOf(user.getNationalityId()),  user.getfName(), user.getlName(),
											user.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			System.out.println(user.getfName()+"adli kullanici bulunumadi");
			e.printStackTrace();
		}
		return false;
	}

}
