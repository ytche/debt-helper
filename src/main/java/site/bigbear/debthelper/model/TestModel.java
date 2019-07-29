package site.bigbear.debthelper.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author cheyantao
 * @date 2019-07-29
 */
@Data
@Entity
@Table(name = "test")
@Accessors(chain = true)
public class TestModel {

  @Id @GeneratedValue private Long id;
  private String name;
  @CreationTimestamp private Date createTime;
  @UpdateTimestamp private Date updateTime;
}
