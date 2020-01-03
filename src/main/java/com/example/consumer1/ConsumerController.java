package com.example.consumer1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ConsumerController
{

    @Autowired
    private ConsumerService consumerService;

    @PostMapping("/consumeradd")
    public ConsumerEntity save(ConsumerEntity consumerEntity)
    {
        return consumerService.savedata(consumerEntity);
    }
}
