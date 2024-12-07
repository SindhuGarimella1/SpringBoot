package klu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import klu.model.CustomerManager;

public interface CustomerRepository extends JpaRepository<CustomerManager, Integer> {
}
