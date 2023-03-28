package hw2;

import api.PlayerPosition;
import api.BallType;
import static api.PlayerPosition.*;
import static api.BallType.*;

/**
 * Class that models the game of three-cushion billiards.
 * 
 * @author Ethan Gruening
 */
public class ThreeCushion{


	/**
	 *  Creates a new game of three cushion billiards with a given lag winner and number of points to win, inning count starts at 1
	 * @param lagWinner
	 * either Player A or B
	 * @param pointsToWin
	 * the number of points a player needs to reach for the game to end
	 */
	public ThreeCushion(PlayerPosition lagWinner, int pointsToWin) {

		
	}
	
	/**
	 * Sets whether the player that won the lag chooses to break or not.
	 * Only is able to be chosen once.
	 * @param selfBreak
	 * if true the lag winner chooses to take the break shot
	 * @param cueBall
	 * the lag winners chosen cue ball (either white or yellow)
	 */
	public void lagWinnerChooses(boolean selfBreak, BallType cueBall) {
		
	}
	
	/**
	 * Indicates the cue stick has struck the given ball.
	 * If the player strikes anything other than their own cue ball they committed a foul
	 * 
	 * Calling this method signifies the start of a shot and inning
	 * @param ball
	 */
	public void cueStickStrike(BallType ball) {
		
	}
	
	/**
	 * Indicates the player's cue ball has struck the given ball
	 * @param ball
	 * The cue ball of the player
	 */
	public void cueBallStrike(BallType ball) {
		
	}
	
	/**
	 * Indicates the given ball has impacted the given cushion
	 */
	public void cueBallImpactCushion() {
		
	}
	/**
	 * Inidicates that all balls have stopped motion.
	 * If shot was valid and no foul was committed, the player scores 1 point
	 */
	public void endShot() {
		
	}
	
	/**
	 * Calling this method will indicate a foul was made and ends the player's inning
	 */
	public void foul() {
		
	}
	
	/**
	 * Gets the number of points scored by Player A
	 * @return
	 * the number of points
	 */
	public int getPlayerAScore() {
		return NULL;
	}

	/**
	 * Gets the number of points scored by Player B
	 * @return
	 * the number of points
	 */
	public int getPlayerBScore() {
		return NULL;
	}
	
	/**
	 * Gets the inning number.
	 * @return
	 *The inning number
	 */
	public int getInning() {
		return NULL;
	}
	
	/**
	 * Gets the cue ball of the current player.
	 * @return
	 * the player's cue ball.
	 */
	public BallType getCueBall() {
		return NULL;
	}
	/**
	 * Gets the current player.
	 * @return
	 * the current player
	 */
	
	public PlayerPosition getInningPlayer() {
		return 0;
	}
	
	/**
	 * Returns true if and only if this is the break shot
	 * @return
	 * true if it is the break shot, false otherwise
	 */
	public boolean isBreakShot() {
		return 0;
	}
	
	/**
	 * Returns true if and only if the most recently completed shot was a bank shot
	 * @return
	 * true if shot was a bank shot, false otherwise
	 */
	public boolean isBankShot() {
		return 0;
	}
	
	/**
	 * Returns true if a shot has been taken but not ended
	 * @return
	 * true if the shot has been started, false otherwise
	 */
	public boolean isShotStarted() {
		return 0;
	}
	
	/**
	 * Returns true if the shooting player has taken their first shot of the inning
	 * @return
	 *true if the inning has started, false otherwise
	 */
	public boolean isInningStarted() {
		return 0;
	}
	
	/**
	 * Returns true if the game is over
	 * @return
	 * true if the game is over, false otherwise
	 */
	public boolean isGameOver() {
		return 0;
	}
	
	
	// TODO: EVERTHING ELSE GOES HERE
	// Note that this code will not compile until you have put in stubs for all
	// the required methods.

	// The method below is provided for you and you should not modify it.
	// The compile errors will go away after you have written stubs for the
	// rest of the API methods.

	/**
	 * Returns a one-line string representation of the current game state. The
	 * format is:
	 * <p>
	 * <tt>Player A*: X Player B: Y, Inning: Z</tt>
	 * <p>
	 * The asterisks next to the player's name indicates which player is at the
	 * table this inning. The number after the player's name is their score. Z is
	 * the inning number. Other messages will appear at the end of the string.
	 * 
	 * @return one-line string representation of the game state
	 */
	public String toString() {
		String fmt = "Player A%s: %d, Player B%s: %d, Inning: %d %s%s";
		String playerATurn = "";
		String playerBTurn = "";
		String inningStatus = "";
		String gameStatus = "";
		if (getInningPlayer() == PLAYER_A) {
			playerATurn = "*";
		} else if (getInningPlayer() == PLAYER_B) {
			playerBTurn = "*";
		}
		if (isInningStarted()) {
			inningStatus = "started";
		} else {
			inningStatus = "not started";
		}
		if (isGameOver()) {
			gameStatus = ", game result final";
		}
		return String.format(fmt, playerATurn, getPlayerAScore(), playerBTurn, getPlayerBScore(), getInning(),
				inningStatus, gameStatus);
	}
	
}
