package waileys.data;

import java.util.List;
import waileys.models.Runner;

public interface RunnerRepository {
    List<Runner> findAll();

    Runner findById(int runnerId);
}
