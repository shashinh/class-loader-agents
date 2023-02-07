#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt sparse-loader.jar ForNameAgent.class
\rm *.class
