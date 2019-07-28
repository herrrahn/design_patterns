package chain_of_responsibility

import invoice.Invoice

class DiscountOverValue : Discount {

    private var nextDiscount: Discount? = null

    override fun setNextDiscount(next: Discount) {
        this.nextDiscount = next
    }

    override fun apply(invoice: Invoice): Double {
        return if (invoice.value >= 500)
            invoice.value * 0.1
        else if (nextDiscount != null) {
            nextDiscount!!.apply(invoice)
        } else return 0.0
    }
}
