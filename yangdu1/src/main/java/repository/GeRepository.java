package repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import domain.Ge;

public interface GeRepository {
      List<Ge> fandAll();
     // void save(Map<String,Object> user);
      void save(@Param("name")String name,@Param("password")String password);
      void delete(Integer id);
      void update(Ge ge);
}
