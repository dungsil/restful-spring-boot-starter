package kr.kyg.spring.boot.restful.error

import kr.kyg.spring.boot.restful.autoconfigure.RestfulConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.context.annotation.Import
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*
import kotlin.test.Test

@WebMvcTest
@Import(RestfulConfiguration::class)
internal class RestfulErrorControllerTest {

  @Autowired
  lateinit var mock: MockMvc

  @Test
  fun handleError() {
    mock.perform(get("/error"))
      .andExpect { handler().handlerType(RestfulErrorController::class.java) }
      .andExpect { status().isNotFound }
      .andExpect { content().json("""{"errors":[{"code":"NOT_FOUND"}]}""") }
  }
}
