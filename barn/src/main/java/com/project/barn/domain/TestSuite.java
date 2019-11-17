package com.project.barn.domain;

import org.springframework.security.access.prepost.PreAuthorize;

import javax.persistence.*;
import java.util.Set;

@Entity
public class TestSuite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    @ManyToMany(mappedBy = "testSuites")
    private Set<User> testers;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<TestCase> testCases;

    public TestSuite(){}

    public TestSuite(String name, User author){
        this.name = name;
        this.author = author;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

//    public Set<User> getTesters() {
//        return testers;
//    }
//
//    public void setTesters(Set<User> testers) {
//        this.testers = testers;
//    }

    public Set<TestCase> getTestCases() {
        return testCases;
    }

    public void setTestCases(Set<TestCase> testCases) {
        this.testCases = testCases;
    }
}
