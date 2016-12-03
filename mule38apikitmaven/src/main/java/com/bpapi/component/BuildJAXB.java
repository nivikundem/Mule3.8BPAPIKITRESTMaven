package com.bpapi.component;


import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Marshaller;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

import com.bpapi.org.Batch;
import com.bpapi.org.BatchArray;




public class BuildJAXB implements Callable {
	
	
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {

		Batch batch = new Batch();	 	
		BatchArray batchArray = new BatchArray();	 	
		List<Batch> batchList = new ArrayList<Batch>();	 
		
		
		try
		{
			JAXBContext jaxbContext = JAXBContext.newInstance(Batch.class); 		   
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			InputStream is = null;
			MuleMessage msg = eventContext.getMessage();
			LinkedList<Map> xmlList=(LinkedList<Map>)msg.getProperty("xmlList", PropertyScope.SESSION);					
			for(int i = 0 ; i < xmlList.size(); i++)
			{
				Map rowmap = xmlList.get(i);	
				if(rowmap.get("Message") != null)
					batchList.add((Batch)unmarshaller.unmarshal(new ByteArrayInputStream(((String)rowmap.get("Message").toString()).getBytes("UTF-8"))));				
			}	
			
			batchArray.setBatches(batchList);					
		}
		catch (Exception e)
		{
		   e.printStackTrace();
		}	
		return batchArray;	
	}

}
