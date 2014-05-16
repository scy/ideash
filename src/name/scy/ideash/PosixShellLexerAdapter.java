package name.scy.ideash;

import com.intellij.lexer.FlexAdapter;
import java.io.Reader;

public class PosixShellLexerAdapter extends FlexAdapter {
	public PosixShellLexerAdapter() {
		super(new PosixShellLexer((Reader) null));
	}
}
