package intermediate;

import java.util.LinkedList;
import java.util.List;

public class RecentAppMemory {
	private List<String> appList;

	public RecentAppMemory() {
		appList = new LinkedList<String>();
	}

	public void openApp(String app) {
		appList.remove(app);

		appList.addFirst(app);

		if (appList.size() > 5) {
			appList.removeLast();
		}
	}

	public LinkedList<String> getRecentApps() {
		return new LinkedList<String>(appList);
	}

	public static void main(String[] args) {
		RecentAppMemory mem = new RecentAppMemory();
		mem.openApp("Email");
		mem.openApp("Insta");
		mem.openApp("Whatsapp");
		mem.openApp("Chrome");
		mem.openApp("Youtube");

		System.out.println("Recent apps: " + mem.getRecentApps());
	}
}
