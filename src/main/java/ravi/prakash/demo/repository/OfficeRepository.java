package ravi.prakash.demo.repository;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ravi.prakash.demo.entity.Office;

@Repository
@Hidden
public interface OfficeRepository extends JpaRepository<Office, String>, JpaSpecificationExecutor<Office> {
}