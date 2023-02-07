#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt fop-loader.jar ForNameAgent.class
\rm *.class
