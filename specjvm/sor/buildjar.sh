#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt sor-loader.jar ForNameAgent.class
\rm *.class
