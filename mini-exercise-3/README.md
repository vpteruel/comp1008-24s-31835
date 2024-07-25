
## This directory contains the source code for Mini Exercise 3.

**Folder Structure:**

- **.devcontainer:** (Optional) This folder may contain files related to development container configuration if you're using tools like GitHub Codespaces.
  - ``devcontainer.json``: This file defines the configuration for a development container environment.
- **.github:** This folder contains files related to GitHub integration.
  - ``dependabot.yml``: This file likely defines configuration for Dependabot, a service that helps automate dependency updates.
- **.vscode:** (Optional) This folder may contain configuration files specific to Visual Studio Code.
  - ``settings.json``: This file stores settings for your VS Code environment.
- **src:** This folder contains the core Java source code for the assignment.
  - ``App.java``: The ``App`` class serves as the entry point, demonstrating the ``BookItem`` class by creating, displaying, and updating a book's information.
  - ``Book.java``: The ``Book`` interface defines methods for displaying book information and checking availability.
  - ``BookItem.java``: The ``BookItem`` class represents a library book, implementing methods to display details and manage availability.
  - ``LibraryItem.java``: The ``LibraryItem`` abstract class provides common properties and methods for library items, such as titles and item numbers.

**Running the Program:**

1. Ensure you have Java installed and configured on your system.
2. Open a terminal or command prompt and navigate to the root directory of this project (assignment-2).
3. Compile the Java source code using a command like ``javac src/*.java``. This will create class files in the same directory.
4. Run the program using the command ``java App``. This will execute the program and allow you to interact with the bank functionalities.

**Note:** This README assumes a basic understanding of Java development and project structure.