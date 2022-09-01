
class TuitionCost{
    fun publicCollege(monthly,payment):
        monthlyCost = monthly / payment
        print(monthlyCost)
        yearlyCost = (monthly * 12) / payment 
        print(yearlyCost)
    fun privateCollege(monthly,payment):
        pri_monthly_cost = monthly / payment
        print(pri_monthly_cost)
        pri_yearly_cost = (monthly * 12) / payment
        print(pri_yearly_cost)
}