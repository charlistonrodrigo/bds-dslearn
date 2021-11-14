package com.charlistonrodrigo.dslearnbds.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charlistonrodrigo.dslearnbds.entities.Enrollment;
import com.charlistonrodrigo.dslearnbds.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK>{

}
