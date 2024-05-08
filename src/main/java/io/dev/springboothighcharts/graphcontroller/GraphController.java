package io.dev.springboothighcharts.graphcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class GraphController {

    @GetMapping("/displayBarGraph")
    public String barGraph(Model model) {
        Map<String, Integer> surveyMap = new LinkedHashMap<>();
        surveyMap.put("Java", 55);
        surveyMap.put("Python", 25);
        surveyMap.put(".Net", 7);
        surveyMap.put("Javascript", 10);
        surveyMap.put("Dev-ops", 3);
        model.addAttribute("surveyMap", surveyMap);
        return "barGraph";
    }

    @GetMapping("/displayPieChart")
    public String pieChart(Model model) {
        model.addAttribute("pass", 70);
        model.addAttribute("fail", 30);
        return "pieChart";
    }
}
