package SpringSql.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import SpringSql.dao.TravelDao;
import SpringSql.dto.TravelQueryParams;
import SpringSql.model.Travel;
import SpringSql.service.TravelService;

@Component
public class TravelServiceImpl implements TravelService{
	
	@Autowired
	private TravelDao travelDao;

	@Override
	public List<Travel> getTravelById(TravelQueryParams travelQueryParams) {
		
		return travelDao.getTravelById(travelQueryParams);
	}
	
	
	
	
}
