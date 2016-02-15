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
import java.util.Map;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This is the business class for the object InformationsClient
 */ 
public class InformationsClient implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private Declarant _declarant1;
    private Declarant _declarant2;
    private FoyerFiscal _foyerFiscal;
    
    /**
     * Sets the _declarant1
     * @param declarant1 The _declarant1
     */
    @JsonProperty( "declarant1" )
    public void setDeclarant1( Map<String, Object> declarant1 )
    {
        _declarant1 = new Declarant();
        _declarant1.setNom( (String) declarant1.get( "nom" ) );
        _declarant1.setNomNaissance( (String) declarant1.get( "nomNaissance" ) );
        _declarant1.setPrenoms( (String) declarant1.get( "prenoms" ) );
        _declarant1.setDateNaissance( (String) declarant1.get( "dateNaissance" ) );
    }
    
    /**
     * Sets the _declarant1
     * @param declarant1 The _declarant1
     */
    @JsonProperty( "declarant2" )
    public void setDeclarant2( Map<String, Object> declarant1 )
    {
        _declarant2 = new Declarant();
        _declarant2.setNom( (String) declarant1.get( "nom" ) );
        _declarant2.setNomNaissance( (String) declarant1.get( "nomNaissance" ) );
        _declarant2.setPrenoms( (String) declarant1.get( "prenoms" ) );
        _declarant2.setDateNaissance( (String) declarant1.get( "dateNaissance" ) );
    }
    
    /**
     * Sets the _foyerFiscal
     * @param foyerFiscal The _foyerFiscal
     */
    @JsonProperty( "foyerFiscal" )
    public void setFoyerFiscal( Map<String, Object> foyerFiscal )
    {
        _foyerFiscal = new FoyerFiscal();
        _foyerFiscal.setAnnee( (int) foyerFiscal.get( "annee" ) );
        _foyerFiscal.setAdresse( (String) foyerFiscal.get( "adresse" ) );
    }
    
    /**
     * Get the _declarant1
     * @return the _declarant1
     */
    public Declarant getDeclarant1()
    {
        return _declarant1;
    }
    
    /**
     * Get the _declarant2
     * @return the _declarant2
     */
    public Declarant getDeclarant2()
    {
        return _declarant2;
    }
    
    /**
     * Get the _foyerFiscal
     * @return the _foyerFiscal
     */
    public FoyerFiscal getFoyerFiscal()
    {
        return _foyerFiscal;
    }
}