#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt "$1" ForNameAgent.class
\rm *.class
