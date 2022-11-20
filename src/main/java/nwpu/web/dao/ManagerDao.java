package nwpu.web.dao;

import nwpu.web.domain.Manager;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface ManagerDao {
    @Insert("insert into manager (managerID, managerName, password) values (#{managerID},#{managerName},#{password})")
    public int save(Manager manager);
}
