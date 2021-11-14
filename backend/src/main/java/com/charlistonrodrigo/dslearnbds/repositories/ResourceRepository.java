package com.charlistonrodrigo.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charlistonrodrigo.dslearnbds.entities.Resource;

public interface ResourceRepository extends JpaRepository<Resource, Long> {

}
