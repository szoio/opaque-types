import io.circe.Codec
import io.circe.generic.semiauto.*

type ReplicationFactor = Int
type PartitionCount = Int

case class Topic(topicName: String, replicationFactor: ReplicationFactor, partitionCount: PartitionCount)

object Topic {
  given Codec[Topic] = deriveCodec
}
