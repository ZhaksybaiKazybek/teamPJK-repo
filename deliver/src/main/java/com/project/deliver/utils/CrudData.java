package com.project.deliver.utils;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/util")
public class CrudData {
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
    public String CreateData(String name) {
      return "Create: "+ name;
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String DeleteData(String name) {
      return "Delete: "+ name;
    }
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
    public String UpdateData(String name) {
      return "Update: "+ name;
    }
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
    public String ReadData(String name) {
      return "Read: "+ name;
    }
}