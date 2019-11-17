package com.project.barn.controllers;

import com.project.barn.domain.TestCase;
import com.project.barn.domain.User;
import com.project.barn.repos.TestCaseRepo;
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

import java.util.Optional;

@Controller
public class TestCaseController {

    @Autowired
    private TestCaseRepo testCaseRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private TestSuiteRepo testSuiteRepo;

    @PostMapping("/main")
    public String add(
            @AuthenticationPrincipal User user,
            @RequestParam String title,  @RequestParam String summary, Model model){
        TestCase testCase = new TestCase(title, summary, user);

        testCaseRepo.save(testCase);

        Iterable<TestCase> testCases = testCaseRepo.findAll();

        model.addAttribute("testCases", testCases);

        return "main";
    }

    public void editTestCase(){}

    @GetMapping("/main")
    public String getTCList(Model model){
        Iterable<TestCase> testCases = testCaseRepo.findAll();

        model.addAttribute("testCases", testCases);
        return "main";
    }

    @GetMapping("/getTC")
    public String getTestCase(@AuthenticationPrincipal User user, @RequestParam Long id, Model model){


        Optional<TestCase> testCases = testCaseRepo.findById(id);
        TestCase testCase = testCases.get();

        model.addAttribute("title", testCase.getTitle());
        model.addAttribute("summary", testCase.getSummary());
        model.addAttribute("author", (testCase.getAuthor()!=null)?testCase.getAuthor().getUsername():"");


        Iterable<TestCase> testCases1 = testCaseRepo.findAll();

        model.addAttribute("testCases", testCases1);



        return "main";
    }

    public void deleteTestCase(){}

    ////////

    @GetMapping("/tcOfTestSuite")
    public String getTCListByTS(@AuthenticationPrincipal User user, @RequestParam Long id, Model model){
        Iterable<TestCase> testCases = testSuiteRepo.findById(id).get().getTestCases();


        model.addAttribute("testCases", testCases);
        return "main";
    }

    @PostMapping("/tcOfTestSuite")
    public String addTCToTS(@AuthenticationPrincipal User user, @RequestParam Long id, Model model){
        Iterable<TestCase> testCases = testSuiteRepo.findById(id).get().getTestCases();

        model.addAttribute("testCases", testCases);
        return "main";
    }


}
