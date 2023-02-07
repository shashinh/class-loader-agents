#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt fft-loader.jar ForNameAgent.class
\rm *.class
