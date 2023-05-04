// $ANTLR null C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g 2023-04-30 19:24:53
package parser;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class AlgebraRelacionalParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CAD", "NUM", "WS", "'!='", "'('", 
		"')'", "','", "'-'", "'.'", "':='", "'<'", "'<='", "'='", "'>'", "'>= '", 
		"'AGRUPAR'", "'AND'", "'ASC'", "'AVG'", "'COUNT'", "'CRUZ'", "'DESC'", 
		"'DIFERENCIA'", "'DIVISION'", "'INTER'", "'MAX'", "'MIN'", "'OR'", "'ORDENAR'", 
		"'PROYECTAR'", "'RENOMBRAR'", "'REUNION'", "'REUNION_EXT_DER'", "'REUNION_EXT_FULL'", 
		"'REUNION_EXT_IZQ'", "'REUNION_NATURAL'", "'SELECCIONAR'", "'SUM'", "'UNION'", 
		"'\\u0027'", "'agrupar'", "'and'", "'asc'", "'avg'", "'count'", "'cruz'", 
		"'desc'", "'diferencia'", "'division'", "'inter'", "'max'", "'min'", "'or'", 
		"'ordenar'", "'proyectar'", "'renombrar'", "'reunion'", "'reunion_ext_der'", 
		"'reunion_ext_full'", "'reunion_ext_izq'", "'reunion_natural'", "'seleccionar'", 
		"'sum'", "'union'"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int CAD=4;
	public static final int NUM=5;
	public static final int WS=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public AlgebraRelacionalParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public AlgebraRelacionalParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return AlgebraRelacionalParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g"; }



	// $ANTLR start "st"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:3:1: st : ( asg | con ) ;
	public final void st() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:3:4: ( ( asg | con ) )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:3:6: ( asg | con )
			{
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:3:6: ( asg | con )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CAD) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==13) ) {
					alt1=1;
				}
				else if ( (LA1_1==24||LA1_1==26||LA1_1==28||(LA1_1 >= 36 && LA1_1 <= 39)||LA1_1==42||LA1_1==49||LA1_1==51||LA1_1==53||(LA1_1 >= 61 && LA1_1 <= 64)||LA1_1==67) ) {
					alt1=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA1_0==8||(LA1_0 >= 22 && LA1_0 <= 23)||(LA1_0 >= 29 && LA1_0 <= 30)||(LA1_0 >= 32 && LA1_0 <= 34)||(LA1_0 >= 40 && LA1_0 <= 41)||(LA1_0 >= 47 && LA1_0 <= 48)||(LA1_0 >= 54 && LA1_0 <= 55)||(LA1_0 >= 57 && LA1_0 <= 59)||(LA1_0 >= 65 && LA1_0 <= 66)) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:3:8: asg
					{
					pushFollow(FOLLOW_asg_in_st12);
					asg();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:3:14: con
					{
					pushFollow(FOLLOW_con_in_st16);
					con();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "st"



	// $ANTLR start "asg"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:4:1: asg : rel ':=' con ;
	public final void asg() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:4:5: ( rel ':=' con )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:4:7: rel ':=' con
			{
			pushFollow(FOLLOW_rel_in_asg25);
			rel();
			state._fsp--;

			match(input,13,FOLLOW_13_in_asg27); 
			pushFollow(FOLLOW_con_in_asg29);
			con();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "asg"



	// $ANTLR start "con"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:1: con : ( bin | select | proy | renom1 | renom2 | renom3 | join | groupby | orderby | agregation | division ) ;
	public final void con() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:5: ( ( bin | select | proy | renom1 | renom2 | renom3 | join | groupby | orderby | agregation | division ) )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:7: ( bin | select | proy | renom1 | renom2 | renom3 | join | groupby | orderby | agregation | division )
			{
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:7: ( bin | select | proy | renom1 | renom2 | renom3 | join | groupby | orderby | agregation | division )
			int alt2=11;
			alt2 = dfa2.predict(input);
			switch (alt2) {
				case 1 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:9: bin
					{
					pushFollow(FOLLOW_bin_in_con38);
					bin();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:15: select
					{
					pushFollow(FOLLOW_select_in_con42);
					select();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:24: proy
					{
					pushFollow(FOLLOW_proy_in_con46);
					proy();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:31: renom1
					{
					pushFollow(FOLLOW_renom1_in_con50);
					renom1();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:40: renom2
					{
					pushFollow(FOLLOW_renom2_in_con54);
					renom2();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:49: renom3
					{
					pushFollow(FOLLOW_renom3_in_con58);
					renom3();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:58: join
					{
					pushFollow(FOLLOW_join_in_con62);
					join();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:65: groupby
					{
					pushFollow(FOLLOW_groupby_in_con66);
					groupby();
					state._fsp--;

					}
					break;
				case 9 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:75: orderby
					{
					pushFollow(FOLLOW_orderby_in_con70);
					orderby();
					state._fsp--;

					}
					break;
				case 10 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:85: agregation
					{
					pushFollow(FOLLOW_agregation_in_con74);
					agregation();
					state._fsp--;

					}
					break;
				case 11 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:5:98: division
					{
					pushFollow(FOLLOW_division_in_con78);
					division();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "con"



	// $ANTLR start "bin"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:8:1: bin : ( rel ( 'UNION' | 'union' ) rel | rel ( 'INTER' | 'inter' ) rel | rel ( 'DIFERENCIA' | 'diferencia' ) rel | rel ( 'CRUZ' | 'cruz' ) rel | rel ( 'REUNION_NATURAL' | 'reunion_natural' ) rel | rel ( 'reunion_ext_izq' | 'REUNION_EXT_IZQ' ) rel | rel ( 'reunion_ext_der' | 'REUNION_EXT_DER' ) rel | rel ( 'reunion_ext_full' | 'REUNION_EXT_FULL' ) rel );
	public final void bin() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:8:5: ( rel ( 'UNION' | 'union' ) rel | rel ( 'INTER' | 'inter' ) rel | rel ( 'DIFERENCIA' | 'diferencia' ) rel | rel ( 'CRUZ' | 'cruz' ) rel | rel ( 'REUNION_NATURAL' | 'reunion_natural' ) rel | rel ( 'reunion_ext_izq' | 'REUNION_EXT_IZQ' ) rel | rel ( 'reunion_ext_der' | 'REUNION_EXT_DER' ) rel | rel ( 'reunion_ext_full' | 'REUNION_EXT_FULL' ) rel )
			int alt3=8;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CAD) ) {
				switch ( input.LA(2) ) {
				case 42:
				case 67:
					{
					alt3=1;
					}
					break;
				case 28:
				case 53:
					{
					alt3=2;
					}
					break;
				case 26:
				case 51:
					{
					alt3=3;
					}
					break;
				case 24:
				case 49:
					{
					alt3=4;
					}
					break;
				case 39:
				case 64:
					{
					alt3=5;
					}
					break;
				case 38:
				case 63:
					{
					alt3=6;
					}
					break;
				case 36:
				case 61:
					{
					alt3=7;
					}
					break;
				case 37:
				case 62:
					{
					alt3=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:8:7: rel ( 'UNION' | 'union' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin88);
					rel();
					state._fsp--;

					if ( input.LA(1)==42||input.LA(1)==67 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin96);
					rel();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:9:3: rel ( 'INTER' | 'inter' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin100);
					rel();
					state._fsp--;

					if ( input.LA(1)==28||input.LA(1)==53 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin108);
					rel();
					state._fsp--;

					}
					break;
				case 3 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:10:3: rel ( 'DIFERENCIA' | 'diferencia' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin112);
					rel();
					state._fsp--;

					if ( input.LA(1)==26||input.LA(1)==51 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin120);
					rel();
					state._fsp--;

					}
					break;
				case 4 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:11:3: rel ( 'CRUZ' | 'cruz' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin124);
					rel();
					state._fsp--;

					if ( input.LA(1)==24||input.LA(1)==49 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin132);
					rel();
					state._fsp--;

					}
					break;
				case 5 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:12:3: rel ( 'REUNION_NATURAL' | 'reunion_natural' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin136);
					rel();
					state._fsp--;

					if ( input.LA(1)==39||input.LA(1)==64 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin144);
					rel();
					state._fsp--;

					}
					break;
				case 6 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:13:3: rel ( 'reunion_ext_izq' | 'REUNION_EXT_IZQ' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin148);
					rel();
					state._fsp--;

					if ( input.LA(1)==38||input.LA(1)==63 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin156);
					rel();
					state._fsp--;

					}
					break;
				case 7 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:14:3: rel ( 'reunion_ext_der' | 'REUNION_EXT_DER' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin160);
					rel();
					state._fsp--;

					if ( input.LA(1)==36||input.LA(1)==61 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin168);
					rel();
					state._fsp--;

					}
					break;
				case 8 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:15:3: rel ( 'reunion_ext_full' | 'REUNION_EXT_FULL' ) rel
					{
					pushFollow(FOLLOW_rel_in_bin172);
					rel();
					state._fsp--;

					if ( input.LA(1)==37||input.LA(1)==62 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_rel_in_bin180);
					rel();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "bin"



	// $ANTLR start "select"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:17:1: select : ( 'seleccionar' | 'SELECCIONAR' ) '(' conds1 ')' '(' rel ')' ;
	public final void select() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:17:8: ( ( 'seleccionar' | 'SELECCIONAR' ) '(' conds1 ')' '(' rel ')' )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:17:10: ( 'seleccionar' | 'SELECCIONAR' ) '(' conds1 ')' '(' rel ')'
			{
			if ( input.LA(1)==40||input.LA(1)==65 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,8,FOLLOW_8_in_select193); 
			pushFollow(FOLLOW_conds1_in_select194);
			conds1();
			state._fsp--;

			match(input,9,FOLLOW_9_in_select195); 
			match(input,8,FOLLOW_8_in_select196); 
			pushFollow(FOLLOW_rel_in_select197);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_select198); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "select"



	// $ANTLR start "proy"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:18:1: proy : ( 'proyectar' | 'PROYECTAR' ) '(' atts ')' '(' rel ')' ;
	public final void proy() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:18:6: ( ( 'proyectar' | 'PROYECTAR' ) '(' atts ')' '(' rel ')' )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:18:8: ( 'proyectar' | 'PROYECTAR' ) '(' atts ')' '(' rel ')'
			{
			if ( input.LA(1)==33||input.LA(1)==58 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,8,FOLLOW_8_in_proy210); 
			pushFollow(FOLLOW_atts_in_proy211);
			atts();
			state._fsp--;

			match(input,9,FOLLOW_9_in_proy212); 
			match(input,8,FOLLOW_8_in_proy213); 
			pushFollow(FOLLOW_rel_in_proy214);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_proy215); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "proy"



	// $ANTLR start "renom1"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:19:1: renom1 : ( 'renombrar' | 'RENOMBRAR' ) rel '(' atts ')' '(' rel ')' ;
	public final void renom1() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:19:8: ( ( 'renombrar' | 'RENOMBRAR' ) rel '(' atts ')' '(' rel ')' )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:19:10: ( 'renombrar' | 'RENOMBRAR' ) rel '(' atts ')' '(' rel ')'
			{
			if ( input.LA(1)==34||input.LA(1)==59 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_rel_in_renom1228);
			rel();
			state._fsp--;

			match(input,8,FOLLOW_8_in_renom1230); 
			pushFollow(FOLLOW_atts_in_renom1231);
			atts();
			state._fsp--;

			match(input,9,FOLLOW_9_in_renom1232); 
			match(input,8,FOLLOW_8_in_renom1233); 
			pushFollow(FOLLOW_rel_in_renom1234);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_renom1235); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "renom1"



	// $ANTLR start "renom2"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:20:1: renom2 : ( 'renombrar' | 'RENOMBRAR' ) rel '(' rel ')' ;
	public final void renom2() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:20:8: ( ( 'renombrar' | 'RENOMBRAR' ) rel '(' rel ')' )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:20:10: ( 'renombrar' | 'RENOMBRAR' ) rel '(' rel ')'
			{
			if ( input.LA(1)==34||input.LA(1)==59 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_rel_in_renom2248);
			rel();
			state._fsp--;

			match(input,8,FOLLOW_8_in_renom2250); 
			pushFollow(FOLLOW_rel_in_renom2251);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_renom2252); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "renom2"



	// $ANTLR start "renom3"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:21:1: renom3 : ( 'renombrar' | 'RENOMBRAR' ) '(' atts ')' '(' rel ')' ;
	public final void renom3() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:21:8: ( ( 'renombrar' | 'RENOMBRAR' ) '(' atts ')' '(' rel ')' )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:21:10: ( 'renombrar' | 'RENOMBRAR' ) '(' atts ')' '(' rel ')'
			{
			if ( input.LA(1)==34||input.LA(1)==59 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,8,FOLLOW_8_in_renom3264); 
			pushFollow(FOLLOW_atts_in_renom3265);
			atts();
			state._fsp--;

			match(input,9,FOLLOW_9_in_renom3266); 
			match(input,8,FOLLOW_8_in_renom3267); 
			pushFollow(FOLLOW_rel_in_renom3268);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_renom3269); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "renom3"



	// $ANTLR start "join"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:22:1: join : '(' rel ')' ( 'reunion' | 'REUNION' ) '(' conds2 ')' '(' rel ')' ;
	public final void join() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:22:6: ( '(' rel ')' ( 'reunion' | 'REUNION' ) '(' conds2 ')' '(' rel ')' )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:22:8: '(' rel ')' ( 'reunion' | 'REUNION' ) '(' conds2 ')' '(' rel ')'
			{
			match(input,8,FOLLOW_8_in_join276); 
			pushFollow(FOLLOW_rel_in_join277);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_join278); 
			if ( input.LA(1)==35||input.LA(1)==60 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,8,FOLLOW_8_in_join284); 
			pushFollow(FOLLOW_conds2_in_join285);
			conds2();
			state._fsp--;

			match(input,9,FOLLOW_9_in_join286); 
			match(input,8,FOLLOW_8_in_join287); 
			pushFollow(FOLLOW_rel_in_join288);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_join289); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "join"



	// $ANTLR start "groupby"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:23:1: groupby : '(' atts ')' ( 'agrupar' | 'AGRUPAR' ) fagregas '(' rel ')' ;
	public final void groupby() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:23:9: ( '(' atts ')' ( 'agrupar' | 'AGRUPAR' ) fagregas '(' rel ')' )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:23:11: '(' atts ')' ( 'agrupar' | 'AGRUPAR' ) fagregas '(' rel ')'
			{
			match(input,8,FOLLOW_8_in_groupby296); 
			pushFollow(FOLLOW_atts_in_groupby298);
			atts();
			state._fsp--;

			match(input,9,FOLLOW_9_in_groupby299); 
			if ( input.LA(1)==19||input.LA(1)==44 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_fagregas_in_groupby307);
			fagregas();
			state._fsp--;

			match(input,8,FOLLOW_8_in_groupby309); 
			pushFollow(FOLLOW_rel_in_groupby310);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_groupby311); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "groupby"



	// $ANTLR start "orderby"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:24:1: orderby : ( 'ordenar' | 'ORDENAR' ) orders '(' rel ')' ;
	public final void orderby() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:24:9: ( ( 'ordenar' | 'ORDENAR' ) orders '(' rel ')' )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:24:11: ( 'ordenar' | 'ORDENAR' ) orders '(' rel ')'
			{
			if ( input.LA(1)==32||input.LA(1)==57 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_orders_in_orderby326);
			orders();
			state._fsp--;

			match(input,8,FOLLOW_8_in_orderby328); 
			pushFollow(FOLLOW_rel_in_orderby329);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_orderby330); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "orderby"



	// $ANTLR start "agregation"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:25:1: agregation : fagrega ( att '(' rel ')' ) ;
	public final void agregation() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:25:12: ( fagrega ( att '(' rel ')' ) )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:25:14: fagrega ( att '(' rel ')' )
			{
			pushFollow(FOLLOW_fagrega_in_agregation338);
			fagrega();
			state._fsp--;

			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:25:22: ( att '(' rel ')' )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:25:24: att '(' rel ')'
			{
			pushFollow(FOLLOW_att_in_agregation342);
			att();
			state._fsp--;

			match(input,8,FOLLOW_8_in_agregation344); 
			pushFollow(FOLLOW_rel_in_agregation345);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_agregation346); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "agregation"



	// $ANTLR start "division"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:26:1: division : '(' atts ')' '(' rel ')' ( 'division' | 'DIVISION' ) '(' att ')' '(' rel ')' ;
	public final void division() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:26:9: ( '(' atts ')' '(' rel ')' ( 'division' | 'DIVISION' ) '(' att ')' '(' rel ')' )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:26:11: '(' atts ')' '(' rel ')' ( 'division' | 'DIVISION' ) '(' att ')' '(' rel ')'
			{
			match(input,8,FOLLOW_8_in_division355); 
			pushFollow(FOLLOW_atts_in_division356);
			atts();
			state._fsp--;

			match(input,9,FOLLOW_9_in_division357); 
			match(input,8,FOLLOW_8_in_division358); 
			pushFollow(FOLLOW_rel_in_division359);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_division360); 
			if ( input.LA(1)==27||input.LA(1)==52 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,8,FOLLOW_8_in_division366); 
			pushFollow(FOLLOW_att_in_division367);
			att();
			state._fsp--;

			match(input,9,FOLLOW_9_in_division368); 
			match(input,8,FOLLOW_8_in_division369); 
			pushFollow(FOLLOW_rel_in_division370);
			rel();
			state._fsp--;

			match(input,9,FOLLOW_9_in_division371); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "division"



	// $ANTLR start "atts"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:29:1: atts : att ( ',' att )* ;
	public final void atts() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:29:6: ( att ( ',' att )* )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:29:8: att ( ',' att )*
			{
			pushFollow(FOLLOW_att_in_atts380);
			att();
			state._fsp--;

			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:29:12: ( ',' att )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==10) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:29:13: ',' att
					{
					match(input,10,FOLLOW_10_in_atts383); 
					pushFollow(FOLLOW_att_in_atts385);
					att();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atts"



	// $ANTLR start "conds1"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:30:1: conds1 : cond1 ( ( 'and' | 'or' | 'AND' | 'OR' ) cond1 )* ;
	public final void conds1() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:30:8: ( cond1 ( ( 'and' | 'or' | 'AND' | 'OR' ) cond1 )* )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:30:10: cond1 ( ( 'and' | 'or' | 'AND' | 'OR' ) cond1 )*
			{
			pushFollow(FOLLOW_cond1_in_conds1394);
			cond1();
			state._fsp--;

			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:30:16: ( ( 'and' | 'or' | 'AND' | 'OR' ) cond1 )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==20||LA5_0==31||LA5_0==45||LA5_0==56) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:30:17: ( 'and' | 'or' | 'AND' | 'OR' ) cond1
					{
					if ( input.LA(1)==20||input.LA(1)==31||input.LA(1)==45||input.LA(1)==56 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_cond1_in_conds1415);
					cond1();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "conds1"



	// $ANTLR start "conds2"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:31:1: conds2 : cond2 ( ( 'and' | 'or' | 'AND' | 'OR' ) cond2 )* ;
	public final void conds2() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:31:8: ( cond2 ( ( 'and' | 'or' | 'AND' | 'OR' ) cond2 )* )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:31:10: cond2 ( ( 'and' | 'or' | 'AND' | 'OR' ) cond2 )*
			{
			pushFollow(FOLLOW_cond2_in_conds2424);
			cond2();
			state._fsp--;

			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:31:16: ( ( 'and' | 'or' | 'AND' | 'OR' ) cond2 )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==20||LA6_0==31||LA6_0==45||LA6_0==56) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:31:17: ( 'and' | 'or' | 'AND' | 'OR' ) cond2
					{
					if ( input.LA(1)==20||input.LA(1)==31||input.LA(1)==45||input.LA(1)==56 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_cond2_in_conds2445);
					cond2();
					state._fsp--;

					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "conds2"



	// $ANTLR start "cond1"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:32:1: cond1 : ( con1 | con11 ) ;
	public final void cond1() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:32:7: ( ( con1 | con11 ) )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:32:9: ( con1 | con11 )
			{
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:32:9: ( con1 | con11 )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==CAD) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==7||(LA7_1 >= 14 && LA7_1 <= 18)) ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2==NUM||LA7_2==11||LA7_2==43) ) {
						alt7=1;
					}
					else if ( (LA7_2==CAD) ) {
						alt7=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:32:11: con1
					{
					pushFollow(FOLLOW_con1_in_cond1456);
					con1();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:32:17: con11
					{
					pushFollow(FOLLOW_con11_in_cond1459);
					con11();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cond1"



	// $ANTLR start "cond2"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:33:1: cond2 : ( con2 | con3 ) ;
	public final void cond2() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:33:7: ( ( con2 | con3 ) )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:33:9: ( con2 | con3 )
			{
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:33:9: ( con2 | con3 )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==CAD) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==12) ) {
					int LA8_2 = input.LA(3);
					if ( (LA8_2==CAD) ) {
						int LA8_3 = input.LA(4);
						if ( (LA8_3==7||(LA8_3 >= 14 && LA8_3 <= 18)) ) {
							int LA8_4 = input.LA(5);
							if ( (LA8_4==CAD) ) {
								alt8=1;
							}
							else if ( (LA8_4==NUM||LA8_4==11||LA8_4==43) ) {
								alt8=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 8, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:33:11: con2
					{
					pushFollow(FOLLOW_con2_in_cond2470);
					con2();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:33:17: con3
					{
					pushFollow(FOLLOW_con3_in_cond2473);
					con3();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cond2"



	// $ANTLR start "orders"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:34:1: orders : att '(' order ')' ( ',' att '(' order ')' )* ;
	public final void orders() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:34:8: ( att '(' order ')' ( ',' att '(' order ')' )* )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:34:10: att '(' order ')' ( ',' att '(' order ')' )*
			{
			pushFollow(FOLLOW_att_in_orders482);
			att();
			state._fsp--;

			match(input,8,FOLLOW_8_in_orders484); 
			pushFollow(FOLLOW_order_in_orders485);
			order();
			state._fsp--;

			match(input,9,FOLLOW_9_in_orders486); 
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:34:26: ( ',' att '(' order ')' )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==10) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:34:27: ',' att '(' order ')'
					{
					match(input,10,FOLLOW_10_in_orders489); 
					pushFollow(FOLLOW_att_in_orders491);
					att();
					state._fsp--;

					match(input,8,FOLLOW_8_in_orders493); 
					pushFollow(FOLLOW_order_in_orders494);
					order();
					state._fsp--;

					match(input,9,FOLLOW_9_in_orders495); 
					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "orders"



	// $ANTLR start "order"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:35:1: order : ( 'asc' | 'ASC' | 'desc' | 'DESC' ) ;
	public final void order() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:35:7: ( ( 'asc' | 'ASC' | 'desc' | 'DESC' ) )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:
			{
			if ( input.LA(1)==21||input.LA(1)==25||input.LA(1)==46||input.LA(1)==50 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "order"



	// $ANTLR start "fagregas"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:36:1: fagregas : fagrega '(' att ')' ( ',' fagrega '(' att ')' )* ;
	public final void fagregas() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:36:9: ( fagrega '(' att ')' ( ',' fagrega '(' att ')' )* )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:36:11: fagrega '(' att ')' ( ',' fagrega '(' att ')' )*
			{
			pushFollow(FOLLOW_fagrega_in_fagregas529);
			fagrega();
			state._fsp--;

			match(input,8,FOLLOW_8_in_fagregas531); 
			pushFollow(FOLLOW_att_in_fagregas532);
			att();
			state._fsp--;

			match(input,9,FOLLOW_9_in_fagregas533); 
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:36:29: ( ',' fagrega '(' att ')' )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==10) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:36:30: ',' fagrega '(' att ')'
					{
					match(input,10,FOLLOW_10_in_fagregas536); 
					pushFollow(FOLLOW_fagrega_in_fagregas538);
					fagrega();
					state._fsp--;

					match(input,8,FOLLOW_8_in_fagregas540); 
					pushFollow(FOLLOW_att_in_fagregas541);
					att();
					state._fsp--;

					match(input,9,FOLLOW_9_in_fagregas542); 
					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fagregas"



	// $ANTLR start "fagrega"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:37:1: fagrega : ( 'sum' | 'SUM' | 'avg' | 'AVG' | 'count' | 'COUNT' | 'min' | 'MIN' | 'max' | 'MAX' ) ;
	public final void fagrega() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:37:9: ( ( 'sum' | 'SUM' | 'avg' | 'AVG' | 'count' | 'COUNT' | 'min' | 'MIN' | 'max' | 'MAX' ) )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:
			{
			if ( (input.LA(1) >= 22 && input.LA(1) <= 23)||(input.LA(1) >= 29 && input.LA(1) <= 30)||input.LA(1)==41||(input.LA(1) >= 47 && input.LA(1) <= 48)||(input.LA(1) >= 54 && input.LA(1) <= 55)||input.LA(1)==66 ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "fagrega"



	// $ANTLR start "con1"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:38:1: con1 : att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) cons ;
	public final void con1() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:38:6: ( att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) cons )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:38:8: att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) cons
			{
			pushFollow(FOLLOW_att_in_con1598);
			att();
			state._fsp--;

			if ( input.LA(1)==7||(input.LA(1) >= 14 && input.LA(1) <= 18) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_cons_in_con1624);
			cons();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "con1"



	// $ANTLR start "con11"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:39:1: con11 : att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) att ;
	public final void con11() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:39:7: ( att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) att )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:39:9: att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) att
			{
			pushFollow(FOLLOW_att_in_con11631);
			att();
			state._fsp--;

			if ( input.LA(1)==7||(input.LA(1) >= 14 && input.LA(1) <= 18) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_att_in_con11657);
			att();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "con11"



	// $ANTLR start "con2"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:40:1: con2 : rel '.' att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) rel '.' att ;
	public final void con2() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:40:6: ( rel '.' att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) rel '.' att )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:40:8: rel '.' att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) rel '.' att
			{
			pushFollow(FOLLOW_rel_in_con2664);
			rel();
			state._fsp--;

			match(input,12,FOLLOW_12_in_con2665); 
			pushFollow(FOLLOW_att_in_con2666);
			att();
			state._fsp--;

			if ( input.LA(1)==7||(input.LA(1) >= 14 && input.LA(1) <= 18) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_rel_in_con2692);
			rel();
			state._fsp--;

			match(input,12,FOLLOW_12_in_con2693); 
			pushFollow(FOLLOW_att_in_con2694);
			att();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "con2"



	// $ANTLR start "con3"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:41:1: con3 : rel '.' att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) cons ;
	public final void con3() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:41:6: ( rel '.' att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) cons )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:41:8: rel '.' att ( '=' | '<' | '<=' | '>' | '>= ' | '!=' ) cons
			{
			pushFollow(FOLLOW_rel_in_con3701);
			rel();
			state._fsp--;

			match(input,12,FOLLOW_12_in_con3702); 
			pushFollow(FOLLOW_att_in_con3703);
			att();
			state._fsp--;

			if ( input.LA(1)==7||(input.LA(1) >= 14 && input.LA(1) <= 18) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			pushFollow(FOLLOW_cons_in_con3729);
			cons();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "con3"



	// $ANTLR start "cons"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:42:1: cons : ( num | cad ) ;
	public final void cons() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:42:6: ( ( num | cad ) )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:42:8: ( num | cad )
			{
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:42:8: ( num | cad )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==NUM||LA11_0==11) ) {
				alt11=1;
			}
			else if ( (LA11_0==43) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:42:10: num
					{
					pushFollow(FOLLOW_num_in_cons738);
					num();
					state._fsp--;

					}
					break;
				case 2 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:42:16: cad
					{
					pushFollow(FOLLOW_cad_in_cons742);
					cad();
					state._fsp--;

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cons"



	// $ANTLR start "num"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:43:1: num : ( '-' )? ( NUM )+ ( '.' ( NUM )+ )? ;
	public final void num() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:43:5: ( ( '-' )? ( NUM )+ ( '.' ( NUM )+ )? )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:43:7: ( '-' )? ( NUM )+ ( '.' ( NUM )+ )?
			{
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:43:7: ( '-' )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==11) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:43:8: '-'
					{
					match(input,11,FOLLOW_11_in_num752); 
					}
					break;

			}

			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:43:13: ( NUM )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==NUM) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:43:14: NUM
					{
					match(input,NUM,FOLLOW_NUM_in_num756); 
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:43:19: ( '.' ( NUM )+ )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==12) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:43:20: '.' ( NUM )+
					{
					match(input,12,FOLLOW_12_in_num760); 
					// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:43:23: ( NUM )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==NUM) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:43:24: NUM
							{
							match(input,NUM,FOLLOW_NUM_in_num762); 
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "num"



	// $ANTLR start "cad"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:44:1: cad : '\\u0027' CAD '\\u0027' ;
	public final void cad() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:44:5: ( '\\u0027' CAD '\\u0027' )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:44:7: '\\u0027' CAD '\\u0027'
			{
			match(input,43,FOLLOW_43_in_cad773); 
			match(input,CAD,FOLLOW_CAD_in_cad774); 
			match(input,43,FOLLOW_43_in_cad775); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "cad"



	// $ANTLR start "att"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:45:1: att : CAD ;
	public final void att() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:45:5: ( CAD )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:45:7: CAD
			{
			match(input,CAD,FOLLOW_CAD_in_att782); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "att"



	// $ANTLR start "rel"
	// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:46:1: rel : CAD ;
	public final void rel() throws RecognitionException {
		try {
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:46:5: ( CAD )
			// C:\\Users\\yianv\\OneDrive\\Trabajo de titulo 1\\implementacion\\gramatica\\AlgebraRelacional.g:46:7: CAD
			{
			match(input,CAD,FOLLOW_CAD_in_rel789); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "rel"

	// Delegated rules


	protected DFA2 dfa2 = new DFA2(this);
	static final String DFA2_eotS =
		"\27\uffff";
	static final String DFA2_eofS =
		"\24\uffff\1\26\2\uffff";
	static final String DFA2_minS =
		"\1\4\3\uffff\2\4\3\uffff\1\10\1\11\1\4\1\10\1\4\1\11\3\uffff\1\11\1\uffff"+
		"\2\10\1\uffff";
	static final String DFA2_maxS =
		"\1\102\3\uffff\1\10\1\4\3\uffff\1\10\1\12\1\4\1\74\1\4\1\12\3\uffff\1"+
		"\12\1\uffff\1\10\1\54\1\uffff";
	static final String DFA2_acceptS =
		"\1\uffff\1\1\1\2\1\3\2\uffff\1\11\1\12\1\6\6\uffff\1\7\1\10\1\13\1\uffff"+
		"\1\4\2\uffff\1\5";
	static final String DFA2_specialS =
		"\27\uffff}>";
	static final String[] DFA2_transitionS = {
			"\1\1\3\uffff\1\5\15\uffff\2\7\5\uffff\2\7\1\uffff\1\6\1\3\1\4\5\uffff"+
			"\1\2\1\7\5\uffff\2\7\5\uffff\2\7\1\uffff\1\6\1\3\1\4\5\uffff\1\2\1\7",
			"",
			"",
			"",
			"\1\11\3\uffff\1\10",
			"\1\12",
			"",
			"",
			"",
			"\1\13",
			"\1\14\1\15",
			"\1\16",
			"\1\21\12\uffff\1\20\17\uffff\1\17\10\uffff\1\20\17\uffff\1\17",
			"\1\22",
			"\1\24\1\23",
			"",
			"",
			"",
			"\1\25\1\15",
			"",
			"\1\23",
			"\1\21\12\uffff\1\20\30\uffff\1\20",
			""
	};

	static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
	static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
	static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
	static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
	static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
	static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
	static final short[][] DFA2_transition;

	static {
		int numStates = DFA2_transitionS.length;
		DFA2_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
		}
	}

	protected class DFA2 extends DFA {

		public DFA2(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 2;
			this.eot = DFA2_eot;
			this.eof = DFA2_eof;
			this.min = DFA2_min;
			this.max = DFA2_max;
			this.accept = DFA2_accept;
			this.special = DFA2_special;
			this.transition = DFA2_transition;
		}
		@Override
		public String getDescription() {
			return "5:7: ( bin | select | proy | renom1 | renom2 | renom3 | join | groupby | orderby | agregation | division )";
		}
	}

	public static final BitSet FOLLOW_asg_in_st12 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_con_in_st16 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_asg25 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_asg27 = new BitSet(new long[]{0x0EC1830760C00110L,0x0000000000000006L});
	public static final BitSet FOLLOW_con_in_asg29 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bin_in_con38 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_in_con42 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_proy_in_con46 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_renom1_in_con50 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_renom2_in_con54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_renom3_in_con58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_in_con62 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_groupby_in_con66 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orderby_in_con70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_agregation_in_con74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_division_in_con78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin88 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_set_in_bin90 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin100 = new BitSet(new long[]{0x0020000010000000L});
	public static final BitSet FOLLOW_set_in_bin102 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin112 = new BitSet(new long[]{0x0008000004000000L});
	public static final BitSet FOLLOW_set_in_bin114 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin120 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin124 = new BitSet(new long[]{0x0002000001000000L});
	public static final BitSet FOLLOW_set_in_bin126 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin136 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_set_in_bin138 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin148 = new BitSet(new long[]{0x8000004000000000L});
	public static final BitSet FOLLOW_set_in_bin150 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin160 = new BitSet(new long[]{0x2000001000000000L});
	public static final BitSet FOLLOW_set_in_bin162 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_bin172 = new BitSet(new long[]{0x4000002000000000L});
	public static final BitSet FOLLOW_set_in_bin174 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_bin180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_select188 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_select193 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_conds1_in_select194 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_select195 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_select196 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_select197 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_select198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_proy205 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_proy210 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_atts_in_proy211 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_proy212 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_proy213 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_proy214 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_proy215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_renom1222 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_renom1228 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_renom1230 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_atts_in_renom1231 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_renom1232 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_renom1233 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_renom1234 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_renom1235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_renom2242 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_renom2248 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_renom2250 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_renom2251 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_renom2252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_renom3259 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_renom3264 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_atts_in_renom3265 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_renom3266 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_renom3267 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_renom3268 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_renom3269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_join276 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_join277 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_join278 = new BitSet(new long[]{0x1000000800000000L});
	public static final BitSet FOLLOW_set_in_join279 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_join284 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_conds2_in_join285 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_join286 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_join287 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_join288 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_join289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_groupby296 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_atts_in_groupby298 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_groupby299 = new BitSet(new long[]{0x0000100000080000L});
	public static final BitSet FOLLOW_set_in_groupby301 = new BitSet(new long[]{0x00C1820060C00000L,0x0000000000000004L});
	public static final BitSet FOLLOW_fagregas_in_groupby307 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_groupby309 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_groupby310 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_groupby311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_orderby318 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_orders_in_orderby326 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_orderby328 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_orderby329 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_orderby330 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fagrega_in_agregation338 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_att_in_agregation342 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_agregation344 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_agregation345 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_agregation346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_8_in_division355 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_atts_in_division356 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_division357 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_division358 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_division359 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_division360 = new BitSet(new long[]{0x0010000008000000L});
	public static final BitSet FOLLOW_set_in_division361 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_division366 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_att_in_division367 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_division368 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_division369 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_division370 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_division371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_att_in_atts380 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_atts383 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_att_in_atts385 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_cond1_in_conds1394 = new BitSet(new long[]{0x0100200080100002L});
	public static final BitSet FOLLOW_set_in_conds1397 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_cond1_in_conds1415 = new BitSet(new long[]{0x0100200080100002L});
	public static final BitSet FOLLOW_cond2_in_conds2424 = new BitSet(new long[]{0x0100200080100002L});
	public static final BitSet FOLLOW_set_in_conds2427 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_cond2_in_conds2445 = new BitSet(new long[]{0x0100200080100002L});
	public static final BitSet FOLLOW_con1_in_cond1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_con11_in_cond1459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_con2_in_cond2470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_con3_in_cond2473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_att_in_orders482 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_orders484 = new BitSet(new long[]{0x0004400002200000L});
	public static final BitSet FOLLOW_order_in_orders485 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_orders486 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_orders489 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_att_in_orders491 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_orders493 = new BitSet(new long[]{0x0004400002200000L});
	public static final BitSet FOLLOW_order_in_orders494 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_orders495 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_fagrega_in_fagregas529 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_fagregas531 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_att_in_fagregas532 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_fagregas533 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_10_in_fagregas536 = new BitSet(new long[]{0x00C1820060C00000L,0x0000000000000004L});
	public static final BitSet FOLLOW_fagrega_in_fagregas538 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_fagregas540 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_att_in_fagregas541 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_fagregas542 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_att_in_con1598 = new BitSet(new long[]{0x000000000007C080L});
	public static final BitSet FOLLOW_set_in_con1600 = new BitSet(new long[]{0x0000080000000820L});
	public static final BitSet FOLLOW_cons_in_con1624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_att_in_con11631 = new BitSet(new long[]{0x000000000007C080L});
	public static final BitSet FOLLOW_set_in_con11633 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_att_in_con11657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_con2664 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_con2665 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_att_in_con2666 = new BitSet(new long[]{0x000000000007C080L});
	public static final BitSet FOLLOW_set_in_con2668 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_rel_in_con2692 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_con2693 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_att_in_con2694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rel_in_con3701 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_con3702 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_att_in_con3703 = new BitSet(new long[]{0x000000000007C080L});
	public static final BitSet FOLLOW_set_in_con3705 = new BitSet(new long[]{0x0000080000000820L});
	public static final BitSet FOLLOW_cons_in_con3729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_num_in_cons738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cad_in_cons742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_num752 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUM_in_num756 = new BitSet(new long[]{0x0000000000001022L});
	public static final BitSet FOLLOW_12_in_num760 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_NUM_in_num762 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_43_in_cad773 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_CAD_in_cad774 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_cad775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAD_in_att782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CAD_in_rel789 = new BitSet(new long[]{0x0000000000000002L});
}
