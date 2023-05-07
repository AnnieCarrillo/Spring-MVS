package ico.fes.intro.controllers;

import ico.fes.intro.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Principal {
    @GetMapping("/Inicio")
    public String getInicio(Model model){
        Empleado emp = new Empleado(1, "Ana Guadalupe", 25000, "Desarrollo","31/03/2000");
        model.addAttribute("Empleado", emp);
        return "index";
    }

}
