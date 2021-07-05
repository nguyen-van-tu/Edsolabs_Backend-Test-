package com.example.demo.service;

import com.example.demo.model.Department;
import com.example.demo.model.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ITicketService {
    List<Ticket> findALl();

    Ticket save(Ticket t);

}
