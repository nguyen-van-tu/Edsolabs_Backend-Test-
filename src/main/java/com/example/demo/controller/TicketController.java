package com.example.demo.controller;

import com.example.demo.model.Department;
import com.example.demo.model.Ticket;
import com.example.demo.service.ITicketService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private ITicketService ticketService;

    @GetMapping("")
    public ResponseEntity<Iterable<Ticket>> getAll() {
        return new ResponseEntity<>(ticketService.findALl(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Ticket> create(@RequestBody Ticket ticket) {
        Ticket ticket1 = new Ticket(ticket.getDepartment(), ticket.getNumberPhone(),
                ticket.getTicketProcessing(), ticket.getReceptionTime());
        ticketService.save(ticket1);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
