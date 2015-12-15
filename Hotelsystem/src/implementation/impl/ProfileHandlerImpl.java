/**
 */
package implementation.impl;

import implementation.Customer;
import implementation.ImplementationPackage;
import implementation.Model;
import implementation.ProfileHandler;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Profile Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementation.impl.ProfileHandlerImpl#getProfilehandler <em>Profilehandler</em>}</li>
 *   <li>{@link implementation.impl.ProfileHandlerImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileHandlerImpl extends MinimalEObjectImpl.Container implements ProfileHandler {
	/**
	 * The cached value of the '{@link #getProfilehandler() <em>Profilehandler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfilehandler()
	 * @generated
	 * @ordered
	 */
	protected ProfileHandler profilehandler;
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProfileHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ImplementationPackage.Literals.PROFILE_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileHandler getProfilehandler() {
		if (profilehandler != null && profilehandler.eIsProxy()) {
			InternalEObject oldProfilehandler = (InternalEObject)profilehandler;
			profilehandler = (ProfileHandler)eResolveProxy(oldProfilehandler);
			if (profilehandler != oldProfilehandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.PROFILE_HANDLER__PROFILEHANDLER, oldProfilehandler, profilehandler));
			}
		}
		return profilehandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileHandler basicGetProfilehandler() {
		return profilehandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfilehandler(ProfileHandler newProfilehandler) {
		ProfileHandler oldProfilehandler = profilehandler;
		profilehandler = newProfilehandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.PROFILE_HANDLER__PROFILEHANDLER, oldProfilehandler, profilehandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (Model)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ImplementationPackage.PROFILE_HANDLER__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(Model newModel) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ImplementationPackage.PROFILE_HANDLER__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void editInformation(Customer customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void removeProfile(Customer customer) {
		model.getCustomer().remove(customer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public Customer getCustomerDetails(String ssn) {
		EList customers = model.getCustomer();
		for(int i = 0; i < customers.size(); i++)
			if(((CustomerImpl)customers.get(i)).getSocialSecurityNumber() == ssn)
				return (CustomerImpl)customers.get(i);
		CustomerImpl newCustomer = new CustomerImpl();
		newCustomer.setSocialSecurityNumber(ssn);
		model.getCustomer().add(newCustomer);
		return newCustomer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createProfile(Customer customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ImplementationPackage.PROFILE_HANDLER__PROFILEHANDLER:
				if (resolve) return getProfilehandler();
				return basicGetProfilehandler();
			case ImplementationPackage.PROFILE_HANDLER__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ImplementationPackage.PROFILE_HANDLER__PROFILEHANDLER:
				setProfilehandler((ProfileHandler)newValue);
				return;
			case ImplementationPackage.PROFILE_HANDLER__MODEL:
				setModel((Model)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ImplementationPackage.PROFILE_HANDLER__PROFILEHANDLER:
				setProfilehandler((ProfileHandler)null);
				return;
			case ImplementationPackage.PROFILE_HANDLER__MODEL:
				setModel((Model)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ImplementationPackage.PROFILE_HANDLER__PROFILEHANDLER:
				return profilehandler != null;
			case ImplementationPackage.PROFILE_HANDLER__MODEL:
				return model != null;
		}
		return super.eIsSet(featureID);
	}

} //ProfileHandlerImpl
