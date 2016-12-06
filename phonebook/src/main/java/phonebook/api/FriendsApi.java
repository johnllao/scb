package phonebook.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import phonebook.models.Friend;
import phonebook.repositories.FriendsRepository;

@RestController
@RequestMapping(value="api")
public class FriendsApi {

	@Autowired
	private FriendsRepository repo;
	
	@RequestMapping(value="friends", method=RequestMethod.GET)
	public Iterable<Friend> friends() {
		return repo.findAll();
	}
	
	@RequestMapping(value="friends/{id}", method=RequestMethod.GET)
	public Friend friend(@PathVariable("id") Integer id) {
		return repo.findOne(id);
	}
}
