package RentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import RentACar.entities.concretes.Model;

public interface ModelRepository extends JpaRepository<Model, Integer> {

	boolean existsByName(String name);  // look at spring jpa keywords
}
