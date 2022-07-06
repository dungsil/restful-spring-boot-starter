package kr.kyg.spring.boot.restful.error

import org.springframework.boot.web.servlet.error.ErrorController
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletResponse

/**
 * @since 0.1.0
 */
@RestController
@RequestMapping("\${server.error.path:\${error.path:/error}}")
class RestfulErrorController : ErrorController {

  @RequestMapping
  fun handleError(res: HttpServletResponse): ResponseEntity<RestfulErrorResponse> {
    val status = when (res.status) {
      200 -> HttpStatus.NOT_FOUND
      else -> HttpStatus.valueOf(res.status)
    }

    return ResponseEntity
      .status(status)
      .body(RestfulErrorResponse.of(status.name))
  }
}
