package edu.escuelaing.arsw.ASE.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    private CalculatorModel calculatorModel = CalculatorModel.getInstance();

    @GetMapping("/")
    public String showCalculator(Model model) {
        model.addAttribute("calculatorModel", calculatorModel);
        model.addAttribute("result", calculatorModel.getResult());
        return "calculator";
    }

    @PostMapping("/calculate")
    public String calculate(@ModelAttribute CalculatorModel modelInput, Model model) {
        double result = 0;
        switch (modelInput.getOperation()) {
            case "+":
                result = calculatorModel.getResult() + modelInput.getNumber1();
                break;
            case "-":
                result = calculatorModel.getResult() - modelInput.getNumber1();
                break;
            case "*":
                result = calculatorModel.getResult() * modelInput.getNumber1();
                break;
            case "/":
                result = calculatorModel.getResult() / modelInput.getNumber1();
                break;
            case "AC":
                calculatorModel.setResult(0.0);
        }
        calculatorModel.setResult(result);
        model.addAttribute("result", result);
        model.addAttribute("calculatorModel", calculatorModel);
        return "calculator";
    }

}

