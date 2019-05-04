package model;

import java.io.IOException;

import dao.CampeonatoDAO;

public class Exemplo {
	public static void main(String[] args) {

		Campeonato a = new Campeonato("Campeonato brasileiro", 38);
		a.setId(1);

		Campeonato b = new Campeonato("Copa do mundo", 12);
		b.setId(2);

		Campeonato c = new Campeonato("Copa do Brasil", 8);
		c.setId(3);
		CampeonatoDAO dao = new CampeonatoDAO();
		dao.add(a);
		dao.add(b);
		dao.add(c);
		try {
			dao.delete(c);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(dao.get(c.getId()).toJson().toString());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
