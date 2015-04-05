/**
 * Name class: Building Java Programs 
 *             Chapter 8, Self Check #7, 15, 26
 * 
 * OUTPUT:
 * Character1 = Paul J. Marques
 * Character2 = Kermit T. Frog
 * Character3 = Oprah Winfrey
 * Character4 = null null
 * Character4 = Oprah Winfrey
 * Character4 = SpongeBob O. SquarePants
 */

public class Name_CLIENT
{
  
        public static void main()
        {
            Name character1 = new Name("Paul", "Joseph", "Marques");
            Name character2 = new Name("Kermit", "The", "Frog");
            Name character3 = new Name("Oprah", "Winfrey");
            Name character4 = new Name();
        
            System.out.println("Character1 = " + character1);
            System.out.println("Character2 = " + character2);
            System.out.println("Character3 = " + character3);   
            System.out.println("Character4 = " + character4); 
            
            character4 = character3;
            System.out.println("Character4 = " + character4);
            
            character4.setName("SpongeBob","Ocean","SquarePants");
            System.out.println("Character4 = " + character4);            
            
        } // main

    } // Name_CLIENT