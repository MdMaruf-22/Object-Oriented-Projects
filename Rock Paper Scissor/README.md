# Rock Paper Scissors Game 🤖✋📝

A simple Rock Paper Scissors game where a human player competes against a robot. The game is implemented using Object-Oriented Programming (OOP) concepts in Java.

## Project Structure

- **Human.java**: Defines the `Human` class that extends the abstract `Player` class. It allows the human player to input their choice of Rock, Paper, or Scissors.
- **Player.java**: An abstract class that serves as a blueprint for all players (Human and Robot). It contains common properties like `name` and `choice`, and an abstract method `selectChoice()` to define how each player selects their choice.
- **Robot.java**: Defines the `Robot` class that extends `Player`. The robot makes its choice randomly between Rock, Paper, or Scissors.
- **PlayGame.java**: Implements the game logic, handling user input, and determining the winner based on the choices of the human and robot.
- **Main.java**: Contains the `main` method which runs the game.

## Features

- **Human vs. Robot**: A player competes against an AI-controlled robot.
- **Choice Input**: The human player inputs their choice (Rock, Paper, or Scissors) while the robot selects its choice randomly.
- **Game Logic**: The game determines the winner based on the classic rules of Rock, Paper, Scissors:
    - Rock beats Scissors
    - Scissors beats Paper
    - Paper beats Rock

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or later
- A Java IDE (like IntelliJ IDEA, Eclipse, or NetBeans) or a text editor (VS Code, Sublime Text)

## How It Works

1. The player selects their move: Rock, Paper, or Scissors.
2. The computer randomly selects its move.
3. The winner is determined based on the classic rules:
   - Rock beats Scissors.
   - Scissors beats Paper.
   - Paper beats Rock.
4. The result is displayed, and the player can choose to play again.

## Object-Oriented Approach

This project follows a fully **Object-Oriented Programming (OOP)** approach. Key components include:

- **Game Class**: Manages the overall game flow.
- **Player Class**: Represents the player and their choices.
- **Computer Class**: Represents the computer opponent with randomized decision-making.
- **Rules Class**: Encapsulates the game rules and determines the winner.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Rock-Paper-Scissor.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Rock-Paper-Scissor
   ```
3. Run the game:
   ```bash
   python main.py
   ```

## Usage

- Follow the on-screen instructions to play the game.
- Enter your choice (Rock, Paper, or Scissors) when prompted.
- View the results and decide whether to play again.

## Example Output

```
Welcome to Rock Paper Scissors!
Enter your move (Rock, Paper, Scissors): Rock
Computer chose: Scissors
You win! Rock beats Scissors.
Play again? (yes/no): no
Thanks for playing!
```

## Project Structure

```
Rock Paper Scissor/
│
├── main.py                # Entry point of the game
├── game.py                # Contains the Game class
├── player.py              # Contains the Player class
├── computer.py            # Contains the Computer class
├── rules.py               # Contains the Rules class
└── README.md              # Project documentation
```

## Contributing

Contributions are welcome! Feel free to fork the repository and submit a pull request with your improvements.

## License

This project is licensed under the [MIT License](LICENSE).

---

Enjoy playing **Rock Paper Scissors** while exploring the power of Object-Oriented Programming!
