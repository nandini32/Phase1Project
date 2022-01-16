
package ProjectPhase1;

import java.io.FileNotFoundException;

/**
 * @author Nandini_Gorkal
 *
 */


public interface FileDiscription {
	public void DisplayAllFiles();
	public void AddingFile();
	public void DeletingFile();
	abstract void SearchingFile() throws FileNotFoundException;
}

