import io.circe.syntax._

@main def main: Unit = {
  val x: Nullable[String] = "    hello nullable   "
  // x.trim
  x.map(_.trim).foreach(println)
}
