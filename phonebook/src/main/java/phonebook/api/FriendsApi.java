package phonebook.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import phonebook.models.Friend;
import phonebook.repositories.FriendsRepository;

@RestController
@RequestMapping(value="api")
public class FriendsApi {

	@Autowired	
	private FriendsRepository repo;
	
	@GetMapping(value="friends")
	@ResponseBody
	public Iterable<Friend> friends(@RequestParam(value="q", required=false) final String q) {
		Iterable<Friend> result = null;
		
		if (q == null) {
			result = repo.findAll();
		}
		else {
			result = repo.findByNameContaining(q);
		}
		
		return result;
	}
	
	@GetMapping(value="friends/{id}")
	public Friend friend(@PathVariable("id") final Integer id) {
		return repo.findOne(id);
	}
	
	@PostMapping(value="friends")
	public Friend insert(@RequestBody final Friend friend) {
		return friend;
	}
	
	@PutMapping(value="friends/{id}")
	public Friend update(@PathVariable("id") final Integer id, @RequestBody final Friend friend) {
		return friend;
	}
}
