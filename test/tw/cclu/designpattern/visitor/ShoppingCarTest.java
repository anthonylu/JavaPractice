package tw.cclu.designpattern.visitor;

import static org.junit.Assert.*;

import org.junit.Test;

public class ShoppingCarTest {

	@Test
	public void testCalculatePrice() {
		ShoppingCar sc = new ShoppingCar();
		Book book = new Book(132.92);
		sc.addItem(book);
		Dvd dvd = new Dvd(201.31);
		sc.addItem(dvd);
		Customer c = new Customer();
		Vip vip = new Vip();
		assertTrue(sc.calculatePrice(c) == (book.getPrice()+dvd.getPrice()));
		assertTrue(sc.calculatePrice(vip) < sc.calculatePrice(c));
	}

}
