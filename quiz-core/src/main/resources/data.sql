
INSERT INTO QUESTIONS(ID,TEXT,TYPE,LEVEL) VALUES (1001,'What is OutPut ? 
// filename Main.java 
class Test { 
	protected int x, y; 
} 

class Main { 
	public static void main(String args[]) { 
		Test t = new Test(); 
		System.out.println(t.x); 
	} 
} 
','O','1');


INSERT INTO QUESTIONS(ID,TEXT,TYPE,LEVEL) VALUES (1002,'What is OutPut ?   
// filename Test.java 
class Test { 
    public static void main(String[] args) { 
        for(int i = 0; true; i++) { 
            System.out.println("Hello"); 
            break; 
        } 
    } 
}','O','2');

INSERT INTO QUESTIONS(ID,TEXT,TYPE,LEVEL) VALUES (1003,'What is OutPut ? 
// filename Main.java 
class Main { 
    public static void main(String args[]) { 
        System.out.println(fun()); 
    }   
    static int fun() { 
        return 20; 
    } 
}','O','3');


INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1001,'0',TRUE);
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1002,'Hello',TRUE);
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1003,'20',TRUE);

INSERT INTO QUESTION_ANSWERS  VALUES (1001,1001);
INSERT INTO QUESTION_ANSWERS  VALUES (1002,1002);
INSERT INTO QUESTION_ANSWERS  VALUES (1003,1003);


INSERT INTO QUESTIONS(ID,TEXT,TYPE,LEVEL) VALUES (1004,'A process that involves recognizing and focusing on the important characteristics of a situation or object is known as: ','M','1');
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1004,'Encapsulation',FALSE); 
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1005,'Polymorphism',FALSE);
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1006,'Abstraction',TRUE);
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1007,'Object persistence',FALSE);
INSERT INTO QUESTION_ANSWERS  VALUES (1004,1004);
INSERT INTO QUESTION_ANSWERS  VALUES (1004,1005);
INSERT INTO QUESTION_ANSWERS  VALUES (1004,1006);
INSERT INTO QUESTION_ANSWERS  VALUES (1004,1007);

INSERT INTO QUESTIONS(ID,TEXT,TYPE,LEVEL) VALUES (1005,'Which statement is true regarding an object? ','M','1');
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1008,'An object is what classes instantiated are from',FALSE); 
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1009,'An object is an instance of a class',TRUE);
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1010,'An object is a variable',FALSE);
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1011,'An object is a reference to an attribute',FALSE);
INSERT INTO QUESTION_ANSWERS  VALUES (1005,1008);
INSERT INTO QUESTION_ANSWERS  VALUES (1005,1009);
INSERT INTO QUESTION_ANSWERS  VALUES (1005,1010);
INSERT INTO QUESTION_ANSWERS  VALUES (1005,1011);

INSERT INTO QUESTIONS(ID,TEXT,TYPE,LEVEL) VALUES (1006,'In object-oriented programming, new classes can be defined by extending existing classes. This is an example of: ','M','1');
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1012,'Encapsulation',FALSE); 
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1013,'Interface',FALSE);
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1014,'Composition',FALSE);
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1015,'Inheritance',TRUE);
INSERT INTO QUESTION_ANSWERS  VALUES (1006,1012);
INSERT INTO QUESTION_ANSWERS  VALUES (1006,1013);
INSERT INTO QUESTION_ANSWERS  VALUES (1006,1014);
INSERT INTO QUESTION_ANSWERS  VALUES (1006,1015);


INSERT INTO QUESTIONS(ID,TEXT,TYPE,LEVEL) VALUES (1007,'Which of the following is a member of the java.lang package? ','M','2');
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1016,'List',FALSE); 
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1017,'Queue',TRUE);
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1018,'Math',FALSE);
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1019,'Stack',FALSE);
INSERT INTO QUESTION_ANSWERS  VALUES (1007,1016);
INSERT INTO QUESTION_ANSWERS  VALUES (1007,1017);
INSERT INTO QUESTION_ANSWERS  VALUES (1007,1018);
INSERT INTO QUESTION_ANSWERS  VALUES (1007,1019);

