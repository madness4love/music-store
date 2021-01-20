fun main() {
    var totalSum = 12_000.0
    val standardDiscountRubles = 100.0
    val standardDiscountFrom = 1_001.0
    val increasedDiscountFrom = 10_001.0
    val increasedDiscountPercent = 5
    val isMusicLover = true
    val additionalDiscountPercent = 1

    println("Покупка - $totalSum рублей")

    if (totalSum >= standardDiscountFrom && totalSum < increasedDiscountFrom) {
        totalSum -=standardDiscountRubles
        println("После применения скидки $standardDiscountRubles рублей - $totalSum")
    } else if (totalSum >= increasedDiscountFrom) {
        totalSum -= totalSum * increasedDiscountPercent / 100
        println("После применения скидки $increasedDiscountPercent % - $totalSum")
    } else {
        println("Скидок не предусмотрено")
    }

    if (isMusicLover) {
        totalSum -= totalSum * additionalDiscountPercent / 100
        println("После применения скидки $additionalDiscountPercent % - $totalSum")
    }

}