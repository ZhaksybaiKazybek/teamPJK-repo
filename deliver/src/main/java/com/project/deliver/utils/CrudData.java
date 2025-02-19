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
public class CrudData {
	@Autowired DataRepository datautil;
	@RequestMapping(value = "/create", method = RequestMethod.POST)
    public ProductOrder CreateData(ProductOrder order) {
		return datautil.save(order);
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void DeleteData(ProductOrder order) {
		datautil.delete(order);
    }
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ProductOrder UpdateData(ProductOrder order, long id) {
		if (datautil.existsById(id)){
			return datautil.save(order);
		}
		return order;
    }
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
    public ProductOrder ReadData(long id) {
		return datautil.findById(id);
    }
	
}