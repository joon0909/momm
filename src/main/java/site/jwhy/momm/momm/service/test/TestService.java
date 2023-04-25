package site.jwhy.momm.momm.service.test;

import site.jwhy.momm.momm.model.res.TestRes;
import site.jwhy.momm.momm.model.req.TestReq;

public interface TestService {
    TestRes selectTest(TestReq testReq) throws Exception;
}
