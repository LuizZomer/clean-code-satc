class FinancialCalculator:
    def calculate_monthly_salary(self, hours_worked, hourly_rate):
        return hours_worked * hourly_rate


financial_calculator = FinancialCalculator()

total_salary = financial_calculator.calculate_monthly_salary(
    hours_worked=40,
    hourly_rate=160
)

print(f"Salario total: ${total_salary}")