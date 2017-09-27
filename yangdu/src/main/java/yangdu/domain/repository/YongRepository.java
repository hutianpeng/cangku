package yangdu.domain.repository;

import java.util.List;

import yangdu.domain.Yong;

public interface YongRepository {
        List<Yong> fandAll();
        void save(Yong yong);
        void update(Yong yong);
}
