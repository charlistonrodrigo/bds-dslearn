package com.charlistonrodrigo.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charlistonrodrigo.dslearnbds.entities.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {

}
