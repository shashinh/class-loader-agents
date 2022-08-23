#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt luindex-loader.jar ForNameAgent.class
\rm *.class
