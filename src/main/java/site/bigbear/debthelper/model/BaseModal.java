package site.bigbear.debthelper.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * 基础modal
 *
 * @author cheyantao
 * @date 2019-08-29
 */
@MappedSuperclass
@Data
public class BaseModal implements Serializable {
  @Id @GeneratedValue private String id;
  private String createUser;
  private String updateUser;
  @CreationTimestamp private String createTime;
  @UpdateTimestamp private String updateTime;
}
