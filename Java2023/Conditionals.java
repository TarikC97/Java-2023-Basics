  class Conditional{      
    
        public static void main(String args[]){   
        //++num; - PreIncrement, num++; - PostIncrement;
        //Relational Operators(>,==,<)
        //int x=5;int y=6; boolean rez = x>5 => println(rez)
        //Logical Operators(&&,||,!)
        //Conditional Statements (If,Else,IfElse)
        //Ternary Operators ?,:
        //Switch old
        //     int n =2;
        //         switch(n){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;//So it stops executing rest cases
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     default:
        //         System.out.println("Rest");
        //     }   
        // }
        //Switch new 
        String day = "Monday";
        String result ="";
        result = switch(day){
            case "Saturday","Sunday" -> "6am";
            case "Monday" -> "7am";        
            default -> "8am";
        };
        System.out.println(result);
    } 
  }