package com.syntel.aset;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AssetDetails {

	protected Shell shell;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			AssetDetails window = new AssetDetails();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(801, 427);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		Label Uname = new Label(shell, SWT.NONE);
		Uname.setBounds(132, 62, 55, 15);
		Uname.setText("Name");
		
		Label Sname = new Label(shell, SWT.NONE);
		Sname.setBounds(426, 62, 55, 15);
		Sname.setText("Surname");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(215, 56, 76, 21);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(525, 56, 76, 21);
		
		Button submit = new Button(shell, SWT.NONE);
		submit.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		submit.setBounds(309, 137, 99, 25);
		submit.setText("Add to excel");

	}
}
