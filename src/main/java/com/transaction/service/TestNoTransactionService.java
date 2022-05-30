package com.transaction.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TestNoTransactionService {

  public void methodWithNoTransaction() throws InterruptedException {
    log.info("No Transaction - Start");
    Thread.sleep(15000);
    log.info("No Transaction - Done");
  }
}
