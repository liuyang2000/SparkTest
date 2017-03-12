package pattern_match

/**
  * Created by liuyang on 2017/1/4.
  */
case class User(
                 id: Int, firstName: String, lastName: String, age: Int, gender: Option[String]
               )

object UserRepository {
  private val users = Map(1 -> User(1, "f", "l", 10, Some("male")),
                          2 -> User(2, "df", "as", 11, None))

  def findById(id : Int) : Option[User] = {
    users.get(id)
  }

  def findAll = users.values

}

object OptionOps {
  def main(args: Array[String]): Unit = {
    val user1 = UserRepository.findById(1)
    println(user1.get.gender.getOrElse(
      {
        println("123")
        "NO gender"
      }
    ))


    val user2 = UserRepository.findById(2)
    println(user2.get.gender.getOrElse({
      println("121233")
      "NO gender"
    }))

    val user3 = UserRepository.findById(3)

    if(user3.isDefined){
      println("users age " + user3.get.gender)
    }
    else {
      println("user3 is not defined")
    }
  }
}
