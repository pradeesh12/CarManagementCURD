package com.carmanagement.virtusa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carmanagement")
public class Car {
		@Id
		private int id;
		private int carId;
		private String carName;
		private String carNumber;
		private String carStatus;
		public Car() {
		}
		public Car(int id, int carId, String carName, String carNumber, String carStatus) {
			super();
			this.id = id;
			this.carId = carId;
			this.carName = carName;
			this.carNumber = carNumber;
			this.carStatus = carStatus;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getCarId() {
			return carId;
		}
		public void setCarId(int carId) {
			this.carId = carId;
		}
		public String getCarName() {
			return carName;
		}
		public void setCarName(String carName) {
			this.carName = carName;
		}
		public String getCarNumber() {
			return carNumber;
		}
		public void setCarNumber(String carNumber) {
			this.carNumber = carNumber;
		}
		public String getCarStatus() {
			return carStatus;
		}
		public void setCarStatus(String carStatus) {
			this.carStatus = carStatus;
		}
		
}
