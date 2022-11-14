package com.rk.mode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "mustab")
public class Mus {
	@Id
	@GeneratedValue
	@Column(name="mus_id_col")
	private Integer id;
	@Column(name="mus_type_col")
	private String musType;
	@Column(name="mus_model_col")
	private String musModel;
	@Column(name="mus_desc_col")
	private String desc;

}
