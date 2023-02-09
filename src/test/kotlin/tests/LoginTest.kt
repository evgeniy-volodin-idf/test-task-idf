package tests

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class LoginTest {
  private lateinit var user: User

  @BeforeAll
  fun createUser() {
    user = ApiOperations().createUser
  }

  @Test
  fun loginTest() {
    LoginPage().login(user)
    ProfilePage().verifyIsOnPage
  }
}