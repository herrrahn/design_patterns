package strategy

import invoice.Invoice

class Tax1 : Tax {
    override fun calculate(invoice: Invoice) = invoice.value * 0.1
}
