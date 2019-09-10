package site.bigbear.debthelper.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 用户
 *
 * @author cheyantao
 * @date 2019-09-06
 */
@Data
@Entity
@Table(name = "base_user")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {
  private String name;
  private String password;
  private String nickName;
  private String telephone;
  private String wechat;
}
