package site.bigbear.debthelper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import site.bigbear.debthelper.model.TestModel;
import site.bigbear.debthelper.repository.TestRepository;

/**
 * @author cheyantao
 * @date 2019-07-29
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableScheduling
public class DebtHelperApplication {
  @Autowired
  private TestRepository testRepository;

  public static void main(String[] args) {
    SpringApplication.run(DebtHelperApplication.class, args);
  }

}
