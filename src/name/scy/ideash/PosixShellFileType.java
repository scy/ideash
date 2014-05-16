package name.scy.ideash;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class PosixShellFileType extends LanguageFileType {
	public static final PosixShellFileType INSTANCE = new PosixShellFileType();

	private PosixShellFileType() {
		super(PosixShellLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "POSIX Shell file";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "POSIX Shell script file";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return "sh";
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return null;
	}
}
