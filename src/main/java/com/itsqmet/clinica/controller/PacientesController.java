package com.itsqmet.clinica.controller;

import com.itsqmet.clinica.modelo.Paciente;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PacientesController {

  /*  @GetMapping("/registroPacientes")
    public String mostrarRegistroPacientes(){
        return "/pages/registroPacientes";
    }*/

    @GetMapping("/listaPacientes")
    public String mostrarListaPacientes(Model model){
        Paciente paciente = new Paciente();
        model.addAttribute("paciente", paciente);
        return "/pages/listaPacientes";
    }

    //mostrar registro
    @GetMapping("/registroPacientes")
    public String mostrarRegistroPacientes(Model model){
        Paciente paciente = new Paciente();
        model.addAttribute("paciente", paciente);
        return "/pages/registroPacientes";
    }

    //enviar datos "/enviarPaciente"
    @PostMapping("/listaPacientes")
    public String enviarPaciente(@Valid @ModelAttribute Paciente paciente,
                                 BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errores", bindingResult.getAllErrors());
            return "pages/registroPacientes";
        } else {
            return "pages/listaPacientes";
        }
    }
}
