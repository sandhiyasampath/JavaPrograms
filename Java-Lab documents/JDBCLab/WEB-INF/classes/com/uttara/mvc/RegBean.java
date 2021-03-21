package com.uttara.mvc;

import java.io.Serializable;

public class RegBean implements Serializable {
 
	private String uname,email,pass,rpass;
	
	public RegBean() {
		System.out.println("in no-arg constr of RB");
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
		System.out.println("in setUname() of RB "+uname);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		System.out.println("in setEmail() of RB "+email);
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
		System.out.println("in setPass() of RB "+pass);
	}

	public String getRpass() {
		return rpass;
	}

	public void setRpass(String rpass) {
		System.out.println("in setRpass() of RB "+rpass);
		this.rpass = rpass;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		result = prime * result + ((rpass == null) ? 0 : rpass.hashCode());
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegBean other = (RegBean) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		if (rpass == null) {
			if (other.rpass != null)
				return false;
		} else if (!rpass.equals(other.rpass))
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RegBean [uname=" + uname + ", email=" + email + ", pass="
				+ pass + ", rpass=" + rpass + "]";
	}
	
	public String validate()
	{
		StringBuilder msg = new StringBuilder();
		if(uname==null || uname.trim().equals(""))
			msg.append("Your parents did not name you?? Enter the name <br/>");
		if(email==null || email.trim().equals(""))
			msg.append("Email is mandatory, enter it!<br/>");
		
		if(pass==null || pass.trim().equals(""))
			msg.append("Password is mandatory, enter it!<br/>");
		else
			if(!pass.equals(rpass))
				msg.append("If you cannot type pass and repeat pass correctly, you must be drunk, if not what will you do in life?!");
		
		String str = msg.toString();
		
		if(str.equals(""))
			return Constants.SUCCESS;
		else
			return str;

	}
 
}









