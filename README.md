# 🤖 HojeLB3 TeleOp — Team Angola FGC 2025 Robot Control Code

This repository contains the **TeleOp control program** for the **Team Angola FGC 2025** robot, developed for the **FIRST Global Challenge (FGC)** using the **REV Robotics Control Hub** and FTC SDK.

---

## 🌍 Overview

**HojeLB3** is a Java-based TeleOp mode that enables manual control of a multifunctional robot built for the *FIRST Global Challenge 2025*.  
The program integrates multiple subsystems such as driving, intake, arm control, and servo manipulation, allowing smooth and efficient robot operation during the competition.

---

## ⚙️ Technical Specifications

| Component | Description |
|------------|-------------|
| **Length** | 50 cm |
| **Breadth** | 50 cm |
| **Height** | 48 cm |
| **Chassis Type** | Differential Tank Drive |
| **Power Source** | 12 V DC Battery |
| **Motors** | 4 × REV HD Motors, 1 × Arm Motor (Core Hex), 2 × Intake Motors |
| **Microcontroller** | REV Control Hub |
| **Programming Language** | Java (converted from FTC Blocks) |

---

## 🕹️ Gamepad Controls

| Input | Function |
|-------|-----------|
| **Left Stick** | Move robot (arcade drive) |
| **Right Stick** | Move the arm (`Brac`) |
| **Right Bumper (RB)** | Intake forward (`Sug`, `Sug2`) |
| **Left Bumper (LB)** | Intake reverse |
| **D-Pad Up / Down** | Rotate continuous servos (`Srigth`, `Sleft`) |
| **D-Pad Left / Right** | Adjust claw servos (`Braleft`, `Braright`) |
| **Cross (X)** | Lower lift motors (`MPenD0`, `MPenE1`) |
| **Triangle (△)** | Raise lift motors (`MPenD0`, `MPenE1`) |
| **Circle (O)** | Activate actuator (`Ace`) |
| **Square (□)** | Stop actuator & servos |

---

## 🧠 System Functions

- **Drive System** — dual DC motors (`MD0`, `ME1`) for differential drive  
- **Arm Mechanism** — single DC motor (`Brac`) for lifting and lowering the arm  
- **Intake System** — twin motors (`Sug`, `Sug2`) for object collection and release  
- **Lift System** — two DC motors (`MPenD0`, `MPenE1`) for vertical mechanisms  
- **Actuator** — motor (`Ace`) for accelerator mechanical actions  
- **Servo System** — CR servos (`Srigth`, `Sleft`) and positional servos (`Braleft`, `Braright`) for manipulation and balance  

---

## 🌎 Challenge Context — FIRST Global 2025

The **FIRST Global Challenge 2025** emphasizes **innovation**, **sustainability**, and **team collaboration** among young engineers worldwide.  
Team Angola’s robot is designed to:
- Perform precise and stable movement control  
- Manipulate game elements using coordinated arm and servo systems  
- Demonstrate efficiency and creativity in technical execution  

---

## 🧩 Installation & Usage

1. Clone this repository into your **FTC Robot Controller project folder**:
   ```bash
   git clone https://github.com/Quilmer/Team-Angola-FGC-2025.git
