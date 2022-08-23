#!/bin/bash

javac ForNameAgent.java
jar cmvf manifest.txt lusearch-loader.jar ForNameAgent.class
\rm *.class
