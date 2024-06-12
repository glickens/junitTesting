# junitTesting
# junitTesting

This is a simple Java project demonstrating the use of JUnit for testing a basic service class.

## Project Structure

- **src/main/java/org/example**:
  - **Service.java**: Contains the `Service` class with `getName` and `walk` methods.
  - **Main.java**: Contains the main method to run the `walk` function.

- **src/test/java/org/example**:
  - **ServiceTest.java**: Contains JUnit tests for the `Service` class.

## How to Run

### Prerequisites

- Java Development Kit (JDK) 22 or higher
- Apache Maven 3.6.0 or higher

### Steps

1. **Clone the Repository**:
    ```sh
    git clone https://github.com/glickens/junitTesting.git
    cd junitTesting
    ```

2. **Build the Project**:
    ```sh
    mvn clean install
    ```

3. **Run the Tests**:
    ```sh
    mvn test
    ```

## License

This project is licensed under the MIT License.
