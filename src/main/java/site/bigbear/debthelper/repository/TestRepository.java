package site.bigbear.debthelper.repository;

import org.springframework.data.repository.CrudRepository;
import site.bigbear.debthelper.model.TestModel;

/**
 * @author cheyantao
 * @date 2019-07-29
 */
public interface TestRepository extends CrudRepository<TestModel, Long> {}
