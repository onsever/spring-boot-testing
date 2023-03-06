package com.onurcansever.springboot.repository;

import com.onurcansever.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

// @DataJpaTest: This annotation is used to test the persistence layer. It configures an in-memory database, Hibernate, Spring Data, and the DataSource, as well as performing an @EntityScan and enabling SQL logging. It doesn't load the full application context (Controller, Service, etc..), so we can write some fast unit tests for our persistence layer. It scans for @Entity classes and @Repository classes. By default, test cases are transactional and rolled back at the end of each test.
