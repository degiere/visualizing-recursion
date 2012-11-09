#!/bin/sh

# Brownian or Brownian.java
f=`echo $1 |sed s/\.java//`

echo 'compiling...';
javac -cp stdlib.jar *.java;

echo 'running' $f;
java -cp .:stdlib.jar $f;

