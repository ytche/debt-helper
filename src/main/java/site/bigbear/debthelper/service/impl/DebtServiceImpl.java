package site.bigbear.debthelper.service.impl;

import org.springframework.stereotype.Service;
import site.bigbear.debthelper.model.Debt;
import site.bigbear.debthelper.repository.DebtRepository;
import site.bigbear.debthelper.service.DebtService;

/**
 * @author cheyantao
 * @date 2019-09-10
 */
@Service
public class DebtServiceImpl extends BaseCrudServiceImpl<DebtRepository, Debt>
    implements DebtService {}
