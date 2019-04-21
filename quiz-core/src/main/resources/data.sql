INSERT INTO QUESTIONS(ID,TEXT,TYPE,LEVEL) VALUES (1,'What is OutPut ? 
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


INSERT INTO QUESTIONS(ID,TEXT,TYPE,LEVEL) VALUES (2,'What is OutPut ?   
// filename Test.java 
class Test { 
    public static void main(String[] args) { 
        for(int i = 0; true; i++) { 
            System.out.println("Hello"); 
            break; 
        } 
    } 
}','O','2');

INSERT INTO QUESTIONS(ID,TEXT,TYPE,LEVEL) VALUES (3,'What is OutPut ? 
// filename Main.java 
class Main { 
    public static void main(String args[]) { 
        System.out.println(fun()); 
    }   
    static int fun() { 
        return 20; 
    } 
}','O','3');

