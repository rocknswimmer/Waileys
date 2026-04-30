package waileys.data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import waileys.data.mappers.RunnerMapper;
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
        final String sql = "select runner_id, runner as runner_name, pace from runners;";

        return jdbcTemplate.query(sql, new RunnerMapper());
    }

    @Override
    public Runner findById(int runnerId) {
        final String sql = "select runner_id, runner as runner_name, pace from runners where id = ?;";

        return jdbcTemplate.query(sql, new RunnerMapper(), runnerId).stream()
                .findFirst().orElse(null);
    }
}
