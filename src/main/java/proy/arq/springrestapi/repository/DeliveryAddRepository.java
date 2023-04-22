package proy.arq.springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proy.arq.springrestapi.model.DeliveryAdd;

@Repository
public interface DeliveryAddRepository extends JpaRepository<DeliveryAdd, Long> {

}
