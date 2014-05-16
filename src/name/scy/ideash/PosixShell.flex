package name.scy.ideash;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import name.scy.ideash.psi.PosixShellTypes;
import com.intellij.psi.TokenType;

%%

%class PosixShellLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{
return;
%eof}

CRLF=\n|\r|\r\n
COMMENT=#[^\n]*

%state WAITING_VALUE

%%

<YYINITIAL> {
  COMMENT { return PosixShellTypes.COMMENT; }
}

. { return TokenType.BAD_CHARACTER; }