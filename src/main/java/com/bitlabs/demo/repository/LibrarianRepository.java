package com.bitlabs.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitlabs.demo.model.Librarian;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian,Integer>{

}
