package com.techelevator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

@Controller 
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	/* What request mapping do we want here */
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String showSearchActorForm() {
		return "actorList";
	}

	/* What about here? */
	@RequestMapping(path="/actorList", method=RequestMethod.GET)
	public String searchActors(@RequestParam String nameSearch, ModelMap modelHolder) {
		/* Call the model and pass values to the jsp */
		List<Actor> listOfActors = actorDao.getMatchingActors(nameSearch);
		modelHolder.put("actorsInJSP", listOfActors);

		return "actorList";
	}
}
