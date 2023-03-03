package com.example.paf_assess.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.paf_assess.models.Account;
import com.example.paf_assess.models.Transfer;
import com.example.paf_assess.services.FundsTransferService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@Controller
@RequestMapping(path="/")
public class FundsTransferController {
    @Autowired
    FundsTransferService fundsTransferSvc;

    @Autowired
    ApplicationArguments appArgs;

    @GetMapping()
    public String findAllAccount(Model model)
    {
        // System.out.println((fundsTransferSvc.findAll()).toString());
        // System.out.println("----------------index---------------");
        List<Account> results = fundsTransferSvc.findAll();
        model.addAttribute("transfer",new Transfer());
        model.addAttribute("listaccount", results);
        return "view0";
        //return "view0";
    }

    @PostMapping(value = "/transfer")
    public String saveOrder(@Valid Transfer transfer, BindingResult bindResult,
                Model model, HttpServletResponse response) throws IOException{ 
        if(bindResult.hasErrors()){   
            List<Account> results = fundsTransferSvc.findAll();
            model.addAttribute("listaccount", results);       
            return "view0";
        }
        return "view1";
    }

    
}
