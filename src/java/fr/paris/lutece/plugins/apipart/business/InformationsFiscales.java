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
package fr.paris.lutece.plugins.apipart.business;

import java.io.Serializable;

/**
 * This is the business class for the object InformationsFiscales
 */ 
public class InformationsFiscales implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private String _strNumeroFiscal;
    private String _strReferenceAvis;

    /**
     * Returns the NumeroFiscal
     * @return The NumeroFiscal
     */
    public String getNumeroFiscal( )
    {
        return _strNumeroFiscal;
    }

    /**
     * Sets the NumeroFiscal
     * @param strNumeroFiscal The NumeroFiscal
     */ 
    public void setNumeroFiscal( String strNumeroFiscal )
    {
        _strNumeroFiscal = strNumeroFiscal;
    }
    
    /**
     * Returns the ReferenceAvis
     * @return The ReferenceAvis
     */
    public String getReferenceAvis( )
    {
        return _strReferenceAvis;
    }

    /**
     * Sets the ReferenceAvis
     * @param strReferenceAvis The ReferenceAvis
     */ 
    public void setReferenceAvis( String strReferenceAvis )
    {
        _strReferenceAvis = strReferenceAvis;
    }
}