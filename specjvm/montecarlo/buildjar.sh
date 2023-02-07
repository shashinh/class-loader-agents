#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt montecarlo ForNameAgent.class
\rm *.class
