package com.puranam.bpm.service.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EchoDelegate implements JavaDelegate {

    public static Logger logger = LoggerFactory.getLogger(EchoDelegate.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        logger.info("<<<<<< Starting delegated execution >>>>>>>>>"+delegateExecution.getProcessInstance().getProcessBusinessKey());
        delegateExecution.setVariable("Output_Msg",delegateExecution.getVariable("echoMessage")+" World!");
        logger.info("<<<<<< Completed the variable delegated execution >>>>>>>>>");
    }
}
