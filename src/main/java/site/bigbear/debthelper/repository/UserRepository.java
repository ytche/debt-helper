package site.bigbear.debthelper.repository;

import org.springframework.data.repository.CrudRepository;
import site.bigbear.debthelper.model.User;
/**
 * @author cheyantao
 * @date 2019-09-06
 */
public interface UserRepository extends CrudRepository<User, Long> {}
