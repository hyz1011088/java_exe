package main;

public class StorageTest {	
	public static void main(String[] args) {
		class StoreStuff {
			int storage(String s) {
				return s.length() * 2;
			}	
		}
		StoreStuff x = new StoreStuff();
		System.out.println(x.storage("hi"));		
	}
}