# Ticket to Ride Sprint 1 Prototype

## Project Purpose

This project is an extremely basic Java console prototype for Sprint 1. It only demonstrates the initial setup of a simplified Ticket to Ride game.

## Features Implemented

- Displays a welcome message
- Prompts the user for the number of players
- Creates players with:
  - 45 trains
  - 4 train cards
  - 3 destination tickets
- Prints each player's starting state
- Exits cleanly after setup

## Classes Used

- `Main`
- `Main.Player` (nested helper class inside `Main`)

## How to Compile

Run this in the project folder:

```powershell
javac Main.java
```

## How to Build the Runnable JAR

Run this after compiling:

```powershell
java --module jdk.jartool/sun.tools.jar.Main --create --file TicketToRidePrototype.jar --main-class Main Main.class Main`$Player.class
```

## How to Run the JAR

```powershell
java -jar TicketToRidePrototype.jar
```
