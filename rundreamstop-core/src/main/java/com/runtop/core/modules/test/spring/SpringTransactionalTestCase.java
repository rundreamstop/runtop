package com.runtop.core.modules.test.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

import javax.sql.DataSource;

/**
 * 追忆寻梦
 * rundreams.net
 *
 * @Author:zzh rundreams@yeah.net  @Time:2018\8\17 0017
 */

public class SpringTransactionalTestCase extends AbstractTransactionalJUnit4SpringContextTests {

    public final Logger logger = LoggerFactory.getLogger(getClass());

    protected DataSource dataSource;

    public SpringTransactionalTestCase() {
    }

    @Autowired
    public void setDataSource(DataSource dataSource) {
        super.setDataSource(dataSource);
        this.dataSource = dataSource;
    }
}
