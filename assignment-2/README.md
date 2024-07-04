
## This directory contains the source code for Assignment 2.

**Folder Structure:**

- **.devcontainer:** (Optional) This folder may contain files related to development container configuration if you're using tools like GitHub Codespaces.
  - ``devcontainer.json``: This file defines the configuration for a development container environment.
- **.github:** This folder contains files related to GitHub integration.
  - ``dependabot.yml``: This file likely defines configuration for Dependabot, a service that helps automate dependency updates.
- **.vscode:** (Optional) This folder may contain configuration files specific to Visual Studio Code.
  - ``settings.json``: This file stores settings for your VS Code environment.
- **src:** This folder contains the core Java source code for the assignment.
  - ``Account.java``: This file implements the ``Account`` class which represents a bank account with details and validation logic.
  - ``Bank.java``: This file implements the ``Bank`` class which manages a collection of accounts and provides functionalities like adding, viewing, and deleting accounts.
  - ``BankRunner.java``: This file implements the ``BankRunner`` class which is the entry point for the program. It interacts with the user to create a bank, manage accounts, and display summaries.

**Running the Program:**

1. Ensure you have Java installed and configured on your system.
2. Open a terminal or command prompt and navigate to the root directory of this project (assignment-2).
3. Compile the Java source code using a command like ``javac src/*.java.`` This will create class files in the same directory.
4. Run the program using the command ``java BankRunner``. This will execute the program and allow you to interact with the bank functionalities.

**Note:** This README assumes a basic understanding of Java development and project structure.