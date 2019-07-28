package strategy

import invoice.Invoice

interface Tax {
    fun calculate(invoice: Invoice): Double
}
