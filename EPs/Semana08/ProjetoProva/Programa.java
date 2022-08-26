public class Programa {

	public static void main(String[] args) {
		try (
			Prova p1 = new Prova("P1");
			Prova p2 = new Prova("P2");
			Prova p3 = new Prova("P3");
		) {
			p1.responderQuestao(1);
			p1.responderQuestao(2);
			p1.responderQuestao(3);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}