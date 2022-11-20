package nwpu.web.service;

import nwpu.web.domain.Test;
import org.springframework.stereotype.Service;

@Service
public interface TestService {
    public boolean save(Test test);
}
