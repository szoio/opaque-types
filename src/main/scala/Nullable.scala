// See https://docs.scala-lang.org/resources/images/tour/unified-types-diagram.svg

opaque type Nullable[A >: Null <: AnyRef] = A

object Nullable {
  given conversion[A >: Null <: AnyRef]: Conversion[A, Nullable[A]] = identity

  extension[A >: Null <: AnyRef] (nullableA: Nullable[A]) {
    def foreach(f: A => Unit): Unit = if (nullableA != null) f(nullableA)

    def map[B >: Null <: AnyRef](f: A => B): Nullable[B] = if (nullableA != null) f(nullableA) else null

    def flatMap[B >: Null <: AnyRef](f: A => Nullable[B]): Nullable[B] = ???

    def orElse(na2: => Nullable[A]): Nullable[A] = ???

    def toOption: Option[A] = Option(nullableA)
  }
}
