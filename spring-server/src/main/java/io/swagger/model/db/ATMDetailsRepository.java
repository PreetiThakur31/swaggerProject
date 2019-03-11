package io.swagger.model.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ATMDetailsRepository extends JpaRepository<CustomersATMData,Integer>{

	CustomersATMData findByCustomerId(String customerId);

}
