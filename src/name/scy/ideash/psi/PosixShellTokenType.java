package name.scy.ideash.psi;

import com.intellij.psi.tree.IElementType;
import name.scy.ideash.PosixShellLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PosixShellTokenType extends IElementType {
	public PosixShellTokenType(@NotNull @NonNls String debugName) {
		super(debugName, PosixShellLanguage.INSTANCE);
	}

	@Override
	public String toString() {
		return "PosixShellTokenType." + super.toString();
	}
}
