package me.eltacshikhsaidov.matrixrain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatrixRainController {
    @GetMapping("/")
    public String matrixRainPage() {
        return "matrix_rain";
    }
}
