package com.lhl.keshang;

import com.lhl.keshang.test.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KeshangApplicationTests {

    @Autowired
    private TestMapper testMapper;

    @Test
    public void contextLoads() {
        com.lhl.keshang.test.pojo.Test t = new com.lhl.keshang.test.pojo.Test();
        t.setId(1);
        t.setName("刘浩磊");
        testMapper.insert(t);

    }

}
