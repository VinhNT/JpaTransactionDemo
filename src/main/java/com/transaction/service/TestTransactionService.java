package com.transaction.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class TestTransactionService {

  public void methodWithTransaction() {
    log.info("Start Transaction");
  }
}
