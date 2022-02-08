package patterns.structural.proxy.proxy__;

import java.lang.reflect.Proxy;

import patterns.structural.proxy.proxy__.handlers.NonOwnerInvocationHandler;
import patterns.structural.proxy.proxy__.handlers.OwnerInvocationHandler;
import patterns.structural.proxy.proxy__.person.Person;
import patterns.structural.proxy.proxy__.person.PersonImpl;

public class ProxyTest {

	public static void main(String[] args) {

		ProxyTest pT = new ProxyTest();

//		Person joeTest = new PersonImpl("Joe", "Baker", 3);
		Person salivanTest = new PersonImpl("Salivan", "Manager", 5);

		Person ownerProxy = pT.getOwnerProxy(salivanTest);

		System.out.println("--------Owner proxy--------");

		System.out.println("Name is:" + ownerProxy.getName());
		try {
			ownerProxy.setGeekRating(3);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is: " + ownerProxy.getGeekRating());

		Person nonOwnerProxy = pT.getNonOwnerProxy(salivanTest);

		System.out.println("--------Non-owner proxy--------");

		System.out.println("Name is:" + nonOwnerProxy.getName());
		nonOwnerProxy.setGeekRating(3);
		System.out.println("Rating is: " + nonOwnerProxy.getGeekRating());
		try {
			nonOwnerProxy.setName("aa");
		} catch (Exception e) {
			System.out.println("Can't set name from non-owner proxy");
		}
	}

	Person getNonOwnerProxy(Person person) {

		return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(person));
	}

	Person getOwnerProxy(Person person) {

		return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
				new OwnerInvocationHandler(person));
	}
}
