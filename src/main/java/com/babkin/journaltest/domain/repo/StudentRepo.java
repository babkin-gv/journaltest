package com.babkin.journaltest.domain.repo;

import com.babkin.journaltest.domain.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepo extends CrudRepository<Student, Long> {
    List<Student> findByGroupp(int groupp);
}
