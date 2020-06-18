package site.bigbear.debthelper.service;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import site.bigbear.debthelper.DebtHelperApplicationTests;
import site.bigbear.debthelper.model.Debt;

public class DebtServiceTest extends DebtHelperApplicationTests {

    @Autowired
    private DebtService debtService;

//    public void  testSave(){
//        Debt test=
//                new Debt().setAgreedTime(new DateTime().plusDays(7).toDate()).setAmount((double) 100).setCreditor(1L).setDebtor(2L)
//    }
}
