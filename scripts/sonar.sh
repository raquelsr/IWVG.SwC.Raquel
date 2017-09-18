#echo off
export workspace=/Users/Raquel/Documents/Workspace/Eclipse/IWVG.SwC.Raquel
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk/Contents/Home/jre
export M2_HOME=/Users/Raquel/Desktop/Master/Software/apache-maven-3.5.0

echo -----------------------------------------
echo ".(C) MIW"
echo -----------------------------------------
echo .
echo Workspace --- $workspace
echo JAVA_HOME -- $JAVA_HOME
echo PATH -- $PATH
echo M2_HOME = $M2_HOME

echo .
cd $workspace
echo ============ mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml ... ==================
echo . Se prepara cobertura
mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml

echo ============ mvn sonar:sonar ... =======================================================
echo . Se analiza y sube a sonar cloud
mvn sonar:sonar \
  -Dsonar.organization=raquelsr-github \
  -Dsonar.host.url=https://sonarcloud.io \
  -Dsonar.login=bdb50be6bb3c212f2735c8cc04909d727ae6f3a6 --settings settings.xml
