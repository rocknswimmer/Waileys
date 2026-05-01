package waileys.data.mappers;

import waileys.models.Runner;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class RunnerMapper implements RowMapper<Runner> {

    @Override
    public Runner mapRow(ResultSet resultSet, int i) throws SQLException {
        Runner runner = new Runner();
        runner.setRunnerId(resultSet.getInt("runner_id"));
        runner.setName(resultSet.getString("runner_name"));
        runner.setPace(resultSet.getFloat("pace"));

        return runner;
    }
}
