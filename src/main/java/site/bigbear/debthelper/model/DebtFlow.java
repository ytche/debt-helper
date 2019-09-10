package site.bigbear.debthelper.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * 债务流程
 *
 * @author cheyantao
 * @date 2019-09-06
 */
@Entity
@Table(name = "base_debt_flow")
@Data
@Accessors(chain = true)
public class DebtFlow {
  @Id @GeneratedValue private Long id;
  @CreationTimestamp private Date createTime;
  @UpdateTimestamp private Date updateTime;

  @ManyToOne(cascade = CascadeType.REFRESH)
  @JoinColumn(name = "debt_id")
  private Debt debt;

  private Date agreedTime;
  private String endTime;
  private String reason;

  /**
   * 状态 1未到期2到期未归还3已完成,默认1
   **/
  @Column(columnDefinition = "tinyint(2) default 1")
  private Integer status;
}
