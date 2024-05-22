package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
//reusable function or method related to whole application
	
  public WebDriver driver;
	public String url = "http://183.82.103.245/nareshit/login.php" ;
	public String un = "nareshit";
	public String pw = "nareshit";
	public String fn = "royalchalenger";
	public String ln = "Bengaluru";
	public String nw_fn = "kumar";
	public String nw_ln = "soumya";
	
	
	public String txt_username = "txtUserName";
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	public String btn_add = "//*[@id=\"standardView\"]/div[3]/div[1]/input[1]";
	public String btn_save = "//*[@id=\"btnEdit\"]";
	public String fn_txt = "/html/body/form/div/div[1]/div[2]/input[3]";
	public String ln_txt = "/html/body/form/div/div[1]/div[2]/input[2]";
	public String frm_id = "rightMenu";
	public String emp_nm = "/html/body/div/div[2]/form/table/tbody/tr[50]/td[3]/a";
	public String btn_edit = "/html/body/form/div[2]/div[1]/div[2]/div[2]/input[1]";
	public String nw_fn_txt = "/html/body/form/div[2]/div[1]/div[2]/input[4]";
	public String nw_ln_txt = "//*[@id=\"txtEmpLastName\"]";
	public String add_emp_save_btn = "/html/body/form/div[2]/div[1]/div[2]/div[2]/input[1]";
	public String chk_box = "/html/body/div/div[2]/form/table/tbody/tr[21]/td[1]/input";
	public String btn_dlt = "/html/body/div/div[2]/form/div[3]/div[1]/input[2]";
	
}
