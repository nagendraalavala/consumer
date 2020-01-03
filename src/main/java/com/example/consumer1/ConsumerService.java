package com.example.consumer1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService
{

    @Autowired
    private ConsumerRepo consumerRepo;

//    private RestTemplate restTemplate;
//
//    @Autowired
//    public ConsumerService(ConsumerRepo consumerRepo, RestTemplate restTemplate) {
//        this.consumerRepo = consumerRepo;
//        this.restTemplate = restTemplate;
//    }


    private ConsumeFeign consumeFeign;



    public ConsumerEntity savedata(ConsumerEntity consumerEntity)

    {

        GmailUsers response= consumeFeign.findbyid(consumerEntity.getId());
        if (response.getAge()>18)
        {
            ConsumerEntity consumerEntity1=consumerRepo.save(consumerEntity);
            return consumerEntity1;
        }
        else
        {
            throw new RuntimeException("Access Denied");
        }

    }





}
