package com.example.demo.app.survey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/survey")
public class SurveyController {
	
	@GetMapping("/form")
	public String formGet(SurveyForm surveyForm, Model model) {
		model.addAttribute("title", "Survey Form");

		return "survey/form";
	}
	
	@PostMapping("/form")
	public String formPost(SurveyForm surveyForm, Model model) {
		model.addAttribute("title", "戻ってきたタイトル");
		return "survey/form";
	}
	

	@PostMapping("/confirm")
	public String confirm(@Validated SurveyForm surveyForm, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("title", "Survey Form");
			return "survey/form";
		}
		model.addAttribute("title", " Confirm Page");
		return "survey/confirm";

	}
	
	@PostMapping("/complete")
	public String completePost(SurveyForm surveyForm, Model model) {
		model.addAttribute("title", "コンプリートタイトル");
		return "survey/form";
	}

}
