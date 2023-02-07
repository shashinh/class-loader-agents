#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt pmd-loader.jar ForNameAgent.class
\rm *.class
