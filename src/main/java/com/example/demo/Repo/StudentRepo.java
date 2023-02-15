package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.Entity.Student;

@RepositoryRestResource(collectionResourceRel="/key")
public interface StudentRepo  extends JpaRepository<Student, Integer> {

}
