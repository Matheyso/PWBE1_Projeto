
import com.fasterxml.jackson.databind.ObjectMapper;

public class TesteJSON {

	public static void main(String[] args) {
		try {
			ObjectMapper objeto = new ObjectMapper();
			//objeto para utilizar na serializacao
			Pessoa pes1 = new Pessoa("Abel", 45);
			//serializar o obj pes
			String json = objeto.writeValueAsString(pes1);
			System.out.println("Objeto Serializado");
			System.out.println(json);
			
			//desserializar o JSON para o obj pes
			Pessoa desPes = objeto.readValue(json, Pessoa.class);
			System.out.println("JSON desserializado para obj Pessoa");
			System.out.println("Nome: " + desPes.getNome());
			System.out.println("Idade: " + desPes.getIdade());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
