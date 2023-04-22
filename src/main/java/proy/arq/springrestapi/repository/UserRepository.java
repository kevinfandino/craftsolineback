package proy.arq.springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import proy.arq.springrestapi.model.UserInfo;


@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long> {

}
