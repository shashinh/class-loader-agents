#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt compress-loader.jar ForNameAgent.class
\rm *.class
