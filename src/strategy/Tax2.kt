package strategy

import invoice.Invoice

class Tax2 : Tax {
    override fun calculate(invoice: Invoice) = invoice.value * 0.2
}

