package com.example.barcodereader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BarcodeController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/scan")
    public String scanBarcode(@RequestParam("barcode") String barcode, Model model) {
        // Validação básica para EAN-13 (13 dígitos)
//        if (barcode != null && barcode.matches("\\d{13}")) {
//            model.addAttribute("barcode", barcode);
//            model.addAttribute("success", true);
//            model.addAttribute("message", "Código de barras lido com sucesso!");
//        } else {
//            model.addAttribute("success", false);
//            model.addAttribute("message", "Código inválido! EAN-13 deve ter 13 dígitos.");
//        }


        model.addAttribute("barcode", barcode);
        model.addAttribute("success", true);
        model.addAttribute("message", "Código de barras lido com sucesso!");
        
        return "index";
    }
}
