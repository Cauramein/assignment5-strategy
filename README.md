# Assignment #5 — Strategy Pattern (Navigation / Route Planning)

- **Student:** Shyngys Zaikenov (SE-2523)
- **Course:** ShP-2216 – Software Design Patterns
- **Language:** Java (JDK 17)

## Project Structure
```text
assignment5-strategy/
├── src/
│   ├── RouteStrategy.java   # Strategy Interface
│   ├── CarStrategy.java     # Concrete Strategy 1
│   ├── WalkStrategy.java    # Concrete Strategy 2
│   ├── CycleStrategy.java   # Concrete Strategy 3
│   ├── BusStrategy.java     # Concrete Strategy 4 (Extensibility Demo)
│   ├── Navigator.java       # Context Class
│   └── Main.java            # Client Class (Runtime Switching Demo)
├── README.md
└── REPORT.md
```
How to Build and Run
Option 1: IntelliJ IDEA 

Open the assignment5-strategy folder in IntelliJ IDEA.

Ensure the Project SDK is set to JDK 17.

Open src/Main.java and click the green Run arrow next to main().

Option 2: Command Line (Terminal / PowerShell)
Run the following commands from the project root directory:

```PowerShell
javac -d out src/*.java
java -cp out Main
```
Expected Output:
```bash
AITU -> highway -> Park (5 km, ~15 min by Car)
AITU -> footpath -> Park (5 km, ~60 min by Walk)
AITU -> cycle lane -> Park (5 km, ~20 min by Cycle)
AITU -> bus lane -> Park (5 km, ~22 min by Bus)
```
