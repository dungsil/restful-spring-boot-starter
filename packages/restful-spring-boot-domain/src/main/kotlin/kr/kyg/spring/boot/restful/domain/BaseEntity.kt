package kr.kyg.spring.boot.restful.domain

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.MappedSuperclass

/**
 * 공통 엔티티
 *
 * @property activated 사용 여부
 * @since 0.1.0
 */
@MappedSuperclass
abstract class BaseEntity(
  @Column(name = "activated")
  open var activated: Boolean = true
) : Serializable
