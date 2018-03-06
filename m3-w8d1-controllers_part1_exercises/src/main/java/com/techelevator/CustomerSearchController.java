package com.techelevator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Customer;

@Controller
public class CustomerSearchController
{

	@Autowired
	private CustomerDao customerDao;

	@RequestMapping(path="/customer", method=RequestMethod.GET)
    	public String showSearchForm() {
    		return "customerList";
    }

	@RequestMapping(path="/customerSearch", method=RequestMethod.GET)
	public String showCustomerList(@RequestParam String search, String sort, ModelMap modelHolder) {
    	
    	
    	List<Customer> matchingCustomers = customerDao.searchAndSortCustomers(search, sort);
    	modelHolder.put("customer", matchingCustomers);
		return "customerList";
    
	}
}