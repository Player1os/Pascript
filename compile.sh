#!/bin/bash

java -classpath build/classes/:lib/antlr-4.4-complete.jar pascript.Compiler <$1 | opt -S -std-compile-opts >$2