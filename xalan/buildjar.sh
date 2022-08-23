#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt xalan-loader.jar ForNameAgent.class
\rm *.class
