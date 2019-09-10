package site.bigbear.debthelper.repository;

import org.springframework.data.repository.CrudRepository;
import site.bigbear.debthelper.model.Debtor;

public interface DebtorRepository  extends CrudRepository<Debtor,Long> {
}
