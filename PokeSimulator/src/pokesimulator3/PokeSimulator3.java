// Exercicio feito na aula do dia 22/09
//
package pokesimulator3;

public class PokeSimulator3 {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Charmeleon","Fogo",50);
        Pokemon pokemon2 = new Pokemon("Squirtle","Agua",50);      
        
        int vidaPokemon1 = pokemon1.getVida();
        int vidaPokemon2 = pokemon2.getVida();
        
        if(vidaPokemon1 > vidaPokemon2){
            System.out.println(pokemon1.getNome() + " venceu");
        } else{
            System.out.println(pokemon2.getNome() + " venceu");
        }

    }
    
}
