//package com.pb.ts.master.tsproc;
//
//import com.pb.ts.master.Master;
//import com.pb.ts.master.timelog.rebuild.TimeLogRebuilderMaster;
//import org.joda.time.LocalDateTime;
//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.BeanDefinition;
//import org.springframework.context.annotation.Scope;
//import org.springframework.scheduling.quartz.QuartzJobBean;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//import java.util.List;
//
///**
// * Job по выполнению заданий, которые поступают в таблицу tsproc
// * @author Alexandr Derevyanchuk dn090189dap
// * @author <a href="mailto:belorus.victor@gmail.com">Belorus Victor (dn221090bva)</a>
// */
//@Master
//@Component
//@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
//public class RebuildProcessJobManual extends QuartzJobBean {
//
//    RebuildProcessMapper processMapper;
//    TimeLogRebuilderMaster rebuilderMaster;
//    TsprocJobSender jobSender;
//
//    private static final Logger log = LoggerFactory.getLogger(RebuildProcessJobManual.class);
//
//    @Autowired
//    public void setJobSender(TsprocJobSender jobSender) {
//        this.jobSender = jobSender;
//    }
//
//    @Autowired
//    public void setProcessMapper(RebuildProcessMapper processMapper) {
//        this.processMapper = processMapper;
//    }
//
//    @Autowired
//    public void setRebuilderMaster(TimeLogRebuilderMaster rebuilderMaster) {
//        this.rebuilderMaster = rebuilderMaster;
//    }
//
//
//    public void doTask() throws JobExecutionException {
//        log.debug("Получаю задания из tsproc");
//        List<EmplRebuildProcess> listProc = processMapper.getNewTasks(Arrays.asList(TsprocType.values()));
//        if (!listProc.isEmpty()){
//            log.info("Получено {} заданий из tsproc", listProc.size());
//            int tasksSent = 0;
//            for (EmplRebuildProcess erp : listProc) {
//                try{
//                    erp.setProcStart(LocalDateTime.now());
//                    processMapper.setStartTime(erp);
//                    log.debug("Отправляю задание в очередь JMS: {}", erp);
//                    jobSender.sendTsprocJob(erp);
//                    tasksSent++;
//                } catch (Exception e) {
//                    String err = "Ошибка обработки задания до отправки в очередь JMS";
//                    log.warn(err + ": {}", erp);
//                    log.error(err, e);
//                }
//            }
//            if (tasksSent != listProc.size()) {
//                log.warn("В очереди на обработку были отправлены {} заданий из {}", tasksSent, listProc.size());
//            }
//        }
//    }
//
//    @Override
//    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
//
//    }
//}
