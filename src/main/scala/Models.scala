import io.circe.Codec
import io.circe.generic.semiauto.*

case class ReplicationFactor(value: Int)
case class PartitionCount(value: Int)

case class Topic(topicName: String, replicationFactor: ReplicationFactor, partitionCount: PartitionCount)

object Topic {
  given Codec[Topic] = deriveCodec
}
