JFLAGS = -g -cp "src:lib/*"
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	src/Coordinate.java \
	test/CoordinateTest.java \
	src/GameBoard.java \
	test/GameBoardTest.java \
	src/TicTacToe.java \
	test/TicTacToeTest.java \
	src/Main.java 

default: classes

classes: $(CLASSES:.java=.class)
		 $(info ************  COMPILE COMPLETE ************)

clean:
	$(RM) src/*.class
	$(RM) test/*.class
