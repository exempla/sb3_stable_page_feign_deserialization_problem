package com.example.demo;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller implements Api {
  public static final Page<Integer> PAGE = new PageImpl<>(List.of(1, 2, 3), PageRequest.of(0, 3), 10);

  @Override
  public Page<Integer> page() {
    return PAGE;
  }
}
