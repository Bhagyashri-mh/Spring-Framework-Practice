package com.model;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Student {
		private int sid;
		private String sname;
		private String scity;
		private double spercentage;
		private Map<String,String> map= new LinkedHashMap();
		public Map<String, String> getMap() {
			return map;
		}
		public void setMap(Map<String, String> map) {
			this.map = map;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getScity() {
			return scity;
		}
		public void setScity(String scity) {
			this.scity = scity;
		}
		public double getSpercentage() {
			return spercentage;
		}
		public void setSpercentage(double spercentage) {
			this.spercentage = spercentage;
		}
		@Override
		public String toString() {
			return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercentage=" + spercentage
					+ ", map=" + map + "]";
		}
		
		
		
}
