package com.ebenezerdiaz.cmc.web.controller;

import com.ebenezerdiaz.cmc.domain.service.UserService;
import com.ebenezerdiaz.cmc.persistence.entity.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    private UserService userService;

    public UsuarioController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/vistaUsuarios")
    public String vistaUsuarios(Model model) {
        model.addAttribute("usuarios", userService.getUsuarios());
        return "view-users";
    }

    @GetMapping("/agregarUsuario")
    public String addUserView(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "add-user";
    }

    @PostMapping("/agregarUsuario")
    public RedirectView addUser(@ModelAttribute("usuario") Usuario usuario,
                                RedirectAttributes redirectAttributes) {
        final RedirectView redirectView = new RedirectView("/usuario/agregarUsuario",
                true);
        Usuario savedUser = userService.insert(usuario);
        redirectAttributes.addFlashAttribute("saveduser", savedUser);
        redirectAttributes.addFlashAttribute("addUserSuccess", true);
        return redirectView;
    }
}
