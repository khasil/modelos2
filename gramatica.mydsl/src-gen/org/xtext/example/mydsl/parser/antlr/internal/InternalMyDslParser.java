package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Procesar'", "'{'", "'}'", "'Concluir'", "'Crear'", "'Consultar'", "'Eliminar'", "'Maquina'", "'Material'", "'CO2'", "'Fibra'", "'Vidrio'", "'cortar'", "'grabar'", "'Madera'", "'MDF'", "'Metal'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_procesos_0_0= ruleProceso ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_procesos_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_procesos_0_0= ruleProceso ) )* )
            // InternalMyDsl.g:78:2: ( (lv_procesos_0_0= ruleProceso ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_procesos_0_0= ruleProceso ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_procesos_0_0= ruleProceso )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_procesos_0_0= ruleProceso )
            	    // InternalMyDsl.g:80:4: lv_procesos_0_0= ruleProceso
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getProcesosProcesoParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_procesos_0_0=ruleProceso();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"procesos",
            	    					lv_procesos_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Proceso");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProceso"
    // InternalMyDsl.g:100:1: entryRuleProceso returns [EObject current=null] : iv_ruleProceso= ruleProceso EOF ;
    public final EObject entryRuleProceso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProceso = null;


        try {
            // InternalMyDsl.g:100:48: (iv_ruleProceso= ruleProceso EOF )
            // InternalMyDsl.g:101:2: iv_ruleProceso= ruleProceso EOF
            {
             newCompositeNode(grammarAccess.getProcesoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProceso=ruleProceso();

            state._fsp--;

             current =iv_ruleProceso; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProceso"


    // $ANTLR start "ruleProceso"
    // InternalMyDsl.g:107:1: ruleProceso returns [EObject current=null] : (otherlv_0= 'Procesar' ( (lv_tipo_1_0= ruleTipoProceso ) ) otherlv_2= '{' ( ( (lv_creacion_3_0= ruleCreacion ) ) | ( (lv_consulta_4_0= ruleConsulta ) ) | ( (lv_eliminacion_5_0= ruleEliminacion ) ) ) otherlv_6= '}' otherlv_7= 'Concluir' ( (lv_tipo_8_0= ruleTipoProceso ) ) ) ;
    public final EObject ruleProceso() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_tipo_1_0 = null;

        EObject lv_creacion_3_0 = null;

        EObject lv_consulta_4_0 = null;

        EObject lv_eliminacion_5_0 = null;

        AntlrDatatypeRuleToken lv_tipo_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( (otherlv_0= 'Procesar' ( (lv_tipo_1_0= ruleTipoProceso ) ) otherlv_2= '{' ( ( (lv_creacion_3_0= ruleCreacion ) ) | ( (lv_consulta_4_0= ruleConsulta ) ) | ( (lv_eliminacion_5_0= ruleEliminacion ) ) ) otherlv_6= '}' otherlv_7= 'Concluir' ( (lv_tipo_8_0= ruleTipoProceso ) ) ) )
            // InternalMyDsl.g:114:2: (otherlv_0= 'Procesar' ( (lv_tipo_1_0= ruleTipoProceso ) ) otherlv_2= '{' ( ( (lv_creacion_3_0= ruleCreacion ) ) | ( (lv_consulta_4_0= ruleConsulta ) ) | ( (lv_eliminacion_5_0= ruleEliminacion ) ) ) otherlv_6= '}' otherlv_7= 'Concluir' ( (lv_tipo_8_0= ruleTipoProceso ) ) )
            {
            // InternalMyDsl.g:114:2: (otherlv_0= 'Procesar' ( (lv_tipo_1_0= ruleTipoProceso ) ) otherlv_2= '{' ( ( (lv_creacion_3_0= ruleCreacion ) ) | ( (lv_consulta_4_0= ruleConsulta ) ) | ( (lv_eliminacion_5_0= ruleEliminacion ) ) ) otherlv_6= '}' otherlv_7= 'Concluir' ( (lv_tipo_8_0= ruleTipoProceso ) ) )
            // InternalMyDsl.g:115:3: otherlv_0= 'Procesar' ( (lv_tipo_1_0= ruleTipoProceso ) ) otherlv_2= '{' ( ( (lv_creacion_3_0= ruleCreacion ) ) | ( (lv_consulta_4_0= ruleConsulta ) ) | ( (lv_eliminacion_5_0= ruleEliminacion ) ) ) otherlv_6= '}' otherlv_7= 'Concluir' ( (lv_tipo_8_0= ruleTipoProceso ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProcesoAccess().getProcesarKeyword_0());
            		
            // InternalMyDsl.g:119:3: ( (lv_tipo_1_0= ruleTipoProceso ) )
            // InternalMyDsl.g:120:4: (lv_tipo_1_0= ruleTipoProceso )
            {
            // InternalMyDsl.g:120:4: (lv_tipo_1_0= ruleTipoProceso )
            // InternalMyDsl.g:121:5: lv_tipo_1_0= ruleTipoProceso
            {

            					newCompositeNode(grammarAccess.getProcesoAccess().getTipoTipoProcesoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_tipo_1_0=ruleTipoProceso();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcesoRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_1_0,
            						"org.xtext.example.mydsl.MyDsl.TipoProceso");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getProcesoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:142:3: ( ( (lv_creacion_3_0= ruleCreacion ) ) | ( (lv_consulta_4_0= ruleConsulta ) ) | ( (lv_eliminacion_5_0= ruleEliminacion ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:143:4: ( (lv_creacion_3_0= ruleCreacion ) )
                    {
                    // InternalMyDsl.g:143:4: ( (lv_creacion_3_0= ruleCreacion ) )
                    // InternalMyDsl.g:144:5: (lv_creacion_3_0= ruleCreacion )
                    {
                    // InternalMyDsl.g:144:5: (lv_creacion_3_0= ruleCreacion )
                    // InternalMyDsl.g:145:6: lv_creacion_3_0= ruleCreacion
                    {

                    						newCompositeNode(grammarAccess.getProcesoAccess().getCreacionCreacionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_creacion_3_0=ruleCreacion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcesoRule());
                    						}
                    						set(
                    							current,
                    							"creacion",
                    							lv_creacion_3_0,
                    							"org.xtext.example.mydsl.MyDsl.Creacion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:163:4: ( (lv_consulta_4_0= ruleConsulta ) )
                    {
                    // InternalMyDsl.g:163:4: ( (lv_consulta_4_0= ruleConsulta ) )
                    // InternalMyDsl.g:164:5: (lv_consulta_4_0= ruleConsulta )
                    {
                    // InternalMyDsl.g:164:5: (lv_consulta_4_0= ruleConsulta )
                    // InternalMyDsl.g:165:6: lv_consulta_4_0= ruleConsulta
                    {

                    						newCompositeNode(grammarAccess.getProcesoAccess().getConsultaConsultaParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_consulta_4_0=ruleConsulta();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcesoRule());
                    						}
                    						set(
                    							current,
                    							"consulta",
                    							lv_consulta_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Consulta");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:183:4: ( (lv_eliminacion_5_0= ruleEliminacion ) )
                    {
                    // InternalMyDsl.g:183:4: ( (lv_eliminacion_5_0= ruleEliminacion ) )
                    // InternalMyDsl.g:184:5: (lv_eliminacion_5_0= ruleEliminacion )
                    {
                    // InternalMyDsl.g:184:5: (lv_eliminacion_5_0= ruleEliminacion )
                    // InternalMyDsl.g:185:6: lv_eliminacion_5_0= ruleEliminacion
                    {

                    						newCompositeNode(grammarAccess.getProcesoAccess().getEliminacionEliminacionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_eliminacion_5_0=ruleEliminacion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProcesoRule());
                    						}
                    						set(
                    							current,
                    							"eliminacion",
                    							lv_eliminacion_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Eliminacion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getProcesoAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getProcesoAccess().getConcluirKeyword_5());
            		
            // InternalMyDsl.g:211:3: ( (lv_tipo_8_0= ruleTipoProceso ) )
            // InternalMyDsl.g:212:4: (lv_tipo_8_0= ruleTipoProceso )
            {
            // InternalMyDsl.g:212:4: (lv_tipo_8_0= ruleTipoProceso )
            // InternalMyDsl.g:213:5: lv_tipo_8_0= ruleTipoProceso
            {

            					newCompositeNode(grammarAccess.getProcesoAccess().getTipoTipoProcesoParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_tipo_8_0=ruleTipoProceso();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProcesoRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_8_0,
            						"org.xtext.example.mydsl.MyDsl.TipoProceso");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProceso"


    // $ANTLR start "entryRuleTipoProceso"
    // InternalMyDsl.g:234:1: entryRuleTipoProceso returns [String current=null] : iv_ruleTipoProceso= ruleTipoProceso EOF ;
    public final String entryRuleTipoProceso() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoProceso = null;


        try {
            // InternalMyDsl.g:234:51: (iv_ruleTipoProceso= ruleTipoProceso EOF )
            // InternalMyDsl.g:235:2: iv_ruleTipoProceso= ruleTipoProceso EOF
            {
             newCompositeNode(grammarAccess.getTipoProcesoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoProceso=ruleTipoProceso();

            state._fsp--;

             current =iv_ruleTipoProceso.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoProceso"


    // $ANTLR start "ruleTipoProceso"
    // InternalMyDsl.g:241:1: ruleTipoProceso returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Maquina_0= ruleMaquina | this_Material_1= ruleMaterial ) ;
    public final AntlrDatatypeRuleToken ruleTipoProceso() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Maquina_0 = null;

        AntlrDatatypeRuleToken this_Material_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:247:2: ( (this_Maquina_0= ruleMaquina | this_Material_1= ruleMaterial ) )
            // InternalMyDsl.g:248:2: (this_Maquina_0= ruleMaquina | this_Material_1= ruleMaterial )
            {
            // InternalMyDsl.g:248:2: (this_Maquina_0= ruleMaquina | this_Material_1= ruleMaterial )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:249:3: this_Maquina_0= ruleMaquina
                    {

                    			newCompositeNode(grammarAccess.getTipoProcesoAccess().getMaquinaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Maquina_0=ruleMaquina();

                    state._fsp--;


                    			current.merge(this_Maquina_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:260:3: this_Material_1= ruleMaterial
                    {

                    			newCompositeNode(grammarAccess.getTipoProcesoAccess().getMaterialParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Material_1=ruleMaterial();

                    state._fsp--;


                    			current.merge(this_Material_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoProceso"


    // $ANTLR start "entryRuleCreacion"
    // InternalMyDsl.g:274:1: entryRuleCreacion returns [EObject current=null] : iv_ruleCreacion= ruleCreacion EOF ;
    public final EObject entryRuleCreacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreacion = null;


        try {
            // InternalMyDsl.g:274:49: (iv_ruleCreacion= ruleCreacion EOF )
            // InternalMyDsl.g:275:2: iv_ruleCreacion= ruleCreacion EOF
            {
             newCompositeNode(grammarAccess.getCreacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreacion=ruleCreacion();

            state._fsp--;

             current =iv_ruleCreacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreacion"


    // $ANTLR start "ruleCreacion"
    // InternalMyDsl.g:281:1: ruleCreacion returns [EObject current=null] : (otherlv_0= 'Crear' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) ) ) ;
    public final EObject ruleCreacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_potencia_3_0=null;
        Token lv_grosor_5_0=null;
        AntlrDatatypeRuleToken lv_sustantivo_1_0 = null;

        AntlrDatatypeRuleToken lv_tipoMaquina_2_0 = null;

        AntlrDatatypeRuleToken lv_tipoMaterial_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:287:2: ( (otherlv_0= 'Crear' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) ) ) )
            // InternalMyDsl.g:288:2: (otherlv_0= 'Crear' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) ) )
            {
            // InternalMyDsl.g:288:2: (otherlv_0= 'Crear' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) ) )
            // InternalMyDsl.g:289:3: otherlv_0= 'Crear' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCreacionAccess().getCrearKeyword_0());
            		
            // InternalMyDsl.g:293:3: ( (lv_sustantivo_1_0= ruleTipoProceso ) )
            // InternalMyDsl.g:294:4: (lv_sustantivo_1_0= ruleTipoProceso )
            {
            // InternalMyDsl.g:294:4: (lv_sustantivo_1_0= ruleTipoProceso )
            // InternalMyDsl.g:295:5: lv_sustantivo_1_0= ruleTipoProceso
            {

            					newCompositeNode(grammarAccess.getCreacionAccess().getSustantivoTipoProcesoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_sustantivo_1_0=ruleTipoProceso();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreacionRule());
            					}
            					set(
            						current,
            						"sustantivo",
            						lv_sustantivo_1_0,
            						"org.xtext.example.mydsl.MyDsl.TipoProceso");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:312:3: ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=20 && LA4_0<=22)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=25 && LA4_0<=27)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:313:4: ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:313:4: ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) )
                    // InternalMyDsl.g:314:5: ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:314:5: ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) )
                    // InternalMyDsl.g:315:6: (lv_tipoMaquina_2_0= ruleTipoMaquina )
                    {
                    // InternalMyDsl.g:315:6: (lv_tipoMaquina_2_0= ruleTipoMaquina )
                    // InternalMyDsl.g:316:7: lv_tipoMaquina_2_0= ruleTipoMaquina
                    {

                    							newCompositeNode(grammarAccess.getCreacionAccess().getTipoMaquinaTipoMaquinaParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_tipoMaquina_2_0=ruleTipoMaquina();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCreacionRule());
                    							}
                    							set(
                    								current,
                    								"tipoMaquina",
                    								lv_tipoMaquina_2_0,
                    								"org.xtext.example.mydsl.MyDsl.TipoMaquina");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDsl.g:333:5: ( (lv_potencia_3_0= RULE_INT ) )
                    // InternalMyDsl.g:334:6: (lv_potencia_3_0= RULE_INT )
                    {
                    // InternalMyDsl.g:334:6: (lv_potencia_3_0= RULE_INT )
                    // InternalMyDsl.g:335:7: lv_potencia_3_0= RULE_INT
                    {
                    lv_potencia_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    							newLeafNode(lv_potencia_3_0, grammarAccess.getCreacionAccess().getPotenciaINTTerminalRuleCall_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCreacionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"potencia",
                    								lv_potencia_3_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:353:4: ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:353:4: ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) )
                    // InternalMyDsl.g:354:5: ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:354:5: ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) )
                    // InternalMyDsl.g:355:6: (lv_tipoMaterial_4_0= ruleTipoMaterial )
                    {
                    // InternalMyDsl.g:355:6: (lv_tipoMaterial_4_0= ruleTipoMaterial )
                    // InternalMyDsl.g:356:7: lv_tipoMaterial_4_0= ruleTipoMaterial
                    {

                    							newCompositeNode(grammarAccess.getCreacionAccess().getTipoMaterialTipoMaterialParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_tipoMaterial_4_0=ruleTipoMaterial();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCreacionRule());
                    							}
                    							set(
                    								current,
                    								"tipoMaterial",
                    								lv_tipoMaterial_4_0,
                    								"org.xtext.example.mydsl.MyDsl.TipoMaterial");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDsl.g:373:5: ( (lv_grosor_5_0= RULE_INT ) )
                    // InternalMyDsl.g:374:6: (lv_grosor_5_0= RULE_INT )
                    {
                    // InternalMyDsl.g:374:6: (lv_grosor_5_0= RULE_INT )
                    // InternalMyDsl.g:375:7: lv_grosor_5_0= RULE_INT
                    {
                    lv_grosor_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    							newLeafNode(lv_grosor_5_0, grammarAccess.getCreacionAccess().getGrosorINTTerminalRuleCall_2_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCreacionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"grosor",
                    								lv_grosor_5_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreacion"


    // $ANTLR start "entryRuleConsulta"
    // InternalMyDsl.g:397:1: entryRuleConsulta returns [EObject current=null] : iv_ruleConsulta= ruleConsulta EOF ;
    public final EObject entryRuleConsulta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsulta = null;


        try {
            // InternalMyDsl.g:397:49: (iv_ruleConsulta= ruleConsulta EOF )
            // InternalMyDsl.g:398:2: iv_ruleConsulta= ruleConsulta EOF
            {
             newCompositeNode(grammarAccess.getConsultaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConsulta=ruleConsulta();

            state._fsp--;

             current =iv_ruleConsulta; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConsulta"


    // $ANTLR start "ruleConsulta"
    // InternalMyDsl.g:404:1: ruleConsulta returns [EObject current=null] : (otherlv_0= 'Consultar' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) ) ( (lv_verbo_6_0= ruleVerbo ) ) ) ;
    public final EObject ruleConsulta() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_potencia_3_0=null;
        Token lv_grosor_5_0=null;
        AntlrDatatypeRuleToken lv_sustantivo_1_0 = null;

        AntlrDatatypeRuleToken lv_tipoMaquina_2_0 = null;

        AntlrDatatypeRuleToken lv_tipoMaterial_4_0 = null;

        AntlrDatatypeRuleToken lv_verbo_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:410:2: ( (otherlv_0= 'Consultar' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) ) ( (lv_verbo_6_0= ruleVerbo ) ) ) )
            // InternalMyDsl.g:411:2: (otherlv_0= 'Consultar' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) ) ( (lv_verbo_6_0= ruleVerbo ) ) )
            {
            // InternalMyDsl.g:411:2: (otherlv_0= 'Consultar' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) ) ( (lv_verbo_6_0= ruleVerbo ) ) )
            // InternalMyDsl.g:412:3: otherlv_0= 'Consultar' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) ) ( (lv_verbo_6_0= ruleVerbo ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConsultaAccess().getConsultarKeyword_0());
            		
            // InternalMyDsl.g:416:3: ( (lv_sustantivo_1_0= ruleTipoProceso ) )
            // InternalMyDsl.g:417:4: (lv_sustantivo_1_0= ruleTipoProceso )
            {
            // InternalMyDsl.g:417:4: (lv_sustantivo_1_0= ruleTipoProceso )
            // InternalMyDsl.g:418:5: lv_sustantivo_1_0= ruleTipoProceso
            {

            					newCompositeNode(grammarAccess.getConsultaAccess().getSustantivoTipoProcesoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_sustantivo_1_0=ruleTipoProceso();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConsultaRule());
            					}
            					set(
            						current,
            						"sustantivo",
            						lv_sustantivo_1_0,
            						"org.xtext.example.mydsl.MyDsl.TipoProceso");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:435:3: ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=20 && LA5_0<=22)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=25 && LA5_0<=27)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:436:4: ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:436:4: ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) )
                    // InternalMyDsl.g:437:5: ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:437:5: ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) )
                    // InternalMyDsl.g:438:6: (lv_tipoMaquina_2_0= ruleTipoMaquina )
                    {
                    // InternalMyDsl.g:438:6: (lv_tipoMaquina_2_0= ruleTipoMaquina )
                    // InternalMyDsl.g:439:7: lv_tipoMaquina_2_0= ruleTipoMaquina
                    {

                    							newCompositeNode(grammarAccess.getConsultaAccess().getTipoMaquinaTipoMaquinaParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_tipoMaquina_2_0=ruleTipoMaquina();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConsultaRule());
                    							}
                    							set(
                    								current,
                    								"tipoMaquina",
                    								lv_tipoMaquina_2_0,
                    								"org.xtext.example.mydsl.MyDsl.TipoMaquina");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDsl.g:456:5: ( (lv_potencia_3_0= RULE_INT ) )
                    // InternalMyDsl.g:457:6: (lv_potencia_3_0= RULE_INT )
                    {
                    // InternalMyDsl.g:457:6: (lv_potencia_3_0= RULE_INT )
                    // InternalMyDsl.g:458:7: lv_potencia_3_0= RULE_INT
                    {
                    lv_potencia_3_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    							newLeafNode(lv_potencia_3_0, grammarAccess.getConsultaAccess().getPotenciaINTTerminalRuleCall_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConsultaRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"potencia",
                    								lv_potencia_3_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:476:4: ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:476:4: ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) )
                    // InternalMyDsl.g:477:5: ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:477:5: ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) )
                    // InternalMyDsl.g:478:6: (lv_tipoMaterial_4_0= ruleTipoMaterial )
                    {
                    // InternalMyDsl.g:478:6: (lv_tipoMaterial_4_0= ruleTipoMaterial )
                    // InternalMyDsl.g:479:7: lv_tipoMaterial_4_0= ruleTipoMaterial
                    {

                    							newCompositeNode(grammarAccess.getConsultaAccess().getTipoMaterialTipoMaterialParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_tipoMaterial_4_0=ruleTipoMaterial();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getConsultaRule());
                    							}
                    							set(
                    								current,
                    								"tipoMaterial",
                    								lv_tipoMaterial_4_0,
                    								"org.xtext.example.mydsl.MyDsl.TipoMaterial");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDsl.g:496:5: ( (lv_grosor_5_0= RULE_INT ) )
                    // InternalMyDsl.g:497:6: (lv_grosor_5_0= RULE_INT )
                    {
                    // InternalMyDsl.g:497:6: (lv_grosor_5_0= RULE_INT )
                    // InternalMyDsl.g:498:7: lv_grosor_5_0= RULE_INT
                    {
                    lv_grosor_5_0=(Token)match(input,RULE_INT,FOLLOW_11); 

                    							newLeafNode(lv_grosor_5_0, grammarAccess.getConsultaAccess().getGrosorINTTerminalRuleCall_2_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConsultaRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"grosor",
                    								lv_grosor_5_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:516:3: ( (lv_verbo_6_0= ruleVerbo ) )
            // InternalMyDsl.g:517:4: (lv_verbo_6_0= ruleVerbo )
            {
            // InternalMyDsl.g:517:4: (lv_verbo_6_0= ruleVerbo )
            // InternalMyDsl.g:518:5: lv_verbo_6_0= ruleVerbo
            {

            					newCompositeNode(grammarAccess.getConsultaAccess().getVerboVerboParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_verbo_6_0=ruleVerbo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConsultaRule());
            					}
            					set(
            						current,
            						"verbo",
            						lv_verbo_6_0,
            						"org.xtext.example.mydsl.MyDsl.Verbo");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConsulta"


    // $ANTLR start "entryRuleEliminacion"
    // InternalMyDsl.g:539:1: entryRuleEliminacion returns [EObject current=null] : iv_ruleEliminacion= ruleEliminacion EOF ;
    public final EObject entryRuleEliminacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEliminacion = null;


        try {
            // InternalMyDsl.g:539:52: (iv_ruleEliminacion= ruleEliminacion EOF )
            // InternalMyDsl.g:540:2: iv_ruleEliminacion= ruleEliminacion EOF
            {
             newCompositeNode(grammarAccess.getEliminacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEliminacion=ruleEliminacion();

            state._fsp--;

             current =iv_ruleEliminacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEliminacion"


    // $ANTLR start "ruleEliminacion"
    // InternalMyDsl.g:546:1: ruleEliminacion returns [EObject current=null] : (otherlv_0= 'Eliminar' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) ) ) ;
    public final EObject ruleEliminacion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_potencia_3_0=null;
        Token lv_grosor_5_0=null;
        AntlrDatatypeRuleToken lv_sustantivo_1_0 = null;

        AntlrDatatypeRuleToken lv_tipoMaquina_2_0 = null;

        AntlrDatatypeRuleToken lv_tipoMaterial_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:552:2: ( (otherlv_0= 'Eliminar' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) ) ) )
            // InternalMyDsl.g:553:2: (otherlv_0= 'Eliminar' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) ) )
            {
            // InternalMyDsl.g:553:2: (otherlv_0= 'Eliminar' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) ) )
            // InternalMyDsl.g:554:3: otherlv_0= 'Eliminar' ( (lv_sustantivo_1_0= ruleTipoProceso ) ) ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEliminacionAccess().getEliminarKeyword_0());
            		
            // InternalMyDsl.g:558:3: ( (lv_sustantivo_1_0= ruleTipoProceso ) )
            // InternalMyDsl.g:559:4: (lv_sustantivo_1_0= ruleTipoProceso )
            {
            // InternalMyDsl.g:559:4: (lv_sustantivo_1_0= ruleTipoProceso )
            // InternalMyDsl.g:560:5: lv_sustantivo_1_0= ruleTipoProceso
            {

            					newCompositeNode(grammarAccess.getEliminacionAccess().getSustantivoTipoProcesoParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_sustantivo_1_0=ruleTipoProceso();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEliminacionRule());
            					}
            					set(
            						current,
            						"sustantivo",
            						lv_sustantivo_1_0,
            						"org.xtext.example.mydsl.MyDsl.TipoProceso");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:577:3: ( ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) ) | ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=20 && LA6_0<=22)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=25 && LA6_0<=27)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:578:4: ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:578:4: ( ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) ) )
                    // InternalMyDsl.g:579:5: ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) ) ( (lv_potencia_3_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:579:5: ( (lv_tipoMaquina_2_0= ruleTipoMaquina ) )
                    // InternalMyDsl.g:580:6: (lv_tipoMaquina_2_0= ruleTipoMaquina )
                    {
                    // InternalMyDsl.g:580:6: (lv_tipoMaquina_2_0= ruleTipoMaquina )
                    // InternalMyDsl.g:581:7: lv_tipoMaquina_2_0= ruleTipoMaquina
                    {

                    							newCompositeNode(grammarAccess.getEliminacionAccess().getTipoMaquinaTipoMaquinaParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_tipoMaquina_2_0=ruleTipoMaquina();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEliminacionRule());
                    							}
                    							set(
                    								current,
                    								"tipoMaquina",
                    								lv_tipoMaquina_2_0,
                    								"org.xtext.example.mydsl.MyDsl.TipoMaquina");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDsl.g:598:5: ( (lv_potencia_3_0= RULE_INT ) )
                    // InternalMyDsl.g:599:6: (lv_potencia_3_0= RULE_INT )
                    {
                    // InternalMyDsl.g:599:6: (lv_potencia_3_0= RULE_INT )
                    // InternalMyDsl.g:600:7: lv_potencia_3_0= RULE_INT
                    {
                    lv_potencia_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    							newLeafNode(lv_potencia_3_0, grammarAccess.getEliminacionAccess().getPotenciaINTTerminalRuleCall_2_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEliminacionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"potencia",
                    								lv_potencia_3_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:618:4: ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) )
                    {
                    // InternalMyDsl.g:618:4: ( ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) ) )
                    // InternalMyDsl.g:619:5: ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) ) ( (lv_grosor_5_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:619:5: ( (lv_tipoMaterial_4_0= ruleTipoMaterial ) )
                    // InternalMyDsl.g:620:6: (lv_tipoMaterial_4_0= ruleTipoMaterial )
                    {
                    // InternalMyDsl.g:620:6: (lv_tipoMaterial_4_0= ruleTipoMaterial )
                    // InternalMyDsl.g:621:7: lv_tipoMaterial_4_0= ruleTipoMaterial
                    {

                    							newCompositeNode(grammarAccess.getEliminacionAccess().getTipoMaterialTipoMaterialParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_tipoMaterial_4_0=ruleTipoMaterial();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEliminacionRule());
                    							}
                    							set(
                    								current,
                    								"tipoMaterial",
                    								lv_tipoMaterial_4_0,
                    								"org.xtext.example.mydsl.MyDsl.TipoMaterial");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDsl.g:638:5: ( (lv_grosor_5_0= RULE_INT ) )
                    // InternalMyDsl.g:639:6: (lv_grosor_5_0= RULE_INT )
                    {
                    // InternalMyDsl.g:639:6: (lv_grosor_5_0= RULE_INT )
                    // InternalMyDsl.g:640:7: lv_grosor_5_0= RULE_INT
                    {
                    lv_grosor_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    							newLeafNode(lv_grosor_5_0, grammarAccess.getEliminacionAccess().getGrosorINTTerminalRuleCall_2_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEliminacionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"grosor",
                    								lv_grosor_5_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEliminacion"


    // $ANTLR start "entryRuleMaquina"
    // InternalMyDsl.g:662:1: entryRuleMaquina returns [String current=null] : iv_ruleMaquina= ruleMaquina EOF ;
    public final String entryRuleMaquina() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaquina = null;


        try {
            // InternalMyDsl.g:662:47: (iv_ruleMaquina= ruleMaquina EOF )
            // InternalMyDsl.g:663:2: iv_ruleMaquina= ruleMaquina EOF
            {
             newCompositeNode(grammarAccess.getMaquinaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaquina=ruleMaquina();

            state._fsp--;

             current =iv_ruleMaquina.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaquina"


    // $ANTLR start "ruleMaquina"
    // InternalMyDsl.g:669:1: ruleMaquina returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Maquina' ;
    public final AntlrDatatypeRuleToken ruleMaquina() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:675:2: (kw= 'Maquina' )
            // InternalMyDsl.g:676:2: kw= 'Maquina'
            {
            kw=(Token)match(input,18,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMaquinaAccess().getMaquinaKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaquina"


    // $ANTLR start "entryRuleMaterial"
    // InternalMyDsl.g:684:1: entryRuleMaterial returns [String current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final String entryRuleMaterial() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaterial = null;


        try {
            // InternalMyDsl.g:684:48: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalMyDsl.g:685:2: iv_ruleMaterial= ruleMaterial EOF
            {
             newCompositeNode(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaterial=ruleMaterial();

            state._fsp--;

             current =iv_ruleMaterial.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalMyDsl.g:691:1: ruleMaterial returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Material' ;
    public final AntlrDatatypeRuleToken ruleMaterial() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:697:2: (kw= 'Material' )
            // InternalMyDsl.g:698:2: kw= 'Material'
            {
            kw=(Token)match(input,19,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getMaterialAccess().getMaterialKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleTipoMaquina"
    // InternalMyDsl.g:706:1: entryRuleTipoMaquina returns [String current=null] : iv_ruleTipoMaquina= ruleTipoMaquina EOF ;
    public final String entryRuleTipoMaquina() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoMaquina = null;


        try {
            // InternalMyDsl.g:706:51: (iv_ruleTipoMaquina= ruleTipoMaquina EOF )
            // InternalMyDsl.g:707:2: iv_ruleTipoMaquina= ruleTipoMaquina EOF
            {
             newCompositeNode(grammarAccess.getTipoMaquinaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoMaquina=ruleTipoMaquina();

            state._fsp--;

             current =iv_ruleTipoMaquina.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoMaquina"


    // $ANTLR start "ruleTipoMaquina"
    // InternalMyDsl.g:713:1: ruleTipoMaquina returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'CO2' | kw= 'Fibra' | kw= 'Vidrio' ) ;
    public final AntlrDatatypeRuleToken ruleTipoMaquina() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:719:2: ( (kw= 'CO2' | kw= 'Fibra' | kw= 'Vidrio' ) )
            // InternalMyDsl.g:720:2: (kw= 'CO2' | kw= 'Fibra' | kw= 'Vidrio' )
            {
            // InternalMyDsl.g:720:2: (kw= 'CO2' | kw= 'Fibra' | kw= 'Vidrio' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:721:3: kw= 'CO2'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMaquinaAccess().getCO2Keyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:727:3: kw= 'Fibra'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMaquinaAccess().getFibraKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:733:3: kw= 'Vidrio'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMaquinaAccess().getVidrioKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoMaquina"


    // $ANTLR start "entryRuleVerbo"
    // InternalMyDsl.g:742:1: entryRuleVerbo returns [String current=null] : iv_ruleVerbo= ruleVerbo EOF ;
    public final String entryRuleVerbo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerbo = null;


        try {
            // InternalMyDsl.g:742:45: (iv_ruleVerbo= ruleVerbo EOF )
            // InternalMyDsl.g:743:2: iv_ruleVerbo= ruleVerbo EOF
            {
             newCompositeNode(grammarAccess.getVerboRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerbo=ruleVerbo();

            state._fsp--;

             current =iv_ruleVerbo.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerbo"


    // $ANTLR start "ruleVerbo"
    // InternalMyDsl.g:749:1: ruleVerbo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'cortar' | kw= 'grabar' ) ;
    public final AntlrDatatypeRuleToken ruleVerbo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:755:2: ( (kw= 'cortar' | kw= 'grabar' ) )
            // InternalMyDsl.g:756:2: (kw= 'cortar' | kw= 'grabar' )
            {
            // InternalMyDsl.g:756:2: (kw= 'cortar' | kw= 'grabar' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:757:3: kw= 'cortar'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboAccess().getCortarKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:763:3: kw= 'grabar'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getVerboAccess().getGrabarKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerbo"


    // $ANTLR start "entryRuleTipoMaterial"
    // InternalMyDsl.g:772:1: entryRuleTipoMaterial returns [String current=null] : iv_ruleTipoMaterial= ruleTipoMaterial EOF ;
    public final String entryRuleTipoMaterial() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipoMaterial = null;


        try {
            // InternalMyDsl.g:772:52: (iv_ruleTipoMaterial= ruleTipoMaterial EOF )
            // InternalMyDsl.g:773:2: iv_ruleTipoMaterial= ruleTipoMaterial EOF
            {
             newCompositeNode(grammarAccess.getTipoMaterialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipoMaterial=ruleTipoMaterial();

            state._fsp--;

             current =iv_ruleTipoMaterial.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipoMaterial"


    // $ANTLR start "ruleTipoMaterial"
    // InternalMyDsl.g:779:1: ruleTipoMaterial returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Madera' | kw= 'MDF' | kw= 'Metal' ) ;
    public final AntlrDatatypeRuleToken ruleTipoMaterial() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:785:2: ( (kw= 'Madera' | kw= 'MDF' | kw= 'Metal' ) )
            // InternalMyDsl.g:786:2: (kw= 'Madera' | kw= 'MDF' | kw= 'Metal' )
            {
            // InternalMyDsl.g:786:2: (kw= 'Madera' | kw= 'MDF' | kw= 'Metal' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:787:3: kw= 'Madera'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMaterialAccess().getMaderaKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:793:3: kw= 'MDF'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMaterialAccess().getMDFKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:799:3: kw= 'Metal'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoMaterialAccess().getMetalKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipoMaterial"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000E700000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001800000L});

}