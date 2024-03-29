package general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a side of a {@link Board}.
 */
public enum Side 
{
	/** The left side of a {@link Board}, column 0. */
	LEFT,
	/** The right side of a {@link Board}, column <b>size-1</b>. */
	RIGHT,
	/** The top side of a {@link Board}, row 0. */
	TOP,
	/** The bottom side of a {@link Board}, row <b>size-1</b>. */
	BOTTOM;
	
	/** Holds a mapping of valid diagonals moving 1 space away from each side, primarily used for checkers. */
	private static Map<Side, List<int[]>> diagonals = new HashMap<>();
	/** Holds all of the diagonals moving 1 space in any direction, primarily used for checkers. */
	private static List<int[]> allDiagonals = new ArrayList<>();
	
	/**
	 * Initializes the lists of diagonals.
	 */
	static
	{
		List<int[]> left = new ArrayList<>(), right = new ArrayList<>(), top = new ArrayList<>(), bottom = new ArrayList<>();
		
		left.add(new int[] {1, 1});
		left.add(new int[] {-1, 1});
		
		right.add(new int[] {1, -1});
		right.add(new int[] {-1, -1});
		
		top.add(new int[] {1, 1});
		top.add(new int[] {1, -1});
		
		bottom.add(new int[] {-1, 1});
		bottom.add(new int[] {-1, -1});
		
		diagonals.put(LEFT, left);
		diagonals.put(RIGHT, right);
		diagonals.put(TOP, top);
		diagonals.put(BOTTOM, bottom);
		
		allDiagonals.addAll(left);
		allDiagonals.addAll(right);
	}
	
	/**
	 * Gets the side of a {@link Board} a point is on.
	 * 
	 * @param pos The position to check.
	 * @param size The size of the {@link Board}.
	 * @return the side of a {@link Board} <b>pos</b> is on, or null if it is not on a side.
	 */
	public static Side getSide(int[] pos, int size)
	{
		if(pos[0] == 0)
			return TOP;
		if(pos[0] + 1 == size)
			return BOTTOM;
		if(pos[1] == 0)
			return LEFT;
		if(pos[1] + 1 == size)
			return RIGHT;
		return null;
	}
	
	/**
	 * Gets the side opposite this one.
	 * 
	 * @return The opposite side to this one:
	 * <ul>
	 * 	<li>{@link LEFT} is opposite {@link RIGHT}
	 * 	<li>{@link TOP} is opposite {@link BOTTOM}
	 * </ul>
	 * 
	 * @throws IllegalStateException if by some unholy magic this side is something other than {@link LEFT}, {@link RIGHT}, {@link TOP}, or {@link BOTTOM}.
	 * <br> Hopefully this should never, ever, happen.
	 */
	public Side getOpposite()
	{
		switch(this)
		{
			case LEFT:
				return RIGHT;
			case RIGHT:
				return LEFT;
			case TOP:
				return BOTTOM;
			case BOTTOM:
				return TOP;
		}
		throw new IllegalStateException();
	}
	
	/**
	 * Gets the diagonals for this side, primarily used for checkers.
	 * 
	 * @param all If true, all diagonals are returned.
	 * @return The diagonals 1 unit each direction away from this side, or all of the diagonals if <b>all</b> is true.
	 */
	public List<int[]> getDiagonals(boolean all)
	{
		if(all)
			return allDiagonals;
		return diagonals.get(this);
	}
}
