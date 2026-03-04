class Account:
    def __init__(self, owner, balance):
        self.owner = owner
        self.balance = balance

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        if amount <= self.balance:
            self.balance -= amount
        else:
            print("Sem saldo suficientes")

    def get_balance(self):
        return self.balance

    def get_account_info(self):
        return f"Conta: {self.owner}, saldo: {self.balance}"


def total_funds(accounts):
    return sum(account.balance for account in accounts)

def richest_account(accounts):
    return max(accounts, key=lambda account: account.balance)


acc1 = Account("Alice", 500)
acc2 = Account("Bob", 1200)
acc3 = Account("Charlie", 700)

acc1.deposit(200)
acc2.withdraw(300)

print(acc1.get_balance())
print(acc2.get_account_info())

all_accounts = [acc1, acc2, acc3]
print(total_funds(all_accounts))
print(richest_account(all_accounts).owner)