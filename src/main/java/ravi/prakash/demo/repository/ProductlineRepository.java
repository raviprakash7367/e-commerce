package ravi.prakash.demo.repository;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ravi.prakash.demo.entity.Productline;

@Repository
@Hidden
public interface ProductlineRepository extends JpaRepository<Productline, String>, JpaSpecificationExecutor<Productline> {
}