all:
	javac -sourcepath src src/VetPet/VetPetSystem.java  -d bin/

run:
	java -classpath ".:bin/" VetPet.VetPetSystem

clean:
	rm -f *~ src/*~ src/*/*~ src/*/*/*~ src/*/*/*/*~
	rm -rf bin/*

DOCU:
	doxygen Doxyfile

again:
	make clean
	make all