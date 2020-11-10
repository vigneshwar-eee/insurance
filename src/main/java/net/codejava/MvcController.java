package net.codejava;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MvcController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Going home...");
		return "index";
	}
	
	@GetMapping("/register")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		
		return "register_form";
	}
	
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("user") User user) {

		if (user != null) {
			
			int age=Integer.parseInt(user.getAge());
			double premium=0d;
			
			if (age < 18) {
				premium = 5000d;
			} else {
				premium=5000d;
				
				int increment=0;
				
				if ((18 <= age && age <= 25) || age > 25 ) {
					
					premium=((premium*110)/100);
					
				}
				if ((25 < age && age <= 30) || age > 30) {
					premium = ((premium * 110) / 100);
				}
				if ((30 <= age && age <= 35) || age > 35) {
					premium = ((premium * 110) / 100);
				}
				if ((35 <= age && age <= 40) || age > 40) {
					premium = ((premium * 110) / 100);
				}
				if (40 < age) {
					premium = ((premium * 120) / 100);
				}
				
				
			
				if (user.getGender().equals("Male")) {
					premium=updatePremium(premium, 2);
				}
				
				//Current health
				if (user.isHypertension()) {
					premium=updatePremium(premium, 1);
				}
				if (user.isBloodPressure()) {
					premium=updatePremium(premium, 1);
				}
				if (user.isBloodSugar()) {
					premium=updatePremium(premium, 1);
				}
				if (user.isOverWeight()) {
					premium=updatePremium(premium, 1);
				}

				//Habits
				if (user.isSmoking()) {
					premium=updatePremium(premium, 1);
				}
				if (user.isBloodPressure()) {
					premium=updatePremium(premium, 3);
				}
				if (user.isBloodSugar()) {
					premium=updatePremium(premium, 1);
				}
				if (user.isOverWeight()) {
					premium=updatePremium(premium, 1);
				}
				if (user.isSmoking()) {
					premium=updatePremium(premium, 3);
				}
				if (user.isAlcohol()) {
					premium=updatePremium(premium, 3);
				}
				if (user.isDailyExercise()) {
					premium=updatePremium(premium, 3);
				}
				if (user.isDrugs()) {
					premium=updatePremium(premium, 3);
				}

				
			}
			
			DecimalFormat df = new DecimalFormat("#.##");
	        df.setRoundingMode(RoundingMode.HALF_DOWN );

			String resultString = df.format(premium);
			double res = Double.valueOf(resultString);
			
			user.setPremium(res);
		}
		
		System.out.println(user);
		return "register_success";
	}
	
	double updatePremium(double premium, int percentNeed) {

		percentNeed = 100 + percentNeed;
		premium = (premium*(percentNeed)) / 100;
		return premium;
	}
}
