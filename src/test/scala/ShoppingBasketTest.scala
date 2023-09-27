import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class ShoppingBasketTest extends AnyFlatSpec with Matchers {

  "calculateSubtotal" should "calculate the subtotal correctly" in {
    val items = List("Soup", "Bread", "Milk", "Apples")
    val subtotal = ShoppingBasket.calculateSubtotal(items)
    subtotal shouldEqual 3.75
  }

  it should "handle unknown items" in {
    val items = List("Soup", "UnknownItem", "Milk")
    val subtotal = ShoppingBasket.calculateSubtotal(items)
    subtotal shouldEqual 1.95
  }

  "applySpecialOffers" should "apply the Apple discount correctly" in {
    val items = List("Apples", "Apples", "Milk")
    val discount = ShoppingBasket.applySpecialOffers(items)
    discount shouldEqual 0.20
  }

  it should "apply the Soup and Bread discount correctly" in {
    val items = List("Soup", "Soup", "Bread", "Bread", "Milk")
    val discount = ShoppingBasket.applySpecialOffers(items)
    discount shouldEqual 0.40
  }

  it should "handle no applicable offers" in {
    val items = List("Milk", "Milk")
    val discount = ShoppingBasket.applySpecialOffers(items)
    discount shouldEqual 0.0
  }
}
