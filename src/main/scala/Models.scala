import io.circe.Codec
import io.circe.generic.semiauto.*

type ReplicationFactor = Int
type PartitionCount = Int

<<<<<<< HEAD
case class Topic(topicName: String, replicationFactor: Int, partitionCount: Int)
=======
case class Topic(topicName: String, replicationFactor: ReplicationFactor, partitionCount: PartitionCount)
>>>>>>> 658ecd7 (added type aliases)

object Topic {
  given Codec[Topic] = deriveCodec
}
