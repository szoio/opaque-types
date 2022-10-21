import io.circe.{Decoder, Encoder}

trait OpaqueValue[T] {
  opaque type Type = T

  inline def apply(p: T): Type = p
  extension (p: Type) inline def value: T = p
  def unapply(p: Type): Option[T] = Some(p)
  given(using encoder: Encoder[T]): Encoder[Type] = encoder
  given(using decoder: Decoder[T]): Decoder[Type] = decoder
}
