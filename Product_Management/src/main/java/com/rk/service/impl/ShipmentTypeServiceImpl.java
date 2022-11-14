package com.rk.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rk.mode.ShipmentType;
import com.rk.repo.ShipmentTypeRepository;
import com.rk.service.IShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {
	@Autowired
	private ShipmentTypeRepository repo;// HAS-A

	@Override
	public Integer saveShipmentType(ShipmentType st) {
		st = repo.save(st);
		return st.getId();// return PK(ID)
	}

	@Override
	public List<ShipmentType> getAllShipmentType() {
		// call repository findAll() method
		List<ShipmentType> list = repo.findAll();
		return list;
	}

	@Override
	public void deleteShipmentType(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public ShipmentType getShipmentType(Integer id) {
		Optional<ShipmentType> opt = repo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			// throw exception(ShipmentTypeNotFoundException)
		}
		return null;
	}

	@Override
	public void updateShipmentType(ShipmentType st) {
		// IS Given Object Present
		// then Update
		// else throw exception
		repo.save(st);
	}

	@Override
	public boolean isShipmentCodeExist(String shipmentCode) {
		int count = repo.getShipmentCodeCount(shipmentCode);
		boolean flag = (count >= 1 ? true : false);
		return flag;
	}

}
