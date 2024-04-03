/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.mydsl.myDsl.Consulta;
import org.xtext.example.mydsl.myDsl.Creacion;
import org.xtext.example.mydsl.myDsl.Eliminacion;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Proceso;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.CONSULTA:
				sequence_Consulta(context, (Consulta) semanticObject); 
				return; 
			case MyDslPackage.CREACION:
				sequence_Creacion(context, (Creacion) semanticObject); 
				return; 
			case MyDslPackage.ELIMINACION:
				sequence_Eliminacion(context, (Eliminacion) semanticObject); 
				return; 
			case MyDslPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MyDslPackage.PROCESO:
				sequence_Proceso(context, (Proceso) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Consulta returns Consulta
	 *
	 * Constraint:
	 *     (sustantivo=TipoProceso ((tipoMaquina=TipoMaquina potencia=INT) | (tipoMaterial=TipoMaterial grosor=INT)) verbo=Verbo)
	 * </pre>
	 */
	protected void sequence_Consulta(ISerializationContext context, Consulta semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Creacion returns Creacion
	 *
	 * Constraint:
	 *     (sustantivo=TipoProceso ((tipoMaquina=TipoMaquina potencia=INT) | (tipoMaterial=TipoMaterial grosor=INT)))
	 * </pre>
	 */
	protected void sequence_Creacion(ISerializationContext context, Creacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Eliminacion returns Eliminacion
	 *
	 * Constraint:
	 *     (sustantivo=TipoProceso ((tipoMaquina=TipoMaquina potencia=INT) | (tipoMaterial=TipoMaterial grosor=INT)))
	 * </pre>
	 */
	protected void sequence_Eliminacion(ISerializationContext context, Eliminacion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     procesos+=Proceso+
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Proceso returns Proceso
	 *
	 * Constraint:
	 *     (tipo=TipoProceso (creacion=Creacion | consulta=Consulta | eliminacion=Eliminacion) tipo=TipoProceso)
	 * </pre>
	 */
	protected void sequence_Proceso(ISerializationContext context, Proceso semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}