package site.bigbear.debthelper.model;

import lombok.Data;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * 超期不良记录
 *
 * @author cheyantao
 * @date 2019-09-10
 */
@Entity
@Table(name = "base_over_record")
@Data
@Accessors(chain = true)
public class OverRecord {

  @Id @GeneratedValue private Long id;
  @CreationTimestamp private Date createTime;
  @UpdateTimestamp private Date updateTime;

  @OneToOne
  @JoinColumn(name = "debt_id",nullable = false)
  private Debt debt;
}
