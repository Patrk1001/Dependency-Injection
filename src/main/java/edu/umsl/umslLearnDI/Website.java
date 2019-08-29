/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl.umslLearnDI;

/**
 *
 * @author patrick
 */
public class Website {
        private String websiteName;
	private String personName;
	
        public Website() {
	}
	

	public Website(String websiteName, String personName) {//add this
		super();
		this.websiteName = websiteName;
		this.personName = personName;
		
	}


	public String getwebsiteName() {
		return websiteName;
	}
	public void setFirstName(String websiteName) {
		this.websiteName = websiteName;
	}
	public String getpersonName() {
		return personName;
	}
	public void setpersonName(String personName) {
		this.personName = personName;
	}


	@Override
	public String toString() {
		return "Student [websiteName=" +websiteName+ ",personName=" +personName+"]";
	}

	
	
   
}
