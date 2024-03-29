package general;

import java.awt.Color;

/**
 * Represents a player, who can make moves on a {@link Board}.
 */
public abstract class Player
{
	/** A name used to identify this player in the interface. */
	private String name;
	/** The color of this player's pieces, used to validate moves. */
	private Color c;
	
	/**
	 * Creates a new Player with the specified parameters.
	 * 
	 * @param name A name used to identify this player in the interface.
	 * @param c The color of this player's pieces, used to validate moves.
	 */
	public Player(String name, Color c)
	{
		this.name = name;
		this.c = c;
	}
	
	/**
	 * Gets the color of this player's pieces, used to validate moves.
	 * 
	 * @return This player's color.
	 */
	public Color getColor()
	{
		return c;
	}
	
	/**
	 * Gets the name of this player.
	 * 
	 * @return This player's name.
	 */
	public String toString()
	{
		return name;
	}
	
	/**
	 * Moves a <b>Piece</b>.
	 * 
	 * @param b The board which the game is being played on.
	 */
	abstract public void makeMove(Board b);
}
