/*
 * Copyright (c) 2002-2015, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.apipart.api;

import fr.paris.lutece.plugins.apipart.business.InformationsFiscales;
import fr.paris.lutece.portal.service.util.AppLogService;
import fr.paris.lutece.util.httpaccess.HttpAccess;
import fr.paris.lutece.util.httpaccess.HttpAccessException;

import java.util.HashMap;
import java.util.Map;

/**
 * AbstractApiPartAPI
 */
public abstract class AbstractApiPartAPI implements ApiPartAPI
{
    // REQUEST PARAMETERS
    private static final String API_PARTICULIER_PARAMETER_NUMERO_FISCAL = "numeroFiscal";
    private static final String API_PARTICULIER_PARAMETER_REFERENCE_AVIS = "referenceAvis";
    
    // REQUEST HEADERS
    private static final String API_PARTICULIER_HEADER_ACCEPT = "Accept";
    private static final String API_PARTICULIER_HEADER_ACCEPT_VALUE = "application/json";
    private static final String API_PARTICULIER_HEADER_API_KEY = "X-API-KEY";
    
    /**
     * {@inheritDoc }
     */
    @Override
    public String buildRequestAPI( InformationsFiscales informationsFiscales )
    {
        String strResponse = null;
        HttpAccess httpAccess = new HttpAccess( );
        try
        {
            strResponse = httpAccess.doGet(getUrlParameters( informationsFiscales ), null, null, getUrlHeaders( ));
            AppLogService.debug( "API Part : " + strResponse );
        }
        catch ( HttpAccessException ex )
        {
            AppLogService.error( "API Part Error : " + ex.getMessage(  ), ex );
        }
        return strResponse;
    }
    
    /**
     * {@inheritDoc }
     */
    @Override
    public String getUrlParameters( InformationsFiscales informationsFiscales )
    {
        String strUrl = getPropertyDomain();
        
        strUrl = addParameter( strUrl, API_PARTICULIER_PARAMETER_NUMERO_FISCAL, informationsFiscales.getNumeroFiscal(), true );
        strUrl = addParameter( strUrl, API_PARTICULIER_PARAMETER_REFERENCE_AVIS, informationsFiscales.getReferenceAvis(), false );
               
        return strUrl;
    }
    
    /**
     * {@inheritDoc }
     */
    @Override
    public Map<String, String> getUrlHeaders( )
    {
        final Map<String, String> headers = new HashMap<>();
        
        headers.put(API_PARTICULIER_HEADER_ACCEPT, API_PARTICULIER_HEADER_ACCEPT_VALUE);
        headers.put(API_PARTICULIER_HEADER_API_KEY, getPropertyToken());
        
        return headers;
    }
    
    /**
     * {@inheritDoc }
     */
    @Override
    public String addParameter( String strUrl, String parameter, String value, boolean first )
    {
        String strUrlParameter;
        if(first)
        {
            strUrlParameter = strUrl.concat("?").concat(parameter).concat("=").concat(value);
        }
        else
        {
            strUrlParameter = strUrl.concat("&").concat(parameter).concat("=").concat(value);
        }
        return strUrlParameter;
    }
}
