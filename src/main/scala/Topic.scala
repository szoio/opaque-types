import io.circe.*
import io.circe.generic.semiauto.*

case class Topic(topicName: TopicName, replicationFactor: ReplicationFactor, partitionCount: PartitionCount)

object Topic {
  given Codec[Topic] = deriveCodec
}
