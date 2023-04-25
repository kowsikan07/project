package com.example.demo.service;


	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.example.demo.model.CustomerDetails;
	import com.example.demo.repository.CustomrREPO;
	@Service
	public class CustomerService {
		@Autowired
		CustomrREPO repobj;
		
		public String addCustomer(CustomerDetails pojobj)
		{
			repobj.save(pojobj);
		return"Added";
		}
		
		public List<CustomerDetails>getCustomer()
		{
			return repobj.findAll();
		}
		
		public Optional<CustomerDetails>getCustomerById(int id)
		{
			return repobj.findById(id);
		}
		public String updatecustomerdetails(CustomerDetails customer)
		{
			 repobj.save(customer);
			 return "updated";
		}

		public void DeleteByRequestParam(int id) {
			// TODO Auto-generated method stub
			repobj.deleteById(id);
		}

	}

