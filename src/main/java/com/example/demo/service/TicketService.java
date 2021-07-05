package com.example.demo.service;

import com.example.demo.model.Ticket;
import com.example.demo.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketService implements ITicketService{
    @Autowired
    private TicketRepository ticketRepository;
    @Override
    public List<Ticket> findALl() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket save(Ticket t) {
        return ticketRepository.save(t);
    }
}
