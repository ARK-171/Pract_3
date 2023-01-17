package com.example.demo.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "cw6_client")
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Type(type = "org.hibernate.type.UUIDCharType")
	private UUID id;

	@Column(name = "surname")
	private String surname;

	@Column(name = "name")
	private String name;

	@Column(name = "patronymic")
	private String patronymic;

	@Column(name = "sex")
	private String sex;

	@Column(name = "birth_date")
	private LocalDate birthDate;

	@Column(name = "inn")
	private String inn;

	@Column(name = "passport_serial")
	private String passportSerial;

	@Column(name = "phone")
	private String phone;

	public Client(final UUID id,
				  final String surname,
				  final String name,
				  final String patronymic,
				  final String sex,
				  final LocalDate birthDate,
				  final String inn,
				  final String passportSerial,
				  final String phone) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.sex = sex;
		this.birthDate = birthDate;
		this.inn = inn;
		this.passportSerial = passportSerial;
		this.phone = phone;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getInn() {
		return inn;
	}

	public void setInn(String inn) {
		this.inn = inn;
	}

	public String getPassportSerial() {
		return passportSerial;
	}

	public void setPassportSerial(String passportSerial) {
		this.passportSerial = passportSerial;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Client{" +
		       "id=" + id +
		       ", surname='" + surname + '\'' +
		       ", name='" + name + '\'' +
		       ", patronymic='" + patronymic + '\'' +
		       ", sex=" + sex +
		       ", birthDate=" + birthDate +
		       ", inn='" + inn + '\'' +
		       ", passportSerial='" + passportSerial + '\'' +
		       ", phone='" + phone + '\'' +
		       '}';
	}

/*	public static class Builder {
		private UUID id;
		private String surname;
		private String name;
		private String patronymic;
		private String sex;
		private LocalDate birthDate;
		private String inn;
		private String passportSerial;
		private String phone;

		public Client build() {
			Client client = new Client();
			client.setId(id);
			client.setSurname(surname);
			client.setName(name);
			client.setPatronymic(patronymic);
			client.setPassportSerial(passportSerial);
			client.setSex(sex);
			client.setBirthDate(birthDate);
			client.setInn(inn);
			client.setPhone(phone);
			return client;
		}

		public Builder setId(UUID id) {
			this.id = id;
			return this;
		}

		public Builder setSurname(String surname) {
			this.surname = surname;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setPatronymic(String patronymic) {
			this.patronymic = patronymic;
			return this;
		}

		public Builder setSex(String sex) {
			this.sex = sex;
			return this;
		}

		public Builder setBirthDate(LocalDate birthDate) {
			this.birthDate = birthDate;
			return this;
		}

		public Builder setInn(String inn) {
			this.inn = inn;
			return this;
		}

		public Builder setPassportSerial(String passportSerial) {
			this.passportSerial = passportSerial;
			return this;
		}

		public Builder setPhone(String phone) {
			this.phone = phone;
			return this;
		}
	}*/
}
