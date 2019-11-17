package com.project.barn.repos;

import com.project.barn.domain.TestSuite;
import com.project.barn.domain.User;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.repository.CrudRepository;

public interface TestSuiteRepo extends CrudRepository<TestSuite, Long> {

    Iterable<TestSuite> findAllByAuthor(User author);



}
