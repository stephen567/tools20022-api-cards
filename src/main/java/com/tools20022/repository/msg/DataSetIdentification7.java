/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.DataSetCategory12Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a data set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DataSetIdentification7#mmName
 * DataSetIdentification7.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DataSetIdentification7#mmType
 * DataSetIdentification7.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DataSetIdentification7#mmVersion
 * DataSetIdentification7.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DataSetIdentification7#mmCreationDateTime
 * DataSetIdentification7.mmCreationDateTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DataSetIdentification7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a data set."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DataSetIdentification7", propOrder = {"name", "type", "version", "creationDateTime"})
public class DataSetIdentification7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nm")
	protected Max256Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DataSetIdentification7
	 * DataSetIdentification7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the data set."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DataSetIdentification7, Optional<Max256Text>> mmName = new MMMessageAttribute<DataSetIdentification7, Optional<Max256Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DataSetIdentification7.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(DataSetIdentification7 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(DataSetIdentification7 obj, Optional<Max256Text> value) {
			obj.setName(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected DataSetCategory12Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory12Code
	 * DataSetCategory12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DataSetIdentification7
	 * DataSetIdentification7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of data set."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DataSetIdentification7, DataSetCategory12Code> mmType = new MMMessageAttribute<DataSetIdentification7, DataSetCategory12Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DataSetIdentification7.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Category of data set.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataSetCategory12Code.mmObject();
		}

		@Override
		public DataSetCategory12Code getValue(DataSetIdentification7 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(DataSetIdentification7 obj, DataSetCategory12Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Vrsn")
	protected Max256Text version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DataSetIdentification7
	 * DataSetIdentification7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the data set."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DataSetIdentification7, Optional<Max256Text>> mmVersion = new MMMessageAttribute<DataSetIdentification7, Optional<Max256Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DataSetIdentification7.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(DataSetIdentification7 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(DataSetIdentification7 obj, Optional<Max256Text> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "CreDtTm")
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DataSetIdentification7
	 * DataSetIdentification7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of creation of the data set."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DataSetIdentification7, Optional<ISODateTime>> mmCreationDateTime = new MMMessageAttribute<DataSetIdentification7, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DataSetIdentification7.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time of creation of the data set.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(DataSetIdentification7 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(DataSetIdentification7 obj, Optional<ISODateTime> value) {
			obj.setCreationDateTime(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DataSetIdentification7.mmName, com.tools20022.repository.msg.DataSetIdentification7.mmType,
						com.tools20022.repository.msg.DataSetIdentification7.mmVersion, com.tools20022.repository.msg.DataSetIdentification7.mmCreationDateTime);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetIdentification7";
				definition = "Identification of a data set.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max256Text> getName() {
		return name == null ? Optional.empty() : Optional.of(name);
	}

	public DataSetIdentification7 setName(Max256Text name) {
		this.name = name;
		return this;
	}

	public DataSetCategory12Code getType() {
		return type;
	}

	public DataSetIdentification7 setType(DataSetCategory12Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<Max256Text> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public DataSetIdentification7 setVersion(Max256Text version) {
		this.version = version;
		return this;
	}

	public Optional<ISODateTime> getCreationDateTime() {
		return creationDateTime == null ? Optional.empty() : Optional.of(creationDateTime);
	}

	public DataSetIdentification7 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
		return this;
	}
}