package edu.escuelaing.arsw.ASE.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * CalculatorController class that handles the web requests for the calculator application.
 * It interacts with the CalculatorModel to perform calculations and update the result.
 */
@Controller
public class CalculatorController {

    private CalculatorModel calculatorModel = CalculatorModel.getInstance();

    /**
     * Handles GET requests to the root URL ("/").
     * Displays the calculator page with the current model and result.
     *
     * @param model the model to which attributes are added
     * @return the name of the view to render ("calculator")
     */
    @GetMapping("/")
    public String showCalculator(Model model) {
        model.addAttribute("calculatorModel", calculatorModel);
        model.addAttribute("result", calculatorModel.getResult());
        return "Calculator";
    }

    /**
     * Handles POST requests to the "/calculate" URL.
     * Performs the calculation based on the operation and number provided in the modelInput.
     *
     * @param modelInput the input model containing the number and operation
     * @param model the model to which attributes are added
     * @return the name of the view to render ("calculator")
     */
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
        return "Calculator";
    }

}

