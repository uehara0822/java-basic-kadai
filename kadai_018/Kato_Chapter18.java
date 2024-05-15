package kadai_018;

abstract public class Kato_Chapter18 {

	public String familyName="加藤";
	public String givenName="";
	public String address="東京都中野区〇×";
	
	public  void commonIntroduce() {
		System.out.println("住所は"+address+"です");
	}
	 abstract void eachIntroduce();
//	 abstract void getGivenName();

	 abstract void setGivenName(String givenName);
//	 abstract void setGivenName();
	 
//	 public String getGivenName(){
//		 return this.givenName;
		 
//	 }
	 
}
