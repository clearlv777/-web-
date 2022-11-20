package nwpu.web.dao;

import nwpu.web.domain.Test;
import org.apache.ibatis.annotations.Insert;

public interface TestDao {
    @Insert("")
    public void save(Test test);
}
