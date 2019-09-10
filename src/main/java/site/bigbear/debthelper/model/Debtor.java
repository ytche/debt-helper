package site.bigbear.debthelper.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * 债务人
 *
 * @author cheyantao
 * @date 2019-09-06
 */
@Entity
@Table(name = "base_debtor")
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class Debtor extends BaseEntity {
  private String name;
  private String nickName;
  private String telephone;
  private Long creditorId;

  @Column(columnDefinition = "tinyint default 0")
  private Integer alertStatus;

  @ManyToOne(cascade = CascadeType.REFRESH)
  @JoinColumn(name = "owner_id")
  private User owner;
}
