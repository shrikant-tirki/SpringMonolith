package com.bel.training.ims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bel.training.ims.model.Address;
import com.bel.training.ims.model.Dealer;
import com.bel.training.ims.model.DealerAddress;

public interface UserRepository extends CrudRepository<Dealer, Long> {

	//Fetch record/object by fields or non primary key
	public Dealer findByEmail(String email);
	//Custom queries using jpql in crud repo
	@Query("SELECT new com.bel.training.ims.model.DealerAddress(d.id,d.email,d.fname,d.lname,"
			+ "d.password,d.dob,d.phoneNo,a.street,a.city,a.pincode) "
			+ "FROM Dealer d INNER JOIN d.address a")
	List<DealerAddress> fetchDealerInnerJoin();
}
