class SqueakyClean {
    
    static String clean(String identifier) {
        StringBuilder str=new StringBuilder("");
     for(int i=0;i<identifier.length();i++)
         {
            char t=identifier.charAt(i);

             if(Character.isLetterOrDigit(t) || t=='-' ||t=='_' || t==' ') {
                  if(t==' ')
                 str=str.append("_");
            else if(t=='-') {
                 str=str.append(Character.toUpperCase(identifier.charAt(i+1)));
                i++;
            } 

            else if(Character.isDigit(t)) {
                switch(t) {
                    case '0':str=str.append("o");
                             break;
                     case '3':str=str.append("e");
                             break;

                     case '1':str=str.append("l");
                             break;

                    case '4':str=str.append("a");
                             break;
                    case '7':str=str.append("t");
                             break;
                        
                }
            }
             else
                 str=str.append(identifier.charAt(i));
         }
             }
            
       return str.toString();

        }       
    
}
