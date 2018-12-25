package com.training.factory.example2.creators;

import com.training.factory.example2.products.Transport;

/**
 *  Abstract Creator 
 * @author Srivatsan
 *
 */
public interface Creator {

	public Transport createTransport();
	public void setRoute(String src, String destination);
}
