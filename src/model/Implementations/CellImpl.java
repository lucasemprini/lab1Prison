package model.Implementations;

import java.io.Serializable;

import model.Interfaces.Cell;

/**
 * implementazione di una cella
 */
public class CellImpl implements Cell, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9167940013424894676L;
	
	private int id;
	private String position;
	private int capacity;
	private int CurrentPrisoners;
	
	/**
	 * costruttore cella
	 * @param id id cella
	 * @param position posizione
	 * @param capacity capacità
	 */
	public CellImpl(final int id, final String position, final int capacity){
		this.id=id;
		this.position=position;
		this.capacity=capacity;
		this.CurrentPrisoners=0;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(final String position) {
		this.position = position;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(final int capacity) {
		this.capacity = capacity;
	}

	public int getCurrentPrisoners() {
		return CurrentPrisoners;
	}

	public void setCurrentPrisoners(final int currentPrisoners) {
		CurrentPrisoners = currentPrisoners;
	}

	@Override
	public String toString() {
		return "CellImpl [id=" + id + ", position=" + position + ", capacity=" + capacity + ", CurrentPrisoners="
				+ CurrentPrisoners + "]";
	}
	
	
}
