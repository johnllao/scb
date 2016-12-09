package phonebook.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import phonebook.models.Friend;

public interface FriendsRepository extends PagingAndSortingRepository<Friend, Integer> {
	Iterable<Friend> findByNameContaining(final String name);
}
