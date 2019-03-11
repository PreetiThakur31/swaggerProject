package io.swagger.model.db;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TollBankRepository extends JpaRepository<CustomerData,Integer>{
    
	void deleteByCustomerId(String customerId);

	CustomerData findByCustomerId(String customerId);
}
