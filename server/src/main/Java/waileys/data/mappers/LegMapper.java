package waileys.data.mappers;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import waileys.models.Leg;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class LegMapper implements RowMapper<Leg> {
    @Override
    public Leg mapRow(ResultSet resultSet, int i) throws SQLException {
        Leg leg = new Leg();
        leg.setLegId(resultSet.getInt("leg_id"));
        leg.setRunnerId(resultSet.getInt("runner_id"));
        leg.setDistance(resultSet.getFloat("distance"));
        leg.setComplete(resultSet.getBoolean("complete"));
        leg.setDifferance(resultSet.getString("dif"));
        leg.setStart_time(resultSet.getString("start_time"));
        leg.setEnd_time(resultSet.getString("end_time"));
        leg.setMountain_start(resultSet.getString("mountain_start"));
        leg.setMountain_end(resultSet.getString("mountain_end"));
        leg.setPacific_start(resultSet.getString("pacific_start"));
        leg.setPacific_end(resultSet.getString("pacific_end"));


        return leg;
    }
}
