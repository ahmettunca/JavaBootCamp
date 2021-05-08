package Abstract;

import java.util.ArrayList;
import java.util.List;

import Entities.Campaign;

public abstract class BaseCampaignManager implements CampaignService{

	@Override
	public void add(Campaign entity) {
		System.out.println("Product: "+entity.getProduct().getName()+
				"-- Campaign: "+entity.getName()+" added.");
		
	}

	@Override
	public void add(List<Campaign> entities) {
		for(Campaign c:entities) {
			this.add(c);
		}
		
	}

	@Override
	public void delete(Campaign entity) {
		System.out.println("Product: "+entity.getProduct().getName()+
				"-- Campaign: "+entity.getName()+" deleted.");
		
	}

	@Override
	public void update(Campaign entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Campaign> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
