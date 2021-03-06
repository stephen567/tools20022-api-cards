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
import com.tools20022.repository.codeset.DataSetCategory11Code;
import com.tools20022.repository.codeset.Response2Code;
import com.tools20022.repository.codeset.TerminalManagementAction3Code;
import com.tools20022.repository.datatype.Max3000Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ContentInformationType19;
import com.tools20022.repository.msg.MaintenanceIdentificationAssociation1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information on the delegation of a maintenance action or maintenance
 * function.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmMaintenanceService
 * MaintenanceDelegation6.mmMaintenanceService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmResponse
 * MaintenanceDelegation6.mmResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmResponseReason
 * MaintenanceDelegation6.mmResponseReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmDelegationType
 * MaintenanceDelegation6.mmDelegationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmPOISubset
 * MaintenanceDelegation6.mmPOISubset}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmDelegationScopeIdentification
 * MaintenanceDelegation6.mmDelegationScopeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmDelegationScopeDefinition
 * MaintenanceDelegation6.mmDelegationScopeDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmDelegationProof
 * MaintenanceDelegation6.mmDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmProtectedDelegationProof
 * MaintenanceDelegation6.mmProtectedDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6#mmPOIIdentificationAssociation
 * MaintenanceDelegation6.mmPOIIdentificationAssociation}</li>
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
 * "MaintenanceDelegation6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information on the delegation of a maintenance action or maintenance function."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MaintenanceDelegation6", propOrder = {"maintenanceService", "response", "responseReason", "delegationType", "pOISubset", "delegationScopeIdentification", "delegationScopeDefinition", "delegationProof",
		"protectedDelegationProof", "pOIIdentificationAssociation"})
