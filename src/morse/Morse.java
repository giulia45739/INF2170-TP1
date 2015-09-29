/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

/**
 *
 * @author Utilisateur
 */
public class Morse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char firstChar = Pep8.chari();
        
        while(firstChar != '$'){
            toLetters(firstChar);
            firstChar = Pep8.chari();
        }
    }
    
    public static void toLetters(char thisChar){
        
        // si c'est un « - »
        if(thisChar == '-'){
            
            // on verifie le charactère suivant  
            thisChar = Pep8.chari();
            
            // si c'est « - » on traduit par la lettre « t »
            if(thisChar == ' '){
                System.out.print("t");
            }
            
            // si c'est un « -* » on traduit par la lettre « t » et un retour de ligne
            else if(thisChar == '\n'){
                System.out.println("t");
            }
            
            else if(thisChar == '$'){
                System.out.println("t");
                Pep8.stop();
            }
            
            // si c'est un « -- »
            else if(thisChar == '-'){
                // on verifie le charactère suivant  
                thisChar = Pep8.chari();
                
                // si c'est « -- » on traduit par la lettre « m »
                if(thisChar == ' ') {
                    System.out.print("m");
                }
                
                // si c'est « --* » on traduit par la lettre « m » et un retour de ligne 
                else if(thisChar == '\n'){
                    System.out.println("m");
                }
                
                else if(thisChar == '$'){
                    System.out.println("m");
                    Pep8.stop();
                }
                
                // si c'est un « --- »
                else if(thisChar == '-'){
                    // on verifie le charactere suivant 
                    thisChar = Pep8.chari();
                    
                    if(thisChar == ' '){
                        System.out.print("o");
                    }
                    
                    else if(thisChar == '\n'){
                        System.out.println("o");
                    }
                    
                    else if(thisChar == '$'){
                        System.out.println("o");
                        Pep8.stop();
                    }
                    
                    // ---- 
                    // cas 1: la chaine de characteres n'existe pas
                    else if(thisChar == '-'){
                        
                        while(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            
                            if(thisChar != '.' && thisChar != '-'){

                                    System.out.println("----*ERROR");
                                    Pep8.stop();
                            }
                            thisChar = Pep8.chari(); 
                        }
                        
                        if(thisChar == '$'){
                            System.out.println("?"); 
                            Pep8.stop();
                        }
                        
                        else if(thisChar == '\n'){
                            System.out.println("?");
                        }
                        else{
                            System.out.print("?");
                        }
                        
                    }
                    
                    // ---.
                    // cas 1: la chaine de characteres n'existe pas
                    else if(thisChar == '.'){
                        
                        while(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            
                            if(thisChar != '.' && thisChar != '-'){

                                    System.out.println("---.*ERROR");
                                    Pep8.stop();
                            }
                            thisChar = Pep8.chari(); 
                        }
                        
                        if(thisChar == '$'){
                            System.out.println("?"); 
                            Pep8.stop();
                        }
                        
                        else if(thisChar == '\n'){
                            System.out.println("?");
                        }
                        else{
                            System.out.print("?");
                        } 
                    }
                    
                    else{
                        System.out.println("---ERROR");
                        Pep8.stop();
                    }
                }
                
                // si c'est un « --. »
                else if(thisChar == '.'){
                    // on verifie le charactere suivant 
                    thisChar = Pep8.chari();
                    
                    if(thisChar == ' '){
                        System.out.print("g");
                    }
                    
                    else if(thisChar == '\n'){
                        System.out.println("g");
                    }
                    
                    else if(thisChar == '$'){
                        System.out.println("g");
                        Pep8.stop();
                    }
                    
                    // --.-
                    // cas 2: la chaine de charachere existe mais il pourrait y avoir une erreur 
                    else if(thisChar == '-'){
                        // on verifie le prochain charactere 
                        thisChar = Pep8.chari();
                        
                        // dans le cas ou le prochain charactere est illegal 
                        if(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            //thisChar = Pep8.chari();

                            while(thisChar != ' ' && thisChar != '\n' && thisChar !='$'){
                                
                                // si le charactere n'est pas un . ou un -, on a une erreur et le programme s'arrete 
                                if(thisChar != '.' && thisChar != '-'){
                                        System.out.println("--.-*ERROR");
                                        Pep8.stop();
                                }
                                thisChar = Pep8.chari(); 
                            }
                            
                            if(thisChar == '$'){
                                System.out.println("?");
                                Pep8.stop();
                            }
                            else {
                                System.out.println("?");
                            }
                        }
                        
                        // dans le cas ou le prochain charactere est legale 
                        else{
                            if (thisChar == ' '){
                              System.out.print("q");  
                            }
                            else if(thisChar == '$'){
                                System.out.println("q"); 
                                Pep8.stop();
                            }
                            else{
                              System.out.println("q");  
                            }
                        }
                    }
                    
                    // --..
                    // cas 2: la chaine de charachere existe mais il pourrait y avoir une erreur 
                    else if(thisChar == '.'){
                        // on verifie le prochain charactere 
                        thisChar = Pep8.chari();
                        
                        // dans le cas ou le prochain charactere est illegal 
                        if(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            //thisChar = Pep8.chari();

                            while(thisChar != ' ' && thisChar != '\n' && thisChar !='$'){
                                
                                // si le charactere n'est pas un . ou un -, on a une erreur et le programme s'arrete 
                                if(thisChar != '.' && thisChar != '-'){
                                        System.out.println("--..*ERROR");
                                        Pep8.stop();
                                }
                                thisChar = Pep8.chari(); 
                            }
                            
                            if(thisChar == '$'){
                                System.out.println("?");
                                Pep8.stop();
                            }
                            else {
                                System.out.println("?");
                            }
                        }
                        
                        // dans le cas ou le prochain charactere est legale 
                        else{
                            if (thisChar == ' '){
                              System.out.print("z");  
                            }
                            else if(thisChar == '$'){
                                System.out.println("z"); 
                                Pep8.stop();
                            }
                            else{
                              System.out.println("z");  
                            }
                        }
                    }
                    
                    else{
                        System.out.println("--.ERROR");
                        Pep8.stop();
                    }
                }
                
                // --ERROR
                else{
                    System.out.println("--ERROR");
                    Pep8.stop();
                } 
                
            }
            
            // si c'est un « -. »
            else if(thisChar == '.'){
                // on verifie le charactère suivant
                thisChar = Pep8.chari();
                
                // si c'est « -. » on traduit par la lettre « n »
                if(thisChar == ' '){
                   System.out.print("n"); 
                }
                
                // si c'est « -.* » par la lettre « n » et un retour de ligne 
                else if(thisChar == '\n'){
                   System.out.println("n"); 
                }
                
                else if(thisChar == '$'){
                    System.out.println("n");
                    Pep8.stop();
                }
                
                // si c'est un « -.- »
                else if(thisChar == '-'){
                    // on verifie le charactere suivant 
                    thisChar = Pep8.chari();
                    
                    if(thisChar == ' '){
                        System.out.print("k");
                    }
                    
                    else if(thisChar == '\n'){
                        System.out.println("k");
                    }
                    
                    else if(thisChar == '$'){
                        System.out.println("k");
                        Pep8.stop();
                    }
                    
                    // -.--
                    // cas 2: la chaine de charachere existe mais il pourrait y avoir une erreur 
                    else if(thisChar == '-'){
                        // on verifie le prochain charactere 
                        thisChar = Pep8.chari();
                        
                        // dans le cas ou le prochain charactere est illegal 
                        if(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            //thisChar = Pep8.chari();

                            while(thisChar != ' ' && thisChar != '\n' && thisChar !='$'){
                                
                                // si le charactere n'est pas un . ou un -, on a une erreur et le programme s'arrete 
                                if(thisChar != '.' && thisChar != '-'){
                                        System.out.println("-.--*ERROR");
                                        Pep8.stop();
                                }
                                thisChar = Pep8.chari(); 
                            }
                            
                            if(thisChar == '$'){
                                System.out.println("?");
                                Pep8.stop();
                            }
                            else {
                                System.out.println("?");
                            }
                        }
                        
                        // dans le cas ou le prochain charactere est legale 
                        else{
                            if (thisChar == ' '){
                              System.out.print("y");  
                            }
                            else if(thisChar == '$'){
                                System.out.println("y"); 
                                Pep8.stop();
                            }
                            else{
                              System.out.println("y");  
                            }
                        }
                    }
                    
                    // -.-.
                    // cas 2: la chaine de charachere existe mais il pourrait y avoir une erreur 
                    else if(thisChar == '.'){
                        // on verifie le prochain charactere 
                        thisChar = Pep8.chari();
                        
                        // dans le cas ou le prochain charactere est illegal 
                        if(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            //thisChar = Pep8.chari();

                            while(thisChar != ' ' && thisChar != '\n' && thisChar !='$'){
                                
                                // si le charactere n'est pas un . ou un -, on a une erreur et le programme s'arrete 
                                if(thisChar != '.' && thisChar != '-'){
                                        System.out.println("-.-.*ERROR");
                                        Pep8.stop();
                                }
                                thisChar = Pep8.chari(); 
                            }
                            
                            if(thisChar == '$'){
                                System.out.println("?");
                                Pep8.stop();
                            }
                            else {
                                System.out.println("?");
                            }
                        }
                        
                        // dans le cas ou le prochain charactere est legale 
                        else{
                            if (thisChar == ' '){
                              System.out.print("c");  
                            }
                            else if(thisChar == '$'){
                                System.out.println("c"); 
                                Pep8.stop();
                            }
                            else{
                              System.out.println("c");  
                            }
                        }
                    }
                    
                    else{
                        System.out.println("-.-ERROR");
                        Pep8.stop();
                    }
                    
                }
                // si c'est un « -.. »
                else if(thisChar == '.'){
                    // on verifie le charactere suivant 
                    thisChar = Pep8.chari();
                    
                    if(thisChar == ' '){
                        System.out.print("d");
                    }
                    
                    else if(thisChar == '\n'){
                        System.out.println("d");
                    }
                    
                    else if(thisChar == '$'){
                        System.out.println("d");
                        Pep8.stop();
                    }
                    
                    // -..- 
                    // cas 2: la chaine de charachere existe mais il pourrait y avoir une erreur 
                    else if(thisChar == '-'){
                        // on verifie le prochain charactere 
                        thisChar = Pep8.chari();
                        
                        // dans le cas ou le prochain charactere est illegal 
                        if(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            //thisChar = Pep8.chari();

                            while(thisChar != ' ' && thisChar != '\n' && thisChar !='$'){
                                
                                // si le charactere n'est pas un . ou un -, on a une erreur et le programme s'arrete 
                                if(thisChar != '.' && thisChar != '-'){
                                        System.out.println("-..-*ERROR");
                                        Pep8.stop();
                                }
                                thisChar = Pep8.chari(); 
                            }
                            
                            if(thisChar == '$'){
                                System.out.println("?");
                                Pep8.stop();
                            }
                            else {
                                System.out.println("?");
                            }
                        }
                        
                        // dans le cas ou le prochain charactere est legale 
                        else{
                            if (thisChar == ' '){
                              System.out.print("n");  
                            }
                            else if(thisChar == '$'){
                                System.out.println("n"); 
                                Pep8.stop();
                            }
                            else{
                              System.out.println("n");  
                            }
                        }
                    }
                    
                    // -...
                    // cas 2: la chaine de charachere existe mais il pourrait y avoir une erreur 
                    else if(thisChar == '.'){
                        // on verifie le prochain charactere 
                        thisChar = Pep8.chari();
                        
                        // dans le cas ou le prochain charactere est illegal 
                        if(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            //thisChar = Pep8.chari();

                            while(thisChar != ' ' && thisChar != '\n' && thisChar !='$'){
                                
                                // si le charactere n'est pas un . ou un -, on a une erreur et le programme s'arrete 
                                if(thisChar != '.' && thisChar != '-'){
                                        System.out.println("-...*ERROR");
                                        Pep8.stop();
                                }
                                thisChar = Pep8.chari(); 
                            }
                            
                            if(thisChar == '$'){
                                System.out.println("?");
                                Pep8.stop();
                            }
                            else {
                                System.out.println("?");
                            }
                        }
                        
                        // dans le cas ou le prochain charactere est legale 
                        else{
                            if (thisChar == ' '){
                              System.out.print("n");  
                            }
                            else if(thisChar == '$'){
                                System.out.println("n"); 
                                Pep8.stop();
                            }
                            else{
                              System.out.println("n");  
                            }
                        }
                    }
                    
                    else{
                        System.out.println("-..ERROR");
                        Pep8.stop();
                    }
                    
                }
                
                // si c'est un « -.ERROR »
                else{
                    System.out.println("-.ERROR");
                    Pep8.stop();
                }
                
            }
            
            // si c'est un « -ERROR »
            else{
                System.out.println("-ERROR");
                Pep8.stop();
            }
        } 
        
        // si c'est un « . »
        else if (thisChar == '.'){
            
            // on verifie le charactere suivant 
            thisChar = Pep8.chari();
            
            // si c'est un « . »
            if(thisChar == ' '){
                System.out.print("e");  
            }
            
            // // si c'est un « .* » 
            else if(thisChar == '\n'){
                System.out.println("e");  
            }
            
            else if(thisChar == '$'){
                System.out.println("e");
                Pep8.stop();
            }
            
            // si c'est un « .- »
            else if (thisChar == '-'){
                // on verifie le charactere suivant  
                thisChar = Pep8.chari();
                
                // si c'est « .- »
                if(thisChar == ' '){
                   System.out.print("a"); 
                }
                
                // si c'est « .-* »
                else if(thisChar == '\n'){
                    System.out.println("a"); 
                } 
                
                else if(thisChar == '$'){
                    System.out.println("e");
                    Pep8.stop();
                }
                
                
                // si c'est « .-- »
                else if(thisChar == '-'){
                    // on verifie le charactere suivant 
                    thisChar = Pep8.chari();
                    
                    if(thisChar == ' '){
                        System.out.print("w");
                    }
                    
                    else if(thisChar == '\n'){
                        System.out.println("w");
                    }
                    
                    else if(thisChar == '$'){
                        System.out.println("w");
                        Pep8.stop();
                    }
                    
                    // .--- 
                    // cas 2: la chaine de charachere existe mais il pourrait y avoir une erreur 
                    else if(thisChar == '-'){
                        // on verifie le prochain charactere 
                        thisChar = Pep8.chari();
                        
                        // dans le cas ou le prochain charactere est illegal 
                        if(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            //thisChar = Pep8.chari();

                            while(thisChar != ' ' && thisChar != '\n' && thisChar !='$'){
                                
                                // si le charactere n'est pas un . ou un -, on a une erreur et le programme s'arrete 
                                if(thisChar != '.' && thisChar != '-'){
                                        System.out.println(".---*ERROR");
                                        Pep8.stop();
                                }
                                thisChar = Pep8.chari(); 
                            }
                            
                            if(thisChar == '$'){
                                System.out.println("?");
                                Pep8.stop();
                            }
                            else {
                                System.out.println("?");
                            }
                        }
                        
                        // dans le cas ou le prochain charactere est legale 
                        else{
                            if (thisChar == ' '){
                              System.out.print("j");  
                            }
                            else if(thisChar == '$'){
                                System.out.println("j"); 
                                Pep8.stop();
                            }
                            else{
                              System.out.println("j");  
                            }
                        }
                    }
                    
                    // .--.
                    // cas 2: la chaine de charachere existe mais il pourrait y avoir une erreur 
                    else if(thisChar == '.'){
                        // on verifie le prochain charactere 
                        thisChar = Pep8.chari();
                        
                        // dans le cas ou le prochain charactere est illegal 
                        if(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            //thisChar = Pep8.chari();

                            while(thisChar != ' ' && thisChar != '\n' && thisChar !='$'){
                                
                                // si le charactere n'est pas un . ou un -, on a une erreur et le programme s'arrete 
                                if(thisChar != '.' && thisChar != '-'){
                                        System.out.println(".--.*ERROR");
                                        Pep8.stop();
                                }
                                thisChar = Pep8.chari(); 
                            }
                            
                            if(thisChar == '$'){
                                System.out.println("?");
                                Pep8.stop();
                            }
                            else {
                                System.out.println("?");
                            }
                        }
                        
                        // dans le cas ou le prochain charactere est legale 
                        else{
                            if (thisChar == ' '){
                              System.out.print("p");  
                            }
                            else if(thisChar == '$'){
                                System.out.println("p"); 
                                Pep8.stop();
                            }
                            else{
                              System.out.println("p");  
                            }
                        }
                    }
                    
                    else{
                        System.out.println(".--ERROR");
                        Pep8.stop();
                    }

                }
                
                // si c'est « .-. »
                else if(thisChar == '.'){
                    // on verifie le charactere suivant 
                    thisChar = Pep8.chari();
                    
                    if(thisChar == ' '){
                        System.out.print("r");
                    }
                    
                    else if(thisChar == '\n'){
                        System.out.println("r");
                    }
                    
                    else if(thisChar == '$'){
                        System.out.println("r");
                        Pep8.stop();
                    }
                    
                    // .-.-
                    // cas 1: la chaine de characteres n'existe pas
                    else if(thisChar == '-'){
                        
                        while(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            
                            if(thisChar != '.' && thisChar != '-'){

                                    System.out.println(".-.-*ERROR");
                                    Pep8.stop();
                            }
                            thisChar = Pep8.chari(); 
                        }
                        
                        if(thisChar == '$'){
                            System.out.println("?"); 
                            Pep8.stop();
                        }
                        
                        else if(thisChar == '\n'){
                            System.out.println("?");
                        }
                        else{
                            System.out.print("?");
                        }
                        
                    }
                    
                    // .-..
                    // cas 2: la chaine de charachere existe mais il pourrait y avoir une erreur 
                    else if(thisChar == '.'){
                        // on verifie le prochain charactere 
                        thisChar = Pep8.chari();
                        
                        // dans le cas ou le prochain charactere est illegal 
                        if(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            //thisChar = Pep8.chari();

                            while(thisChar != ' ' && thisChar != '\n' && thisChar !='$'){
                                
                                // si le charactere n'est pas un . ou un -, on a une erreur et le programme s'arrete 
                                if(thisChar != '.' && thisChar != '-'){
                                        System.out.println(".-..*ERROR");
                                        Pep8.stop();
                                }
                                thisChar = Pep8.chari(); 
                            }
                            
                            if(thisChar == '$'){
                                System.out.println("?");
                                Pep8.stop();
                            }
                            else {
                                System.out.println("?");
                            }
                        }
                        
                        // dans le cas ou le prochain charactere est legale 
                        else{
                            if (thisChar == ' '){
                              System.out.print("l");  
                            }
                            else if(thisChar == '$'){
                                System.out.println("l"); 
                                Pep8.stop();
                            }
                            else{
                              System.out.println("l");  
                            }
                        }
                    }
                    
                    else{
                        System.out.println(".-.ERROR");
                        Pep8.stop();
                    }
                }
                
                else{
                    System.out.println(".-ERROR");
                    Pep8.stop();
                }
            }
            
            // si c'est « .. »
            else if (thisChar == '.'){
                // on verifie le charactere suivant 
                thisChar = Pep8.chari();
                
                // si c'est « .. »
                if(thisChar == ' '){
                   System.out.print("i"); 
                }
                
                // si c'est « ..* »
                else if(thisChar == '\n'){
                   System.out.println("i"); 
                }
                
                else if(thisChar == '$'){
                    System.out.println("i");
                    Pep8.stop();
                }
                
                // si c'est « ..- »
                else if(thisChar == '-'){
                   // on verifie le charactere suivant 
                    thisChar = Pep8.chari();
                    
                    if(thisChar == ' '){
                        System.out.print("u");
                    }
                    
                    else if(thisChar == '\n'){
                        System.out.println("u");
                    }
                    
                    else if(thisChar == '$'){
                        System.out.println("u");
                        Pep8.stop();
                    }
                    
                    // ..--
                    // cas 1: la chaine de characteres n'existe pas
                    else if(thisChar == '-'){
                        
                        while(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            
                            if(thisChar != '.' && thisChar != '-'){

                                    System.out.println("..--*ERROR");
                                    Pep8.stop();
                            }
                            thisChar = Pep8.chari(); 
                        }
                        
                        if(thisChar == '$'){
                            System.out.println("?"); 
                            Pep8.stop();
                        }
                        
                        else if(thisChar == '\n'){
                            System.out.println("?");
                        }
                        else{
                            System.out.print("?");
                        }
                        
                    }
                    
                    // ..-.
                    // cas 2: la chaine de charachere existe mais il pourrait y avoir une erreur 
                    else if(thisChar == '.'){
                        // on verifie le prochain charactere 
                        thisChar = Pep8.chari();
                        
                        // dans le cas ou le prochain charactere est illegal 
                        if(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            //thisChar = Pep8.chari();

                            while(thisChar != ' ' && thisChar != '\n' && thisChar !='$'){
                                
                                // si le charactere n'est pas un . ou un -, on a une erreur et le programme s'arrete 
                                if(thisChar != '.' && thisChar != '-'){
                                        System.out.println("..-.*ERROR");
                                        Pep8.stop();
                                }
                                thisChar = Pep8.chari(); 
                            }
                            
                            if(thisChar == '$'){
                                System.out.println("?");
                                Pep8.stop();
                            }
                            else {
                                System.out.println("?");
                            }
                        }
                        
                        // dans le cas ou le prochain charactere est legale 
                        else{
                            if (thisChar == ' '){
                              System.out.print("f");  
                            }
                            else if(thisChar == '$'){
                                System.out.println("f"); 
                                Pep8.stop();
                            }
                            else{
                              System.out.println("f");  
                            }
                        }
                    }
                    
                    else{
                        System.out.println("..-ERROR");
                        Pep8.stop();
                    } 
                    
                }
                
                // si c'est « ... »
                else if(thisChar == '.'){
                    // on verifie le charactere suivant 
                    thisChar = Pep8.chari();
                    
                    if(thisChar == ' '){
                        System.out.print("s");
                    }
                    
                    else if(thisChar == '\n'){
                        System.out.println("s");
                    }
                    
                    else if(thisChar == '$'){
                        System.out.println("s");
                        Pep8.stop();
                    }
                    
                    // ...-
                    // cas 2: la chaine de charachere existe mais il pourrait y avoir une erreur 
                    else if(thisChar == '-'){
                        // on verifie le prochain charactere 
                        thisChar = Pep8.chari();
                        
                        // dans le cas ou le prochain charactere est illegal 
                        if(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            //thisChar = Pep8.chari();

                            while(thisChar != ' ' && thisChar != '\n' && thisChar !='$'){
                                
                                // si le charactere n'est pas un . ou un -, on a une erreur et le programme s'arrete 
                                if(thisChar != '.' && thisChar != '-'){
                                        System.out.println("...-*ERROR");
                                        Pep8.stop();
                                }
                                thisChar = Pep8.chari(); 
                            }
                            
                            if(thisChar == '$'){
                                System.out.println("?");
                                Pep8.stop();
                            }
                            else {
                                System.out.println("?");
                            }
                        }
                        
                        // dans le cas ou le prochain charactere est legale 
                        else{
                            if (thisChar == ' '){
                              System.out.print("v");  
                            }
                            else if(thisChar == '$'){
                                System.out.println("v"); 
                                Pep8.stop();
                            }
                            else{
                              System.out.println("v");  
                            }
                        }
                    }
                    
                    // ....
                    // cas 2: la chere de charachere existe mais il pourrait y avoir une erreur 
                                        // cas 2: la chaine de charachere existe mais il pourrait y avoir une erreur 
                    else if(thisChar == '.'){
                        // on verifie le prochain charactere 
                        thisChar = Pep8.chari();
                        
                        // dans le cas ou le prochain charactere est illegal 
                        if(thisChar != ' ' && thisChar != '\n' && thisChar != '$'){
                            //thisChar = Pep8.chari();

                            while(thisChar != ' ' && thisChar != '\n' && thisChar !='$'){
                                
                                // si le charactere n'est pas un . ou un -, on a une erreur et le programme s'arrete 
                                if(thisChar != '.' && thisChar != '-'){
                                        System.out.println("....*ERROR");
                                        Pep8.stop();
                                }
                                thisChar = Pep8.chari(); 
                            }
                            
                            if(thisChar == '$'){
                                System.out.println("?");
                                Pep8.stop();
                            }
                            else {
                                System.out.println("?");
                            }
                        }
                        
                        // dans le cas ou le prochain charactere est legale 
                        else{
                            if (thisChar == ' '){
                              System.out.print("h");  
                            }
                            else if(thisChar == '$'){
                                System.out.println("h"); 
                                Pep8.stop();
                            }
                            else{
                              System.out.println("h");  
                            }
                        }
                    }
                    
                    else{
                        System.out.println("...ERROR");
                        Pep8.stop();
                    }
                }

                else{
                    System.out.println("..ERROR");
                    Pep8.stop();
                }
            }
            
            // si c'est une erreur .ERROR
            else{
                System.out.println(".ERROR");
                Pep8.stop();
            }
        }
        
        // si c'est un saut de ligne
        else if(thisChar == '\n'){
            System.out.print("\n");
        }
        
        // si c'est un espace
        else if (thisChar == ' '){
            //continue 
        }
        
        // si c'est la fin du message
        else if (thisChar == '$'){
            System.out.print("\n");
            Pep8.stop();
        }
        
        // si c'est une erreur
        else {
            System.out.println("ERROR");
            Pep8.stop();
        } 
    }
}
 
