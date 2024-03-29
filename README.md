# Number Guessing Game in Java

## Overview
The Number Guessing Game is a simple, console-based game implemented in Java. The game generates a random number between 1 and 100, and the player has 10 attempts to guess this number. To assist the player, hints are provided after certain attempts.

## How to Run
1. Ensure Java is installed on your system.
2. Download the `NumberGuessingGame.java` file.
3. Open a terminal or command prompt and navigate to the directory containing the downloaded file.
4. Compile the program using the command: `javac NumberGuessingGame.java`
5. Run the compiled program with: `java Main`

## Gameplay
- The player has 10 attempts to guess the correct number.
- After 2 attempts, a hint about the number range is provided.
- After 4 attempts, a hint about whether the number is even or odd is given.
- After 6 attempts, a hint about the number's range with a 15-unit buffer is provided.
- If the correct number is guessed, a congratulatory message is displayed.

## Note
- The program will exit if the maximum number of attempts is reached.
- The correct number will be revealed if the player fails to guess it within the given attempts.

Feel free to explore the code to understand its logic and make any modifications as needed. Enjoy playing the Number Guessing Game!
