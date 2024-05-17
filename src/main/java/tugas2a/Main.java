package tugas2a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nomor akun:");
        String accountNumber = scanner.nextLine();

        System.out.println("Masukkan saldo awal:");
        double balance = scanner.nextDouble();
        scanner.nextLine();  // Consume newline left-over

        System.out.println("Masukkan nama pelanggan:");
        String customerName = scanner.nextLine();

        System.out.println("Masukkan email pelanggan:");
        String customerEmail = scanner.nextLine();

        System.out.println("Masukkan nomor telepon pelanggan:");
        String customerPhone = scanner.nextLine();

        BankAccount account = new BankAccount(balance, accountNumber, customerName, customerEmail, customerPhone);

        boolean continueBanking = true;
        while (continueBanking) {
            System.out.println("Pilih operasi: 1. Deposit, 2. Withdraw, 3. Balance, 4. Berhenti");
            int operation = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (operation) {
                case 1:
                    System.out.println("Masukkan jumlah deposit:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Masukkan jumlah penarikan:");
                    double withdrawAmount = scanner.nextDouble();

                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Saldo saat ini: " + account.getBalance());
                    account.printAccountInfo();
                    break;
                case 4:
                    continueBanking = false;
                    break;
                default:
                    System.out.println("Operasi tidak valid. Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}
