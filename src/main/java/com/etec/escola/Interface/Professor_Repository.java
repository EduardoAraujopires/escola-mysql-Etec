package com.etec.escola.Interface;

import com.etec.escola.Models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Professor_Repository extends JpaRepository <Professor, Long> {
}
