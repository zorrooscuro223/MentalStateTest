import java.util.Scanner;

public class MentalStateTest {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int score = 0;
      
      System.out.println("Bienvenido al Test de Estado Mental\n");
      
      // Preguntas del test
      System.out.println("1. ¿Con qué frecuencia te sientes ansioso/a durante el día? (0 - nunca, 1 - a veces, 2 - a menudo)");
      score += scnr.nextInt();
      
      System.out.println("2. ¿Cómo describirías tu estado de ánimo general? (0 - feliz, 1 - neutral, 2 - triste)");
      score += scnr.nextInt();
      
      System.out.println("3. ¿Te cuesta concentrarte en tus tareas diarias? (0 - no, 1 - un poco, 2 - mucho)");
      score += scnr.nextInt();
      
      System.out.println("4. ¿Has tenido pensamientos negativos o pesimistas recientemente? (0 - no, 1 - a veces, 2 - frecuentemente)");
      score += scnr.nextInt();
      
      System.out.println("5. ¿Has experimentado cambios en tus patrones de sueño recientemente? (0 - no, 1 - un poco, 2 - mucho)");
      score += scnr.nextInt();
      
      System.out.println("\nTu puntuación total es: " + score);
      
      // Evaluación de la puntuación
      if (score <= 4) {
         System.out.println("Tu estado mental parece estar en un buen lugar");
      } else if (score > 4 && score <= 8) {
         System.out.println("Tu estado mental puede ser preocupante. Se recomienda buscar ayuda profesional.");
      } else {
         System.out.println("Tu estado mental es preocupante. Se recomienda buscar ayuda profesional inmediatamente.");
      }
   }
}
