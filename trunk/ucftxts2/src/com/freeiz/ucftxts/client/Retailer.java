/**
 * 
 */
package com.freeiz.ucftxts.client;

import java.io.Serializable;

/**
 * @author Michael Scherer
 *	Class containing all the information about a given
 *	retailer, the price that they offer, their location
 */
public class Retailer implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2533494878586476310L;
	private String mName;
	private double mPrice;
	private String mAddress;
	private String mURL;
	
	/**
	 * Creates an empty Retailer instance
	 */
	public Retailer()
	{
	}
	
	public Retailer(String name, double price, String address, String url)
	{
		this.mName = name;
		this.mPrice = price;
		this.mAddress = address;
		this.mURL = url;
	}
	
	public String GetName()
	{
		return mName;
	}
	
	public void SetName(String name)
	{
		mName = name;
	}
	
	public double GetPrice()
	{
		return mPrice;
	}
	
	public void SetPrice(double price)
	{
		mPrice = price;
	}
	
	public String GetAddress()
	{
		return mAddress;
	}
	
	public void SetAddress(String address)
	{
		mAddress = address;
	}
	
	public String GetURL()
	{
		return mURL;
	}
	
	public void SetURL(String url)
	{
		mURL = url;
	}
}
