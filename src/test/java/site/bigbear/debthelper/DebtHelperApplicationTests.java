package site.bigbear.debthelper;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import site.bigbear.debthelper.model.TestModel;
import site.bigbear.debthelper.repository.TestRepository;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DebtHelperApplicationTests {
  @Autowired private TestRepository testRepository;

  @Test
  public void contextLoads() {}

  @Test
  @Rollback(value = false)
  public void testInsert() {
    assert this.testRepository.save(new TestModel().setName("ttest")).getId() > 0;
    List<TestModel> modelList = Lists.newArrayList(this.testRepository.findAll());
    modelList.forEach(p->System.out.println(p.getName()));
  }

  @Test
  @Rollback(value = false)
  public void testIlist() {
    List<TestModel> modelList = Lists.newArrayList(this.testRepository.findAll());
    modelList.forEach(p->System.out.println(p.getName()));
  }
}
