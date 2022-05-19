package com.nokerakuta.controllers;

import com.nokerakuta.config.TestProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestPropertiesController {

  @Autowired
  TestProperties testProperties;

  @GetMapping("/testProperties")
  public TestProperties getTestProperties() {
    return testProperties;
  }
}
