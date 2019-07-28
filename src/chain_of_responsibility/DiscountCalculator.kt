package chain_of_responsibility

import invoice.Invoice

class DiscountCalculator(val invoice: Invoice) {
    fun applyDiscount(): Double {
        val discountOverValue = DiscountOverValue()
        val discountOverItemsAmount = DiscountOverItemsAmount()

        discountOverValue.setNextDiscount(discountOverItemsAmount)
        return discountOverValue.apply(invoice)

    }


}
