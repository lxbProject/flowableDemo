package com.dreamTh.flowable;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;

/**
 * @author luxingbang
 * @date 2022-05-30-1.:24
 */
public class HolidayRuquest {
    public static void main(String[] args) {
        ProcessEngineConfiguration cfg = new StandaloneProcessEngineConfiguration()
                .setJdbcDriver("org:h2.Driver")
                .setJdbcUsername("sa")
                .setJdbcPassword("123456")
                .setJdbcUrl("jdbc:h2:flowable;DB_CLOSE_DELAY=-1").setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);

        ProcessEngine processEngine = cfg.buildProcessEngine();

    }
}
