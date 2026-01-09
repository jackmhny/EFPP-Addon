# EFPP-Addon

A Meteor Client addon containing the ElytraFlyPlusPlus module from BepHax.
BepHax kept crashing and breaking my instances so i just stole EFPP.

## Features

- **ElytraFlyPlusPlus**: Advanced elytra flight module with bounce mode, obstacle passing, portal trap detection, and fake fly support.

## Building

### Requirements
- Java 21 JDK (not just JRE)
- The project uses Gradle with the wrapper included

### Build Instructions

1. Ensure you have Java 21 JDK installed and JAVA_HOME set to your Java 21 installation
2. Run the build command:
   ```bash
   ./gradlew build
   ```
3. The compiled jar will be in `build/libs/EFPP-Addon-1.0.jar`

**Note:** If the build fails with Java version errors, make sure JAVA_HOME points to Java 21:
- On Linux/Mac: `export JAVA_HOME=/path/to/your/java-21`
- On Windows: Set JAVA_HOME environment variable in System Properties

Common Java 21 installation paths:
- Arch Linux: `/usr/lib/jvm/java-21-openjdk`
- Ubuntu/Debian: `/usr/lib/jvm/java-21-openjdk-amd64`
- macOS (Homebrew): `/opt/homebrew/opt/openjdk@21`
- Windows: `C:\Program Files\Java\jdk-21`

## Installation

1. Build the addon or download a release
2. Place the jar file in your `.minecraft/mods/` folder
3. Make sure you have Meteor Client installed
4. Launch Minecraft

## Requirements

- Minecraft 1.21.10
- Fabric Loader 0.17.3+
- Meteor Client (latest snapshot)
- Baritone (for obstacle passer feature)

## Module Overview

### ElytraFlyPlusPlus

Advanced elytra flight module with the following features:

- **Bounce Mode**: Automatically performs bounce efly with configurable speed
- **Motion Y Boost**: Increases speed by cancelling Y momentum
- **Yaw/Pitch Lock**: Lock your rotation for consistent travel
- **Highway Obstacle Passer**: Uses Baritone to automatically navigate around obstacles
- **Portal Trap Detection**: Automatically detects and avoids portal traps
- **Fake Fly**: Fly using a chestplate to save elytra durability
- **Auto Elytra Swap**: Automatically equips/unequips elytra

## Credits

- Original ElytraFlyPlusPlus module by dekrom (from BepHax addon)
- Ported to standalone addon for easier distribution

## License

GNU General Public License v3.0 - See LICENSE file for details
