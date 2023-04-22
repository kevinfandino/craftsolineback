package proy.arq.springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proy.arq.springrestapi.model.PurchaseDetails;


@Repository
public interface PurchaseDetailsRepository extends JpaRepository<PurchaseDetails, Long> {

}
