package site.jwhy.momm.momm.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import site.jwhy.momm.momm.model.res.TestRes;
import site.jwhy.momm.momm.model.req.TestReq;

@Repository
@Mapper
public interface TestMapper {

    TestRes selectTest(TestReq testReq) throws DataAccessException;

}
