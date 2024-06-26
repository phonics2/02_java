package ncs.test5;

public class Book {
//필드
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;

//메서드
	// 생성자 : 기본
	public Book() {
		// TODO Auto-generated constructor stub
	}
	// 생성자 : 필수

	public Book(String title, String author, int price, String publisher, double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}


	//Setter

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	//Getter
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public int get할인가() {
		//할인하는 계산 방식 실수
		double discountAmount = price * discountRate; //예를들어 100원 10%할인
		
		//정상가 % 만큼 할인이 들어간 금액
		int 할인가격 = (int) (price-discountAmount);
		return 할인가격;
	}
	
	
	@Override
	public String toString() {
		return "title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher
				+ ", discountRate=" + discountRate;
	}
	
	
}
