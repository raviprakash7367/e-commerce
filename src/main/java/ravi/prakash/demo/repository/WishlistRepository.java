package ravi.prakash.demo.repository;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ravi.prakash.demo.entity.Wishlist;
import ravi.prakash.demo.entity.WishlistId;

import java.util.Set;

@Repository
@Hidden
public interface WishlistRepository extends JpaRepository<Wishlist, WishlistId>, JpaSpecificationExecutor<Wishlist> {
    Set<Wishlist> findDistinctByCustomerId(Integer customerId);
}