public class MaintenanceDelegation6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MntncSvc", required = true)
	protected List<DataSetCategory11Code> maintenanceService;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory11Code
	 * DataSetCategory11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6
	 * MaintenanceDelegation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntncSvc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaintenanceService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance service to be delegated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation6, List<DataSetCategory11Code>> mmMaintenanceService = new MMMessageAttribute<MaintenanceDelegation6, List<DataSetCategory11Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation6.mmObject();
			isDerived = false;
			xmlTag = "MntncSvc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaintenanceService";
			definition = "Maintenance service to be delegated.";
			minOccurs = 1;
			simpleType_lazy = () -> DataSetCategory11Code.mmObject();
		}

		@Override
		public List<DataSetCategory11Code> getValue(MaintenanceDelegation6 obj) {
			return obj.getMaintenanceService();
		}

		@Override
		public void setValue(MaintenanceDelegation6 obj, List<DataSetCategory11Code> value) {
			obj.setMaintenanceService(value);
		}
	};
	@XmlElement(name = "Rspn", required = true)
	protected Response2Code response;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Response2Code
	 * Response2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6
	 * MaintenanceDelegation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Response"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Response of the MTM to the delegation of the maintenance service."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation6, Response2Code> mmResponse = new MMMessageAttribute<MaintenanceDelegation6, Response2Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation6.mmObject();
			isDerived = false;
			xmlTag = "Rspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Response of the MTM to the delegation of the maintenance service.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Response2Code.mmObject();
		}

		@Override
		public Response2Code getValue(MaintenanceDelegation6 obj) {
			return obj.getResponse();
		}

		@Override
		public void setValue(MaintenanceDelegation6 obj, Response2Code value) {
			obj.setResponse(value);
		}
	};
	@XmlElement(name = "RspnRsn")
	protected Max35Text responseReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6
	 * MaintenanceDelegation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason of the response of the MTM."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation6, Optional<Max35Text>> mmResponseReason = new MMMessageAttribute<MaintenanceDelegation6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation6.mmObject();
			isDerived = false;
			xmlTag = "RspnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseReason";
			definition = "Reason of the response of the MTM.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MaintenanceDelegation6 obj) {
			return obj.getResponseReason();
		}

		@Override
		public void setValue(MaintenanceDelegation6 obj, Optional<Max35Text> value) {
			obj.setResponseReason(value.orElse(null));
		}
	};
	@XmlElement(name = "DlgtnTp", required = true)
	protected TerminalManagementAction3Code delegationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6
	 * MaintenanceDelegation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of delegation action."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation6, TerminalManagementAction3Code> mmDelegationType = new MMMessageAttribute<MaintenanceDelegation6, TerminalManagementAction3Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation6.mmObject();
			isDerived = false;
			xmlTag = "DlgtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationType";
			definition = "Type of delegation action.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}

		@Override
		public TerminalManagementAction3Code getValue(MaintenanceDelegation6 obj) {
			return obj.getDelegationType();
		}

		@Override
		public void setValue(MaintenanceDelegation6 obj, TerminalManagementAction3Code value) {
			obj.setDelegationType(value);
		}
	};
	@XmlElement(name = "POISubset")
	protected List<Max35Text> pOISubset;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6
	 * MaintenanceDelegation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POISubset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POISubset"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subset of the terminal estate for the delegated actions, for instance for pilot or key deactivation). The subset may be expressed as a list of POI or terminal estate subset identifier."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation6, List<Max35Text>> mmPOISubset = new MMMessageAttribute<MaintenanceDelegation6, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation6.mmObject();
			isDerived = false;
			xmlTag = "POISubset";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POISubset";
			definition = "Subset of the terminal estate for the delegated actions, for instance for pilot or key deactivation). The subset may be expressed as a list of POI or terminal estate subset identifier.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(MaintenanceDelegation6 obj) {
			return obj.getPOISubset();
		}

		@Override
		public void setValue(MaintenanceDelegation6 obj, List<Max35Text> value) {
			obj.setPOISubset(value);
		}
	};
	@XmlElement(name = "DlgtnScpId")
	protected Max35Text delegationScopeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6
	 * MaintenanceDelegation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnScpId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationScopeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the parameters subset assigned by the MTM."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation6, Optional<Max35Text>> mmDelegationScopeIdentification = new MMMessageAttribute<MaintenanceDelegation6, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation6.mmObject();
			isDerived = false;
			xmlTag = "DlgtnScpId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationScopeIdentification";
			definition = "Identification of the parameters subset assigned by the MTM.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MaintenanceDelegation6 obj) {
			return obj.getDelegationScopeIdentification();
		}

		@Override
		public void setValue(MaintenanceDelegation6 obj, Optional<Max35Text> value) {
			obj.setDelegationScopeIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "DlgtnScpDef")
	protected Max3000Binary delegationScopeDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3000Binary
	 * Max3000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6
	 * MaintenanceDelegation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnScpDef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationScopeDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This element contains all information relevant to the DelegationScopeIdentification. The format of this element is out of scope of this definition."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation6, Optional<Max3000Binary>> mmDelegationScopeDefinition = new MMMessageAttribute<MaintenanceDelegation6, Optional<Max3000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation6.mmObject();
			isDerived = false;
			xmlTag = "DlgtnScpDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationScopeDefinition";
			definition = "This element contains all information relevant to the DelegationScopeIdentification. The format of this element is out of scope of this definition.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3000Binary.mmObject();
		}

		@Override
		public Optional<Max3000Binary> getValue(MaintenanceDelegation6 obj) {
			return obj.getDelegationScopeDefinition();
		}

		@Override
		public void setValue(MaintenanceDelegation6 obj, Optional<Max3000Binary> value) {
			obj.setDelegationScopeDefinition(value.orElse(null));
		}
	};
	@XmlElement(name = "DlgtnProof")
	protected Max5000Binary delegationProof;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6
	 * MaintenanceDelegation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlgtnProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This element contains the necessary information to secure the management of the Delegation. The format of this element is out of scope of this definition."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MaintenanceDelegation6, Optional<Max5000Binary>> mmDelegationProof = new MMMessageAttribute<MaintenanceDelegation6, Optional<Max5000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation6.mmObject();
			isDerived = false;
			xmlTag = "DlgtnProof";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationProof";
			definition = "This element contains the necessary information to secure the management of the Delegation. The format of this element is out of scope of this definition.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}

		@Override
		public Optional<Max5000Binary> getValue(MaintenanceDelegation6 obj) {
			return obj.getDelegationProof();
		}

		@Override
		public void setValue(MaintenanceDelegation6 obj, Optional<Max5000Binary> value) {
			obj.setDelegationProof(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtctdDlgtnProof")
	protected ContentInformationType19 protectedDelegationProof;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ContentInformationType19
	 * ContentInformationType19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6
	 * MaintenanceDelegation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctdDlgtnProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectedDelegationProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protected proof of delegation."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegation6, Optional<ContentInformationType19>> mmProtectedDelegationProof = new MMMessageAssociationEnd<MaintenanceDelegation6, Optional<ContentInformationType19>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation6.mmObject();
			isDerived = false;
			xmlTag = "PrtctdDlgtnProof";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectedDelegationProof";
			definition = "Protected proof of delegation.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ContentInformationType19.mmObject();
		}

		@Override
		public Optional<ContentInformationType19> getValue(MaintenanceDelegation6 obj) {
			return obj.getProtectedDelegationProof();
		}

		@Override
		public void setValue(MaintenanceDelegation6 obj, Optional<ContentInformationType19> value) {
			obj.setProtectedDelegationProof(value.orElse(null));
		}
	};
	@XmlElement(name = "POIIdAssoctn")
	protected List<MaintenanceIdentificationAssociation1> pOIIdentificationAssociation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceIdentificationAssociation1
	 * MaintenanceIdentificationAssociation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MaintenanceDelegation6
	 * MaintenanceDelegation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "POIIdAssoctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "POIIdentificationAssociation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Association of the TM identifier and the MTM identifier of a POI."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MaintenanceDelegation6, List<MaintenanceIdentificationAssociation1>> mmPOIIdentificationAssociation = new MMMessageAssociationEnd<MaintenanceDelegation6, List<MaintenanceIdentificationAssociation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MaintenanceDelegation6.mmObject();
			isDerived = false;
			xmlTag = "POIIdAssoctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "POIIdentificationAssociation";
			definition = "Association of the TM identifier and the MTM identifier of a POI.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MaintenanceIdentificationAssociation1.mmObject();
		}

		@Override
		public List<MaintenanceIdentificationAssociation1> getValue(MaintenanceDelegation6 obj) {
			return obj.getPOIIdentificationAssociation();
		}

		@Override
		public void setValue(MaintenanceDelegation6 obj, List<MaintenanceIdentificationAssociation1> value) {
			obj.setPOIIdentificationAssociation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MaintenanceDelegation6.mmMaintenanceService, com.tools20022.repository.msg.MaintenanceDelegation6.mmResponse,
						com.tools20022.repository.msg.MaintenanceDelegation6.mmResponseReason, com.tools20022.repository.msg.MaintenanceDelegation6.mmDelegationType, com.tools20022.repository.msg.MaintenanceDelegation6.mmPOISubset,
						com.tools20022.repository.msg.MaintenanceDelegation6.mmDelegationScopeIdentification, com.tools20022.repository.msg.MaintenanceDelegation6.mmDelegationScopeDefinition,
						com.tools20022.repository.msg.MaintenanceDelegation6.mmDelegationProof, com.tools20022.repository.msg.MaintenanceDelegation6.mmProtectedDelegationProof,
						com.tools20022.repository.msg.MaintenanceDelegation6.mmPOIIdentificationAssociation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MaintenanceDelegation6";
				definition = "Information on the delegation of a maintenance action or maintenance function.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<DataSetCategory11Code> getMaintenanceService() {
		return maintenanceService == null ? maintenanceService = new ArrayList<>() : maintenanceService;
	}

	public MaintenanceDelegation6 setMaintenanceService(List<DataSetCategory11Code> maintenanceService) {
		this.maintenanceService = Objects.requireNonNull(maintenanceService);
		return this;
	}

	public Response2Code getResponse() {
		return response;
	}

	public MaintenanceDelegation6 setResponse(Response2Code response) {
		this.response = Objects.requireNonNull(response);
		return this;
	}

	public Optional<Max35Text> getResponseReason() {
		return responseReason == null ? Optional.empty() : Optional.of(responseReason);
	}

	public MaintenanceDelegation6 setResponseReason(Max35Text responseReason) {
		this.responseReason = responseReason;
		return this;
	}

	public TerminalManagementAction3Code getDelegationType() {
		return delegationType;
	}

	public MaintenanceDelegation6 setDelegationType(TerminalManagementAction3Code delegationType) {
		this.delegationType = Objects.requireNonNull(delegationType);
		return this;
	}

	public List<Max35Text> getPOISubset() {
		return pOISubset == null ? pOISubset = new ArrayList<>() : pOISubset;
	}

	public MaintenanceDelegation6 setPOISubset(List<Max35Text> pOISubset) {
		this.pOISubset = Objects.requireNonNull(pOISubset);
		return this;
	}

	public Optional<Max35Text> getDelegationScopeIdentification() {
		return delegationScopeIdentification == null ? Optional.empty() : Optional.of(delegationScopeIdentification);
	}

	public MaintenanceDelegation6 setDelegationScopeIdentification(Max35Text delegationScopeIdentification) {
		this.delegationScopeIdentification = delegationScopeIdentification;
		return this;
	}

	public Optional<Max3000Binary> getDelegationScopeDefinition() {
		return delegationScopeDefinition == null ? Optional.empty() : Optional.of(delegationScopeDefinition);
	}

	public MaintenanceDelegation6 setDelegationScopeDefinition(Max3000Binary delegationScopeDefinition) {
		this.delegationScopeDefinition = delegationScopeDefinition;
		return this;
	}

	public Optional<Max5000Binary> getDelegationProof() {
		return delegationProof == null ? Optional.empty() : Optional.of(delegationProof);
	}

	public MaintenanceDelegation6 setDelegationProof(Max5000Binary delegationProof) {
		this.delegationProof = delegationProof;
		return this;
	}

	public Optional<ContentInformationType19> getProtectedDelegationProof() {
		return protectedDelegationProof == null ? Optional.empty() : Optional.of(protectedDelegationProof);
	}

	public MaintenanceDelegation6 setProtectedDelegationProof(ContentInformationType19 protectedDelegationProof) {
		this.protectedDelegationProof = protectedDelegationProof;
		return this;
	}

	public List<MaintenanceIdentificationAssociation1> getPOIIdentificationAssociation() {
		return pOIIdentificationAssociation == null ? pOIIdentificationAssociation = new ArrayList<>() : pOIIdentificationAssociation;
	}

	public MaintenanceDelegation6 setPOIIdentificationAssociation(List<MaintenanceIdentificationAssociation1> pOIIdentificationAssociation) {
		this.pOIIdentificationAssociation = Objects.requireNonNull(pOIIdentificationAssociation);
		return this;
	}
}