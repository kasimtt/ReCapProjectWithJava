package RentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import RentACar.entities.concretes.Car;
@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
