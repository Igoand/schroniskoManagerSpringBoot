
package pl.schronisko.projekt.schronisko;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Schronisko {

	@Id
	@GeneratedValue
	private String nazwa;
	private int iloscMiejsc;
	private String dataZalozenia;

	/**
	 * Konstruktor klasy Schronisko
	 */
	public Schronisko() {
		super();
	}

	/**
	 * @param nazwa
	 * @param iloscMiejsc
	 * @param dataZalozenia
	 */
	public Schronisko(String nazwa, int iloscMiejsc, String dataZalozenia) {
		super();
		this.nazwa = nazwa;
		this.iloscMiejsc = iloscMiejsc;
		this.dataZalozenia = dataZalozenia;
	}
}
