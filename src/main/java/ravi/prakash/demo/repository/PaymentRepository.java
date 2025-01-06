package ravi.prakash.demo.repository;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ravi.prakash.demo.entity.Payment;
import ravi.prakash.demo.entity.PaymentId;

@Repository
@Hidden
public interface PaymentRepository extends JpaRepository<Payment, PaymentId>, JpaSpecificationExecutor<Payment> {
}