package tests

import entity.User
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import page.LoginPage
import page.ProfilePage
import services.api.ApiOperations

class LoginTest {
  private lateinit var user: User

  @BeforeAll
  fun createUser() {
    user = ApiOperations().createUser()
  }

  @Test
  fun loginTest() {
    LoginPage().login(user)
    ProfilePage().verifyIsOnPage()
  }
}