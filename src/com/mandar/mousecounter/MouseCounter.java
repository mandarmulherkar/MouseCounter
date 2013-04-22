package com.mandar.mousecounter;

import java.awt.Frame;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class MouseCounter {

	private Display display = Display.getDefault();
	protected Shell shell = new Shell(display);
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MouseCounter window = new MouseCounter();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {

		shell.setText("MouseCounter");
 		shell.setLayout(new FillLayout());
 
	    // Create the SashForm with HORIZONTAL
	    SashForm sashForm = new SashForm(shell, SWT.HORIZONTAL);
	    Canvas videoCanvas = new Canvas(sashForm, SWT.NONE);
	    
	    // "mediaPlayer" is a regular vlcj MediaPlayer instance
	    //mediaPlayer.setVideoSurface(videoSurface);
	    
	    videoCanvas.pack();
	    
	    // Separator
	    Label label = new Label(shell, SWT.SEPARATOR | SWT.VERTICAL);

	    GridData data = new GridData(GridData.FILL, 
	            GridData.BEGINNING, true, false, 2, 1);
	    data = new GridData(GridData.FILL, GridData.BEGINNING, true,
	        false, 2, 1);
	    data.horizontalSpan=2;
	    label.setLayoutData(data);
	    
	    // Create the SashForm with VERTICAL
	    SashForm sashForm2 = new SashForm(shell, SWT.VERTICAL);
	    Button button1 = new Button(sashForm2, SWT.PUSH);
	    button1.setAlignment(SWT.RIGHT);
 

	}

}
