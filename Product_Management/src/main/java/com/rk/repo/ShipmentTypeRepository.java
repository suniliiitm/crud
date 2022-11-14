package com.rk.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rk.mode.ShipmentType;

public interface ShipmentTypeRepository extends JpaRepository<ShipmentType, Integer> {
	@Query("SELECT COUNT(ST.shipCode) FROM ShipmentType ST WHERE ST.shipCode=:shipmentCode")
	public Integer getShipmentCodeCount(String shipmentCode);

}
