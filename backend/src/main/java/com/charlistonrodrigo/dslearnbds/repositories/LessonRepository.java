package com.charlistonrodrigo.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charlistonrodrigo.dslearnbds.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{

}
