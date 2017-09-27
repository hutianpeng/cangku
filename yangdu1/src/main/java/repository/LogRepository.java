package repository;

import java.util.List;

import domain.Ge;
import domain.Log;

public interface LogRepository {
       void save(Log log);
       List<Log> fandAll(Ge ge);
}
