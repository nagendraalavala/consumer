package com.example.consumer1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepo extends CrudRepository<ConsumerEntity,Integer>
{

}