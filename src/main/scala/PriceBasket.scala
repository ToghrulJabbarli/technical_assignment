import ShoppingBasket.{applySpecialOffers, calculateSubtotal}

object PriceBasket{
  def main(args: Array[String]): Unit = {
    if (args.isEmpty) {
      println("Usage: PriceBasket item1 item2 item3 ...")
    } else {
      val basketItems = args.toList
      val subtotal = calculateSubtotal(basketItems)
      val discount = applySpecialOffers(basketItems)
      val total = subtotal - discount

      println(s"Subtotal: £${"%.2f".format(subtotal)}")

      if (discount > 0) {
        println(s"Total discounts: £${"%.2f".format(discount)}")
      } else {
        println("(No offers available)")
      }

      println(s"Total price: £${"%.2f".format(total)}")
    }
  }
}