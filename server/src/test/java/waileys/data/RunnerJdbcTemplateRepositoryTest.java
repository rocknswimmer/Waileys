package waileys.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import waileys.models.Runner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RunnerJdbcTemplateRepositoryTest {
    @Autowired
    RunnerJdbcTemplateRepository repository;

    @Autowired
    KnownGoodState knownGoodState;

    @BeforeEach
    void setup(){
        knownGoodState.set();
    }

    @Test
    void shouldFindAll(){
        List<Runner> runners = repository.findAll();
        assertNotNull(runners);
        assertTrue(runners.size() > 0);
    }


}