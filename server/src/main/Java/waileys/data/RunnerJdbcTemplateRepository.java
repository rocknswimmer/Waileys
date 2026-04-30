package waileys.data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import waileys.models.Runner;

import java.util.List;

@Repository
public class RunnerJdbcTemplateRepository implements RunnerRepository {
    private final JdbcTemplate jdbcTemplate;

    public RunnerJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Runner> findAll() {
        return List.of();
    }

    @Override
    public Runner findById(int runnerId) {
        return null;
    }
}
