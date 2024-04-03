package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Maquina'", "'Material'", "'CO2'", "'Fibra'", "'Vidrio'", "'cortar'", "'grabar'", "'Madera'", "'MDF'", "'Metal'", "'Procesar'", "'{'", "'}'", "'Concluir'", "'Crear'", "'Consultar'", "'Eliminar'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__ProcesosAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__ProcesosAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__ProcesosAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__ProcesosAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__ProcesosAssignment )*
            {
             before(grammarAccess.getModelAccess().getProcesosAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__ProcesosAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==21) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__ProcesosAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ProcesosAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getProcesosAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProceso"
    // InternalMyDsl.g:78:1: entryRuleProceso : ruleProceso EOF ;
    public final void entryRuleProceso() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleProceso EOF )
            // InternalMyDsl.g:80:1: ruleProceso EOF
            {
             before(grammarAccess.getProcesoRule()); 
            pushFollow(FOLLOW_1);
            ruleProceso();

            state._fsp--;

             after(grammarAccess.getProcesoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProceso"


    // $ANTLR start "ruleProceso"
    // InternalMyDsl.g:87:1: ruleProceso : ( ( rule__Proceso__Group__0 ) ) ;
    public final void ruleProceso() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Proceso__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Proceso__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Proceso__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Proceso__Group__0 )
            {
             before(grammarAccess.getProcesoAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Proceso__Group__0 )
            // InternalMyDsl.g:94:4: rule__Proceso__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Proceso__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcesoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProceso"


    // $ANTLR start "entryRuleTipoProceso"
    // InternalMyDsl.g:103:1: entryRuleTipoProceso : ruleTipoProceso EOF ;
    public final void entryRuleTipoProceso() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleTipoProceso EOF )
            // InternalMyDsl.g:105:1: ruleTipoProceso EOF
            {
             before(grammarAccess.getTipoProcesoRule()); 
            pushFollow(FOLLOW_1);
            ruleTipoProceso();

            state._fsp--;

             after(grammarAccess.getTipoProcesoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTipoProceso"


    // $ANTLR start "ruleTipoProceso"
    // InternalMyDsl.g:112:1: ruleTipoProceso : ( ( rule__TipoProceso__Alternatives ) ) ;
    public final void ruleTipoProceso() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__TipoProceso__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__TipoProceso__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__TipoProceso__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__TipoProceso__Alternatives )
            {
             before(grammarAccess.getTipoProcesoAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__TipoProceso__Alternatives )
            // InternalMyDsl.g:119:4: rule__TipoProceso__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoProceso__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoProcesoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoProceso"


    // $ANTLR start "entryRuleCreacion"
    // InternalMyDsl.g:128:1: entryRuleCreacion : ruleCreacion EOF ;
    public final void entryRuleCreacion() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleCreacion EOF )
            // InternalMyDsl.g:130:1: ruleCreacion EOF
            {
             before(grammarAccess.getCreacionRule()); 
            pushFollow(FOLLOW_1);
            ruleCreacion();

            state._fsp--;

             after(grammarAccess.getCreacionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCreacion"


    // $ANTLR start "ruleCreacion"
    // InternalMyDsl.g:137:1: ruleCreacion : ( ( rule__Creacion__Group__0 ) ) ;
    public final void ruleCreacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Creacion__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Creacion__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Creacion__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Creacion__Group__0 )
            {
             before(grammarAccess.getCreacionAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Creacion__Group__0 )
            // InternalMyDsl.g:144:4: rule__Creacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Creacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCreacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCreacion"


    // $ANTLR start "entryRuleConsulta"
    // InternalMyDsl.g:153:1: entryRuleConsulta : ruleConsulta EOF ;
    public final void entryRuleConsulta() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleConsulta EOF )
            // InternalMyDsl.g:155:1: ruleConsulta EOF
            {
             before(grammarAccess.getConsultaRule()); 
            pushFollow(FOLLOW_1);
            ruleConsulta();

            state._fsp--;

             after(grammarAccess.getConsultaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConsulta"


    // $ANTLR start "ruleConsulta"
    // InternalMyDsl.g:162:1: ruleConsulta : ( ( rule__Consulta__Group__0 ) ) ;
    public final void ruleConsulta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Consulta__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Consulta__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Consulta__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Consulta__Group__0 )
            {
             before(grammarAccess.getConsultaAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Consulta__Group__0 )
            // InternalMyDsl.g:169:4: rule__Consulta__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Consulta__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConsultaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConsulta"


    // $ANTLR start "entryRuleEliminacion"
    // InternalMyDsl.g:178:1: entryRuleEliminacion : ruleEliminacion EOF ;
    public final void entryRuleEliminacion() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleEliminacion EOF )
            // InternalMyDsl.g:180:1: ruleEliminacion EOF
            {
             before(grammarAccess.getEliminacionRule()); 
            pushFollow(FOLLOW_1);
            ruleEliminacion();

            state._fsp--;

             after(grammarAccess.getEliminacionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEliminacion"


    // $ANTLR start "ruleEliminacion"
    // InternalMyDsl.g:187:1: ruleEliminacion : ( ( rule__Eliminacion__Group__0 ) ) ;
    public final void ruleEliminacion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Eliminacion__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Eliminacion__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Eliminacion__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Eliminacion__Group__0 )
            {
             before(grammarAccess.getEliminacionAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Eliminacion__Group__0 )
            // InternalMyDsl.g:194:4: rule__Eliminacion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Eliminacion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEliminacionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEliminacion"


    // $ANTLR start "entryRuleMaquina"
    // InternalMyDsl.g:203:1: entryRuleMaquina : ruleMaquina EOF ;
    public final void entryRuleMaquina() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleMaquina EOF )
            // InternalMyDsl.g:205:1: ruleMaquina EOF
            {
             before(grammarAccess.getMaquinaRule()); 
            pushFollow(FOLLOW_1);
            ruleMaquina();

            state._fsp--;

             after(grammarAccess.getMaquinaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaquina"


    // $ANTLR start "ruleMaquina"
    // InternalMyDsl.g:212:1: ruleMaquina : ( 'Maquina' ) ;
    public final void ruleMaquina() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( 'Maquina' ) )
            // InternalMyDsl.g:217:2: ( 'Maquina' )
            {
            // InternalMyDsl.g:217:2: ( 'Maquina' )
            // InternalMyDsl.g:218:3: 'Maquina'
            {
             before(grammarAccess.getMaquinaAccess().getMaquinaKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMaquinaAccess().getMaquinaKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaquina"


    // $ANTLR start "entryRuleMaterial"
    // InternalMyDsl.g:228:1: entryRuleMaterial : ruleMaterial EOF ;
    public final void entryRuleMaterial() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleMaterial EOF )
            // InternalMyDsl.g:230:1: ruleMaterial EOF
            {
             before(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getMaterialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalMyDsl.g:237:1: ruleMaterial : ( 'Material' ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( 'Material' ) )
            // InternalMyDsl.g:242:2: ( 'Material' )
            {
            // InternalMyDsl.g:242:2: ( 'Material' )
            // InternalMyDsl.g:243:3: 'Material'
            {
             before(grammarAccess.getMaterialAccess().getMaterialKeyword()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMaterialAccess().getMaterialKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "entryRuleTipoMaquina"
    // InternalMyDsl.g:253:1: entryRuleTipoMaquina : ruleTipoMaquina EOF ;
    public final void entryRuleTipoMaquina() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleTipoMaquina EOF )
            // InternalMyDsl.g:255:1: ruleTipoMaquina EOF
            {
             before(grammarAccess.getTipoMaquinaRule()); 
            pushFollow(FOLLOW_1);
            ruleTipoMaquina();

            state._fsp--;

             after(grammarAccess.getTipoMaquinaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTipoMaquina"


    // $ANTLR start "ruleTipoMaquina"
    // InternalMyDsl.g:262:1: ruleTipoMaquina : ( ( rule__TipoMaquina__Alternatives ) ) ;
    public final void ruleTipoMaquina() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__TipoMaquina__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__TipoMaquina__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__TipoMaquina__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__TipoMaquina__Alternatives )
            {
             before(grammarAccess.getTipoMaquinaAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__TipoMaquina__Alternatives )
            // InternalMyDsl.g:269:4: rule__TipoMaquina__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoMaquina__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoMaquinaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoMaquina"


    // $ANTLR start "entryRuleVerbo"
    // InternalMyDsl.g:278:1: entryRuleVerbo : ruleVerbo EOF ;
    public final void entryRuleVerbo() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleVerbo EOF )
            // InternalMyDsl.g:280:1: ruleVerbo EOF
            {
             before(grammarAccess.getVerboRule()); 
            pushFollow(FOLLOW_1);
            ruleVerbo();

            state._fsp--;

             after(grammarAccess.getVerboRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerbo"


    // $ANTLR start "ruleVerbo"
    // InternalMyDsl.g:287:1: ruleVerbo : ( ( rule__Verbo__Alternatives ) ) ;
    public final void ruleVerbo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Verbo__Alternatives ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Verbo__Alternatives ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Verbo__Alternatives ) )
            // InternalMyDsl.g:293:3: ( rule__Verbo__Alternatives )
            {
             before(grammarAccess.getVerboAccess().getAlternatives()); 
            // InternalMyDsl.g:294:3: ( rule__Verbo__Alternatives )
            // InternalMyDsl.g:294:4: rule__Verbo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Verbo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVerboAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerbo"


    // $ANTLR start "entryRuleTipoMaterial"
    // InternalMyDsl.g:303:1: entryRuleTipoMaterial : ruleTipoMaterial EOF ;
    public final void entryRuleTipoMaterial() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleTipoMaterial EOF )
            // InternalMyDsl.g:305:1: ruleTipoMaterial EOF
            {
             before(grammarAccess.getTipoMaterialRule()); 
            pushFollow(FOLLOW_1);
            ruleTipoMaterial();

            state._fsp--;

             after(grammarAccess.getTipoMaterialRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTipoMaterial"


    // $ANTLR start "ruleTipoMaterial"
    // InternalMyDsl.g:312:1: ruleTipoMaterial : ( ( rule__TipoMaterial__Alternatives ) ) ;
    public final void ruleTipoMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__TipoMaterial__Alternatives ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__TipoMaterial__Alternatives ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__TipoMaterial__Alternatives ) )
            // InternalMyDsl.g:318:3: ( rule__TipoMaterial__Alternatives )
            {
             before(grammarAccess.getTipoMaterialAccess().getAlternatives()); 
            // InternalMyDsl.g:319:3: ( rule__TipoMaterial__Alternatives )
            // InternalMyDsl.g:319:4: rule__TipoMaterial__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoMaterial__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoMaterialAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoMaterial"


    // $ANTLR start "rule__Proceso__Alternatives_3"
    // InternalMyDsl.g:327:1: rule__Proceso__Alternatives_3 : ( ( ( rule__Proceso__CreacionAssignment_3_0 ) ) | ( ( rule__Proceso__ConsultaAssignment_3_1 ) ) | ( ( rule__Proceso__EliminacionAssignment_3_2 ) ) );
    public final void rule__Proceso__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:331:1: ( ( ( rule__Proceso__CreacionAssignment_3_0 ) ) | ( ( rule__Proceso__ConsultaAssignment_3_1 ) ) | ( ( rule__Proceso__EliminacionAssignment_3_2 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
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
                    // InternalMyDsl.g:332:2: ( ( rule__Proceso__CreacionAssignment_3_0 ) )
                    {
                    // InternalMyDsl.g:332:2: ( ( rule__Proceso__CreacionAssignment_3_0 ) )
                    // InternalMyDsl.g:333:3: ( rule__Proceso__CreacionAssignment_3_0 )
                    {
                     before(grammarAccess.getProcesoAccess().getCreacionAssignment_3_0()); 
                    // InternalMyDsl.g:334:3: ( rule__Proceso__CreacionAssignment_3_0 )
                    // InternalMyDsl.g:334:4: rule__Proceso__CreacionAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Proceso__CreacionAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcesoAccess().getCreacionAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:338:2: ( ( rule__Proceso__ConsultaAssignment_3_1 ) )
                    {
                    // InternalMyDsl.g:338:2: ( ( rule__Proceso__ConsultaAssignment_3_1 ) )
                    // InternalMyDsl.g:339:3: ( rule__Proceso__ConsultaAssignment_3_1 )
                    {
                     before(grammarAccess.getProcesoAccess().getConsultaAssignment_3_1()); 
                    // InternalMyDsl.g:340:3: ( rule__Proceso__ConsultaAssignment_3_1 )
                    // InternalMyDsl.g:340:4: rule__Proceso__ConsultaAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Proceso__ConsultaAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcesoAccess().getConsultaAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:344:2: ( ( rule__Proceso__EliminacionAssignment_3_2 ) )
                    {
                    // InternalMyDsl.g:344:2: ( ( rule__Proceso__EliminacionAssignment_3_2 ) )
                    // InternalMyDsl.g:345:3: ( rule__Proceso__EliminacionAssignment_3_2 )
                    {
                     before(grammarAccess.getProcesoAccess().getEliminacionAssignment_3_2()); 
                    // InternalMyDsl.g:346:3: ( rule__Proceso__EliminacionAssignment_3_2 )
                    // InternalMyDsl.g:346:4: rule__Proceso__EliminacionAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Proceso__EliminacionAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getProcesoAccess().getEliminacionAssignment_3_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Alternatives_3"


    // $ANTLR start "rule__TipoProceso__Alternatives"
    // InternalMyDsl.g:354:1: rule__TipoProceso__Alternatives : ( ( ruleMaquina ) | ( ruleMaterial ) );
    public final void rule__TipoProceso__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:358:1: ( ( ruleMaquina ) | ( ruleMaterial ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:359:2: ( ruleMaquina )
                    {
                    // InternalMyDsl.g:359:2: ( ruleMaquina )
                    // InternalMyDsl.g:360:3: ruleMaquina
                    {
                     before(grammarAccess.getTipoProcesoAccess().getMaquinaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMaquina();

                    state._fsp--;

                     after(grammarAccess.getTipoProcesoAccess().getMaquinaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:365:2: ( ruleMaterial )
                    {
                    // InternalMyDsl.g:365:2: ( ruleMaterial )
                    // InternalMyDsl.g:366:3: ruleMaterial
                    {
                     before(grammarAccess.getTipoProcesoAccess().getMaterialParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMaterial();

                    state._fsp--;

                     after(grammarAccess.getTipoProcesoAccess().getMaterialParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoProceso__Alternatives"


    // $ANTLR start "rule__Creacion__Alternatives_2"
    // InternalMyDsl.g:375:1: rule__Creacion__Alternatives_2 : ( ( ( rule__Creacion__Group_2_0__0 ) ) | ( ( rule__Creacion__Group_2_1__0 ) ) );
    public final void rule__Creacion__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:379:1: ( ( ( rule__Creacion__Group_2_0__0 ) ) | ( ( rule__Creacion__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=13 && LA4_0<=15)) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=18 && LA4_0<=20)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:380:2: ( ( rule__Creacion__Group_2_0__0 ) )
                    {
                    // InternalMyDsl.g:380:2: ( ( rule__Creacion__Group_2_0__0 ) )
                    // InternalMyDsl.g:381:3: ( rule__Creacion__Group_2_0__0 )
                    {
                     before(grammarAccess.getCreacionAccess().getGroup_2_0()); 
                    // InternalMyDsl.g:382:3: ( rule__Creacion__Group_2_0__0 )
                    // InternalMyDsl.g:382:4: rule__Creacion__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Creacion__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCreacionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:386:2: ( ( rule__Creacion__Group_2_1__0 ) )
                    {
                    // InternalMyDsl.g:386:2: ( ( rule__Creacion__Group_2_1__0 ) )
                    // InternalMyDsl.g:387:3: ( rule__Creacion__Group_2_1__0 )
                    {
                     before(grammarAccess.getCreacionAccess().getGroup_2_1()); 
                    // InternalMyDsl.g:388:3: ( rule__Creacion__Group_2_1__0 )
                    // InternalMyDsl.g:388:4: rule__Creacion__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Creacion__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCreacionAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Alternatives_2"


    // $ANTLR start "rule__Consulta__Alternatives_2"
    // InternalMyDsl.g:396:1: rule__Consulta__Alternatives_2 : ( ( ( rule__Consulta__Group_2_0__0 ) ) | ( ( rule__Consulta__Group_2_1__0 ) ) );
    public final void rule__Consulta__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:400:1: ( ( ( rule__Consulta__Group_2_0__0 ) ) | ( ( rule__Consulta__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=13 && LA5_0<=15)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=18 && LA5_0<=20)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:401:2: ( ( rule__Consulta__Group_2_0__0 ) )
                    {
                    // InternalMyDsl.g:401:2: ( ( rule__Consulta__Group_2_0__0 ) )
                    // InternalMyDsl.g:402:3: ( rule__Consulta__Group_2_0__0 )
                    {
                     before(grammarAccess.getConsultaAccess().getGroup_2_0()); 
                    // InternalMyDsl.g:403:3: ( rule__Consulta__Group_2_0__0 )
                    // InternalMyDsl.g:403:4: rule__Consulta__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Consulta__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConsultaAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:407:2: ( ( rule__Consulta__Group_2_1__0 ) )
                    {
                    // InternalMyDsl.g:407:2: ( ( rule__Consulta__Group_2_1__0 ) )
                    // InternalMyDsl.g:408:3: ( rule__Consulta__Group_2_1__0 )
                    {
                     before(grammarAccess.getConsultaAccess().getGroup_2_1()); 
                    // InternalMyDsl.g:409:3: ( rule__Consulta__Group_2_1__0 )
                    // InternalMyDsl.g:409:4: rule__Consulta__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Consulta__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConsultaAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Alternatives_2"


    // $ANTLR start "rule__Eliminacion__Alternatives_2"
    // InternalMyDsl.g:417:1: rule__Eliminacion__Alternatives_2 : ( ( ( rule__Eliminacion__Group_2_0__0 ) ) | ( ( rule__Eliminacion__Group_2_1__0 ) ) );
    public final void rule__Eliminacion__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:421:1: ( ( ( rule__Eliminacion__Group_2_0__0 ) ) | ( ( rule__Eliminacion__Group_2_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=13 && LA6_0<=15)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=18 && LA6_0<=20)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:422:2: ( ( rule__Eliminacion__Group_2_0__0 ) )
                    {
                    // InternalMyDsl.g:422:2: ( ( rule__Eliminacion__Group_2_0__0 ) )
                    // InternalMyDsl.g:423:3: ( rule__Eliminacion__Group_2_0__0 )
                    {
                     before(grammarAccess.getEliminacionAccess().getGroup_2_0()); 
                    // InternalMyDsl.g:424:3: ( rule__Eliminacion__Group_2_0__0 )
                    // InternalMyDsl.g:424:4: rule__Eliminacion__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Eliminacion__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEliminacionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:428:2: ( ( rule__Eliminacion__Group_2_1__0 ) )
                    {
                    // InternalMyDsl.g:428:2: ( ( rule__Eliminacion__Group_2_1__0 ) )
                    // InternalMyDsl.g:429:3: ( rule__Eliminacion__Group_2_1__0 )
                    {
                     before(grammarAccess.getEliminacionAccess().getGroup_2_1()); 
                    // InternalMyDsl.g:430:3: ( rule__Eliminacion__Group_2_1__0 )
                    // InternalMyDsl.g:430:4: rule__Eliminacion__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Eliminacion__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEliminacionAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Alternatives_2"


    // $ANTLR start "rule__TipoMaquina__Alternatives"
    // InternalMyDsl.g:438:1: rule__TipoMaquina__Alternatives : ( ( 'CO2' ) | ( 'Fibra' ) | ( 'Vidrio' ) );
    public final void rule__TipoMaquina__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:442:1: ( ( 'CO2' ) | ( 'Fibra' ) | ( 'Vidrio' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
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
                    // InternalMyDsl.g:443:2: ( 'CO2' )
                    {
                    // InternalMyDsl.g:443:2: ( 'CO2' )
                    // InternalMyDsl.g:444:3: 'CO2'
                    {
                     before(grammarAccess.getTipoMaquinaAccess().getCO2Keyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getTipoMaquinaAccess().getCO2Keyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:449:2: ( 'Fibra' )
                    {
                    // InternalMyDsl.g:449:2: ( 'Fibra' )
                    // InternalMyDsl.g:450:3: 'Fibra'
                    {
                     before(grammarAccess.getTipoMaquinaAccess().getFibraKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getTipoMaquinaAccess().getFibraKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:455:2: ( 'Vidrio' )
                    {
                    // InternalMyDsl.g:455:2: ( 'Vidrio' )
                    // InternalMyDsl.g:456:3: 'Vidrio'
                    {
                     before(grammarAccess.getTipoMaquinaAccess().getVidrioKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getTipoMaquinaAccess().getVidrioKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoMaquina__Alternatives"


    // $ANTLR start "rule__Verbo__Alternatives"
    // InternalMyDsl.g:465:1: rule__Verbo__Alternatives : ( ( 'cortar' ) | ( 'grabar' ) );
    public final void rule__Verbo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:469:1: ( ( 'cortar' ) | ( 'grabar' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:470:2: ( 'cortar' )
                    {
                    // InternalMyDsl.g:470:2: ( 'cortar' )
                    // InternalMyDsl.g:471:3: 'cortar'
                    {
                     before(grammarAccess.getVerboAccess().getCortarKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getVerboAccess().getCortarKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:476:2: ( 'grabar' )
                    {
                    // InternalMyDsl.g:476:2: ( 'grabar' )
                    // InternalMyDsl.g:477:3: 'grabar'
                    {
                     before(grammarAccess.getVerboAccess().getGrabarKeyword_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getVerboAccess().getGrabarKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verbo__Alternatives"


    // $ANTLR start "rule__TipoMaterial__Alternatives"
    // InternalMyDsl.g:486:1: rule__TipoMaterial__Alternatives : ( ( 'Madera' ) | ( 'MDF' ) | ( 'Metal' ) );
    public final void rule__TipoMaterial__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:490:1: ( ( 'Madera' ) | ( 'MDF' ) | ( 'Metal' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
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
                    // InternalMyDsl.g:491:2: ( 'Madera' )
                    {
                    // InternalMyDsl.g:491:2: ( 'Madera' )
                    // InternalMyDsl.g:492:3: 'Madera'
                    {
                     before(grammarAccess.getTipoMaterialAccess().getMaderaKeyword_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTipoMaterialAccess().getMaderaKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:497:2: ( 'MDF' )
                    {
                    // InternalMyDsl.g:497:2: ( 'MDF' )
                    // InternalMyDsl.g:498:3: 'MDF'
                    {
                     before(grammarAccess.getTipoMaterialAccess().getMDFKeyword_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTipoMaterialAccess().getMDFKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:503:2: ( 'Metal' )
                    {
                    // InternalMyDsl.g:503:2: ( 'Metal' )
                    // InternalMyDsl.g:504:3: 'Metal'
                    {
                     before(grammarAccess.getTipoMaterialAccess().getMetalKeyword_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getTipoMaterialAccess().getMetalKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoMaterial__Alternatives"


    // $ANTLR start "rule__Proceso__Group__0"
    // InternalMyDsl.g:513:1: rule__Proceso__Group__0 : rule__Proceso__Group__0__Impl rule__Proceso__Group__1 ;
    public final void rule__Proceso__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:517:1: ( rule__Proceso__Group__0__Impl rule__Proceso__Group__1 )
            // InternalMyDsl.g:518:2: rule__Proceso__Group__0__Impl rule__Proceso__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Proceso__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proceso__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Group__0"


    // $ANTLR start "rule__Proceso__Group__0__Impl"
    // InternalMyDsl.g:525:1: rule__Proceso__Group__0__Impl : ( 'Procesar' ) ;
    public final void rule__Proceso__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:529:1: ( ( 'Procesar' ) )
            // InternalMyDsl.g:530:1: ( 'Procesar' )
            {
            // InternalMyDsl.g:530:1: ( 'Procesar' )
            // InternalMyDsl.g:531:2: 'Procesar'
            {
             before(grammarAccess.getProcesoAccess().getProcesarKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getProcesoAccess().getProcesarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Group__0__Impl"


    // $ANTLR start "rule__Proceso__Group__1"
    // InternalMyDsl.g:540:1: rule__Proceso__Group__1 : rule__Proceso__Group__1__Impl rule__Proceso__Group__2 ;
    public final void rule__Proceso__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:544:1: ( rule__Proceso__Group__1__Impl rule__Proceso__Group__2 )
            // InternalMyDsl.g:545:2: rule__Proceso__Group__1__Impl rule__Proceso__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Proceso__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proceso__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Group__1"


    // $ANTLR start "rule__Proceso__Group__1__Impl"
    // InternalMyDsl.g:552:1: rule__Proceso__Group__1__Impl : ( ( rule__Proceso__TipoAssignment_1 ) ) ;
    public final void rule__Proceso__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:556:1: ( ( ( rule__Proceso__TipoAssignment_1 ) ) )
            // InternalMyDsl.g:557:1: ( ( rule__Proceso__TipoAssignment_1 ) )
            {
            // InternalMyDsl.g:557:1: ( ( rule__Proceso__TipoAssignment_1 ) )
            // InternalMyDsl.g:558:2: ( rule__Proceso__TipoAssignment_1 )
            {
             before(grammarAccess.getProcesoAccess().getTipoAssignment_1()); 
            // InternalMyDsl.g:559:2: ( rule__Proceso__TipoAssignment_1 )
            // InternalMyDsl.g:559:3: rule__Proceso__TipoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Proceso__TipoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcesoAccess().getTipoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Group__1__Impl"


    // $ANTLR start "rule__Proceso__Group__2"
    // InternalMyDsl.g:567:1: rule__Proceso__Group__2 : rule__Proceso__Group__2__Impl rule__Proceso__Group__3 ;
    public final void rule__Proceso__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:571:1: ( rule__Proceso__Group__2__Impl rule__Proceso__Group__3 )
            // InternalMyDsl.g:572:2: rule__Proceso__Group__2__Impl rule__Proceso__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Proceso__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proceso__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Group__2"


    // $ANTLR start "rule__Proceso__Group__2__Impl"
    // InternalMyDsl.g:579:1: rule__Proceso__Group__2__Impl : ( '{' ) ;
    public final void rule__Proceso__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:583:1: ( ( '{' ) )
            // InternalMyDsl.g:584:1: ( '{' )
            {
            // InternalMyDsl.g:584:1: ( '{' )
            // InternalMyDsl.g:585:2: '{'
            {
             before(grammarAccess.getProcesoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getProcesoAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Group__2__Impl"


    // $ANTLR start "rule__Proceso__Group__3"
    // InternalMyDsl.g:594:1: rule__Proceso__Group__3 : rule__Proceso__Group__3__Impl rule__Proceso__Group__4 ;
    public final void rule__Proceso__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:598:1: ( rule__Proceso__Group__3__Impl rule__Proceso__Group__4 )
            // InternalMyDsl.g:599:2: rule__Proceso__Group__3__Impl rule__Proceso__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Proceso__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proceso__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Group__3"


    // $ANTLR start "rule__Proceso__Group__3__Impl"
    // InternalMyDsl.g:606:1: rule__Proceso__Group__3__Impl : ( ( rule__Proceso__Alternatives_3 ) ) ;
    public final void rule__Proceso__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( ( ( rule__Proceso__Alternatives_3 ) ) )
            // InternalMyDsl.g:611:1: ( ( rule__Proceso__Alternatives_3 ) )
            {
            // InternalMyDsl.g:611:1: ( ( rule__Proceso__Alternatives_3 ) )
            // InternalMyDsl.g:612:2: ( rule__Proceso__Alternatives_3 )
            {
             before(grammarAccess.getProcesoAccess().getAlternatives_3()); 
            // InternalMyDsl.g:613:2: ( rule__Proceso__Alternatives_3 )
            // InternalMyDsl.g:613:3: rule__Proceso__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Proceso__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getProcesoAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Group__3__Impl"


    // $ANTLR start "rule__Proceso__Group__4"
    // InternalMyDsl.g:621:1: rule__Proceso__Group__4 : rule__Proceso__Group__4__Impl rule__Proceso__Group__5 ;
    public final void rule__Proceso__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:625:1: ( rule__Proceso__Group__4__Impl rule__Proceso__Group__5 )
            // InternalMyDsl.g:626:2: rule__Proceso__Group__4__Impl rule__Proceso__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Proceso__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proceso__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Group__4"


    // $ANTLR start "rule__Proceso__Group__4__Impl"
    // InternalMyDsl.g:633:1: rule__Proceso__Group__4__Impl : ( '}' ) ;
    public final void rule__Proceso__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:637:1: ( ( '}' ) )
            // InternalMyDsl.g:638:1: ( '}' )
            {
            // InternalMyDsl.g:638:1: ( '}' )
            // InternalMyDsl.g:639:2: '}'
            {
             before(grammarAccess.getProcesoAccess().getRightCurlyBracketKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getProcesoAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Group__4__Impl"


    // $ANTLR start "rule__Proceso__Group__5"
    // InternalMyDsl.g:648:1: rule__Proceso__Group__5 : rule__Proceso__Group__5__Impl rule__Proceso__Group__6 ;
    public final void rule__Proceso__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:652:1: ( rule__Proceso__Group__5__Impl rule__Proceso__Group__6 )
            // InternalMyDsl.g:653:2: rule__Proceso__Group__5__Impl rule__Proceso__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Proceso__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Proceso__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Group__5"


    // $ANTLR start "rule__Proceso__Group__5__Impl"
    // InternalMyDsl.g:660:1: rule__Proceso__Group__5__Impl : ( 'Concluir' ) ;
    public final void rule__Proceso__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:664:1: ( ( 'Concluir' ) )
            // InternalMyDsl.g:665:1: ( 'Concluir' )
            {
            // InternalMyDsl.g:665:1: ( 'Concluir' )
            // InternalMyDsl.g:666:2: 'Concluir'
            {
             before(grammarAccess.getProcesoAccess().getConcluirKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getProcesoAccess().getConcluirKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Group__5__Impl"


    // $ANTLR start "rule__Proceso__Group__6"
    // InternalMyDsl.g:675:1: rule__Proceso__Group__6 : rule__Proceso__Group__6__Impl ;
    public final void rule__Proceso__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:679:1: ( rule__Proceso__Group__6__Impl )
            // InternalMyDsl.g:680:2: rule__Proceso__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Proceso__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Group__6"


    // $ANTLR start "rule__Proceso__Group__6__Impl"
    // InternalMyDsl.g:686:1: rule__Proceso__Group__6__Impl : ( ( rule__Proceso__TipoAssignment_6 ) ) ;
    public final void rule__Proceso__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:690:1: ( ( ( rule__Proceso__TipoAssignment_6 ) ) )
            // InternalMyDsl.g:691:1: ( ( rule__Proceso__TipoAssignment_6 ) )
            {
            // InternalMyDsl.g:691:1: ( ( rule__Proceso__TipoAssignment_6 ) )
            // InternalMyDsl.g:692:2: ( rule__Proceso__TipoAssignment_6 )
            {
             before(grammarAccess.getProcesoAccess().getTipoAssignment_6()); 
            // InternalMyDsl.g:693:2: ( rule__Proceso__TipoAssignment_6 )
            // InternalMyDsl.g:693:3: rule__Proceso__TipoAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Proceso__TipoAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getProcesoAccess().getTipoAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__Group__6__Impl"


    // $ANTLR start "rule__Creacion__Group__0"
    // InternalMyDsl.g:702:1: rule__Creacion__Group__0 : rule__Creacion__Group__0__Impl rule__Creacion__Group__1 ;
    public final void rule__Creacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:706:1: ( rule__Creacion__Group__0__Impl rule__Creacion__Group__1 )
            // InternalMyDsl.g:707:2: rule__Creacion__Group__0__Impl rule__Creacion__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Creacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Group__0"


    // $ANTLR start "rule__Creacion__Group__0__Impl"
    // InternalMyDsl.g:714:1: rule__Creacion__Group__0__Impl : ( 'Crear' ) ;
    public final void rule__Creacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:718:1: ( ( 'Crear' ) )
            // InternalMyDsl.g:719:1: ( 'Crear' )
            {
            // InternalMyDsl.g:719:1: ( 'Crear' )
            // InternalMyDsl.g:720:2: 'Crear'
            {
             before(grammarAccess.getCreacionAccess().getCrearKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCreacionAccess().getCrearKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Group__0__Impl"


    // $ANTLR start "rule__Creacion__Group__1"
    // InternalMyDsl.g:729:1: rule__Creacion__Group__1 : rule__Creacion__Group__1__Impl rule__Creacion__Group__2 ;
    public final void rule__Creacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:733:1: ( rule__Creacion__Group__1__Impl rule__Creacion__Group__2 )
            // InternalMyDsl.g:734:2: rule__Creacion__Group__1__Impl rule__Creacion__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Creacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Group__1"


    // $ANTLR start "rule__Creacion__Group__1__Impl"
    // InternalMyDsl.g:741:1: rule__Creacion__Group__1__Impl : ( ( rule__Creacion__SustantivoAssignment_1 ) ) ;
    public final void rule__Creacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:745:1: ( ( ( rule__Creacion__SustantivoAssignment_1 ) ) )
            // InternalMyDsl.g:746:1: ( ( rule__Creacion__SustantivoAssignment_1 ) )
            {
            // InternalMyDsl.g:746:1: ( ( rule__Creacion__SustantivoAssignment_1 ) )
            // InternalMyDsl.g:747:2: ( rule__Creacion__SustantivoAssignment_1 )
            {
             before(grammarAccess.getCreacionAccess().getSustantivoAssignment_1()); 
            // InternalMyDsl.g:748:2: ( rule__Creacion__SustantivoAssignment_1 )
            // InternalMyDsl.g:748:3: rule__Creacion__SustantivoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Creacion__SustantivoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCreacionAccess().getSustantivoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Group__1__Impl"


    // $ANTLR start "rule__Creacion__Group__2"
    // InternalMyDsl.g:756:1: rule__Creacion__Group__2 : rule__Creacion__Group__2__Impl ;
    public final void rule__Creacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:760:1: ( rule__Creacion__Group__2__Impl )
            // InternalMyDsl.g:761:2: rule__Creacion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creacion__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Group__2"


    // $ANTLR start "rule__Creacion__Group__2__Impl"
    // InternalMyDsl.g:767:1: rule__Creacion__Group__2__Impl : ( ( rule__Creacion__Alternatives_2 ) ) ;
    public final void rule__Creacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:771:1: ( ( ( rule__Creacion__Alternatives_2 ) ) )
            // InternalMyDsl.g:772:1: ( ( rule__Creacion__Alternatives_2 ) )
            {
            // InternalMyDsl.g:772:1: ( ( rule__Creacion__Alternatives_2 ) )
            // InternalMyDsl.g:773:2: ( rule__Creacion__Alternatives_2 )
            {
             before(grammarAccess.getCreacionAccess().getAlternatives_2()); 
            // InternalMyDsl.g:774:2: ( rule__Creacion__Alternatives_2 )
            // InternalMyDsl.g:774:3: rule__Creacion__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Creacion__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getCreacionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Group__2__Impl"


    // $ANTLR start "rule__Creacion__Group_2_0__0"
    // InternalMyDsl.g:783:1: rule__Creacion__Group_2_0__0 : rule__Creacion__Group_2_0__0__Impl rule__Creacion__Group_2_0__1 ;
    public final void rule__Creacion__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:787:1: ( rule__Creacion__Group_2_0__0__Impl rule__Creacion__Group_2_0__1 )
            // InternalMyDsl.g:788:2: rule__Creacion__Group_2_0__0__Impl rule__Creacion__Group_2_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Creacion__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creacion__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Group_2_0__0"


    // $ANTLR start "rule__Creacion__Group_2_0__0__Impl"
    // InternalMyDsl.g:795:1: rule__Creacion__Group_2_0__0__Impl : ( ( rule__Creacion__TipoMaquinaAssignment_2_0_0 ) ) ;
    public final void rule__Creacion__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( ( ( rule__Creacion__TipoMaquinaAssignment_2_0_0 ) ) )
            // InternalMyDsl.g:800:1: ( ( rule__Creacion__TipoMaquinaAssignment_2_0_0 ) )
            {
            // InternalMyDsl.g:800:1: ( ( rule__Creacion__TipoMaquinaAssignment_2_0_0 ) )
            // InternalMyDsl.g:801:2: ( rule__Creacion__TipoMaquinaAssignment_2_0_0 )
            {
             before(grammarAccess.getCreacionAccess().getTipoMaquinaAssignment_2_0_0()); 
            // InternalMyDsl.g:802:2: ( rule__Creacion__TipoMaquinaAssignment_2_0_0 )
            // InternalMyDsl.g:802:3: rule__Creacion__TipoMaquinaAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Creacion__TipoMaquinaAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCreacionAccess().getTipoMaquinaAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Group_2_0__0__Impl"


    // $ANTLR start "rule__Creacion__Group_2_0__1"
    // InternalMyDsl.g:810:1: rule__Creacion__Group_2_0__1 : rule__Creacion__Group_2_0__1__Impl ;
    public final void rule__Creacion__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:814:1: ( rule__Creacion__Group_2_0__1__Impl )
            // InternalMyDsl.g:815:2: rule__Creacion__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creacion__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Group_2_0__1"


    // $ANTLR start "rule__Creacion__Group_2_0__1__Impl"
    // InternalMyDsl.g:821:1: rule__Creacion__Group_2_0__1__Impl : ( ( rule__Creacion__PotenciaAssignment_2_0_1 ) ) ;
    public final void rule__Creacion__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:825:1: ( ( ( rule__Creacion__PotenciaAssignment_2_0_1 ) ) )
            // InternalMyDsl.g:826:1: ( ( rule__Creacion__PotenciaAssignment_2_0_1 ) )
            {
            // InternalMyDsl.g:826:1: ( ( rule__Creacion__PotenciaAssignment_2_0_1 ) )
            // InternalMyDsl.g:827:2: ( rule__Creacion__PotenciaAssignment_2_0_1 )
            {
             before(grammarAccess.getCreacionAccess().getPotenciaAssignment_2_0_1()); 
            // InternalMyDsl.g:828:2: ( rule__Creacion__PotenciaAssignment_2_0_1 )
            // InternalMyDsl.g:828:3: rule__Creacion__PotenciaAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Creacion__PotenciaAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCreacionAccess().getPotenciaAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Group_2_0__1__Impl"


    // $ANTLR start "rule__Creacion__Group_2_1__0"
    // InternalMyDsl.g:837:1: rule__Creacion__Group_2_1__0 : rule__Creacion__Group_2_1__0__Impl rule__Creacion__Group_2_1__1 ;
    public final void rule__Creacion__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( rule__Creacion__Group_2_1__0__Impl rule__Creacion__Group_2_1__1 )
            // InternalMyDsl.g:842:2: rule__Creacion__Group_2_1__0__Impl rule__Creacion__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Creacion__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Creacion__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Group_2_1__0"


    // $ANTLR start "rule__Creacion__Group_2_1__0__Impl"
    // InternalMyDsl.g:849:1: rule__Creacion__Group_2_1__0__Impl : ( ( rule__Creacion__TipoMaterialAssignment_2_1_0 ) ) ;
    public final void rule__Creacion__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:853:1: ( ( ( rule__Creacion__TipoMaterialAssignment_2_1_0 ) ) )
            // InternalMyDsl.g:854:1: ( ( rule__Creacion__TipoMaterialAssignment_2_1_0 ) )
            {
            // InternalMyDsl.g:854:1: ( ( rule__Creacion__TipoMaterialAssignment_2_1_0 ) )
            // InternalMyDsl.g:855:2: ( rule__Creacion__TipoMaterialAssignment_2_1_0 )
            {
             before(grammarAccess.getCreacionAccess().getTipoMaterialAssignment_2_1_0()); 
            // InternalMyDsl.g:856:2: ( rule__Creacion__TipoMaterialAssignment_2_1_0 )
            // InternalMyDsl.g:856:3: rule__Creacion__TipoMaterialAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Creacion__TipoMaterialAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCreacionAccess().getTipoMaterialAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Group_2_1__0__Impl"


    // $ANTLR start "rule__Creacion__Group_2_1__1"
    // InternalMyDsl.g:864:1: rule__Creacion__Group_2_1__1 : rule__Creacion__Group_2_1__1__Impl ;
    public final void rule__Creacion__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:868:1: ( rule__Creacion__Group_2_1__1__Impl )
            // InternalMyDsl.g:869:2: rule__Creacion__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Creacion__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Group_2_1__1"


    // $ANTLR start "rule__Creacion__Group_2_1__1__Impl"
    // InternalMyDsl.g:875:1: rule__Creacion__Group_2_1__1__Impl : ( ( rule__Creacion__GrosorAssignment_2_1_1 ) ) ;
    public final void rule__Creacion__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:879:1: ( ( ( rule__Creacion__GrosorAssignment_2_1_1 ) ) )
            // InternalMyDsl.g:880:1: ( ( rule__Creacion__GrosorAssignment_2_1_1 ) )
            {
            // InternalMyDsl.g:880:1: ( ( rule__Creacion__GrosorAssignment_2_1_1 ) )
            // InternalMyDsl.g:881:2: ( rule__Creacion__GrosorAssignment_2_1_1 )
            {
             before(grammarAccess.getCreacionAccess().getGrosorAssignment_2_1_1()); 
            // InternalMyDsl.g:882:2: ( rule__Creacion__GrosorAssignment_2_1_1 )
            // InternalMyDsl.g:882:3: rule__Creacion__GrosorAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Creacion__GrosorAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCreacionAccess().getGrosorAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__Group_2_1__1__Impl"


    // $ANTLR start "rule__Consulta__Group__0"
    // InternalMyDsl.g:891:1: rule__Consulta__Group__0 : rule__Consulta__Group__0__Impl rule__Consulta__Group__1 ;
    public final void rule__Consulta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:895:1: ( rule__Consulta__Group__0__Impl rule__Consulta__Group__1 )
            // InternalMyDsl.g:896:2: rule__Consulta__Group__0__Impl rule__Consulta__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Consulta__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Consulta__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group__0"


    // $ANTLR start "rule__Consulta__Group__0__Impl"
    // InternalMyDsl.g:903:1: rule__Consulta__Group__0__Impl : ( 'Consultar' ) ;
    public final void rule__Consulta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( ( 'Consultar' ) )
            // InternalMyDsl.g:908:1: ( 'Consultar' )
            {
            // InternalMyDsl.g:908:1: ( 'Consultar' )
            // InternalMyDsl.g:909:2: 'Consultar'
            {
             before(grammarAccess.getConsultaAccess().getConsultarKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getConsultaAccess().getConsultarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group__0__Impl"


    // $ANTLR start "rule__Consulta__Group__1"
    // InternalMyDsl.g:918:1: rule__Consulta__Group__1 : rule__Consulta__Group__1__Impl rule__Consulta__Group__2 ;
    public final void rule__Consulta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:922:1: ( rule__Consulta__Group__1__Impl rule__Consulta__Group__2 )
            // InternalMyDsl.g:923:2: rule__Consulta__Group__1__Impl rule__Consulta__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Consulta__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Consulta__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group__1"


    // $ANTLR start "rule__Consulta__Group__1__Impl"
    // InternalMyDsl.g:930:1: rule__Consulta__Group__1__Impl : ( ( rule__Consulta__SustantivoAssignment_1 ) ) ;
    public final void rule__Consulta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:934:1: ( ( ( rule__Consulta__SustantivoAssignment_1 ) ) )
            // InternalMyDsl.g:935:1: ( ( rule__Consulta__SustantivoAssignment_1 ) )
            {
            // InternalMyDsl.g:935:1: ( ( rule__Consulta__SustantivoAssignment_1 ) )
            // InternalMyDsl.g:936:2: ( rule__Consulta__SustantivoAssignment_1 )
            {
             before(grammarAccess.getConsultaAccess().getSustantivoAssignment_1()); 
            // InternalMyDsl.g:937:2: ( rule__Consulta__SustantivoAssignment_1 )
            // InternalMyDsl.g:937:3: rule__Consulta__SustantivoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Consulta__SustantivoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConsultaAccess().getSustantivoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group__1__Impl"


    // $ANTLR start "rule__Consulta__Group__2"
    // InternalMyDsl.g:945:1: rule__Consulta__Group__2 : rule__Consulta__Group__2__Impl rule__Consulta__Group__3 ;
    public final void rule__Consulta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:949:1: ( rule__Consulta__Group__2__Impl rule__Consulta__Group__3 )
            // InternalMyDsl.g:950:2: rule__Consulta__Group__2__Impl rule__Consulta__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Consulta__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Consulta__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group__2"


    // $ANTLR start "rule__Consulta__Group__2__Impl"
    // InternalMyDsl.g:957:1: rule__Consulta__Group__2__Impl : ( ( rule__Consulta__Alternatives_2 ) ) ;
    public final void rule__Consulta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:961:1: ( ( ( rule__Consulta__Alternatives_2 ) ) )
            // InternalMyDsl.g:962:1: ( ( rule__Consulta__Alternatives_2 ) )
            {
            // InternalMyDsl.g:962:1: ( ( rule__Consulta__Alternatives_2 ) )
            // InternalMyDsl.g:963:2: ( rule__Consulta__Alternatives_2 )
            {
             before(grammarAccess.getConsultaAccess().getAlternatives_2()); 
            // InternalMyDsl.g:964:2: ( rule__Consulta__Alternatives_2 )
            // InternalMyDsl.g:964:3: rule__Consulta__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Consulta__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getConsultaAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group__2__Impl"


    // $ANTLR start "rule__Consulta__Group__3"
    // InternalMyDsl.g:972:1: rule__Consulta__Group__3 : rule__Consulta__Group__3__Impl ;
    public final void rule__Consulta__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:976:1: ( rule__Consulta__Group__3__Impl )
            // InternalMyDsl.g:977:2: rule__Consulta__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Consulta__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group__3"


    // $ANTLR start "rule__Consulta__Group__3__Impl"
    // InternalMyDsl.g:983:1: rule__Consulta__Group__3__Impl : ( ( rule__Consulta__VerboAssignment_3 ) ) ;
    public final void rule__Consulta__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:987:1: ( ( ( rule__Consulta__VerboAssignment_3 ) ) )
            // InternalMyDsl.g:988:1: ( ( rule__Consulta__VerboAssignment_3 ) )
            {
            // InternalMyDsl.g:988:1: ( ( rule__Consulta__VerboAssignment_3 ) )
            // InternalMyDsl.g:989:2: ( rule__Consulta__VerboAssignment_3 )
            {
             before(grammarAccess.getConsultaAccess().getVerboAssignment_3()); 
            // InternalMyDsl.g:990:2: ( rule__Consulta__VerboAssignment_3 )
            // InternalMyDsl.g:990:3: rule__Consulta__VerboAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Consulta__VerboAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConsultaAccess().getVerboAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group__3__Impl"


    // $ANTLR start "rule__Consulta__Group_2_0__0"
    // InternalMyDsl.g:999:1: rule__Consulta__Group_2_0__0 : rule__Consulta__Group_2_0__0__Impl rule__Consulta__Group_2_0__1 ;
    public final void rule__Consulta__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1003:1: ( rule__Consulta__Group_2_0__0__Impl rule__Consulta__Group_2_0__1 )
            // InternalMyDsl.g:1004:2: rule__Consulta__Group_2_0__0__Impl rule__Consulta__Group_2_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Consulta__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Consulta__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group_2_0__0"


    // $ANTLR start "rule__Consulta__Group_2_0__0__Impl"
    // InternalMyDsl.g:1011:1: rule__Consulta__Group_2_0__0__Impl : ( ( rule__Consulta__TipoMaquinaAssignment_2_0_0 ) ) ;
    public final void rule__Consulta__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1015:1: ( ( ( rule__Consulta__TipoMaquinaAssignment_2_0_0 ) ) )
            // InternalMyDsl.g:1016:1: ( ( rule__Consulta__TipoMaquinaAssignment_2_0_0 ) )
            {
            // InternalMyDsl.g:1016:1: ( ( rule__Consulta__TipoMaquinaAssignment_2_0_0 ) )
            // InternalMyDsl.g:1017:2: ( rule__Consulta__TipoMaquinaAssignment_2_0_0 )
            {
             before(grammarAccess.getConsultaAccess().getTipoMaquinaAssignment_2_0_0()); 
            // InternalMyDsl.g:1018:2: ( rule__Consulta__TipoMaquinaAssignment_2_0_0 )
            // InternalMyDsl.g:1018:3: rule__Consulta__TipoMaquinaAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Consulta__TipoMaquinaAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getConsultaAccess().getTipoMaquinaAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group_2_0__0__Impl"


    // $ANTLR start "rule__Consulta__Group_2_0__1"
    // InternalMyDsl.g:1026:1: rule__Consulta__Group_2_0__1 : rule__Consulta__Group_2_0__1__Impl ;
    public final void rule__Consulta__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1030:1: ( rule__Consulta__Group_2_0__1__Impl )
            // InternalMyDsl.g:1031:2: rule__Consulta__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Consulta__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group_2_0__1"


    // $ANTLR start "rule__Consulta__Group_2_0__1__Impl"
    // InternalMyDsl.g:1037:1: rule__Consulta__Group_2_0__1__Impl : ( ( rule__Consulta__PotenciaAssignment_2_0_1 ) ) ;
    public final void rule__Consulta__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1041:1: ( ( ( rule__Consulta__PotenciaAssignment_2_0_1 ) ) )
            // InternalMyDsl.g:1042:1: ( ( rule__Consulta__PotenciaAssignment_2_0_1 ) )
            {
            // InternalMyDsl.g:1042:1: ( ( rule__Consulta__PotenciaAssignment_2_0_1 ) )
            // InternalMyDsl.g:1043:2: ( rule__Consulta__PotenciaAssignment_2_0_1 )
            {
             before(grammarAccess.getConsultaAccess().getPotenciaAssignment_2_0_1()); 
            // InternalMyDsl.g:1044:2: ( rule__Consulta__PotenciaAssignment_2_0_1 )
            // InternalMyDsl.g:1044:3: rule__Consulta__PotenciaAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Consulta__PotenciaAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getConsultaAccess().getPotenciaAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group_2_0__1__Impl"


    // $ANTLR start "rule__Consulta__Group_2_1__0"
    // InternalMyDsl.g:1053:1: rule__Consulta__Group_2_1__0 : rule__Consulta__Group_2_1__0__Impl rule__Consulta__Group_2_1__1 ;
    public final void rule__Consulta__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1057:1: ( rule__Consulta__Group_2_1__0__Impl rule__Consulta__Group_2_1__1 )
            // InternalMyDsl.g:1058:2: rule__Consulta__Group_2_1__0__Impl rule__Consulta__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Consulta__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Consulta__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group_2_1__0"


    // $ANTLR start "rule__Consulta__Group_2_1__0__Impl"
    // InternalMyDsl.g:1065:1: rule__Consulta__Group_2_1__0__Impl : ( ( rule__Consulta__TipoMaterialAssignment_2_1_0 ) ) ;
    public final void rule__Consulta__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1069:1: ( ( ( rule__Consulta__TipoMaterialAssignment_2_1_0 ) ) )
            // InternalMyDsl.g:1070:1: ( ( rule__Consulta__TipoMaterialAssignment_2_1_0 ) )
            {
            // InternalMyDsl.g:1070:1: ( ( rule__Consulta__TipoMaterialAssignment_2_1_0 ) )
            // InternalMyDsl.g:1071:2: ( rule__Consulta__TipoMaterialAssignment_2_1_0 )
            {
             before(grammarAccess.getConsultaAccess().getTipoMaterialAssignment_2_1_0()); 
            // InternalMyDsl.g:1072:2: ( rule__Consulta__TipoMaterialAssignment_2_1_0 )
            // InternalMyDsl.g:1072:3: rule__Consulta__TipoMaterialAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Consulta__TipoMaterialAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getConsultaAccess().getTipoMaterialAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group_2_1__0__Impl"


    // $ANTLR start "rule__Consulta__Group_2_1__1"
    // InternalMyDsl.g:1080:1: rule__Consulta__Group_2_1__1 : rule__Consulta__Group_2_1__1__Impl ;
    public final void rule__Consulta__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1084:1: ( rule__Consulta__Group_2_1__1__Impl )
            // InternalMyDsl.g:1085:2: rule__Consulta__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Consulta__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group_2_1__1"


    // $ANTLR start "rule__Consulta__Group_2_1__1__Impl"
    // InternalMyDsl.g:1091:1: rule__Consulta__Group_2_1__1__Impl : ( ( rule__Consulta__GrosorAssignment_2_1_1 ) ) ;
    public final void rule__Consulta__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1095:1: ( ( ( rule__Consulta__GrosorAssignment_2_1_1 ) ) )
            // InternalMyDsl.g:1096:1: ( ( rule__Consulta__GrosorAssignment_2_1_1 ) )
            {
            // InternalMyDsl.g:1096:1: ( ( rule__Consulta__GrosorAssignment_2_1_1 ) )
            // InternalMyDsl.g:1097:2: ( rule__Consulta__GrosorAssignment_2_1_1 )
            {
             before(grammarAccess.getConsultaAccess().getGrosorAssignment_2_1_1()); 
            // InternalMyDsl.g:1098:2: ( rule__Consulta__GrosorAssignment_2_1_1 )
            // InternalMyDsl.g:1098:3: rule__Consulta__GrosorAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Consulta__GrosorAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConsultaAccess().getGrosorAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__Group_2_1__1__Impl"


    // $ANTLR start "rule__Eliminacion__Group__0"
    // InternalMyDsl.g:1107:1: rule__Eliminacion__Group__0 : rule__Eliminacion__Group__0__Impl rule__Eliminacion__Group__1 ;
    public final void rule__Eliminacion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1111:1: ( rule__Eliminacion__Group__0__Impl rule__Eliminacion__Group__1 )
            // InternalMyDsl.g:1112:2: rule__Eliminacion__Group__0__Impl rule__Eliminacion__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Eliminacion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eliminacion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Group__0"


    // $ANTLR start "rule__Eliminacion__Group__0__Impl"
    // InternalMyDsl.g:1119:1: rule__Eliminacion__Group__0__Impl : ( 'Eliminar' ) ;
    public final void rule__Eliminacion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1123:1: ( ( 'Eliminar' ) )
            // InternalMyDsl.g:1124:1: ( 'Eliminar' )
            {
            // InternalMyDsl.g:1124:1: ( 'Eliminar' )
            // InternalMyDsl.g:1125:2: 'Eliminar'
            {
             before(grammarAccess.getEliminacionAccess().getEliminarKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEliminacionAccess().getEliminarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Group__0__Impl"


    // $ANTLR start "rule__Eliminacion__Group__1"
    // InternalMyDsl.g:1134:1: rule__Eliminacion__Group__1 : rule__Eliminacion__Group__1__Impl rule__Eliminacion__Group__2 ;
    public final void rule__Eliminacion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1138:1: ( rule__Eliminacion__Group__1__Impl rule__Eliminacion__Group__2 )
            // InternalMyDsl.g:1139:2: rule__Eliminacion__Group__1__Impl rule__Eliminacion__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Eliminacion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eliminacion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Group__1"


    // $ANTLR start "rule__Eliminacion__Group__1__Impl"
    // InternalMyDsl.g:1146:1: rule__Eliminacion__Group__1__Impl : ( ( rule__Eliminacion__SustantivoAssignment_1 ) ) ;
    public final void rule__Eliminacion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( ( ( rule__Eliminacion__SustantivoAssignment_1 ) ) )
            // InternalMyDsl.g:1151:1: ( ( rule__Eliminacion__SustantivoAssignment_1 ) )
            {
            // InternalMyDsl.g:1151:1: ( ( rule__Eliminacion__SustantivoAssignment_1 ) )
            // InternalMyDsl.g:1152:2: ( rule__Eliminacion__SustantivoAssignment_1 )
            {
             before(grammarAccess.getEliminacionAccess().getSustantivoAssignment_1()); 
            // InternalMyDsl.g:1153:2: ( rule__Eliminacion__SustantivoAssignment_1 )
            // InternalMyDsl.g:1153:3: rule__Eliminacion__SustantivoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Eliminacion__SustantivoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEliminacionAccess().getSustantivoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Group__1__Impl"


    // $ANTLR start "rule__Eliminacion__Group__2"
    // InternalMyDsl.g:1161:1: rule__Eliminacion__Group__2 : rule__Eliminacion__Group__2__Impl ;
    public final void rule__Eliminacion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1165:1: ( rule__Eliminacion__Group__2__Impl )
            // InternalMyDsl.g:1166:2: rule__Eliminacion__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eliminacion__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Group__2"


    // $ANTLR start "rule__Eliminacion__Group__2__Impl"
    // InternalMyDsl.g:1172:1: rule__Eliminacion__Group__2__Impl : ( ( rule__Eliminacion__Alternatives_2 ) ) ;
    public final void rule__Eliminacion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1176:1: ( ( ( rule__Eliminacion__Alternatives_2 ) ) )
            // InternalMyDsl.g:1177:1: ( ( rule__Eliminacion__Alternatives_2 ) )
            {
            // InternalMyDsl.g:1177:1: ( ( rule__Eliminacion__Alternatives_2 ) )
            // InternalMyDsl.g:1178:2: ( rule__Eliminacion__Alternatives_2 )
            {
             before(grammarAccess.getEliminacionAccess().getAlternatives_2()); 
            // InternalMyDsl.g:1179:2: ( rule__Eliminacion__Alternatives_2 )
            // InternalMyDsl.g:1179:3: rule__Eliminacion__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Eliminacion__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getEliminacionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Group__2__Impl"


    // $ANTLR start "rule__Eliminacion__Group_2_0__0"
    // InternalMyDsl.g:1188:1: rule__Eliminacion__Group_2_0__0 : rule__Eliminacion__Group_2_0__0__Impl rule__Eliminacion__Group_2_0__1 ;
    public final void rule__Eliminacion__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( rule__Eliminacion__Group_2_0__0__Impl rule__Eliminacion__Group_2_0__1 )
            // InternalMyDsl.g:1193:2: rule__Eliminacion__Group_2_0__0__Impl rule__Eliminacion__Group_2_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Eliminacion__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eliminacion__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Group_2_0__0"


    // $ANTLR start "rule__Eliminacion__Group_2_0__0__Impl"
    // InternalMyDsl.g:1200:1: rule__Eliminacion__Group_2_0__0__Impl : ( ( rule__Eliminacion__TipoMaquinaAssignment_2_0_0 ) ) ;
    public final void rule__Eliminacion__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( ( ( rule__Eliminacion__TipoMaquinaAssignment_2_0_0 ) ) )
            // InternalMyDsl.g:1205:1: ( ( rule__Eliminacion__TipoMaquinaAssignment_2_0_0 ) )
            {
            // InternalMyDsl.g:1205:1: ( ( rule__Eliminacion__TipoMaquinaAssignment_2_0_0 ) )
            // InternalMyDsl.g:1206:2: ( rule__Eliminacion__TipoMaquinaAssignment_2_0_0 )
            {
             before(grammarAccess.getEliminacionAccess().getTipoMaquinaAssignment_2_0_0()); 
            // InternalMyDsl.g:1207:2: ( rule__Eliminacion__TipoMaquinaAssignment_2_0_0 )
            // InternalMyDsl.g:1207:3: rule__Eliminacion__TipoMaquinaAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Eliminacion__TipoMaquinaAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getEliminacionAccess().getTipoMaquinaAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Group_2_0__0__Impl"


    // $ANTLR start "rule__Eliminacion__Group_2_0__1"
    // InternalMyDsl.g:1215:1: rule__Eliminacion__Group_2_0__1 : rule__Eliminacion__Group_2_0__1__Impl ;
    public final void rule__Eliminacion__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( rule__Eliminacion__Group_2_0__1__Impl )
            // InternalMyDsl.g:1220:2: rule__Eliminacion__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eliminacion__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Group_2_0__1"


    // $ANTLR start "rule__Eliminacion__Group_2_0__1__Impl"
    // InternalMyDsl.g:1226:1: rule__Eliminacion__Group_2_0__1__Impl : ( ( rule__Eliminacion__PotenciaAssignment_2_0_1 ) ) ;
    public final void rule__Eliminacion__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1230:1: ( ( ( rule__Eliminacion__PotenciaAssignment_2_0_1 ) ) )
            // InternalMyDsl.g:1231:1: ( ( rule__Eliminacion__PotenciaAssignment_2_0_1 ) )
            {
            // InternalMyDsl.g:1231:1: ( ( rule__Eliminacion__PotenciaAssignment_2_0_1 ) )
            // InternalMyDsl.g:1232:2: ( rule__Eliminacion__PotenciaAssignment_2_0_1 )
            {
             before(grammarAccess.getEliminacionAccess().getPotenciaAssignment_2_0_1()); 
            // InternalMyDsl.g:1233:2: ( rule__Eliminacion__PotenciaAssignment_2_0_1 )
            // InternalMyDsl.g:1233:3: rule__Eliminacion__PotenciaAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Eliminacion__PotenciaAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEliminacionAccess().getPotenciaAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Group_2_0__1__Impl"


    // $ANTLR start "rule__Eliminacion__Group_2_1__0"
    // InternalMyDsl.g:1242:1: rule__Eliminacion__Group_2_1__0 : rule__Eliminacion__Group_2_1__0__Impl rule__Eliminacion__Group_2_1__1 ;
    public final void rule__Eliminacion__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1246:1: ( rule__Eliminacion__Group_2_1__0__Impl rule__Eliminacion__Group_2_1__1 )
            // InternalMyDsl.g:1247:2: rule__Eliminacion__Group_2_1__0__Impl rule__Eliminacion__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Eliminacion__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eliminacion__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Group_2_1__0"


    // $ANTLR start "rule__Eliminacion__Group_2_1__0__Impl"
    // InternalMyDsl.g:1254:1: rule__Eliminacion__Group_2_1__0__Impl : ( ( rule__Eliminacion__TipoMaterialAssignment_2_1_0 ) ) ;
    public final void rule__Eliminacion__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( ( ( rule__Eliminacion__TipoMaterialAssignment_2_1_0 ) ) )
            // InternalMyDsl.g:1259:1: ( ( rule__Eliminacion__TipoMaterialAssignment_2_1_0 ) )
            {
            // InternalMyDsl.g:1259:1: ( ( rule__Eliminacion__TipoMaterialAssignment_2_1_0 ) )
            // InternalMyDsl.g:1260:2: ( rule__Eliminacion__TipoMaterialAssignment_2_1_0 )
            {
             before(grammarAccess.getEliminacionAccess().getTipoMaterialAssignment_2_1_0()); 
            // InternalMyDsl.g:1261:2: ( rule__Eliminacion__TipoMaterialAssignment_2_1_0 )
            // InternalMyDsl.g:1261:3: rule__Eliminacion__TipoMaterialAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Eliminacion__TipoMaterialAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEliminacionAccess().getTipoMaterialAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Group_2_1__0__Impl"


    // $ANTLR start "rule__Eliminacion__Group_2_1__1"
    // InternalMyDsl.g:1269:1: rule__Eliminacion__Group_2_1__1 : rule__Eliminacion__Group_2_1__1__Impl ;
    public final void rule__Eliminacion__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1273:1: ( rule__Eliminacion__Group_2_1__1__Impl )
            // InternalMyDsl.g:1274:2: rule__Eliminacion__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eliminacion__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Group_2_1__1"


    // $ANTLR start "rule__Eliminacion__Group_2_1__1__Impl"
    // InternalMyDsl.g:1280:1: rule__Eliminacion__Group_2_1__1__Impl : ( ( rule__Eliminacion__GrosorAssignment_2_1_1 ) ) ;
    public final void rule__Eliminacion__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( ( ( rule__Eliminacion__GrosorAssignment_2_1_1 ) ) )
            // InternalMyDsl.g:1285:1: ( ( rule__Eliminacion__GrosorAssignment_2_1_1 ) )
            {
            // InternalMyDsl.g:1285:1: ( ( rule__Eliminacion__GrosorAssignment_2_1_1 ) )
            // InternalMyDsl.g:1286:2: ( rule__Eliminacion__GrosorAssignment_2_1_1 )
            {
             before(grammarAccess.getEliminacionAccess().getGrosorAssignment_2_1_1()); 
            // InternalMyDsl.g:1287:2: ( rule__Eliminacion__GrosorAssignment_2_1_1 )
            // InternalMyDsl.g:1287:3: rule__Eliminacion__GrosorAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Eliminacion__GrosorAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEliminacionAccess().getGrosorAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__Group_2_1__1__Impl"


    // $ANTLR start "rule__Model__ProcesosAssignment"
    // InternalMyDsl.g:1296:1: rule__Model__ProcesosAssignment : ( ruleProceso ) ;
    public final void rule__Model__ProcesosAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1300:1: ( ( ruleProceso ) )
            // InternalMyDsl.g:1301:2: ( ruleProceso )
            {
            // InternalMyDsl.g:1301:2: ( ruleProceso )
            // InternalMyDsl.g:1302:3: ruleProceso
            {
             before(grammarAccess.getModelAccess().getProcesosProcesoParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleProceso();

            state._fsp--;

             after(grammarAccess.getModelAccess().getProcesosProcesoParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ProcesosAssignment"


    // $ANTLR start "rule__Proceso__TipoAssignment_1"
    // InternalMyDsl.g:1311:1: rule__Proceso__TipoAssignment_1 : ( ruleTipoProceso ) ;
    public final void rule__Proceso__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( ( ruleTipoProceso ) )
            // InternalMyDsl.g:1316:2: ( ruleTipoProceso )
            {
            // InternalMyDsl.g:1316:2: ( ruleTipoProceso )
            // InternalMyDsl.g:1317:3: ruleTipoProceso
            {
             before(grammarAccess.getProcesoAccess().getTipoTipoProcesoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoProceso();

            state._fsp--;

             after(grammarAccess.getProcesoAccess().getTipoTipoProcesoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__TipoAssignment_1"


    // $ANTLR start "rule__Proceso__CreacionAssignment_3_0"
    // InternalMyDsl.g:1326:1: rule__Proceso__CreacionAssignment_3_0 : ( ruleCreacion ) ;
    public final void rule__Proceso__CreacionAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1330:1: ( ( ruleCreacion ) )
            // InternalMyDsl.g:1331:2: ( ruleCreacion )
            {
            // InternalMyDsl.g:1331:2: ( ruleCreacion )
            // InternalMyDsl.g:1332:3: ruleCreacion
            {
             before(grammarAccess.getProcesoAccess().getCreacionCreacionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCreacion();

            state._fsp--;

             after(grammarAccess.getProcesoAccess().getCreacionCreacionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__CreacionAssignment_3_0"


    // $ANTLR start "rule__Proceso__ConsultaAssignment_3_1"
    // InternalMyDsl.g:1341:1: rule__Proceso__ConsultaAssignment_3_1 : ( ruleConsulta ) ;
    public final void rule__Proceso__ConsultaAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1345:1: ( ( ruleConsulta ) )
            // InternalMyDsl.g:1346:2: ( ruleConsulta )
            {
            // InternalMyDsl.g:1346:2: ( ruleConsulta )
            // InternalMyDsl.g:1347:3: ruleConsulta
            {
             before(grammarAccess.getProcesoAccess().getConsultaConsultaParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConsulta();

            state._fsp--;

             after(grammarAccess.getProcesoAccess().getConsultaConsultaParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__ConsultaAssignment_3_1"


    // $ANTLR start "rule__Proceso__EliminacionAssignment_3_2"
    // InternalMyDsl.g:1356:1: rule__Proceso__EliminacionAssignment_3_2 : ( ruleEliminacion ) ;
    public final void rule__Proceso__EliminacionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1360:1: ( ( ruleEliminacion ) )
            // InternalMyDsl.g:1361:2: ( ruleEliminacion )
            {
            // InternalMyDsl.g:1361:2: ( ruleEliminacion )
            // InternalMyDsl.g:1362:3: ruleEliminacion
            {
             before(grammarAccess.getProcesoAccess().getEliminacionEliminacionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEliminacion();

            state._fsp--;

             after(grammarAccess.getProcesoAccess().getEliminacionEliminacionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__EliminacionAssignment_3_2"


    // $ANTLR start "rule__Proceso__TipoAssignment_6"
    // InternalMyDsl.g:1371:1: rule__Proceso__TipoAssignment_6 : ( ruleTipoProceso ) ;
    public final void rule__Proceso__TipoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( ( ruleTipoProceso ) )
            // InternalMyDsl.g:1376:2: ( ruleTipoProceso )
            {
            // InternalMyDsl.g:1376:2: ( ruleTipoProceso )
            // InternalMyDsl.g:1377:3: ruleTipoProceso
            {
             before(grammarAccess.getProcesoAccess().getTipoTipoProcesoParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoProceso();

            state._fsp--;

             after(grammarAccess.getProcesoAccess().getTipoTipoProcesoParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Proceso__TipoAssignment_6"


    // $ANTLR start "rule__Creacion__SustantivoAssignment_1"
    // InternalMyDsl.g:1386:1: rule__Creacion__SustantivoAssignment_1 : ( ruleTipoProceso ) ;
    public final void rule__Creacion__SustantivoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1390:1: ( ( ruleTipoProceso ) )
            // InternalMyDsl.g:1391:2: ( ruleTipoProceso )
            {
            // InternalMyDsl.g:1391:2: ( ruleTipoProceso )
            // InternalMyDsl.g:1392:3: ruleTipoProceso
            {
             before(grammarAccess.getCreacionAccess().getSustantivoTipoProcesoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoProceso();

            state._fsp--;

             after(grammarAccess.getCreacionAccess().getSustantivoTipoProcesoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__SustantivoAssignment_1"


    // $ANTLR start "rule__Creacion__TipoMaquinaAssignment_2_0_0"
    // InternalMyDsl.g:1401:1: rule__Creacion__TipoMaquinaAssignment_2_0_0 : ( ruleTipoMaquina ) ;
    public final void rule__Creacion__TipoMaquinaAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1405:1: ( ( ruleTipoMaquina ) )
            // InternalMyDsl.g:1406:2: ( ruleTipoMaquina )
            {
            // InternalMyDsl.g:1406:2: ( ruleTipoMaquina )
            // InternalMyDsl.g:1407:3: ruleTipoMaquina
            {
             before(grammarAccess.getCreacionAccess().getTipoMaquinaTipoMaquinaParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoMaquina();

            state._fsp--;

             after(grammarAccess.getCreacionAccess().getTipoMaquinaTipoMaquinaParserRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__TipoMaquinaAssignment_2_0_0"


    // $ANTLR start "rule__Creacion__PotenciaAssignment_2_0_1"
    // InternalMyDsl.g:1416:1: rule__Creacion__PotenciaAssignment_2_0_1 : ( RULE_INT ) ;
    public final void rule__Creacion__PotenciaAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1421:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1421:2: ( RULE_INT )
            // InternalMyDsl.g:1422:3: RULE_INT
            {
             before(grammarAccess.getCreacionAccess().getPotenciaINTTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCreacionAccess().getPotenciaINTTerminalRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__PotenciaAssignment_2_0_1"


    // $ANTLR start "rule__Creacion__TipoMaterialAssignment_2_1_0"
    // InternalMyDsl.g:1431:1: rule__Creacion__TipoMaterialAssignment_2_1_0 : ( ruleTipoMaterial ) ;
    public final void rule__Creacion__TipoMaterialAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1435:1: ( ( ruleTipoMaterial ) )
            // InternalMyDsl.g:1436:2: ( ruleTipoMaterial )
            {
            // InternalMyDsl.g:1436:2: ( ruleTipoMaterial )
            // InternalMyDsl.g:1437:3: ruleTipoMaterial
            {
             before(grammarAccess.getCreacionAccess().getTipoMaterialTipoMaterialParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoMaterial();

            state._fsp--;

             after(grammarAccess.getCreacionAccess().getTipoMaterialTipoMaterialParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__TipoMaterialAssignment_2_1_0"


    // $ANTLR start "rule__Creacion__GrosorAssignment_2_1_1"
    // InternalMyDsl.g:1446:1: rule__Creacion__GrosorAssignment_2_1_1 : ( RULE_INT ) ;
    public final void rule__Creacion__GrosorAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1450:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1451:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1451:2: ( RULE_INT )
            // InternalMyDsl.g:1452:3: RULE_INT
            {
             before(grammarAccess.getCreacionAccess().getGrosorINTTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCreacionAccess().getGrosorINTTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Creacion__GrosorAssignment_2_1_1"


    // $ANTLR start "rule__Consulta__SustantivoAssignment_1"
    // InternalMyDsl.g:1461:1: rule__Consulta__SustantivoAssignment_1 : ( ruleTipoProceso ) ;
    public final void rule__Consulta__SustantivoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1465:1: ( ( ruleTipoProceso ) )
            // InternalMyDsl.g:1466:2: ( ruleTipoProceso )
            {
            // InternalMyDsl.g:1466:2: ( ruleTipoProceso )
            // InternalMyDsl.g:1467:3: ruleTipoProceso
            {
             before(grammarAccess.getConsultaAccess().getSustantivoTipoProcesoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoProceso();

            state._fsp--;

             after(grammarAccess.getConsultaAccess().getSustantivoTipoProcesoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__SustantivoAssignment_1"


    // $ANTLR start "rule__Consulta__TipoMaquinaAssignment_2_0_0"
    // InternalMyDsl.g:1476:1: rule__Consulta__TipoMaquinaAssignment_2_0_0 : ( ruleTipoMaquina ) ;
    public final void rule__Consulta__TipoMaquinaAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1480:1: ( ( ruleTipoMaquina ) )
            // InternalMyDsl.g:1481:2: ( ruleTipoMaquina )
            {
            // InternalMyDsl.g:1481:2: ( ruleTipoMaquina )
            // InternalMyDsl.g:1482:3: ruleTipoMaquina
            {
             before(grammarAccess.getConsultaAccess().getTipoMaquinaTipoMaquinaParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoMaquina();

            state._fsp--;

             after(grammarAccess.getConsultaAccess().getTipoMaquinaTipoMaquinaParserRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__TipoMaquinaAssignment_2_0_0"


    // $ANTLR start "rule__Consulta__PotenciaAssignment_2_0_1"
    // InternalMyDsl.g:1491:1: rule__Consulta__PotenciaAssignment_2_0_1 : ( RULE_INT ) ;
    public final void rule__Consulta__PotenciaAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1496:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1496:2: ( RULE_INT )
            // InternalMyDsl.g:1497:3: RULE_INT
            {
             before(grammarAccess.getConsultaAccess().getPotenciaINTTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConsultaAccess().getPotenciaINTTerminalRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__PotenciaAssignment_2_0_1"


    // $ANTLR start "rule__Consulta__TipoMaterialAssignment_2_1_0"
    // InternalMyDsl.g:1506:1: rule__Consulta__TipoMaterialAssignment_2_1_0 : ( ruleTipoMaterial ) ;
    public final void rule__Consulta__TipoMaterialAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( ( ruleTipoMaterial ) )
            // InternalMyDsl.g:1511:2: ( ruleTipoMaterial )
            {
            // InternalMyDsl.g:1511:2: ( ruleTipoMaterial )
            // InternalMyDsl.g:1512:3: ruleTipoMaterial
            {
             before(grammarAccess.getConsultaAccess().getTipoMaterialTipoMaterialParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoMaterial();

            state._fsp--;

             after(grammarAccess.getConsultaAccess().getTipoMaterialTipoMaterialParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__TipoMaterialAssignment_2_1_0"


    // $ANTLR start "rule__Consulta__GrosorAssignment_2_1_1"
    // InternalMyDsl.g:1521:1: rule__Consulta__GrosorAssignment_2_1_1 : ( RULE_INT ) ;
    public final void rule__Consulta__GrosorAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1526:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1526:2: ( RULE_INT )
            // InternalMyDsl.g:1527:3: RULE_INT
            {
             before(grammarAccess.getConsultaAccess().getGrosorINTTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConsultaAccess().getGrosorINTTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__GrosorAssignment_2_1_1"


    // $ANTLR start "rule__Consulta__VerboAssignment_3"
    // InternalMyDsl.g:1536:1: rule__Consulta__VerboAssignment_3 : ( ruleVerbo ) ;
    public final void rule__Consulta__VerboAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1540:1: ( ( ruleVerbo ) )
            // InternalMyDsl.g:1541:2: ( ruleVerbo )
            {
            // InternalMyDsl.g:1541:2: ( ruleVerbo )
            // InternalMyDsl.g:1542:3: ruleVerbo
            {
             before(grammarAccess.getConsultaAccess().getVerboVerboParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVerbo();

            state._fsp--;

             after(grammarAccess.getConsultaAccess().getVerboVerboParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Consulta__VerboAssignment_3"


    // $ANTLR start "rule__Eliminacion__SustantivoAssignment_1"
    // InternalMyDsl.g:1551:1: rule__Eliminacion__SustantivoAssignment_1 : ( ruleTipoProceso ) ;
    public final void rule__Eliminacion__SustantivoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1555:1: ( ( ruleTipoProceso ) )
            // InternalMyDsl.g:1556:2: ( ruleTipoProceso )
            {
            // InternalMyDsl.g:1556:2: ( ruleTipoProceso )
            // InternalMyDsl.g:1557:3: ruleTipoProceso
            {
             before(grammarAccess.getEliminacionAccess().getSustantivoTipoProcesoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoProceso();

            state._fsp--;

             after(grammarAccess.getEliminacionAccess().getSustantivoTipoProcesoParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__SustantivoAssignment_1"


    // $ANTLR start "rule__Eliminacion__TipoMaquinaAssignment_2_0_0"
    // InternalMyDsl.g:1566:1: rule__Eliminacion__TipoMaquinaAssignment_2_0_0 : ( ruleTipoMaquina ) ;
    public final void rule__Eliminacion__TipoMaquinaAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1570:1: ( ( ruleTipoMaquina ) )
            // InternalMyDsl.g:1571:2: ( ruleTipoMaquina )
            {
            // InternalMyDsl.g:1571:2: ( ruleTipoMaquina )
            // InternalMyDsl.g:1572:3: ruleTipoMaquina
            {
             before(grammarAccess.getEliminacionAccess().getTipoMaquinaTipoMaquinaParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoMaquina();

            state._fsp--;

             after(grammarAccess.getEliminacionAccess().getTipoMaquinaTipoMaquinaParserRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__TipoMaquinaAssignment_2_0_0"


    // $ANTLR start "rule__Eliminacion__PotenciaAssignment_2_0_1"
    // InternalMyDsl.g:1581:1: rule__Eliminacion__PotenciaAssignment_2_0_1 : ( RULE_INT ) ;
    public final void rule__Eliminacion__PotenciaAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1585:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1586:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1586:2: ( RULE_INT )
            // InternalMyDsl.g:1587:3: RULE_INT
            {
             before(grammarAccess.getEliminacionAccess().getPotenciaINTTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEliminacionAccess().getPotenciaINTTerminalRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__PotenciaAssignment_2_0_1"


    // $ANTLR start "rule__Eliminacion__TipoMaterialAssignment_2_1_0"
    // InternalMyDsl.g:1596:1: rule__Eliminacion__TipoMaterialAssignment_2_1_0 : ( ruleTipoMaterial ) ;
    public final void rule__Eliminacion__TipoMaterialAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1600:1: ( ( ruleTipoMaterial ) )
            // InternalMyDsl.g:1601:2: ( ruleTipoMaterial )
            {
            // InternalMyDsl.g:1601:2: ( ruleTipoMaterial )
            // InternalMyDsl.g:1602:3: ruleTipoMaterial
            {
             before(grammarAccess.getEliminacionAccess().getTipoMaterialTipoMaterialParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoMaterial();

            state._fsp--;

             after(grammarAccess.getEliminacionAccess().getTipoMaterialTipoMaterialParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__TipoMaterialAssignment_2_1_0"


    // $ANTLR start "rule__Eliminacion__GrosorAssignment_2_1_1"
    // InternalMyDsl.g:1611:1: rule__Eliminacion__GrosorAssignment_2_1_1 : ( RULE_INT ) ;
    public final void rule__Eliminacion__GrosorAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1615:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1616:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1616:2: ( RULE_INT )
            // InternalMyDsl.g:1617:3: RULE_INT
            {
             before(grammarAccess.getEliminacionAccess().getGrosorINTTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEliminacionAccess().getGrosorINTTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eliminacion__GrosorAssignment_2_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001CE000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});

}