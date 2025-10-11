# 🤖 HojeLB TeleOp — FTC Robot Control Code

This repository contains the **TeleOp control program** for the **Eco Equilibrium 2025** robot, developed for the **FIRST Tech Challenge (FTC)** using the **REV Robotics Control Hub**.

---

## 🌍 Overview

**HojeLB** is a Java-based TeleOp mode that enables precise manual control of a multifunctional robot built for environmental restoration and coordination tasks inspired by the *Eco Equilibrium 2025* challenge.

The code manages driving, intake, lifting, and balancing systems, allowing full mobility and mechanism control during competition matches.

---

## ⚙️ Technical Specifications

| Component | Description |
|------------|-------------|
| **Length** | 50 cm |
| **Breadth** | 50 cm |
| **Height** | 48 cm |
| **Chassis Type** | Westcoast Tank Drive |
| **Power Source** | 12 V DC Battery |
| **Motors** | 4 × REV 5:1 Motors, 2 × REV UltraPlanetary 125:1, 1 × REV Core Hex |
| **Microcontroller** | REV Control Hub |
| **Programming Language** | Java (converted from Blocks) |

---

## 🕹️ Gamepad Controls

| Input | Function |
|-------|-----------|
| **Left Stick** | Move robot (arcade drive) |
| **Right Bumper** | Intake forward |
| **Left Bumper** | Intake reverse |
| **D-Pad Up / Down** | Rotate continuous servos |
| **D-Pad Left / Right** | Adjust servo arms (open/close) |
| **Cross (X)** | Lower lift motors |
| **Triangle (△)** | Raise lift motors |
| **Circle (O)** | Activate actuator (`Ace`) |
| **Square (□)** | Stop actuator & servos |

---

## 🧠 System Functions

- **Drive System** — two main DC motors (`MD0`, `ME1`) with differential tank drive  
- **Intake System** — dual motors (`Sug`, `Sug2`) for collecting and releasing game elements  
- **Lift System** — two motors (`MPenD0`, `MPenE1`) for vertical movement  
- **Actuator** — single DC motor (`Ace`) for secondary functions  
- **Servo System** — CR servos (`Sright`, `Sleft`) and standard servos (`Braleft`, `Braright`) for manipulation and balance  

---

## 🌿 Context — Eco Equilibrium 2025

The *Eco Equilibrium* challenge focuses on **restoring ecosystems**, **removing barriers to biodiversity**, and **maintaining global stability**.  
This code supports a robot capable of:
- Transporting and depositing biodiversity units  
- Balancing on the **Eco Balance Platform**  
- Demonstrating collaboration and precision in the final **Equilibrium Phase**

---

## 🧩 Installation & Usage

1. Clone this repository to your **FTC Robot Controller project folder**:  
   ```bash
   git clone https://github.com/yourusername/HojeLB-TeleOp.git
