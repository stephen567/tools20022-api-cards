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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.ATMCommandParameters3Choice;
import com.tools20022.repository.codeset.ATMCommand6Code;
import com.tools20022.repository.codeset.ATMCommandReason1Code;
import com.tools20022.repository.codeset.TMSContactLevel2Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.TerminalManagementSystem;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ATMCommandIdentification1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Maintenance command the ATM must perform.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand10#mmType
 * ATMCommand10.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand10#mmUrgency
 * ATMCommand10.mmUrgency}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand10#mmDateTime
 * ATMCommand10.mmDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCommand10#mmCommandIdentification
 * ATMCommand10.mmCommandIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand10#mmReason
 * ATMCommand10.mmReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMCommand10#mmTraceReason
 * ATMCommand10.mmTraceReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCommand10#mmAdditionalReasonInformation
 * ATMCommand10.mmAdditionalReasonInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMCommand10#mmCommandParameters
 * ATMCommand10.mmCommandParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem
 * TerminalManagementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMCommand10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Maintenance command the ATM must perform."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMCommand10", propOrder = {"type", "urgency", "dateTime", "commandIdentification", "reason", "traceReason", "additionalReasonInformation", "commandParameters"})
public class ATMCommand10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected ATMCommand6Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommand6Code
	 * ATMCommand6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand10 ATMCommand10}</li>
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
	 * definition} = "Type of command to be performed by the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommand10, ATMCommand6Code> mmType = new MMMessageAttribute<ATMCommand10, ATMCommand6Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand10.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of command to be performed by the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ATMCommand6Code.mmObject();
		}

		@Override
		public ATMCommand6Code getValue(ATMCommand10 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(ATMCommand10 obj, ATMCommand6Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Urgcy", required = true)
	protected TMSContactLevel2Code urgency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TMSContactLevel2Code
	 * TMSContactLevel2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementSystem#mmContactLevel
	 * TerminalManagementSystem.mmContactLevel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand10 ATMCommand10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Urgcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Urgency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Urgency of the command."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommand10, TMSContactLevel2Code> mmUrgency = new MMMessageAttribute<ATMCommand10, TMSContactLevel2Code>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementSystem.mmContactLevel;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand10.mmObject();
			isDerived = false;
			xmlTag = "Urgcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Urgency";
			definition = "Urgency of the command.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TMSContactLevel2Code.mmObject();
		}

		@Override
		public TMSContactLevel2Code getValue(ATMCommand10 obj) {
			return obj.getUrgency();
		}

		@Override
		public void setValue(ATMCommand10 obj, TMSContactLevel2Code value) {
			obj.setUrgency(value);
		}
	};
	@XmlElement(name = "DtTm")
	protected ISODateTime dateTime;
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
	 * {@linkplain com.tools20022.repository.msg.ATMCommand10 ATMCommand10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date time on which the command must be performed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommand10, Optional<ISODateTime>> mmDateTime = new MMMessageAttribute<ATMCommand10, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand10.mmObject();
			isDerived = false;
			xmlTag = "DtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateTime";
			definition = "Date time on which the command must be performed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(ATMCommand10 obj) {
			return obj.getDateTime();
		}

		@Override
		public void setValue(ATMCommand10 obj, Optional<ISODateTime> value) {
			obj.setDateTime(value.orElse(null));
		}
	};
	@XmlElement(name = "CmdId")
	protected ATMCommandIdentification1 commandIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommandIdentification1
	 * ATMCommandIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand10 ATMCommand10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommandIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the entity issuing the command."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMCommand10, Optional<ATMCommandIdentification1>> mmCommandIdentification = new MMMessageAssociationEnd<ATMCommand10, Optional<ATMCommandIdentification1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand10.mmObject();
			isDerived = false;
			xmlTag = "CmdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandIdentification";
			definition = "Identification of the entity issuing the command.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommandIdentification1.mmObject();
		}

		@Override
		public Optional<ATMCommandIdentification1> getValue(ATMCommand10 obj) {
			return obj.getCommandIdentification();
		}

		@Override
		public void setValue(ATMCommand10 obj, Optional<ATMCommandIdentification1> value) {
			obj.setCommandIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Rsn")
	protected ATMCommandReason1Code reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandReason1Code
	 * ATMCommandReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand10 ATMCommand10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for sending the command."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommand10, Optional<ATMCommandReason1Code>> mmReason = new MMMessageAttribute<ATMCommand10, Optional<ATMCommandReason1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand10.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason for sending the command.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ATMCommandReason1Code.mmObject();
		}

		@Override
		public Optional<ATMCommandReason1Code> getValue(ATMCommand10 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(ATMCommand10 obj, Optional<ATMCommandReason1Code> value) {
			obj.setReason(value.orElse(null));
		}
	};
	@XmlElement(name = "TracRsn")
	protected List<ATMCommandReason1Code> traceReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandReason1Code
	 * ATMCommandReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand10 ATMCommand10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TracRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TraceReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trace of reasons by the entities in the path from the origin of the command to the ATM."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommand10, List<ATMCommandReason1Code>> mmTraceReason = new MMMessageAttribute<ATMCommand10, List<ATMCommandReason1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand10.mmObject();
			isDerived = false;
			xmlTag = "TracRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TraceReason";
			definition = "Trace of reasons by the entities in the path from the origin of the command to the ATM.";
			minOccurs = 0;
			simpleType_lazy = () -> ATMCommandReason1Code.mmObject();
		}

		@Override
		public List<ATMCommandReason1Code> getValue(ATMCommand10 obj) {
			return obj.getTraceReason();
		}

		@Override
		public void setValue(ATMCommand10 obj, List<ATMCommandReason1Code> value) {
			obj.setTraceReason(value);
		}
	};
	@XmlElement(name = "AddtlRsnInf")
	protected Max70Text additionalReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand10 ATMCommand10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about the reason to request this command."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMCommand10, Optional<Max70Text>> mmAdditionalReasonInformation = new MMMessageAttribute<ATMCommand10, Optional<Max70Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand10.mmObject();
			isDerived = false;
			xmlTag = "AddtlRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalReasonInformation";
			definition = "Additional information about the reason to request this command.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Optional<Max70Text> getValue(ATMCommand10 obj) {
			return obj.getAdditionalReasonInformation();
		}

		@Override
		public void setValue(ATMCommand10 obj, Optional<Max70Text> value) {
			obj.setAdditionalReasonInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "CmdParams")
	protected ATMCommandParameters3Choice commandParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters3Choice
	 * ATMCommandParameters3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMCommand10 ATMCommand10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmdParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommandParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specific parameters attached to the command."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMCommand10, Optional<ATMCommandParameters3Choice>> mmCommandParameters = new MMMessageAssociationEnd<ATMCommand10, Optional<ATMCommandParameters3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMCommand10.mmObject();
			isDerived = false;
			xmlTag = "CmdParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommandParameters";
			definition = "Specific parameters attached to the command.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommandParameters3Choice.mmObject();
		}

		@Override
		public Optional<ATMCommandParameters3Choice> getValue(ATMCommand10 obj) {
			return obj.getCommandParameters();
		}

		@Override
		public void setValue(ATMCommand10 obj, Optional<ATMCommandParameters3Choice> value) {
			obj.setCommandParameters(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMCommand10.mmType, com.tools20022.repository.msg.ATMCommand10.mmUrgency, com.tools20022.repository.msg.ATMCommand10.mmDateTime,
						com.tools20022.repository.msg.ATMCommand10.mmCommandIdentification, com.tools20022.repository.msg.ATMCommand10.mmReason, com.tools20022.repository.msg.ATMCommand10.mmTraceReason,
						com.tools20022.repository.msg.ATMCommand10.mmAdditionalReasonInformation, com.tools20022.repository.msg.ATMCommand10.mmCommandParameters);
				trace_lazy = () -> TerminalManagementSystem.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ATMCommand10";
				definition = "Maintenance command the ATM must perform.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMCommand6Code getType() {
		return type;
	}

	public ATMCommand10 setType(ATMCommand6Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public TMSContactLevel2Code getUrgency() {
		return urgency;
	}

	public ATMCommand10 setUrgency(TMSContactLevel2Code urgency) {
		this.urgency = Objects.requireNonNull(urgency);
		return this;
	}

	public Optional<ISODateTime> getDateTime() {
		return dateTime == null ? Optional.empty() : Optional.of(dateTime);
	}

	public ATMCommand10 setDateTime(ISODateTime dateTime) {
		this.dateTime = dateTime;
		return this;
	}

	public Optional<ATMCommandIdentification1> getCommandIdentification() {
		return commandIdentification == null ? Optional.empty() : Optional.of(commandIdentification);
	}

	public ATMCommand10 setCommandIdentification(ATMCommandIdentification1 commandIdentification) {
		this.commandIdentification = commandIdentification;
		return this;
	}

	public Optional<ATMCommandReason1Code> getReason() {
		return reason == null ? Optional.empty() : Optional.of(reason);
	}

	public ATMCommand10 setReason(ATMCommandReason1Code reason) {
		this.reason = reason;
		return this;
	}

	public List<ATMCommandReason1Code> getTraceReason() {
		return traceReason == null ? traceReason = new ArrayList<>() : traceReason;
	}

	public ATMCommand10 setTraceReason(List<ATMCommandReason1Code> traceReason) {
		this.traceReason = Objects.requireNonNull(traceReason);
		return this;
	}

	public Optional<Max70Text> getAdditionalReasonInformation() {
		return additionalReasonInformation == null ? Optional.empty() : Optional.of(additionalReasonInformation);
	}

	public ATMCommand10 setAdditionalReasonInformation(Max70Text additionalReasonInformation) {
		this.additionalReasonInformation = additionalReasonInformation;
		return this;
	}

	public Optional<ATMCommandParameters3Choice> getCommandParameters() {
		return commandParameters == null ? Optional.empty() : Optional.of(commandParameters);
	}

	public ATMCommand10 setCommandParameters(ATMCommandParameters3Choice commandParameters) {
		this.commandParameters = commandParameters;
		return this;
	}
}