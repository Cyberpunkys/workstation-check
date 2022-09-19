package ru.inline.armcheck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.inline.armcheck.domain.OperationSystem;
import ru.inline.armcheck.service.OperationSystemService;

@Controller
@RequestMapping("/os")
public class OperationSystemsController {

    private final OperationSystemService operationSystemService;

    public OperationSystemsController(OperationSystemService operationSystemService) {
        this.operationSystemService = operationSystemService;
    }

    @GetMapping
    public String list(Model model) {
        model.addAttribute("ListOS", operationSystemService.findAll());
        return "osList";
    }

    @PostMapping
    public String add(@RequestParam("name") String name) {
        OperationSystem operationSystem = new OperationSystem();
        operationSystem.setName(name);
        operationSystemService.create(operationSystem);

        return "redirect:/os";
    }
}
