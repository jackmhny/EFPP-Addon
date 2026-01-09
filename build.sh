#!/bin/bash
# Build script for EFPP-Addon
# Sets the correct JAVA_HOME and runs gradle build

export JAVA_HOME=/usr/lib/jvm/java-21-openjdk
./gradlew build "$@"
