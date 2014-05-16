package name.scy.ideash;

import com.intellij.lang.Language;

public class PosixShellLanguage extends Language {
	public static final PosixShellLanguage INSTANCE = new PosixShellLanguage();

	private PosixShellLanguage() {
		super("POSIX Shell");
	}
}
