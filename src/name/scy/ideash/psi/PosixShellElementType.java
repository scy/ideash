package name.scy.ideash.psi;

import com.intellij.psi.tree.IElementType;
import name.scy.ideash.PosixShellLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class PosixShellElementType extends IElementType {
	public PosixShellElementType(@NotNull @NonNls String debugName) {
		super(debugName, PosixShellLanguage.INSTANCE);
	}
}
