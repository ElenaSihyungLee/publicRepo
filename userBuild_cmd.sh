cd /root/jarFile/gitRepo
javac Test.java
jar -cvmf manifest.txt Test.jar Test.class
java -jar /root/jarFile/gitRepo/Test.jar
