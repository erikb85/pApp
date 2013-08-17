package de.pubalapub.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

import com.codename1.io.Externalizable;
import com.codename1.io.Util;

public class Menu implements Externalizable{
	private Vector<Hashtable<String, String>> vek;
	private Hashtable<String, String> hsht;
	
	Menu(){
		vek = new Vector<Hashtable<String,String>>();
		hsht = new Hashtable<String, String>();
	}

	public Vector<Hashtable<String, String>> getVek() {
		return vek;
	}

	public void setVek(Vector<Hashtable<String, String>> vek) {
		this.vek = vek;
	}

	public void addVek(Hashtable<String, String> table){
		this.vek.add(table);
	}
	
	public Hashtable<String, String> getHsht() {
		return hsht;
	}

	public void setHsht(Hashtable<String, String> hsht) {
		this.hsht = hsht;
	}
	
	public void addHsht(String title, String content){
		this.hsht.put(title, content);
	}

	public int getVersion() {
		return 1;
	}

	public void externalize(DataOutputStream out) throws IOException {
		Util.writeObject(vek, out);
		
	}

	public void internalize(int version, DataInputStream in) throws IOException {
		vek = (Vector<Hashtable<String, String>>) Util.readObject(in);
	}

	public String getObjectId() {
		return "Menu";
	}

}
