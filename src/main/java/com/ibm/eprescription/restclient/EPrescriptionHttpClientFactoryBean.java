/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2020 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.ibm.eprescription.restclient;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;


/**
 * @author DimitarMihaylov
 */
@Component
public class EPrescriptionHttpClientFactoryBean implements FactoryBean<ClientHttpRequestFactory>
{


	private int readTimeout;
	private int connectTimeout;
	private int connectionRequestTimeout;

	@Override
	public ClientHttpRequestFactory getObject() throws Exception
	{
		final HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();

		factory.setReadTimeout(getReadTimeout());
		factory.setConnectTimeout(getConnectTimeout());
		factory.setConnectionRequestTimeout(getConnectionRequestTimeout());

		return factory;
	}

	@Override
	public Class<?> getObjectType()
	{
		return ClientHttpRequestFactory.class;
	}

	@Override
	public boolean isSingleton()
	{
		return true;
	}

	/**
	 * @return the readTimeout
	 */
	public int getReadTimeout()
	{
		return readTimeout;
	}

	/**
	 * @param readTimeout
	 *           the readTimeout to set
	 */
	public void setReadTimeout(final int readTimeout)
	{
		this.readTimeout = readTimeout;
	}

	/**
	 * @return the connectTimeout
	 */
	public int getConnectTimeout()
	{
		return connectTimeout;
	}

	/**
	 * @param connectTimeout
	 *           the connectTimeout to set
	 */
	public void setConnectTimeout(final int connectTimeout)
	{
		this.connectTimeout = connectTimeout;
	}

	/**
	 * @return the connectionRequestTimeout
	 */
	public int getConnectionRequestTimeout()
	{
		return connectionRequestTimeout;
	}

	/**
	 * @param connectionRequestTimeout
	 *           the connectionRequestTimeout to set
	 */
	public void setConnectionRequestTimeout(final int connectionRequestTimeout)
	{
		this.connectionRequestTimeout = connectionRequestTimeout;
	}

}
