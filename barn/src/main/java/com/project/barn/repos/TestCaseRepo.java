package com.project.barn.repos;

import com.project.barn.domain.TestCase;
import org.springframework.data.repository.CrudRepository;

public interface TestCaseRepo extends CrudRepository<TestCase, Long> {

}
