Here’s a neat **README.md** for your Snakes & Ladders project:

---

# 🐍🎲 Snakes & Ladders

A simple **Snakes & Ladders game** implemented in **Java**.
The game simulates dice rolls, snake bites, ladder climbs, and winning conditions.

---

## 📌 Features

* 🎲 **Dice Class** – rolls values between `1–6`.
* 🐍 **Snake Class** – brings player down if bitten.
* 🪜 **Ladder Class** – moves player up if climbed.
* 🎯 **Board Class** – stores snakes & ladders, checks positions.
* 🏆 **Game Class** – manages gameplay and winning condition.
* ✅ **Unit Tests** using **JUnit 5**.

---

## 🏗️ Project Structure

```
src/
 ├── Dice.java
 ├── Snake.java
 ├── Ladder.java
 ├── Board.java
 ├── Game.java
test/
 └── GameTest.java
```

---

## 🚀 How to Run

### 1. Clone Repository

```bash
git clone https://github.com/your-username/snakes-ladders-java.git
cd snakes-ladders-java
```

### 2. Compile and Run

```bash
javac src/*.java
java src/Game
```

---

## 🧪 Running Tests

Ensure you have **JUnit 5** in your classpath (via Maven/Gradle or manually).

### If using Maven:

```bash
mvn test
```

### If running manually:

```bash
javac -cp .:junit-5.10.0.jar test/GameTest.java
java -cp .:junit-5.10.0.jar org.junit.runner.JUnitCore GameTest
```

---

## 🎮 Game Rules

1. The board has **100 cells** (01–100).
2. Starting position is **00 (outside the board)**.
3. Roll a dice (1–6) and move forward.
4. If you land at:

   * 🪜 **Ladder foot** → climb up.
   * 🐍 **Snake head** → go down.
5. Must land **exactly on 100** to win.
6. If roll exceeds 100 → stay in the same position.

---

## 📌 Example Gameplay

```
🎲 Welcome to Snakes & Ladders!
Starting at position 0...

Press ENTER to roll the dice...
You rolled a 5
Current Position: 5

Press ENTER to roll the dice...
You rolled a 2
Yay! Climbed a ladder 🪜 from 7 → 33
Current Position: 33
```


