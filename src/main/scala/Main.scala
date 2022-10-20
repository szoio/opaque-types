import io.circe.syntax._

@main def main: Unit = {
  val topic = Topic("my-topic", 3, 6)

  println(topic.asJson.spaces2)
}
