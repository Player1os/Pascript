#!/bin/bash

java -jar lib/antlr-4.4-complete.jar src/pascript/grammar/Pascript.g4 -visitor
g++ -std=c++0x -shared -fPIC lib/library.cpp -o build/library.so