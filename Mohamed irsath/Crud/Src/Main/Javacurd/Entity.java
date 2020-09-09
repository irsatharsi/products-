Package com.irsath.curd.entity;
import javax.persistence.Entity;

import javax.persistence.Generatedvalue;

import javax.persistence.Id;

import javax.persistence.Table;

import javax.persistece.GenerationType;

@data

@allargsconstructor

@NoAllconstructor

@entity

@Table(name = "PRODUCT_TBL")

 

public class Product {

                @Id

                @Generatedvalue(strategy=GenerationType.AUTO)

                Private int Id;

                Private String Name;

                Private int Quantity;

                Private double Price ;
}
