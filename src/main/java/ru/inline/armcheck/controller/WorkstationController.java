package ru.inline.armcheck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.inline.armcheck.domain.TypePC;
import ru.inline.armcheck.service.WorkstationsService;

@Controller
@RequestMapping("/arm")
public class WorkstationController {

    private final WorkstationsService workstationsService;

    public WorkstationController(WorkstationsService workstationsService) {
        this.workstationsService = workstationsService;
    }

    @GetMapping
    public String listAll(Model model) {
        model.addAttribute("workstationsAll", workstationsService);
        model.addAttribute("typesPC", TypePC.values());
        return "workstationList";
    }
}
