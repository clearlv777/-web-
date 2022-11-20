package nwpu.web.service.impl;

import nwpu.web.dao.ManagerDao;
import nwpu.web.domain.Manager;
import nwpu.web.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerDao managerDao;
    public boolean save(Manager manager) {
        return managerDao.save(manager)>0;
    }
}
