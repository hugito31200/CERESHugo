# LIBS=${MULVALROOT}/lib/dom4j-2.1.4.jar:${MULVALROOT}/lib/jaxen-1.1.1.jar:${MULVALROOT}/lib/mysql-connector-java-5.1.8-bin.jar
LIBS=../../lib/dom4j-1.6.1.jar
TARGET=GetCVEID.class GetTplQry.class InitializeDB.class MetricParser.class NessusXMLParser.class GetTplQry_nessusXML.class XMLConstructor.class mysqlConnectionChecker.class 

.SUFFIXES: .java .class

default: ${TARGET}

.java.class:
	javac $*.java -cp ${LIBS}

install: ${TARGET}
	cp ${TARGET} ../../bin/adapter

clean:
	rm -f *.class
