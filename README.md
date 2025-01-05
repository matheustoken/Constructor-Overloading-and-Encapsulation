# Combat Challenge

## Description
In this combat game, each player controls a champion. Each champion has the following attributes:
- **Name**
- **Attack**
- **Armor**
- **Health**

The combat between two champions happens in **turns**, where both champions attack each other. The objective is to create a program that:
1. Instantiates two champions.
2. Executes **N combat rounds**.
3. Displays the state of each champion after each turn.

If, during any round, one champion's health reaches zero, the combat ends. After the combat ends, the program should display the message **"END OF COMBAT"**.

### Combat Rules
The way a champion **A** receives damage from another champion **B** is as follows:
1. The health of champion **A** decreases by the attack value of champion **B**, reduced by the armor value of champion **A**. The resulting health cannot go below zero.
2. Regardless of the armor of champion **A**, the champion must lose at least **1 health** point per attack.

### Requirements
1. **Champion Class**: Create a class to represent the champion, which includes:
   - **Attributes**: Name, Attack, Armor, Health
   - **Methods**:
     - `takeDamage`: Decreases health based on the attack and armor values.
     - `status`: Returns the champion's name and current health status (including the word "dead" if the health is zero).
    
         ![image](https://github.com/user-attachments/assets/6b02b3ce-94ad-4794-a2ad-800966160ddc)

2. **Combat Execution**: 
   - Instantiate two champions.
   - Execute N turns of combat.
   - After each turn, show the current status of both champions.
   - If one champion dies (health reaches zero), the combat ends immediately.

3. **Output**:
   - At the end of each turn, display the updated state of each champion.
   - When one champion dies, print **"END OF COMBAT"** and stop the game.

## Example Output:

![image](https://github.com/user-attachments/assets/a4716c39-dc34-4475-9467-087e3807a5c5)

## Languages and Concepts Used
- Java
- Constructor
- Overloading
- Encapsulation

## Actor
Matheus Accorsi

