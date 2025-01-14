/**
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.myDsl.Consulta;
import org.xtext.example.mydsl.myDsl.Creacion;
import org.xtext.example.mydsl.myDsl.Eliminacion;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Proceso;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proceso</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ProcesoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ProcesoImpl#getCreacion <em>Creacion</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ProcesoImpl#getConsulta <em>Consulta</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.ProcesoImpl#getEliminacion <em>Eliminacion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcesoImpl extends MinimalEObjectImpl.Container implements Proceso
{
  /**
   * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected static final String TIPO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTipo()
   * @generated
   * @ordered
   */
  protected String tipo = TIPO_EDEFAULT;

  /**
   * The cached value of the '{@link #getCreacion() <em>Creacion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreacion()
   * @generated
   * @ordered
   */
  protected Creacion creacion;

  /**
   * The cached value of the '{@link #getConsulta() <em>Consulta</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConsulta()
   * @generated
   * @ordered
   */
  protected Consulta consulta;

  /**
   * The cached value of the '{@link #getEliminacion() <em>Eliminacion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEliminacion()
   * @generated
   * @ordered
   */
  protected Eliminacion eliminacion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcesoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.PROCESO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTipo()
  {
    return tipo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTipo(String newTipo)
  {
    String oldTipo = tipo;
    tipo = newTipo;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROCESO__TIPO, oldTipo, tipo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Creacion getCreacion()
  {
    return creacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreacion(Creacion newCreacion, NotificationChain msgs)
  {
    Creacion oldCreacion = creacion;
    creacion = newCreacion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PROCESO__CREACION, oldCreacion, newCreacion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCreacion(Creacion newCreacion)
  {
    if (newCreacion != creacion)
    {
      NotificationChain msgs = null;
      if (creacion != null)
        msgs = ((InternalEObject)creacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROCESO__CREACION, null, msgs);
      if (newCreacion != null)
        msgs = ((InternalEObject)newCreacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROCESO__CREACION, null, msgs);
      msgs = basicSetCreacion(newCreacion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROCESO__CREACION, newCreacion, newCreacion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Consulta getConsulta()
  {
    return consulta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConsulta(Consulta newConsulta, NotificationChain msgs)
  {
    Consulta oldConsulta = consulta;
    consulta = newConsulta;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PROCESO__CONSULTA, oldConsulta, newConsulta);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConsulta(Consulta newConsulta)
  {
    if (newConsulta != consulta)
    {
      NotificationChain msgs = null;
      if (consulta != null)
        msgs = ((InternalEObject)consulta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROCESO__CONSULTA, null, msgs);
      if (newConsulta != null)
        msgs = ((InternalEObject)newConsulta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROCESO__CONSULTA, null, msgs);
      msgs = basicSetConsulta(newConsulta, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROCESO__CONSULTA, newConsulta, newConsulta));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Eliminacion getEliminacion()
  {
    return eliminacion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEliminacion(Eliminacion newEliminacion, NotificationChain msgs)
  {
    Eliminacion oldEliminacion = eliminacion;
    eliminacion = newEliminacion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.PROCESO__ELIMINACION, oldEliminacion, newEliminacion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEliminacion(Eliminacion newEliminacion)
  {
    if (newEliminacion != eliminacion)
    {
      NotificationChain msgs = null;
      if (eliminacion != null)
        msgs = ((InternalEObject)eliminacion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROCESO__ELIMINACION, null, msgs);
      if (newEliminacion != null)
        msgs = ((InternalEObject)newEliminacion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.PROCESO__ELIMINACION, null, msgs);
      msgs = basicSetEliminacion(newEliminacion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.PROCESO__ELIMINACION, newEliminacion, newEliminacion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.PROCESO__CREACION:
        return basicSetCreacion(null, msgs);
      case MyDslPackage.PROCESO__CONSULTA:
        return basicSetConsulta(null, msgs);
      case MyDslPackage.PROCESO__ELIMINACION:
        return basicSetEliminacion(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.PROCESO__TIPO:
        return getTipo();
      case MyDslPackage.PROCESO__CREACION:
        return getCreacion();
      case MyDslPackage.PROCESO__CONSULTA:
        return getConsulta();
      case MyDslPackage.PROCESO__ELIMINACION:
        return getEliminacion();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.PROCESO__TIPO:
        setTipo((String)newValue);
        return;
      case MyDslPackage.PROCESO__CREACION:
        setCreacion((Creacion)newValue);
        return;
      case MyDslPackage.PROCESO__CONSULTA:
        setConsulta((Consulta)newValue);
        return;
      case MyDslPackage.PROCESO__ELIMINACION:
        setEliminacion((Eliminacion)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.PROCESO__TIPO:
        setTipo(TIPO_EDEFAULT);
        return;
      case MyDslPackage.PROCESO__CREACION:
        setCreacion((Creacion)null);
        return;
      case MyDslPackage.PROCESO__CONSULTA:
        setConsulta((Consulta)null);
        return;
      case MyDslPackage.PROCESO__ELIMINACION:
        setEliminacion((Eliminacion)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.PROCESO__TIPO:
        return TIPO_EDEFAULT == null ? tipo != null : !TIPO_EDEFAULT.equals(tipo);
      case MyDslPackage.PROCESO__CREACION:
        return creacion != null;
      case MyDslPackage.PROCESO__CONSULTA:
        return consulta != null;
      case MyDslPackage.PROCESO__ELIMINACION:
        return eliminacion != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (tipo: ");
    result.append(tipo);
    result.append(')');
    return result.toString();
  }

} //ProcesoImpl
