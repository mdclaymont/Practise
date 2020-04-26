package CrigList;

public class calljava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FunctionLibary ObjFun=new FunctionLibary();
		ObjFun.setBrowser();
		ObjFun.BrowserConfig();
		ObjFun.setUrl();
		ObjFun.UrlConfig();
		//String Locator="//select[contains(@name,'DropDownListCurrency')]";
		ObjFun.SelectStaticDropDown("//select[contains(@name,'DropDownListCurrency')]","Text","USD");
	}

}
