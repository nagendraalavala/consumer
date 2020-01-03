package com.example.consumer1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "gmailusers",url="localhost:8080")
@Component
public interface ConsumeFeign
{
    @GetMapping("/{id}")
    public GmailUsers findbyid(@PathVariable Integer id);

}
