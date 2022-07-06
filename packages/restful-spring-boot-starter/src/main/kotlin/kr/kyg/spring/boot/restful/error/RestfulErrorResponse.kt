package kr.kyg.spring.boot.restful.error

data class RestfulErrorResponse(val errors: Iterable<AbstractRestfulError>) {
  constructor(error: AbstractRestfulError) : this(listOf<AbstractRestfulError>(error))

  companion object {
    fun of(code: String) = RestfulErrorResponse(DefaultRestfulError(code))
    fun of(vararg codes: String) = RestfulErrorResponse(codes.map { DefaultRestfulError(it) })
  }
}
