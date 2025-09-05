# ATM-Simulation
# ATM Simulation - Java Program

A simple command-line ATM (Automated Teller Machine) simulation program written in Java. This program allows users to perform basic banking operations with Indian Rupee (₹) currency.

## Features

- **Check Balance**: View current account balance
- **Deposit Money**: Add money to your account
- **Withdraw Money**: Remove money from your account (with insufficient funds protection)
- **Input Validation**: Robust error handling for invalid inputs
- **Currency Support**: All transactions in Indian Rupees (₹)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Command line interface (Terminal/Command Prompt)

### Installation & Running

1. **Download the source code**
   ```
   Save the ATMSimulation.java file to your desired directory
   ```

2. **Compile the program**
   ```bash
   javac ATMSimulation.java
   ```

3. **Run the program**
   ```bash
   java ATMSimulation
   ```

## How to Use

1. **Start the Program**: Run the compiled Java file
2. **Main Menu**: Choose from 4 options:
   - `1` - Check Balance
   - `2` - Deposit Money
   - `3` - Withdraw Money
   - `4` - Exit

3. **Follow Prompts**: Enter amounts when requested
4. **Continue**: Press Enter to return to the main menu after each transaction

## Usage Examples

### Checking Balance
```
=== BALANCE INQUIRY ===
Your current balance is: ₹1000.00
```

### Depositing Money
```
=== DEPOSIT MONEY ===
Enter amount to deposit: ₹500
Successfully deposited ₹500.00
New balance: ₹1500.00
```

### Withdrawing Money
```
=== WITHDRAW MONEY ===
Current balance: ₹1500.00
Enter amount to withdraw: ₹200
Successfully withdrew ₹200.00
Remaining balance: ₹1300.00
```

## Input Formats

The program accepts amounts in multiple formats:
- `500` (numbers only)
- `₹500` (with rupee symbol)
- `500.50` (decimal amounts)

## Validation Features

- **Menu Input**: Only accepts numbers 1-4
- **Amount Input**: Only accepts valid numerical values
- **Positive Amounts**: Deposits and withdrawals must be positive numbers
- **Sufficient Funds**: Cannot withdraw more than available balance
- **Decimal Precision**: Automatically rounds to 2 decimal places

## Error Handling

- Invalid menu choices prompt for re-entry
- Invalid amount formats show error messages
- Insufficient funds display appropriate warnings
- All errors allow user to retry without restarting

## Default Settings

- **Starting Balance**: ₹1000.00
- **Currency**: Indian Rupees (₹)
- **Decimal Places**: 2 (standard currency format)

## Program Structure

```
ATMSimulation.java
├── main() - Program entry point
├── showMenu() - Displays main menu options
├── getValidChoice() - Validates menu selection
├── checkBalance() - Shows current balance
├── deposit() - Handles money deposits
├── withdraw() - Handles money withdrawals
└── getValidAmount() - Validates monetary input
```

## Technical Details

- **Language**: Java
- **Input Method**: Scanner for console input
- **Data Type**: Double for currency amounts
- **Validation**: Try-catch blocks for error handling
- **Formatting**: Printf for currency display

## Future Enhancements

Potential features that could be added:
- PIN authentication
- Multiple account support
- Transaction history
- Daily withdrawal limits
- Account persistence (file storage)



