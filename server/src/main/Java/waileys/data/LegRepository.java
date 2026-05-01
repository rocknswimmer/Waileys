package waileys.data;

import waileys.models.Leg;

import java.util.List;

public interface LegRepository {
    List<Leg> findAll();

    Leg findById(int legId);

    Leg update(Leg leg); //would one general update or 3 specific updates be better to replace 3 puts
}
