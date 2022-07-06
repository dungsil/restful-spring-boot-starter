package kr.kyg.spring.boot.restful.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface RestfulRepository<T : BaseEntity, ID> : JpaRepository<T, ID> {
  fun findByIdAndActivatedIsTrue(id: ID): T?
  fun findAllByActivatedIsTrue(): List<T>
}
