import io.circe.syntax._

@main def main: Unit = {
  val replicationFactor: ReplicationFactor = 3
  val partitionCount: PartitionCount = 6

  val topic = Topic("my-topic", replicationFactor, partitionCount)

  println(topic.asJson.spaces2)
}
