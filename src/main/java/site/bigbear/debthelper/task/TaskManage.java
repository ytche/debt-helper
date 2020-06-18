package site.bigbear.debthelper.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import site.bigbear.debthelper.service.DebtService;

/**
 * 定时任务类,启动相关定时任务
 * @author cheyantao
 * @date 2019-09-10
 */
@Component
public class TaskManage {
    @Autowired
    private DebtService debtService;

}
