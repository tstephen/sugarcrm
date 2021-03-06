/*
 * A Java client library to interact with the Sugar CRM REST API.
 * Copyright (C) 2013-2014 Tim Stephenson (tim@knowprocess.com)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.knowprocess.sugarcrm.api;

import java.io.Serializable;
import java.util.Date;

import com.knowprocess.crm.CrmPerson;
import com.knowprocess.crm.CrmRecord;

public class SugarLead extends CrmPerson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7522929479604477420L;

	public SugarLead() {
		super();
	}

	public SugarLead(CrmRecord crmRecord) {
		this();
		this.properties = crmRecord.getProperties();
	}

    public SugarLead(String desc) {
        this();
        setDescription(desc);
    }

    public Date getDateEntered() {
		return (Date) properties.get("date_entered");
	}

	public void setDateEntered(Date value) {
		properties.put("date_entered", value);
	}

	public String getDescription() {
		return (String) properties.get("description");
	}

	public void setDescription(String value) {
		properties.put("description", value);
	}
	
}
