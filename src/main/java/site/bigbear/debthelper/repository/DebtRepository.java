package site.bigbear.debthelper.repository;

import org.springframework.data.repository.CrudRepository;
import site.bigbear.debthelper.model.Debt;

public interface DebtRepository extends CrudRepository<Debt,Long> {
}
