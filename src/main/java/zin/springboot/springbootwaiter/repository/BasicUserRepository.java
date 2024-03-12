package zin.springboot.springbootwaiter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import zin.springboot.springbootwaiter.model.BasicUser;

@Repository
public interface BasicUserRepository extends JpaRepository<BasicUser, Long>{

    
} 