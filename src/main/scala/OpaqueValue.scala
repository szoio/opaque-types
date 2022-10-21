import io.circe.{Decoder, Encoder}

trait OpaqueValue[T] {
  opaque type OpaqueType = T

  inline def apply(p: T): OpaqueType = p
  extension (p: OpaqueType) inline def value: T = p
  def unapply(p: OpaqueType): Option[T] = Some(p)
  given(using encoder: Encoder[T]): Encoder[OpaqueType] = encoder
  given(using decoder: Decoder[T]): Decoder[OpaqueType] = decoder
}
