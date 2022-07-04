#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt avrora-loader.jar ForNameAgent.class
\rm *.class
