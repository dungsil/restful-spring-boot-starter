package kr.kyg.spring.boot.restful.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.Instant
import javax.persistence.Column

abstract class AuditEntity(

  @CreatedDate
  @Column(name = "created_at")
  open val createdAt: Instant = Instant.now(),

  @LastModifiedDate
  @Column(name = "last_modified_at")
  open var lastModifiedAt: Instant? = null,

  override var activated: Boolean = true
) : BaseEntity(activated)
