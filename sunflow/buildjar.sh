#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt sunflow-loader.jar ForNameAgent.class
\rm *.class
