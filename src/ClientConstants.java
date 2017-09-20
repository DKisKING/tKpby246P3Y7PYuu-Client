/**
 * 
 * Handles all the client constants
 * @author Austin
 * @author Jesse
 *
 */
public class ClientConstants {
	
	/**
	 * The name of the client
	 */
	public final static String CLIENT_NAME = "Tyras OSRS";
	
	/**
	 * The client version
	 */
	public final static String CLIENT_VERSION = "1.0";
	
	/**
	 * The client version
	 */
	public final static int CLIENT_VERSION_INT = 10;
	
	/**
	 * The world selected
	 */
	public static int worldSelected;
	
	/**
	 * The IP address which the client will be connecting to
	 */
	public final static String[] SERVER_IPS = { "Tyras.chickenkiller.com" };
	
	/**
	 * The client port
	 */
	public final static int SERVER_PORT = 43594;
	
	/**
	 * Check if client will be connecting to local host
	 */
	public final static boolean LOCALHOST = false;
	
	/**
	 * The location of the cache
	 */
	public final static String CACHE_LOCATION = Signlink.findcachedir();
	
	/**
	 * The text which will be shown on announcement bar
	 */
	public final static String ANNOUNCEMENT = "Welcome to Tyras!";

	/**
	 * Amount of icons to display
	 */
	public static final int ICON_AMOUNT = 13;
	
	/**
	 * Checks if the client will be run in debug mode
	 */
	public static boolean DEBUG_MODE = false;

}
