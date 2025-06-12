# 🎯 Number Guessing Game

A simple console-based number guessing game written in Java. Try to guess the number the computer picks between 1 and 100 — you have only 10 tries! 🧠

## 🎮 How to Play

- Run the game in your terminal.
- Enter your name when prompted.
- Guess a number between 1 and 100.
- The AI gives hints:  
  ⬆️ "Up" means your guess is too low  
  ⬇️ "Down" means your guess is too high
- You have 10 total attempts.
- If you guess correctly, your score is calculated based on how many attempts you used.
- After the game, choose whether to play again or quit.

## 💡 Features

- Console-based user interface
- Input validation (only numbers between 1-100 are accepted)
- Limited number of attempts (10 tries)
- Score calculation:  
  🎯 Score = (11 - number of attempts used) × 10
- Replay option after each round
- Emoji-enhanced feedback for a better experience

📌 Example Output
👤 Enter your name: Alperen
🎲 Welcome, Alperen! Let's Play Number Guess! 🎲
💡 You have 10 chances. Good Luck!

🎯 Enter your guess (1-100): 50
⬇️ Down
❗ Remaining Guesses: 9

🎯 Enter your guess (1-100): 25
⬆️ Up
❗ Remaining Guesses: 8

🎯 Enter your guess (1-100): 36
🎉 You guessed correctly!
📊 Attempts Used: 3
🏆 Score: 80 points

🔁 Do you want to play again? (y/n):
