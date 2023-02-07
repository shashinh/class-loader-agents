#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt lu-loader.jar ForNameAgent.class
\rm *.class
