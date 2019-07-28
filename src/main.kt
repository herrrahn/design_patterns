import chain_of_responsibility.DiscountCalculator
import invoice.Invoice
import strategy.Tax1
import strategy.Tax2

class main {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            strategy()
            chainOfResponsibility()
        }

        private fun strategy() {
            println("Strategy")
            val invoice = Invoice(300.00)

            val tax1 = Tax1()
            println(tax1.calculate(invoice))

            val tax2 = Tax2()
            println(tax2.calculate(invoice))
        }

        private fun chainOfResponsibility() {
            println("Chain of responsibility")
            val invoice = Invoice(300.00, 10)
            val discountCalculator = DiscountCalculator(invoice)
            println(discountCalculator.applyDiscount())
        }
    }
}
