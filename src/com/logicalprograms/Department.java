package com.logicalprograms;

public class Department {
	private String dName;
	private String dId;
	private Integer ecount;
	
	@Override
	public String toString() {
		return "Department [dName=" + dName + ", dId=" + dId + ", ecount=" + ecount + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dId == null) ? 0 : dId.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(this == obj ){
			return true;
		}
		if(obj==null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		Department d = (Department)obj;
		if(dId== null){
			if(d.dId != null)
			return false;
		} else if(!dId.equals(d.dId)){
			return false;
		}		
		return true;		
	}	
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdId() {
		return dId;
	}
	public void setdId(String dId) {
		this.dId = dId;
	}
	public Integer getEcount() {
		return ecount;
	}
	public void setEcount(Integer ecount) {
		this.ecount = ecount;
	}
	
}
