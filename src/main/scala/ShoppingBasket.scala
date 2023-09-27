object ShoppingBasket {

  private val itemPrices: Map[String, BigDecimal] = Map(
    "Soup" -> BigDecimal(0.65),
    "Bread" -> BigDecimal(0.80),
    "Milk" -> BigDecimal(1.30),
    "Apples" -> BigDecimal(1.00)
  )

  def calculateSubtotal(items: List[String]): BigDecimal = {
    items.flatMap(item => itemPrices.get(item)).sum
  }

  def applySpecialOffers(items: List[String]): BigDecimal = {
    val itemCounts = items.groupBy(identity).view.mapValues(_.size).toMap

    // Calculates the discount for buying 2 tins of soup and getting bread for half price
    val soupCount = itemCounts.getOrElse("Soup", 0)
    val breadCount = itemCounts.getOrElse("Bread", 0)
    val maxBreadDiscount = (soupCount / 2) * (itemPrices("Bread") / 2)

    // Calculates the discount for apples
    val applesCount = itemCounts.getOrElse("Apples", 0)
    val applesDiscount = (applesCount * itemPrices("Apples") * 10) / 100

    val soupDiscount = if (maxBreadDiscount > 0) {
      val totalBreadDiscount = maxBreadDiscount min (breadCount * (itemPrices("Bread") / 2))
      totalBreadDiscount + applesDiscount
    } else {
      applesDiscount
    }
    soupDiscount
  }
}
