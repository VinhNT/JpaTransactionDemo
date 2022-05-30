package com.transaction.controller;

import com.transaction.service.TestNoTransactionService;
import com.transaction.service.TestTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestTransactionController {

  @Autowired
  private TestTransactionService testEntityService;
  @Autowired
  private TestNoTransactionService testNoTransactionService;

  @GetMapping
  public String testTransaction() throws InterruptedException {
    testEntityService.methodWithTransaction();
    testNoTransactionService.methodWithNoTransaction();
    return "OK";
  }
}
