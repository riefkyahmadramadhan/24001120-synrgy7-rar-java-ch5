package tugas2a;

public class BankAccount {
    double balance;
    String accountNumber, customerName, customerEmail, customerPhone;

    public BankAccount(double balance, String accountNumber, String customerName, String customerEmail, String customerPhone) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public void printAccountInfo() {
        System.out.println("Nomor Akun: " + this.accountNumber);
        System.out.println("Nama Pelanggan: " + this.customerName);
        System.out.println("Email Pelanggan: " + this.customerEmail);
        System.out.println("Nomor Telepon Pelanggan: " + this.customerPhone);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
