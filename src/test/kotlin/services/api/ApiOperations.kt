package services.api

import entity.User

class ApiOperations {
  fun createUser(): User{
    return User("ww", "www")
  }
}