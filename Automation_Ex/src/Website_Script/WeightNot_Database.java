package Website_Script;

import java.io.*;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.thoughtworks.selenium.webdriven.commands.GetAlert;

public class WeightNot_Database {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{	
		File file=new File("/home/inheritx_sales/Desktop/THINNERCLEANSE.xml");//File location
			
			//Prpare Xml
			DocumentBuilderFactory dbf=DocumentBuilderFactory.newInstance();
			DocumentBuilder db=dbf.newDocumentBuilder();
			Document document=db.parse(file);
			document.getDocumentElement().normalize();
			System.out.println("Debug : Root element " + document.getDocumentElement().getNodeName());
			NodeList node=document.getElementsByTagName("options");
			int l=node.getLength();
			System.out.println(l);
			//System.out.println("Fields Data");
			System.out.println("---------------------------------------------------");
			NodeList nL=document.getElementsByTagName("fields");
			System.out.println("fields length :"+nL.getLength());
			System.out.println("---------------------------------");
			NodeList nList1=document.getElementsByTagName("field");
			System.out.println(nList1.getLength());
			ArrayList<String> foods=new ArrayList<String>();
			String f_item="";
			int count=0;
			for(int i=0;i<nList1.getLength();i++){
				f_item=nList1.item(i).getAttributes().getNamedItem("title").getNodeValue();
				foods.add(f_item);
				f_item="";
				count++;
			}
			System.out.println(count +"item addes for Thinnercleanse");
			System.out.println("*************************************");
			
		   }catch(Exception e){
		 e.printStackTrace();
		 
	 }try{
		 File file1=new File("/home/inheritx_sales/Desktop/ThinnerCleanse_Android.xml");
		DocumentBuilderFactory dbfa=DocumentBuilderFactory.newInstance();
		DocumentBuilder dba=dbfa.newDocumentBuilder();
		Document da=dba.parse(file1);
		da.getDocumentElement().normalize();
		System.out.println("Debug : Root element " +da.getDocumentElement().getNodeName());
		NodeList node1=da.getElementsByTagName("string-array name");
		int m=node1.getLength();
		System.out.println(m);
		System.out.println("---------------------------------------------------");
		NodeList na=da.getElementsByTagName("fields");
		System.out.println("Fields Length"+na.getLength());
		System.out.println("---------------------------------");
		
		NodeList na2=da.getElementsByTagName("field");
		System.out.println(na2.getLength());
		
		ArrayList<String> foods2=new ArrayList<String>();
		String food_item="";
		int count=0;
		for(int j=0;j<na2.getLength();j++){
			food_item=na2.item(j).getAttributes().getNamedItem("title").getNodeValue();
			foods2.add(food_item);
			food_item="";
			count++;
		}
		System.out.println(count + "Item addes for thinerCleanes" );
		
		
	   }catch(Exception e){
		   e.printStackTrace();
	   }
	}
}
