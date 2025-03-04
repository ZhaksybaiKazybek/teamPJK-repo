package com.project.deliver.utils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.project.deliver.utils.DataRepository;
import com.project.deliver.ProductOrder;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value="/util")
public class DataController {
	@Autowired DataRepository datautil;
	@RequestMapping(value = "/create", method = RequestMethod.POST)
    public String CreateData(ProductOrder order) {
		if(order != null){
			datautil.save(order);
			return "Done successfuly";
		}
		return "Data error";
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String DeleteData(long id) {
		if (!datautil.existsById(id)){
			return "Data error";
		}
		ProductOrder prop = datautil.findById(id);
		datautil.delete(prop);
		return "Done successfuly";
    }
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ProductOrder UpdateData(ProductOrder order, long id) {
		if (order == null || !datautil.existsById(id)){
			return order;
		}
		ProductOrder prop = datautil.findById(id);
		prop.setProduct(order.getProduct());
		prop.setLocation(order.getLocation());
		prop.setDate(order.getDate());
		return datautil.save(prop);
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
    public Object ReadData(long id) {
		if (datautil.existsById(id)){
			return datautil.findById(id);
		}
		return "Data error";
    }
	
}