package io.swagger.model.db;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ATMRepository extends JpaRepository<CustomersATMData, ATMDetails> {

}
