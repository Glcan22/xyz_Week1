package com.example.crudapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class WebController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // login.html dosyasını render eder
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam String username, @RequestParam String password, Model model) {
        // Giriş işlevini burada yapabilirsiniz (örneğin, kimlik doğrulama)

        // Örnek olarak, verileri model'e ekleyip geri döneriz
        model.addAttribute("username", username);
        return "login"; // Başarılı bir giriş sonrası yönlendirme yapılabilir
    }
}
