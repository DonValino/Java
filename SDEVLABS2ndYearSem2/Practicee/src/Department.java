/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jake
 */
public class Department {
    private int Deptid;
	private String DeptName;
	
	public Department(int dept,String deptN){
		Deptid=dept;
		DeptName=deptN;
	}
	public int getDeptid() {
		return Deptid;
	}
	public void setDeptid(int deptid) {
		Deptid = deptid;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	public static boolean isNumber(String string) {
		try {
			Integer.parseInt(string);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
}
