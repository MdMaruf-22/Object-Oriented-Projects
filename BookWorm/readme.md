# BOOKWORM - Library Management System

A simple library management system fully implemented using Object-Oriented Programming (OOP) concepts. The system allows the librarian to manage users and books, while users can register and log in to the system.

## Features

### For Librarian:
- Login with username and password.
- Add, delete, and edit books.
- Review and accept or reject user registration requests.

### For Users:
- User registration with name, ID, email, and password.
- User login with username and password.
- Registration requests are reviewed by the librarian before being accepted.

## Files

### 1. `Librarian.java`
The `Librarian` class encapsulates the functionality for the librarian to log in and manage user registrations:
- `login()`: Allows the librarian to log in with a username and password.
- `functionality()`: Displays a menu of options for the librarian.
- `reviewUser()`: Allows the librarian to view user registration requests and accept or reject them.

### 2. `User.java`
The `User` class encapsulates the functionality for users to register and log in:
- `registration()`: Allows users to register by providing their name, ID, email, and password.
- `login()`: Allows users to log in with their username and password.

### 3. `Main.java`
The main entry point of the system that presents a menu for users and librarians:
- 1: Librarian Login
- 2: User Registration
- 3: User Login
- 4: Exit

## File Structure

- `users.txt`: Stores registered users' data.
- `registration_request.txt`: Stores pending user registration requests.
  
## Usage

1. **Librarian Login**:
   - The librarian can log in using the credentials `"Admin"` (username) and `"Admin"` (password).
   - After login, the librarian can review and accept/reject user registration requests.

2. **User Registration**:
   - New users can register by entering their details such as name, ID, email, and password.
   - The registration request will be saved to `registration_request.txt` and reviewed by the librarian.

3. **User Login**:
   - Users can log in using their registered username and password.
   - The system will check if the credentials are valid and show a message accordingly.

## How to Run

1. Ensure that the required files (`users.txt` and `registration_request.txt`) are in the same directory as the Java files.
2. Compile the Java files:
    ```bash
    javac *.java
    ```
3. Run the `Main` class:
    ```bash
    java Main
    ```

## Example Flow

1. When the system starts, the user is presented with the following options:
    ```
    1. Librarian Login
    2. User Registration
    3. User Login
    4. Exit
    ```
2. The librarian logs in, reviews user registration requests, and either accepts or rejects them.
3. Users can register by providing their details, and their request will be stored in `registration_request.txt`.
4. Once accepted by the librarian, the user is added to `users.txt`.

## Object-Oriented Design

This system is implemented fully using Object-Oriented Programming (OOP) principles, including:

- **Encapsulation**: Each class (`Librarian` and `User`) contains data and methods that are relevant to their functionality, hiding the internal workings from other parts of the program.
- **Abstraction**: The implementation details of login, registration, and request handling are hidden within methods, providing a simple interface for interacting with the system.
- **Inheritance**: While not explicitly used in this simple implementation, the system is designed to easily accommodate inheritance if extended in the future (e.g., for different types of users).
- **Polymorphism**: Methods like `login()` and `registration()` can be extended or overridden for different user roles, providing flexibility in behavior.

## Notes
- This is a simple console-based implementation for demonstration purposes.
- The system does not include a database and relies on text files (`users.txt`, `registration_request.txt`) for data storage.

## Future Enhancements
- Implement database integration for persistent storage.
- Add functionality for managing books (add, delete, edit).
- Improve error handling and validation for user input.

