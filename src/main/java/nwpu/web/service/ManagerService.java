package nwpu.web.service;

import nwpu.web.domain.Manager;
import org.springframework.transaction.annotation.Transactional;

@Transactional
//定义整个类为事务类，正常时提交，异常时回滚
public interface ManagerService {
    boolean save(Manager manager);
}
