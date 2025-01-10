package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "client", url = "http://localhost:8080")
public interface Client extends Api {
}
