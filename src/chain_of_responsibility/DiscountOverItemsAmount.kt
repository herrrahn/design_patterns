package chain_of_responsibility

import invoice.Invoice

class DiscountOverItemsAmount : Discount {

    private var nextDiscount: Discount? = null

    override fun setNextDiscount(next: Discount) {
        this.nextDiscount = next
    }

    override fun apply(invoice: Invoice): Double {
        return if (invoice.itemsAmount > 5)
            invoice.value * 0.05
        else if (nextDiscount != null) {
            nextDiscount!!.apply(invoice)
        } else return 0.0
    }
}
