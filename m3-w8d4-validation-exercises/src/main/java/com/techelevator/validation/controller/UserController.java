package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {
	// GET: /
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view
	@RequestMapping(path="/register", method=RequestMethod.GET)
	public String getRegistrationForm(ModelMap modelHolder) {
		System.out.println(modelHolder);
		if(! modelHolder.containsAttribute("registration")) {
			modelHolder.put("registration", new Registration());
		}
		return "registration";
	}

	
	
	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)
	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String processRegistration (@Valid @ModelAttribute Registration regData, BindingResult result, RedirectAttributes flash) { 
		if(result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX+ "registration", result);
			flash.addFlashAttribute("registration", regData);
			System.out.println("Errors!");
			return "redirect:/register";
		}
		//"@Valid" runs all the validations in the Registration.java. 
		//"@ModelAttribute Registration regData" takes all the info from the FORM and put them into an object, sort of like how @RequestParam takes parameters and uses them?
		//"BindingResult will hold info about what errors were submitted when this ran, it links to the IF() statment.
		
		flash.addFlashAttribute("message", "You are registered! Good job. Call your mum.");
		return"redirect:/";
	}
	
	
	// GET: /login
	// Return the empty login view
	
	@RequestMapping(path="/login", method=RequestMethod.GET)
	public String getLoginPage(ModelMap modelHolder) {
		System.out.println(modelHolder);
		if(! modelHolder.containsAttribute("login")) {
			modelHolder.put("login", new Login());
		}
		return "login";
	}

	// POST: /login
	// Validate the model and redirect to login (if successful) or return the
	// login view (if validation fails)
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String processLogin (@Valid @ModelAttribute Login regData, BindingResult result, RedirectAttributes flash) { 
		if(result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX+ "login", result);
			flash.addFlashAttribute("login", regData);
			System.out.println("Errors!");
			return "redirect:/login";
		}
		
		flash.addFlashAttribute("message", "You are logged in! Good job. Call your mum.");
		return "redirect:/loginConfirmation";
	}
	
	

	// GET: /confirmation
	// Return the confirmation view
	@RequestMapping(path="/loginConfirmation", method=RequestMethod.GET)
	public String getLoginConfimationScreen() {
		return "loginConfirmation";
	}
}
