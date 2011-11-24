/**
 * 
 */
package com.freeiz.ucftxts.client;

import com.freeiz.ucftxts.client.Retailer;

import java.io.Serializable;
import java.util.*;

/**
 * @author Michael Scherer
 *	Class for holding information about a book, including author,
 *	ISBN, title, abstract, and prices
 */
public class Book implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 234550827802557253L;
	
	/**
	 * Creates an empty book instance
	 */
	public Book()
	{
		this.mRetailers = new Vector<Retailer>();
		this.mTags = new Vector<String>();
	}
	
	public Book(long isbn, String fname, String lname, String title, String _abstract)
	{
		this.mISBN = isbn;
		this.mFName = fname;
		this.mLName = lname;
		this.mTitle = title;
		this.mAbstract = _abstract;
		
		this.mRetailers = new Vector<Retailer>();
		this.mTags = new Vector<String>();
	}
	
	public boolean AddRetailer(Retailer retailer)
	{
		return mRetailers.add(retailer);
	}
	
	public boolean AddTag(String tag)
	{
		return mTags.add(tag);
	}
	
	public String GetFirstName()
	{
		return mFName;
	}
	
	public void SetFirstName(String fname)
	{
		mFName = fname;
	}
	
	public String GetLastName()
	{
		return mLName;
	}
	
	public void SetLastName(String lname)
	{
		mLName = lname;
	}
	
	public String GetTitle()
	{
		return mTitle;
	}
	
	public void SetTitle(String title)
	{
		mTitle = title;
	}
	
	public String GetAbstract()
	{
		return mAbstract;
	}
	
	public void SetAbstract(String _abstract)
	{
		mAbstract = _abstract;
	}
	
	public long GetISBN()
	{
		return mISBN;
	}
	
	public void SetISBN(long isbn)
	{
		mISBN = isbn;
	}
	
	public String GetSubject()
	{
		return mSubject;
	}
	
	public void SetSubject(String subject)
	{
		mSubject = subject;
	}
	
	@Override
	public String toString()
	{
		return "t=" + mTitle + " fn=" + mFName + " ln=" + mLName + " s=" + mSubject + " isbn=" + mISBN;
	}
	
	private String mFName;
	private String mLName;
	private String mTitle;
	private String mAbstract;
	private String mSubject;
	private long mISBN;
	
	private Vector<String> mTags;
	private Vector<Retailer> mRetailers;
}
