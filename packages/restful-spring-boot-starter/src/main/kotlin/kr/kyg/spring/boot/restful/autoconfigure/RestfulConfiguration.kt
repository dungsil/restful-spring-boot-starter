package kr.kyg.spring.boot.restful.autoconfigure

import kr.kyg.spring.boot.restful.error.RestfulErrorController
import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication.Type.SERVLET
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration
import org.springframework.boot.web.servlet.error.ErrorController
import org.springframework.context.annotation.Bean

@AutoConfiguration(before = [ErrorMvcAutoConfiguration::class])
@ConditionalOnWebApplication(type = SERVLET)
class RestfulConfiguration {

  @Bean
  fun errorController(): ErrorController {
    return RestfulErrorController()
  }
}
