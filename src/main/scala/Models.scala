import io.circe.Codec
import io.circe.generic.semiauto.*


case class Topic(replicationFactor: Int, partitionCount: Int)

object Topic {
  given Codec[Topic] = deriveCodec
}
