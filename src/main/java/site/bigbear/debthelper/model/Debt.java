package site.bigbear.debthelper.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * 债务信息
 *
 * @author cheyantao
 * @date 2019-09-06
 */
@Entity
@Table(name = "base_debt")
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Debt extends BaseEntity {
  @CreationTimestamp private Date startTime;

  @Column(nullable = false)
  private Date agreedTime;

  /** 状态 0未激活1未到期2到期未归还3已完成4重新约定,默认1 */
  @Column(nullable = false, columnDefinition = "tinyint default 1")
  private Integer status;

  private Double amount;
  private String reason;
  private Date endTime;

  @ManyToOne(targetEntity = User.class,cascade = CascadeType.REFRESH)
  @JoinColumn(name = "creditor_id")
  private User creditor;

  @ManyToOne(cascade=CascadeType.REFRESH)
  private Debtor debtor;
}
