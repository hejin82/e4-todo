package de.vogella.e4.todo.contribute.handler;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class HelloHander {

	@Execute 
	public void run(Shell shell){
		System.out.println("Called");
		MessageDialog.openInformation(shell, "Just testing", "This is just a test");
	}
}
