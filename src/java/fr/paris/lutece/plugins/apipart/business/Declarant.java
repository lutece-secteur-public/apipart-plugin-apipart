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
public class Declarant implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private String _strNom;
    private String _strNomNaissance;
    private String _strPrenoms;
    private String _strDateNaissance;
    
    /**
     * Returns the _strNom
     * @return The _strNom
     */
    public String getNom( )
    {
        return _strNom;
    }

    /**
     * Sets the _strNom
     * @param strNom The _strNom
     */ 
    public void setNom( String strNom )
    {
        _strNom = strNom;
    }
    
    /**
     * Returns the _strNomNaissance
     * @return The _strNomNaissance
     */
    public String getNomNaissance( )
    {
        return _strNomNaissance;
    }

    /**
     * Sets the _strNomNaissance
     * @param strNomNaissance The _strNomNaissance
     */ 
    public void setNomNaissance( String strNomNaissance )
    {
        _strNomNaissance = strNomNaissance;
    }
    
    /**
     * Returns the _strPrenoms
     * @return The _strPrenoms
     */
    public String getPrenoms( )
    {
        return _strPrenoms;
    }

    /**
     * Sets the _strPrenoms
     * @param strPrenoms The _strPrenoms
     */ 
    public void setPrenoms( String strPrenoms )
    {
        _strPrenoms = strPrenoms;
    }
    
    /**
     * Returns the _strDateNaissance
     * @return The _strDateNaissance
     */
    public String getDateNaissance( )
    {
        return _strDateNaissance;
    }

    /**
     * Sets the _strDateNaissance
     * @param strDateNaissance The _strDateNaissance
     */ 
    public void setDateNaissance( String strDateNaissance )
    {
        _strDateNaissance = strDateNaissance;
    }
}