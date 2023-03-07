package RentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import RentACar.entities.concretes.CorporateCustomer;

public interface CorporateCustomerRepository extends JpaRepository<CorporateCustomer, Integer>  {

	boolean existsByName(String name);

}
