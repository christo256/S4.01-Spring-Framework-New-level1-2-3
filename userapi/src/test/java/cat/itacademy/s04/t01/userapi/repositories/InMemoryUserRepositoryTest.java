package cat.itacademy.s04.t01.userapi.repositories;

import cat.itacademy.s04.t01.userapi.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InMemoryUserRepositoryTest {

    private InMemoryUserRepository repository;

    @BeforeEach
    void setUp() {
        repository = new InMemoryUserRepository();
    }

    @Test
    void save_shouldStoreUser() {
        User user = new User(UUID.randomUUID(), "Ada", "ada@test.com");

        repository.save(user);

        assertEquals(1, repository.findAll().size());
    }

    @Test
    void findById_shouldReturnUserWhenExists() {
        User user = new User(UUID.randomUUID(), "Ada", "ada@test.com");
        repository.save(user);

        Optional<User> result = repository.findById(user.getId());

        assertTrue(result.isPresent());
        assertEquals("Ada", result.get().getName());
    }

    @Test
    void findById_shouldReturnEmptyWhenNotExists() {
        Optional<User> result = repository.findById(UUID.randomUUID());

        assertTrue(result.isEmpty());
    }

    @Test
    void searchByName_shouldFilterByNameIgnoringCase() {
        repository.save(new User(UUID.randomUUID(), "Antonio", "a@test.com"));
        repository.save(new User(UUID.randomUUID(), "Ada Lovelace", "b@test.com"));

        List<User> result = repository.searchByName("ada");

        assertEquals(1, result.size());
        assertEquals("Ada Lovelace", result.getFirst().getName());
    }

    @Test
    void existsByEmail_shouldReturnTrueWhenEmailExists() {
        repository.save(new User(UUID.randomUUID(), "Ada", "ada@test.com"));

        assertTrue(repository.existsByEmail("ada@test.com"));
    }
}

