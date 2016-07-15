package com.sq.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 定时任务执行业务类.
 * User: yaowenjie
 * Date: 2016/6/15
 * Time: 09:26
 */
@Service
public class SchedulerExecuteService {

    private static final Logger log = LoggerFactory.getLogger(SchedulerExecuteService.class);

    public void checkAllProjectPoint(){
        log.error("test!!!!");
        log.error("test!!!!");
        log.error("test!!!!");
        log.error("test!!!!");
    }
}
