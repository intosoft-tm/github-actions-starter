#!/bin/sh
echo "gradlew $@"

mkdir -p ~/.gradle
mkdir -p ~/.gradle/caches
mkdir -p ~/.gradle/wrapper

mkdir -p ./build/reports/tests
touch ./build/reports/tests/report.html