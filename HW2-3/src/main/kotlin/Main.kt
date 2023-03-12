import kotlin.math.roundToInt

fun main(){
    val regular = true
    val purchaseAmount = 100000
    val discount1 = 100
    val discount2 = purchaseAmount * 0.05

    val discount = if (purchaseAmount < 1001) 0 else if (purchaseAmount in 1001..10_000) discount1 else if (purchaseAmount > 10_000) discount2.roundToInt() else TODO()
    val regularBuyerDiscount = if (regular) ((purchaseAmount - discount) * 0.01).roundToInt() else 0

    val result = purchaseAmount - discount - regularBuyerDiscount

    println("""Сумма заказа: $purchaseAmount рублей.
Скидка от суммы заказа: $discount рублей. Скидка постоянного клиента: $regularBuyerDiscount рублей.
Стоимость вашего заказа с учетом всех скидок: $result рублей.""")
}