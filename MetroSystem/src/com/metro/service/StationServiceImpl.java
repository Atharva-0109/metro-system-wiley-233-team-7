package com.metro.service;

import java.util.List;

import com.metro.persistence.StationDao;
import com.metro.persistence.StationDaoImpl;

public class StationServiceImpl implements StationService {

	StationDao stationDao = new StationDaoImpl();
	
	@Override
	public int getStationId(String stationName) {
		return stationDao.getStationId(stationName);
	}

	@Override
	public List<String> getStationsList() {
		return stationDao.getStationsList();
	}
}
