package com.rk.mode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "shipment_type_tab")
public class ShipmentType {
	@Id
	@GeneratedValue
	@Column(name="ship_id_col")
	private Integer id;
	@Column(name="ship_Mode_col")
	private String shipMode;
	@Column(name="ship_Code_col")
	private String shipCode;
	@Column(name="ship_enable_col")
	private String enableShip;
	@Column(name="ship_Grad_col")
	private String shipGrad;
	@Column(name="ship_Desc_col")
	private String shipDesc;

}
