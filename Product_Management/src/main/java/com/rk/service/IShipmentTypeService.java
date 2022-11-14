package com.rk.service;

import java.util.List;

import com.rk.mode.ShipmentType;

public interface IShipmentTypeService {
	Integer saveShipmentType(ShipmentType st);

	List<ShipmentType> getAllShipmentType();

	void deleteShipmentType(Integer id);

	ShipmentType getShipmentType(Integer id);

	void updateShipmentType(ShipmentType st);

	boolean isShipmentCodeExist(String shipmentCode);

}
