package ru.kata.spring.rest.JS.DAO;

import ru.kata.spring.rest.JS.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {
}