package chain_of_responsibility

import invoice.Invoice

interface Discount {
    fun apply(invoice: Invoice) : Double
    fun setNextDiscount(next: Discount)
}

