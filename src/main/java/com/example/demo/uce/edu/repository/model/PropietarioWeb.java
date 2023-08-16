package com.example.demo.uce.edu.repository.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "propietarioWeb", schema = "public")
@Entity
public class PropietarioWeb {

		@Id
		@GeneratedValue(generator = "seq_propietarioWeb", strategy = GenerationType.SEQUENCE)
		@SequenceGenerator(name = "seq_propietarioWeb", sequenceName = "seq_propietarioWeb", allocationSize = 1)
		@Column(name = "prwb_id")
		private Integer id;
		
		@Column(name = "prwb_nombre")
		private String nombre;
		
		@Column(name = "prwb_apellido")
		private String apellido;
		
		@Column(name = "prwb_cedula")
		private String cedula;
		
		

		@Override
		public String toString() {
			return "PropietarioWeb [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
					+ "]";
		}

		//Get and Set
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getCedula() {
			return cedula;
		}

		public void setCedula(String cedula) {
			this.cedula = cedula;
		}
}
