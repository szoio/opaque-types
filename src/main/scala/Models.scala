import io.circe.*
import io.circe.generic.semiauto.*

case class ReplicationFactor(value: Int) extends AnyVal

object ReplicationFactor {
  given Encoder[ReplicationFactor] = Encoder.encodeInt.contramap(_.value)
  given Decoder[ReplicationFactor] = Decoder.decodeInt.map(apply)
}

case class PartitionCount(value: Int) extends AnyVal

object PartitionCount {
  given Encoder[PartitionCount] = Encoder.encodeInt.contramap(_.value)
  given Decoder[PartitionCount] = Decoder.decodeInt.map(apply)
}

// https://docs.scala-lang.org/overviews/core/value-classes.html#limitations

case class Topic(topicName: String, replicationFactor: ReplicationFactor, partitionCount: PartitionCount)

object Topic {
  given Codec[Topic] = deriveCodec
}
