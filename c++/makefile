all: main.o A.o B.o C.o
	g++ main.o A.o B.o C.o -o test
main.o: main.cc
	g++ -c main.cc
A.o: A.cc A.h
	g++ -c A.cc
B.o: B.cc B.h
	g++ -c B.cc
C.o: C.cc C.h
	g++ -c C.cc
