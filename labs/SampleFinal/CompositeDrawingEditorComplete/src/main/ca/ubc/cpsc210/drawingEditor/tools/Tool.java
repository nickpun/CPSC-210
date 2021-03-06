package ca.ubc.cpsc210.drawingEditor.tools;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComponent;

import ca.ubc.cpsc210.drawingEditor.editor.DrawingEditor;

/**
 * Represents a tool in the application
 */
public abstract class Tool {
	
	// A tool is activated through its associated button
	protected JButton button;
	
	// Is this tool active?
	private boolean active;
	
	protected DrawingEditor editor;
	
	/**
	 * Constructor
	 * 
	 * @param editor  the drawing editor associated with this tool
	 * @param parent  the parent component to which this tool will be added
	 */
	public Tool(DrawingEditor editor, JComponent parent) {
		this.editor = editor;
		createButton(parent);
		addToParent(parent);
		active = false;
		addListener();
	}
	
	/**
	 * Determines if tool is active
	 * @return true if tool active, false otherwise
	 */
	protected boolean isActive() {
		return active;
	}
	
	/**
	 * Activates the tool
	 */
	public void activate() {
		active = true;
	}
	
	/**
	 * Deactivates the tool
	 */
	public void deactivate() {
		active = false;
	}
	
	/**
	 * Creates button used to activate tool
	 * @param parent  the parent component
	 */
	protected abstract void createButton(JComponent parent);
	
	/**
	 * Adds a listener for this tool.
	 */
	protected abstract void addListener();

	/**
	 * Adds button to parent component
	 * @param parent  the parent component
	 */
	public void addToParent(JComponent parent) {
		parent.add(button);
	}
	
	/**
	 * Mouse pressed handler - called when mouse button is pressed in drawing area
	 * @param e  the mouse event
	 */
	public abstract void mousePressedInDrawingArea(MouseEvent e);
	
	/**
	 * Mouse released handler - called when mouse button is released in drawing area 
	 * @param e  the mouse event
	 */
	public abstract void mouseReleasedInDrawingArea(MouseEvent e);

	/**
	 * Mouse clicked handler - called when mouse button is clicked in drawing area
	 * @param e  the mouse event
	 */
	public abstract void mouseClickedInDrawingArea(MouseEvent e) ;
	
	/**
	 * Mouse dragged handler - called when mouse is dragged in drawing area
	 * @param e  the mouse event
	 */
	public abstract void mouseDraggedInDrawingArea(MouseEvent e);

}
