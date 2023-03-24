package com.nighthawk.spring_portfolio.database.challenge;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nighthawk.spring_portfolio.database.person.Person;

public interface GradeJpaRepository extends JpaRepository<Assignment, Long> {
    List<Grade> findAllById(Long id);

    List<Grade> findAllByPerson(Person person);

    List<Grade> findAllByOrderByIdAsc();

    // Custom JPA query
    @Query(value = "SELECT * FROM Person p WHERE p.name LIKE ?1 or p.email LIKE ?1", nativeQuery = true)
    List<Assignment> findByLikeTermNative(String term);
}