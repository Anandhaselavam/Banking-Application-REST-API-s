# Banking Application REST APIs

This project provides a simple banking application with core functionalities implemented using Spring Boot, Spring Data JPA (Hibernate), and MySQL database.

## Features

- Account Management: Create, retrieve, deposit, withdraw, and delete bank accounts.
- Database Integration: Seamless integration with MySQL using Spring Data JPA.
- Transaction Handling: Robust management to ensure data consistency and integrity.
- Error Handling: Comprehensive mechanisms for clear and informative error responses.
- Security: Basic authentication and authorization to protect sensitive information.
- Testing: Extensive unit and integration testing to ensure functionality and reliability.

## Technologies Used

- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- Java
- Postman

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven
- MySQL

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/banking-app.git
   cd banking-app
   ```

2. Configure the MySQL database:

   Create a MySQL database and update the `application.properties` file with your database details.

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/banking_app
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```

3. Build the project:

   ```bash
   mvn clean install
   ```

4. Run the application:

   ```bash
   mvn spring-boot:run
   ```

### API Endpoints

- Create Account:`POST /accounts`
- **Get Account Details:`GET /accounts/{id}`
- **Deposit Funds: `POST /accounts/{id}/deposit`
- **Withdraw Funds: `POST /accounts/{id}/withdraw`
- **Delete Account:`DELETE /accounts/{id}`

### Example Requests

- Create Account:

  ```bash
  curl -X POST -H "Content-Type: application/json" -d '{"ownerName":"John Doe"}' http://localhost:8080/accounts
  ```

- Get Account Details:

  ```bash
  curl -X GET http://localhost:8080/accounts/{id}
  ```

- Deposit Funds:

  ```bash
  curl -X POST -H "Content-Type: application/json" -d '{"amount":100}' http://localhost:8080/accounts/{id}/deposit
  ```

- Withdraw Funds:

  ```bash
  curl -X POST -H "Content-Type: application/json" -d '{"amount":50}' http://localhost:8080/accounts/{id}/withdraw
  ```

- Delete Account:

  ```bash
  curl -X DELETE http://localhost:8080/accounts/{id}
  ```

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.


## Acknowledgments

- Thanks to the Spring community for their comprehensive documentation and tutorials.

---

Feel free to adjust the content as per your project specifics and preferences.
