package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;

public interface Api {
  @GetMapping("/")
  Page<Integer> page();
}
