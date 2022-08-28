package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.customer.model.Model;
@Repository
public interface CustomerRepo extends JpaRepository<Model, Long>{

	Model getByCid(Long cid);

}
