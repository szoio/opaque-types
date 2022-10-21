import io.circe.*

opaque type ReplicationFactor = Int

object ReplicationFactor {
  inline def apply(r: Int): ReplicationFactor = r
  extension (r: ReplicationFactor) inline def value: Int = r
  def unapply(r: ReplicationFactor): Option[Int] = Some(r)
  given (using encoder: Encoder[Int]): Encoder[ReplicationFactor] = encoder
  given (using decoder: Decoder[Int]): Decoder[ReplicationFactor] = decoder
}

opaque type PartitionCount = Int

object PartitionCount {
  inline def apply(p: Int): PartitionCount = p
  extension (p: PartitionCount) inline def value: Int = p
  def unapply(p: PartitionCount): Option[Int] = Some(p)
  given (using encoder: Encoder[Int]): Encoder[PartitionCount] = encoder
  given (using decoder: Decoder[Int]): Decoder[PartitionCount] = decoder
}

