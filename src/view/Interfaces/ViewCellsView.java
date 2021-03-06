package view.Interfaces;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.Implementations.ViewCellsControllerImpl.BackListener;
import view.Components.PrisonManagerJFrame;
import view.Components.PrisonManagerJPanel;
import view.Interfaces.Inter.ViewCells;

public class ViewCellsView extends PrisonManagerJFrame implements ViewCells{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4382628436360052382L;
	int rank;
	final PrisonManagerJPanel center;
    final PrisonManagerJPanel south;
    final PrisonManagerJPanel north;
    final JButton back = new JButton("Indietro");
    final JLabel title = new JLabel("Vedi celle : ");
    JTable table = new JTable();
	
    /**
     * costruttore
     * @param rank il rank della guardia che sta visualizzando il programma
     */
	public ViewCellsView(int rank){
		this.rank=rank;
		
		this.setSize(550, 430);	
		this.getContentPane().setLayout(new BorderLayout());
		north = new PrisonManagerJPanel(new FlowLayout());
		north.add(title);
		this.getContentPane().add(BorderLayout.NORTH,north);
		center = new PrisonManagerJPanel(new FlowLayout());
		this.getContentPane().add(BorderLayout.CENTER,center);
		south = new PrisonManagerJPanel(new FlowLayout());
		south.add(back);
		this.getContentPane().add(BorderLayout.SOUTH,south);
		this.setVisible(true);
	}
	
	 public int getRank(){
	    	return this.rank;
	    }
	 
	 public void addBackListener(BackListener backListener){
			back.addActionListener(backListener);
		}
	 
	 public void createTable(JTable table){
	    	this.table=table;
	    	table.setPreferredScrollableViewportSize(new Dimension(500,300));
	        table.setFillsViewportHeight(true);
	        JScrollPane js=new JScrollPane(table);
	        js.setVisible(true);
	    	center.add(js);
	 }

}
