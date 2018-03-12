package com.techelevator;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller
public class SquirrelPartyController
{

	@Autowired
	ReviewDao reviewDao;
	// The controller needs a reviewDao, but we don't make it, SPRING makes it and
	// hands it to us

	@RequestMapping("/")
	public String displayReviews(ModelMap modelHolder)
	{
		List<Review> review = reviewDao.getAllReviews();
		modelHolder.put("reviews", review);
		return "review";
	}

	@RequestMapping("/reviewInput")
	public String reviewInput() {
		return "reviewInput";	
	}

	@RequestMapping(path="/submitReview", method=RequestMethod.POST)
	public String submitReview(
			//@RequestParam Long review_id, 
			@RequestParam String username,
			@RequestParam int rating, 
			@RequestParam String review_title, 
			@RequestParam String review_text 
			/*, @RequestParam LocalDateTime review_date*/ 
			) {
	//public String submitReview(@RequestParam String userName, @RequestParam String text){
		Review r = new Review();
		//r.setId(review_id);
		r.setUsername(username);
		r.setRating(rating);
		r.setTitle(review_title);
		r.setText(review_text);
		r.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(r);
		return "redirect:/";
	}
}
