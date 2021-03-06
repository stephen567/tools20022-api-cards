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
import com.tools20022.repository.codeset.OutputFormat1Code;
import com.tools20022.repository.codeset.UserInterface4Code;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Max20000Text;
import com.tools20022.repository.entity.CardPaymentAcquiring;
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
 * Information to display, print or store.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActionMessage2#mmMessageDestination
 * ActionMessage2.mmMessageDestination}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage2#mmFormat
 * ActionMessage2.mmFormat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActionMessage2#mmMessageContent
 * ActionMessage2.mmMessageContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ActionMessage2#mmMessageContentSignature
 * ActionMessage2.mmMessageContentSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring
 * CardPaymentAcquiring}</li>
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
 * "ActionMessage2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information to display, print or store."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage3 ActionMessage3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ActionMessage2", propOrder = {"messageDestination", "format", "messageContent", "messageContentSignature"})
public class ActionMessage2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgDstn", required = true)
	protected UserInterface4Code messageDestination;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UserInterface4Code
	 * UserInterface4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmPointOfInteraction
	 * CardPaymentAcquiring.mmPointOfInteraction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage2 ActionMessage2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgDstn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageDestination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Destination of the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ActionMessage3#mmDestination
	 * ActionMessage3.mmDestination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ActionMessage2, UserInterface4Code> mmMessageDestination = new MMMessageAttribute<ActionMessage2, UserInterface4Code>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmPointOfInteraction;
			componentContext_lazy = () -> com.tools20022.repository.msg.ActionMessage2.mmObject();
			isDerived = false;
			xmlTag = "MsgDstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageDestination";
			definition = "Destination of the message.";
			nextVersions_lazy = () -> Arrays.asList(ActionMessage3.mmDestination);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UserInterface4Code.mmObject();
		}

		@Override
		public UserInterface4Code getValue(ActionMessage2 obj) {
			return obj.getMessageDestination();
		}

		@Override
		public void setValue(ActionMessage2 obj, UserInterface4Code value) {
			obj.setMessageDestination(value);
		}
	};
	@XmlElement(name = "Frmt")
	protected OutputFormat1Code format;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.OutputFormat1Code
	 * OutputFormat1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage2 ActionMessage2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Frmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Format"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message format."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage3#mmFormat
	 * ActionMessage3.mmFormat}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ActionMessage2, Optional<OutputFormat1Code>> mmFormat = new MMMessageAttribute<ActionMessage2, Optional<OutputFormat1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ActionMessage2.mmObject();
			isDerived = false;
			xmlTag = "Frmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Format";
			definition = "Message format.";
			nextVersions_lazy = () -> Arrays.asList(ActionMessage3.mmFormat);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> OutputFormat1Code.mmObject();
		}

		@Override
		public Optional<OutputFormat1Code> getValue(ActionMessage2 obj) {
			return obj.getFormat();
		}

		@Override
		public void setValue(ActionMessage2 obj, Optional<OutputFormat1Code> value) {
			obj.setFormat(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgCntt", required = true)
	protected Max20000Text messageContent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max20000Text Max20000Text}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmActionMessage
	 * CardPaymentAcquiring.mmActionMessage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage2 ActionMessage2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgCntt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Content or reference of the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.ActionMessage3#mmContent
	 * ActionMessage3.mmContent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ActionMessage2, Max20000Text> mmMessageContent = new MMMessageAttribute<ActionMessage2, Max20000Text>() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmActionMessage;
			componentContext_lazy = () -> com.tools20022.repository.msg.ActionMessage2.mmObject();
			isDerived = false;
			xmlTag = "MsgCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageContent";
			definition = "Content or reference of the message.";
			nextVersions_lazy = () -> Arrays.asList(ActionMessage3.mmContent);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max20000Text.mmObject();
		}

		@Override
		public Max20000Text getValue(ActionMessage2 obj) {
			return obj.getMessageContent();
		}

		@Override
		public void setValue(ActionMessage2 obj, Max20000Text value) {
			obj.setMessageContent(value);
		}
	};
	@XmlElement(name = "MsgCnttSgntr")
	protected Max140Binary messageContentSignature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ActionMessage2 ActionMessage2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgCnttSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageContentSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Digital signature of the message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ActionMessage2, Optional<Max140Binary>> mmMessageContentSignature = new MMMessageAttribute<ActionMessage2, Optional<Max140Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ActionMessage2.mmObject();
			isDerived = false;
			xmlTag = "MsgCnttSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageContentSignature";
			definition = "Digital signature of the message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Optional<Max140Binary> getValue(ActionMessage2 obj) {
			return obj.getMessageContentSignature();
		}

		@Override
		public void setValue(ActionMessage2 obj, Optional<Max140Binary> value) {
			obj.setMessageContentSignature(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ActionMessage2.mmMessageDestination, com.tools20022.repository.msg.ActionMessage2.mmFormat,
						com.tools20022.repository.msg.ActionMessage2.mmMessageContent, com.tools20022.repository.msg.ActionMessage2.mmMessageContentSignature);
				trace_lazy = () -> CardPaymentAcquiring.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ActionMessage2";
				definition = "Information to display, print or store.";
				nextVersions_lazy = () -> Arrays.asList(ActionMessage3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public UserInterface4Code getMessageDestination() {
		return messageDestination;
	}

	public ActionMessage2 setMessageDestination(UserInterface4Code messageDestination) {
		this.messageDestination = Objects.requireNonNull(messageDestination);
		return this;
	}

	public Optional<OutputFormat1Code> getFormat() {
		return format == null ? Optional.empty() : Optional.of(format);
	}

	public ActionMessage2 setFormat(OutputFormat1Code format) {
		this.format = format;
		return this;
	}

	public Max20000Text getMessageContent() {
		return messageContent;
	}

	public ActionMessage2 setMessageContent(Max20000Text messageContent) {
		this.messageContent = Objects.requireNonNull(messageContent);
		return this;
	}

	public Optional<Max140Binary> getMessageContentSignature() {
		return messageContentSignature == null ? Optional.empty() : Optional.of(messageContentSignature);
	}

	public ActionMessage2 setMessageContentSignature(Max140Binary messageContentSignature) {
		this.messageContentSignature = messageContentSignature;
		return this;
	}
}