INSERT INTO QUESTIONS(ID,TEXT,TYPE,LEVEL) VALUES (1008,'Which of the following has a method names flush( )? ','M','3');
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1020,'Input stream',FALSE); 
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1021,'Output Stream',TRUE);
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1022,'Reader stream',FALSE);
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1023,'Input reader stream',FALSE);
INSERT INTO QUESTION_ANSWERS  VALUES (1008,1020);
INSERT INTO QUESTION_ANSWERS  VALUES (1008,1021);
INSERT INTO QUESTION_ANSWERS  VALUES (1008,1022);
INSERT INTO QUESTION_ANSWERS  VALUES (1008,1023);

INSERT INTO QUESTIONS(ID,TEXT,TYPE,LEVEL) VALUES (1009,'What is output?
import java.io.IOException; 
import java.util.EmptyStackException; 
  
public class newclass 
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            System.out.printf("%d", 1); 
            throw(new Exception()); 
        } 
        catch(IOException e) 
        { 
            System.out.printf("%d", 2); 
        } 
        catch(EmptyStackException e) 
        { 
            System.out.printf("%d", 3); 
        } 
        catch(Exception e) 
        { 
            System.out.printf("%d", 4); 
        } 
        finally
        { 
            System.out.printf("%d", 5); 
        } 
    } 
} ','M','3');
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1024,'12345',FALSE); 
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1025,'15',FALSE);
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1026,'135',FALSE);
INSERT INTO ANSWERS(ID,TEXT,IS_CORRECT) VALUES (1027,'145',TRUE);
INSERT INTO QUESTION_ANSWERS  VALUES (1009,1024);
INSERT INTO QUESTION_ANSWERS  VALUES (1009,1025);
INSERT INTO QUESTION_ANSWERS  VALUES (1009,1026);
INSERT INTO QUESTION_ANSWERS  VALUES (1009,1027);


INSERT INTO TOPICS(ID,TEXT) VALUES (1001,'JAVA');
INSERT INTO TOPICS(ID,TEXT) VALUES (1002,'PYTHON');


INSERT INTO QUESTIONS_TOPIC VALUES (1001,1001);
INSERT INTO QUESTIONS_TOPIC VALUES (1002,1001);
INSERT INTO QUESTIONS_TOPIC VALUES (1003,1001);
INSERT INTO QUESTIONS_TOPIC VALUES (1004,1001);
INSERT INTO QUESTIONS_TOPIC VALUES (1005,1001);
INSERT INTO QUESTIONS_TOPIC VALUES (1006,1001);
INSERT INTO QUESTIONS_TOPIC VALUES (1007,1001);
INSERT INTO QUESTIONS_TOPIC VALUES (1008,1001);
INSERT INTO QUESTIONS_TOPIC VALUES (1009,1001);

INSERT INTO QUIZES(ID,Q_NAME) VALUES (1001,'JAVA QUIZ 1');
INSERT INTO QUIZES(ID,Q_NAME) VALUES (1002,'JAVA QUIZ 2');


INSERT INTO QUIZ_QUESTIONS VALUES (1001,1001);
INSERT INTO QUIZ_QUESTIONS VALUES (1001,1003);
INSERT INTO QUIZ_QUESTIONS VALUES (1001,1005);
INSERT INTO QUIZ_QUESTIONS VALUES (1001,1007);
INSERT INTO QUIZ_QUESTIONS VALUES (1001,1009);

INSERT INTO QUIZ_QUESTIONS VALUES (1002,1002);
INSERT INTO QUIZ_QUESTIONS VALUES (1002,1004);
INSERT INTO QUIZ_QUESTIONS VALUES (1002,1006);
INSERT INTO QUIZ_QUESTIONS VALUES (1002,1007);
INSERT INTO QUIZ_QUESTIONS VALUES (1002,1008);

