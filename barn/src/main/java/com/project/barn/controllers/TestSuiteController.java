package com.project.barn.controllers;

import com.project.barn.domain.TestSuite;
import com.project.barn.domain.User;
import com.project.barn.repos.TestSuiteRepo;
import com.project.barn.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/testSuite")
public class TestSuiteController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private TestSuiteRepo testSuiteRepo;


    @GetMapping
    public String getTestSuitesPage(@AuthenticationPrincipal User user, Model model){
        Iterable<TestSuite> testSuites = testSuiteRepo.findAllByAuthor(user);
        model.addAttribute("testSuites", testSuites);



//        model.addAttribute("testSuites", user.getTestSuites());
        return "testSuite";
    }

    @PostMapping
    public String addNewTestSuite(@AuthenticationPrincipal User user, @RequestParam String name, Model model){

        TestSuite testSuite = new TestSuite(name, user);
        testSuiteRepo.save(testSuite);
        return getTestSuitesPage(user, model);
    }






}
