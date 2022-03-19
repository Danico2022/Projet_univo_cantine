package model_class;
// Generated 19 mars 2022, 03:03:27 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Ticket generated by hbm2java
 */
@Entity
@Table(name = "ticket", catalog = "cantine_universitaire")
public class Ticket implements java.io.Serializable {

	private Integer idDate;
	private Boisson boisson;
	private Commande commande;
	private Plat plat;

	public Ticket() {
	}

	public Ticket(Boisson boisson, Commande commande, Plat plat) {
		this.boisson = boisson;
		this.commande = commande;
		this.plat = plat;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id_date", unique = true, nullable = false)
	public Integer getIdDate() {
		return this.idDate;
	}

	public void setIdDate(Integer idDate) {
		this.idDate = idDate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "boisson_id_ticket", nullable = false)
	public Boisson getBoisson() {
		return this.boisson;
	}

	public void setBoisson(Boisson boisson) {
		this.boisson = boisson;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "commande_id_ticket", nullable = false)
	public Commande getCommande() {
		return this.commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "plat_id_ticket", nullable = false)
	public Plat getPlat() {
		return this.plat;
	}

	public void setPlat(Plat plat) {
		this.plat = plat;
	}

}
