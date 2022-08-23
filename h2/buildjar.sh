#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt h2-loader.jar ForNameAgent.class
\rm *.class
