package com.puranam.bpm.service.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  Just Use Delegate to read input variable to the task and set it to output variable with an additional String
 */
public class EchoDelegate implements JavaDelegate {

    public static Logger logger = LoggerFactory.getLogger(EchoDelegate.class);

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        logger.info("<<<<<< Starting delegated execution >>>>>>>>>"+delegateExecution.getProcessInstance().getProcessBusinessKey());
        delegateExecution.setVariable("Output_Msg",delegateExecution.getVariable("echoMessage")+" World!");
        logger.info("<<<<<< Completed the variable delegated execution >>>>>>>>>");
    }
}
