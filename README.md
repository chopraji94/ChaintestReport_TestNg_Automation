
# ChaintestReport_TestNg_Automation

This project demonstrates the integration of the ChainTest reporting framework with TestNG for automated testing.

## Overview

The repository showcases how to set up and use ChainTest with TestNG to generate comprehensive test reports. ChainTest supports multiple output types and provides real-time, historical analytics.

## Features

- **ChainTest Integration**: Leverages ChainTest for detailed and customizable test reports.
- **TestNG Framework**: Utilizes TestNG for structuring and running test cases.
- **Sample Test Cases**: Includes example test cases to illustrate the integration.

## Prerequisites

- **Java Development Kit (JDK)**: Ensure JDK 8 or higher is installed.
- **Apache Maven**: Used for project build and dependency management.
- **TestNG**: Testing framework for Java.
- **ChainTest**: Reporting framework supporting multiple output types and real-time analytics.

## Setup Instructions

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/chopraji94/ChaintestReport_TestNg_Automation.git
   cd ChaintestReport_TestNg_Automation
   ```

2. **Install Dependencies**:
   Use Maven to install the required dependencies:
   ```bash
   mvn clean install
   ```

3. **Configure ChainTest**:
   - Ensure ChainTest is properly configured in your project. For detailed configuration steps, refer to the [ChainTest documentation](https://github.com/anshooarora/chaintest/blob/main/Readme.md).

4. **Run Tests**:
   Execute the test cases using Maven:
   ```bash
   mvn test
   ```

## Project Structure

- **`src/test/java`**: Contains the test cases.
- **`pom.xml`**: Maven configuration file with project dependencies.
- **`testng.xml`**: TestNG configuration file specifying test suites and parameters.

## References

- [ChainTest GitHub Repository](https://github.com/anshooarora/chaintest)
- [TestNG Documentation](https://testng.org/doc/)

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
