# EFPP-Addon

A Meteor Client addon containing the ElytraFlyPlusPlus module from BepHax.

## Features

- **ElytraFlyPlusPlus**: Advanced elytra flight module with bounce mode, obstacle passing, portal trap detection, and fake fly support.

## Building

To build the addon, you need:
- Java 21 JDK (not just JRE) - Install with: `sudo pacman -S jdk21-openjdk`
- The project uses Gradle with the wrapper included

### Build Commands

**Using the build script (recommended):**
```bash
./build.sh
```

**Or manually with JAVA_HOME:**
```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk
./gradlew build
```

The compiled jar will be in `build/libs/EFPP-Addon-1.0.jar`

**Note:** If you want to permanently set JAVA_HOME, add this to your `~/.bashrc` or `~/.zshrc`:
```bash
export JAVA_HOME=/usr/lib/jvm/java-21-openjdk
```

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
