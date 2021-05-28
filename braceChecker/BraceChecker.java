package braceChecker;

public class BraceChecker {

    //սա հենց տեքստն է
    private String text;
    Stack stack = new Stack();

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String txt) {
        text = txt;
    }


    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {
        int braceIndex = -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(' || text.charAt(i) == '[' || text.charAt(i) == '{') {
                stack.push(text.charAt(i));
                ++braceIndex;
            }
        }
            for (int i = 0; i < text.length(); i++) {
                switch(text.charAt(i)){
                    case ')':
                        switch ((int) stack.array[braceIndex]){
                            case '(':
                                stack.pop();
                                braceIndex--;
                                break;
                            case '[':
                                System.out.println("Error: opened [ but closed ) at " + i);
                                return;
                            case '{':
                                System.out.println("Error: opened { but closed ) at " + i);
                                return;
                        }
                        break;
                    case '}':
                        switch ((int) stack.array[braceIndex]){
                            case '{':
                                stack.pop();
                                braceIndex--;
                                break;
                            case '[':
                                System.out.println("Error: opened [ but closed } at " + i);
                                return;
                            case '(':
                                System.out.println("Error: opened ( but closed } at " + i);
                                return;
                        }
                        break;
                    case ']':
                        switch ((int) stack.array[braceIndex]){
                            case '[':
                                stack.pop();
                                braceIndex--;
                                break;
                            case '(':
                                System.out.println("Error: opened ( but closed ] at " + i);
                                return;
                            case '{':
                                System.out.println("Error: opened { but closed ] at " + i);
                                return;
                        }
                        break;
                }
            }
            if(braceIndex >= 0){
                System.out.println("Error: opened " + stack.array[braceIndex] + " but not closed");
            }
        }
}