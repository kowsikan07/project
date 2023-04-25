package com.example.demo.repository;


	import org.springframework.data.jpa.repository.JpaRepository;

	import com.example.demo.model.CustomerDetails;

	public interface CustomrREPO extends JpaRepository<CustomerDetails,Integer>{

	}

