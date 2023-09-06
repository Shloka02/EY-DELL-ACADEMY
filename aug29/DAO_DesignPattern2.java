package com.aug29;

import java.util.ArrayList;
import java.util.List;


class Product1{
	private int ID;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private int price;
	private int quantity;
	
	
	Product1(int ID, int price, int quantity){
		this.ID=ID;
		this.price=price;
		this.quantity=quantity;
	}
}
interface Product1DAO{
    public List<Product> getAllProduct();
    public Product getProduct(int ID);
	/*
	 * public void updateProduct (Product product); public void
	 * deleteProduct(Product product);
	 */
}
class Product1DAOImp1 implements ProductDAO{
	List<Product> products;
	public ProductDAOImp1() {
        products =new ArrayList<>();
        Product pro1=new Product(1,50,5);
        Product pro2=new Product(2,100,10);
        products.add(pro1);products.add(pro2);
    }

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProduct(int ID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
public class DAO_DesignPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductDAO productsDao=new ProductDAOImp1();
        for(Product pt: productsDao.getAllProduct()) {
            System.out.println("Product [PT id "+ pt.getID() +" , Price: "+pt.getPrice()+",Quantity: "pt.getQuantity()+" ]");
        }

        Student firstStudent = studentDao.getAllStudents().get(0);
        System.out.println("First Student is "+ firstStudent.getStu_id()+ " "+ firstStudent.getStu_name());
        firstStudent.setStu_name("PQR");
        for(Student st: studentDao.getAllStudents()) {
            System.out.println("Student [ Stu id "+st.getStu_id()+" , Name: "+ st.getStu_name());
       

	}

}
