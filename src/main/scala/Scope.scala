opaque type Outer = String

object Object {
  opaque type Object1 = String

  object Inner {
    opaque type InnerObject = String
  }

  val io: Inner.InnerObject = "???"  // 1
  val obj: Object1 = "???"           // 2
  val outer: Outer = "???"           // 3

  object Inner2 {
    val inFn: Object1 = "???"        // 4
  }
}

object Outer {
  val outer: Outer = "???"            // 5
}
