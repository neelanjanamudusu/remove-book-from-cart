package com.capgemini.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.RemoveBookEntity;

@Repository
public interface RemoveBookDao extends JpaRepository<RemoveBookEntity, Integer>  {

}
