import io.circe.syntax._

@main def main: Unit = {
  val replicationFactor: ReplicationFactor = ReplicationFactor(3)
  val partitionCount: PartitionCount = PartitionCount(6)

  val topic = Topic("my-topic", replicationFactor, partitionCount)

  println(topic.asJson.spaces2)

  topic match {
    case Topic(name, ReplicationFactor(r), PartitionCount(p)) => println(s"$name: $r, $p")
  }
}
