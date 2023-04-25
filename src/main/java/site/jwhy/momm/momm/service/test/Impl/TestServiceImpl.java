package site.jwhy.momm.momm.service.test.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.jwhy.momm.momm.mapper.TestMapper;
import site.jwhy.momm.momm.model.res.TestRes;
import site.jwhy.momm.momm.model.req.TestReq;
import site.jwhy.momm.momm.service.test.TestService;

@Service
public class TestServiceImpl implements TestService {
    private TestMapper testMapper;

    @Autowired
    public TestServiceImpl(TestMapper testMapper){
        this.testMapper = testMapper;
    }
    @Override
    public TestRes selectTest(TestReq testReq) throws Exception{
        TestRes test = testMapper.selectTest(testReq);
        return test;
    }
}
