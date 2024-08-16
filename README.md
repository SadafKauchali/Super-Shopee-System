
# Super Shopee System

Super Shopee System is a Java-based desktop application designed to streamline shop management. The application allows for efficient inventory and sales management, featuring a user-friendly interface built with Swing and comprehensive CRUD operations integrated with a database.

## Features

- **Inventory Management**: Add, update, delete, and view products.
- **Sales Tracking**: Manage sales transactions and customer information.
- **User-Friendly Interface**: Intuitive GUI designed with Java Swing.
- **Database Integration**: Seamlessly connect to a database to store and retrieve shop data.

## Technologies Used

- **Java**: Core programming language for application logic.
- **Swing**: Used for creating the graphical user interface.
- **JDBC**: For database connectivity and operations.
- **MySQL/SQLite**: (or any other database you used) as the database management system.

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/SadafKauchali/super-shopee-system.git
   ```
2. **Navigate to the project directory:**
   ```bash
   cd super-shopee-system
   ```
3. **Compile the Java files:**
   ```bash
   javac -d bin src/*.java
   ```
4. **Run the application:**
   ```bash
   java -cp bin Main
   ```

## Database Setup

1. **Create a database:**
   - For MySQL:
     ```sql
     CREATE DATABASE shopdb;
     ```
   - For SQLite:
     ```bash
     sqlite3 shopdb.sqlite
     ```
2. **Import the provided SQL script to create tables and insert initial data:**
   ```bash
   mysql -u username -p shopdb < db/schema.sql
   ```

## Usage

1. **Start the application.**
2. **Navigate through the menu to manage products, customers, and sales.**
3. **Use the database to persist data across sessions.**

## Contributing

Contributions are welcome! Feel free to submit a pull request or open an issue to discuss potential improvements or features.

## Contact

For any questions or suggestions, please contact me at kauchalisadaf@gmail.com
