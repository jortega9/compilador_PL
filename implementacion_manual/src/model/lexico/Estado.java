package model.lexico;

public enum Estado {
	INICIO, REC_MAS, REC_MENOS, REC_ID, REC_ENT, REC_0, REC_PDEC, REC_DEC, REC_0DEC, 
    REC_ASIG, REC_IGUAL, REC_DIST, REC_DISTFIN, REC_MAYOR, REC_MAYORIGUAL, REC_MENOR,
    REC_MENORIGUAL, REC_MUL, REC_DIV, REC_PAP, REC_PCIE, REC_PYCO, REC_PUNTO, 
    REC_CAMBSEC, REC_CAMBSECFIN, REC_EVAL, REC_COM, REC_COMINT, REC_EOF, REC_EXP, 
    REC_EXPPOS, REC_EXPNEG, REC_0EXP, REC_ENTEXP, REC_LLAVAP, REC_LLAVCIE
}
