import java.util.*;

public class ParticleAttachment {

	private static final Map<Integer, int[][]> attachments = new HashMap<>();

	public static int[][] getAttachments(int model) {
        return attachments.get(model);
    }

	static {
		//Max cape
		//attachments.put(29616, new int[][] { { 272, 0 }, { 269, 0 }, { 49, 0 }, { 45, 0 }, { 37, 0 }, { 16, 0 }, { 17, 0 }, { 5, 0 }, { 41, 0 }, { 283, 0 }, { 310, 0 }, { 315, 0 } });
		attachments.put(29616, new int[][] { { 272, 0 }, { 269, 1 }, { 49, 0 }, { 45, 1 }, { 37, 0 }, { 16, 1 }, { 17, 0 }, { 5, 1 }, { 41, 0 }, { 283, 1 }, { 310, 0 }, { 315, 1 } });
		attachments.put(29624, new int[][] { { 272, 0 }, { 269, 0 }, { 49, 0 }, { 45, 0 }, { 37, 0 }, { 16, 0 }, { 17, 0 }, { 5, 0 }, { 41, 0 }, { 283, 0 }, { 310, 0 }, { 315, 0 } });
		//easter Cape bottom
		attachments.put(65306, new int[][] { { 59, 3 }, { 5, 3 }, { 151, 2 }, { 149, 2 }, { 148, 2 }, { 147, 2 }, { 146, 2 }, { 145, 2 }, { 163, 2 }, { 162, 2 }, { 166, 2 }, { 119, 2 }, { 121, 2} });
		//Mod Cape
		attachments.put(65307, new int[][] { { 151, 1 }, { 149, 1 }, { 148, 1 }, { 147, 1 }, { 146, 1 }, { 145, 1 }, { 163, 1 }, { 162, 1 }, { 166, 1 }, { 119, 1 }, { 121, 1} });
		//Donor Cape
		attachments.put(65308, new int[][] { { 151, 2 }, { 149, 2 }, { 148, 2 }, { 147, 2 }, { 146, 2 }, { 145, 2 }, { 163, 2 }, { 162, 2 }, { 166, 2 }, { 119, 2 }, { 121, 2} });
		//Super Donor Cape
		attachments.put(65309, new int[][] { { 151, 3 }, { 149, 3 }, { 148, 3 }, { 147, 3 }, { 146, 3 }, { 145, 3 }, { 163, 3 }, { 162, 3 }, { 166, 3 }, { 119, 3 }, { 121, 3} });
		//attachments.put(65306, new int[][] { { 59, 3 }, { 5, 3 } });
	}
}