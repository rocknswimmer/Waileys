package waileys.data;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import waileys.models.Leg;

import java.util.List;

@Repository
public class LegJdbcTemplateRepository implements LegRepository{
    private final JdbcTemplate jdbcTemplate;

    public LegJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Leg> findAll() {
        //the function that is causing me to evaluate what I  am doing while converting
        return List.of();
    }

    @Override
    public Leg findById(int legId) {
        return null;
    }

    @Override
    public Leg update(Leg leg) {
        return null;
    }
}
