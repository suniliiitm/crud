package com.rk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rk.mode.ShipmentType;
import com.rk.service.IShipmentTypeService;

@Controller
@RequestMapping("/st")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;

	// 1. Show Register Page
	@GetMapping("/register")
	public String showRegister() {
		return "ShipmentTypeRegister";
	}

	// 2. On click submite
	@PostMapping("/save")
	public String saveShipmentType(@ModelAttribute ShipmentType shipmentType, Model model) {
		// call service
		Integer id = service.saveShipmentType(shipmentType);
		String msg = "Shipment Type ' " + id + " , is Creaded";
		model.addAttribute("message", msg);
		return "ShipmentTypeRegister";
	}

	// 3. Fetch data To UI
	@GetMapping("/all")
	public String getAllShipmentType(Model model) {
		// call service get List(T)
		List<ShipmentType> list = service.getAllShipmentType();
		model.addAttribute("list", list);
		return "ShipmentTypeData";
	}

	// 4 .Delete Opt
	@GetMapping("/delete")
	public String deleteShipmentType(@RequestParam Integer id, Model model) {
		// call service
		service.deleteShipmentType(id);
		// create Msg
		String msg = "ShipmentType '" + id + "'Deleted !!'";
		// Load new Data
		List<ShipmentType> list = service.getAllShipmentType();
		// send data to UI
		model.addAttribute("list", list);
		model.addAttribute("message", msg);
		return "ShipmentTypeData";
	}

	// 5. Show Edit Page
	@GetMapping("/edit")
	public String showShipmentEdit(@RequestParam Integer id, Model model) {
		// fetch from DB using Service
		ShipmentType st = service.getShipmentType(id);
		// send Object to UI as Form Data
		model.addAttribute("shipmentType", st);
		// go to UI
		return "ShipmentTypeEdit";
	}

	// 6. Reead Form Data and Submite
	@PostMapping("/update")
	public String udateShipmentType(@ModelAttribute ShipmentType shipmentType) {
		// call service for update
		service.updateShipmentType(shipmentType);
		// redirect to all
		return "redirect:all";
	}

	// 7. Ajax Validation
	@GetMapping("/validatecode")
	public @ResponseBody String validateShipmentCode(@RequestParam String code) {
		String message = "";
		if (service.isShipmentCodeExist(code)) {
			message = "Shipment Code " + code + " Already exist";
		}
		return message;
	}

}
